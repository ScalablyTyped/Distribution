package typings.awsSdk.appsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartSchemaCreationResponse extends StObject {
  
  /**
    * The current state of the schema (PROCESSING, FAILED, SUCCESS, or NOT_APPLICABLE). When the schema is in the ACTIVE state, you can add data.
    */
  var status: js.UndefOr[SchemaStatus] = js.native
}
object StartSchemaCreationResponse {
  
  @scala.inline
  def apply(): StartSchemaCreationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartSchemaCreationResponse]
  }
  
  @scala.inline
  implicit class StartSchemaCreationResponseMutableBuilder[Self <: StartSchemaCreationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: SchemaStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
