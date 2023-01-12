package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateOpsMetadataRequest extends StObject {
  
  /**
    * The metadata keys to delete from the OpsMetadata object. 
    */
  var KeysToDelete: js.UndefOr[MetadataKeysToDeleteList] = js.undefined
  
  /**
    * Metadata to add to an OpsMetadata object.
    */
  var MetadataToUpdate: js.UndefOr[MetadataMap] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the OpsMetadata Object to update.
    */
  var OpsMetadataArn: typings.awsSdk.clientsSsmMod.OpsMetadataArn
}
object UpdateOpsMetadataRequest {
  
  inline def apply(OpsMetadataArn: OpsMetadataArn): UpdateOpsMetadataRequest = {
    val __obj = js.Dynamic.literal(OpsMetadataArn = OpsMetadataArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateOpsMetadataRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateOpsMetadataRequest] (val x: Self) extends AnyVal {
    
    inline def setKeysToDelete(value: MetadataKeysToDeleteList): Self = StObject.set(x, "KeysToDelete", value.asInstanceOf[js.Any])
    
    inline def setKeysToDeleteUndefined: Self = StObject.set(x, "KeysToDelete", js.undefined)
    
    inline def setKeysToDeleteVarargs(value: MetadataKey*): Self = StObject.set(x, "KeysToDelete", js.Array(value*))
    
    inline def setMetadataToUpdate(value: MetadataMap): Self = StObject.set(x, "MetadataToUpdate", value.asInstanceOf[js.Any])
    
    inline def setMetadataToUpdateUndefined: Self = StObject.set(x, "MetadataToUpdate", js.undefined)
    
    inline def setOpsMetadataArn(value: OpsMetadataArn): Self = StObject.set(x, "OpsMetadataArn", value.asInstanceOf[js.Any])
  }
}
