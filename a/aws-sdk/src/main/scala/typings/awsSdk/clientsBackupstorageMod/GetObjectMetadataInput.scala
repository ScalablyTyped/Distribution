package typings.awsSdk.clientsBackupstorageMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetObjectMetadataInput extends StObject {
  
  /**
    * Object token.
    */
  var ObjectToken: String
  
  /**
    * Backup job id for the in-progress backup.
    */
  var StorageJobId: String
}
object GetObjectMetadataInput {
  
  inline def apply(ObjectToken: String, StorageJobId: String): GetObjectMetadataInput = {
    val __obj = js.Dynamic.literal(ObjectToken = ObjectToken.asInstanceOf[js.Any], StorageJobId = StorageJobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetObjectMetadataInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetObjectMetadataInput] (val x: Self) extends AnyVal {
    
    inline def setObjectToken(value: String): Self = StObject.set(x, "ObjectToken", value.asInstanceOf[js.Any])
    
    inline def setStorageJobId(value: String): Self = StObject.set(x, "StorageJobId", value.asInstanceOf[js.Any])
  }
}
