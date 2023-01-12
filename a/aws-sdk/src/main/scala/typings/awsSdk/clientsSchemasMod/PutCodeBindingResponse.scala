package typings.awsSdk.clientsSchemasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutCodeBindingResponse extends StObject {
  
  /**
    * The time and date that the code binding was created.
    */
  var CreationDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The date and time that code bindings were modified.
    */
  var LastModified: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The version number of the schema.
    */
  var SchemaVersion: js.UndefOr[string] = js.undefined
  
  /**
    * The current status of code binding generation.
    */
  var Status: js.UndefOr[CodeGenerationStatus] = js.undefined
}
object PutCodeBindingResponse {
  
  inline def apply(): PutCodeBindingResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutCodeBindingResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutCodeBindingResponse] (val x: Self) extends AnyVal {
    
    inline def setCreationDate(value: js.Date): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    inline def setLastModified(value: js.Date): Self = StObject.set(x, "LastModified", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedUndefined: Self = StObject.set(x, "LastModified", js.undefined)
    
    inline def setSchemaVersion(value: string): Self = StObject.set(x, "SchemaVersion", value.asInstanceOf[js.Any])
    
    inline def setSchemaVersionUndefined: Self = StObject.set(x, "SchemaVersion", js.undefined)
    
    inline def setStatus(value: CodeGenerationStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
