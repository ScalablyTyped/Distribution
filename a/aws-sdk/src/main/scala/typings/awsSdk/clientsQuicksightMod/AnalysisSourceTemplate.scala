package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisSourceTemplate extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the source template of an analysis.
    */
  var Arn: typings.awsSdk.clientsQuicksightMod.Arn
  
  /**
    * The dataset references of the source template of an analysis.
    */
  var DataSetReferences: DataSetReferenceList
}
object AnalysisSourceTemplate {
  
  inline def apply(Arn: Arn, DataSetReferences: DataSetReferenceList): AnalysisSourceTemplate = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], DataSetReferences = DataSetReferences.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalysisSourceTemplate]
  }
  
  extension [Self <: AnalysisSourceTemplate](x: Self) {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setDataSetReferences(value: DataSetReferenceList): Self = StObject.set(x, "DataSetReferences", value.asInstanceOf[js.Any])
    
    inline def setDataSetReferencesVarargs(value: DataSetReference*): Self = StObject.set(x, "DataSetReferences", js.Array(value*))
  }
}
