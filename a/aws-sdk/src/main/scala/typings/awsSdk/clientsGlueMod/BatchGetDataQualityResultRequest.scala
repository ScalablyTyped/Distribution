package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetDataQualityResultRequest extends StObject {
  
  /**
    * A list of unique result IDs for the data quality results.
    */
  var ResultIds: DataQualityResultIds
}
object BatchGetDataQualityResultRequest {
  
  inline def apply(ResultIds: DataQualityResultIds): BatchGetDataQualityResultRequest = {
    val __obj = js.Dynamic.literal(ResultIds = ResultIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetDataQualityResultRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchGetDataQualityResultRequest] (val x: Self) extends AnyVal {
    
    inline def setResultIds(value: DataQualityResultIds): Self = StObject.set(x, "ResultIds", value.asInstanceOf[js.Any])
    
    inline def setResultIdsVarargs(value: HashString*): Self = StObject.set(x, "ResultIds", js.Array(value*))
  }
}
