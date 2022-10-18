package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpsMetadata extends StObject {
  
  /**
    * The date the OpsMetadata objects was created.
    */
  var CreationDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The date the OpsMetadata object was last updated.
    */
  var LastModifiedDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The user name who last updated the OpsMetadata object.
    */
  var LastModifiedUser: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the OpsMetadata Object or blob.
    */
  var OpsMetadataArn: js.UndefOr[typings.awsSdk.clientsSsmMod.OpsMetadataArn] = js.undefined
  
  /**
    * The ID of the Application Manager application.
    */
  var ResourceId: js.UndefOr[OpsMetadataResourceId] = js.undefined
}
object OpsMetadata {
  
  inline def apply(): OpsMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpsMetadata]
  }
  
  extension [Self <: OpsMetadata](x: Self) {
    
    inline def setCreationDate(value: js.Date): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    inline def setLastModifiedDate(value: js.Date): Self = StObject.set(x, "LastModifiedDate", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateUndefined: Self = StObject.set(x, "LastModifiedDate", js.undefined)
    
    inline def setLastModifiedUser(value: String): Self = StObject.set(x, "LastModifiedUser", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedUserUndefined: Self = StObject.set(x, "LastModifiedUser", js.undefined)
    
    inline def setOpsMetadataArn(value: OpsMetadataArn): Self = StObject.set(x, "OpsMetadataArn", value.asInstanceOf[js.Any])
    
    inline def setOpsMetadataArnUndefined: Self = StObject.set(x, "OpsMetadataArn", js.undefined)
    
    inline def setResourceId(value: OpsMetadataResourceId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "ResourceId", js.undefined)
  }
}
