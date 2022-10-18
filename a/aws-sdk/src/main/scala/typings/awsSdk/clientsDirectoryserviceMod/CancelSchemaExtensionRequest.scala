package typings.awsSdk.clientsDirectoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelSchemaExtensionRequest extends StObject {
  
  /**
    * The identifier of the directory whose schema extension will be canceled.
    */
  var DirectoryId: typings.awsSdk.clientsDirectoryserviceMod.DirectoryId
  
  /**
    * The identifier of the schema extension that will be canceled.
    */
  var SchemaExtensionId: typings.awsSdk.clientsDirectoryserviceMod.SchemaExtensionId
}
object CancelSchemaExtensionRequest {
  
  inline def apply(DirectoryId: DirectoryId, SchemaExtensionId: SchemaExtensionId): CancelSchemaExtensionRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId.asInstanceOf[js.Any], SchemaExtensionId = SchemaExtensionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelSchemaExtensionRequest]
  }
  
  extension [Self <: CancelSchemaExtensionRequest](x: Self) {
    
    inline def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
    
    inline def setSchemaExtensionId(value: SchemaExtensionId): Self = StObject.set(x, "SchemaExtensionId", value.asInstanceOf[js.Any])
  }
}
