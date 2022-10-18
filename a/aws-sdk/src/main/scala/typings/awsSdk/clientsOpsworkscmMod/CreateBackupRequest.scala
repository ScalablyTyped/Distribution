package typings.awsSdk.clientsOpsworkscmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateBackupRequest extends StObject {
  
  /**
    *  A user-defined description of the backup. 
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the server that you want to back up. 
    */
  var ServerName: typings.awsSdk.clientsOpsworkscmMod.ServerName
  
  /**
    * A map that contains tag keys and tag values to attach to an AWS OpsWorks-CM server backup.   The key cannot be empty.   The key can be a maximum of 127 characters, and can contain only Unicode letters, numbers, or separators, or the following special characters: + - = . _ : /    The value can be a maximum 255 characters, and contain only Unicode letters, numbers, or separators, or the following special characters: + - = . _ : /    Leading and trailing white spaces are trimmed from both the key and value.   A maximum of 50 user-applied tags is allowed for tag-supported AWS OpsWorks-CM resources.  
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateBackupRequest {
  
  inline def apply(ServerName: ServerName): CreateBackupRequest = {
    val __obj = js.Dynamic.literal(ServerName = ServerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBackupRequest]
  }
  
  extension [Self <: CreateBackupRequest](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setServerName(value: ServerName): Self = StObject.set(x, "ServerName", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
