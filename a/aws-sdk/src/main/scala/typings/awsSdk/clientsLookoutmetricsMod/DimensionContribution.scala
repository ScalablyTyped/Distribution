package typings.awsSdk.clientsLookoutmetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DimensionContribution extends StObject {
  
  /**
    * The name of the dimension.
    */
  var DimensionName: js.UndefOr[ColumnName] = js.undefined
  
  /**
    * A list of dimension values that contributed to the anomaly.
    */
  var DimensionValueContributionList: js.UndefOr[typings.awsSdk.clientsLookoutmetricsMod.DimensionValueContributionList] = js.undefined
}
object DimensionContribution {
  
  inline def apply(): DimensionContribution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DimensionContribution]
  }
  
  extension [Self <: DimensionContribution](x: Self) {
    
    inline def setDimensionName(value: ColumnName): Self = StObject.set(x, "DimensionName", value.asInstanceOf[js.Any])
    
    inline def setDimensionNameUndefined: Self = StObject.set(x, "DimensionName", js.undefined)
    
    inline def setDimensionValueContributionList(value: DimensionValueContributionList): Self = StObject.set(x, "DimensionValueContributionList", value.asInstanceOf[js.Any])
    
    inline def setDimensionValueContributionListUndefined: Self = StObject.set(x, "DimensionValueContributionList", js.undefined)
    
    inline def setDimensionValueContributionListVarargs(value: DimensionValueContribution*): Self = StObject.set(x, "DimensionValueContributionList", js.Array(value*))
  }
}
