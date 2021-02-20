package typings.awsSdk.appsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSchemaCreationStatusRequest extends StObject {
  
  /**
    * The API ID.
    */
  var apiId: String = js.native
}
object GetSchemaCreationStatusRequest {
  
  @scala.inline
  def apply(apiId: String): GetSchemaCreationStatusRequest = {
    val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSchemaCreationStatusRequest]
  }
  
  @scala.inline
  implicit class GetSchemaCreationStatusRequestMutableBuilder[Self <: GetSchemaCreationStatusRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiId(value: String): Self = StObject.set(x, "apiId", value.asInstanceOf[js.Any])
  }
}
