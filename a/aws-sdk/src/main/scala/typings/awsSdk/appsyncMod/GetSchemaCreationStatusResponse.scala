package typings.awsSdk.appsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSchemaCreationStatusResponse extends StObject {
  
  /**
    * Detailed information about the status of the schema creation operation.
    */
  var details: js.UndefOr[String] = js.undefined
  
  /**
    * The current state of the schema (PROCESSING, FAILED, SUCCESS, or NOT_APPLICABLE). When the schema is in the ACTIVE state, you can add data.
    */
  var status: js.UndefOr[SchemaStatus] = js.undefined
}
object GetSchemaCreationStatusResponse {
  
  @scala.inline
  def apply(): GetSchemaCreationStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSchemaCreationStatusResponse]
  }
  
  @scala.inline
  implicit class GetSchemaCreationStatusResponseMutableBuilder[Self <: GetSchemaCreationStatusResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetails(value: String): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    @scala.inline
    def setStatus(value: SchemaStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
