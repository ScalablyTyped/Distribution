package typings.awsSdk.clientsAppsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartSchemaCreationResponse extends StObject {
  
  /**
    * The current state of the schema (PROCESSING, FAILED, SUCCESS, or NOT_APPLICABLE). When the schema is in the ACTIVE state, you can add data.
    */
  var status: js.UndefOr[SchemaStatus] = js.undefined
}
object StartSchemaCreationResponse {
  
  inline def apply(): StartSchemaCreationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartSchemaCreationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartSchemaCreationResponse] (val x: Self) extends AnyVal {
    
    inline def setStatus(value: SchemaStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
