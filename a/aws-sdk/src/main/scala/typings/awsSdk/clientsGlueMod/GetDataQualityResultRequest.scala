package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDataQualityResultRequest extends StObject {
  
  /**
    * A unique result ID for the data quality result.
    */
  var ResultId: HashString
}
object GetDataQualityResultRequest {
  
  inline def apply(ResultId: HashString): GetDataQualityResultRequest = {
    val __obj = js.Dynamic.literal(ResultId = ResultId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDataQualityResultRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetDataQualityResultRequest] (val x: Self) extends AnyVal {
    
    inline def setResultId(value: HashString): Self = StObject.set(x, "ResultId", value.asInstanceOf[js.Any])
  }
}
