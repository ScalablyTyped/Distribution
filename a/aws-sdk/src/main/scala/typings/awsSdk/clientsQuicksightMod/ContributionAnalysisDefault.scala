package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContributionAnalysisDefault extends StObject {
  
  /**
    * The dimensions columns that are used in the contribution analysis, usually a list of ColumnIdentifiers.
    */
  var ContributorDimensions: ContributorDimensionList
  
  /**
    * The measure field that is used in the contribution analysis.
    */
  var MeasureFieldId: FieldId
}
object ContributionAnalysisDefault {
  
  inline def apply(ContributorDimensions: ContributorDimensionList, MeasureFieldId: FieldId): ContributionAnalysisDefault = {
    val __obj = js.Dynamic.literal(ContributorDimensions = ContributorDimensions.asInstanceOf[js.Any], MeasureFieldId = MeasureFieldId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContributionAnalysisDefault]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContributionAnalysisDefault] (val x: Self) extends AnyVal {
    
    inline def setContributorDimensions(value: ContributorDimensionList): Self = StObject.set(x, "ContributorDimensions", value.asInstanceOf[js.Any])
    
    inline def setContributorDimensionsVarargs(value: ColumnIdentifier*): Self = StObject.set(x, "ContributorDimensions", js.Array(value*))
    
    inline def setMeasureFieldId(value: FieldId): Self = StObject.set(x, "MeasureFieldId", value.asInstanceOf[js.Any])
  }
}
