package typings.awsSdk.clientsStoragegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateFileSystemAssociationInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the storage used for the audit logs.
    */
  var AuditDestinationARN: js.UndefOr[typings.awsSdk.clientsStoragegatewayMod.AuditDestinationARN] = js.undefined
  
  var CacheAttributes: js.UndefOr[typings.awsSdk.clientsStoragegatewayMod.CacheAttributes] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the file system association that you want to update.
    */
  var FileSystemAssociationARN: typings.awsSdk.clientsStoragegatewayMod.FileSystemAssociationARN
  
  /**
    * The password of the user credential.
    */
  var Password: js.UndefOr[DomainUserPassword] = js.undefined
  
  /**
    * The user name of the user credential that has permission to access the root share D$ of the Amazon FSx file system. The user account must belong to the Amazon FSx delegated admin user group.
    */
  var UserName: js.UndefOr[DomainUserName] = js.undefined
}
object UpdateFileSystemAssociationInput {
  
  inline def apply(FileSystemAssociationARN: FileSystemAssociationARN): UpdateFileSystemAssociationInput = {
    val __obj = js.Dynamic.literal(FileSystemAssociationARN = FileSystemAssociationARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFileSystemAssociationInput]
  }
  
  extension [Self <: UpdateFileSystemAssociationInput](x: Self) {
    
    inline def setAuditDestinationARN(value: AuditDestinationARN): Self = StObject.set(x, "AuditDestinationARN", value.asInstanceOf[js.Any])
    
    inline def setAuditDestinationARNUndefined: Self = StObject.set(x, "AuditDestinationARN", js.undefined)
    
    inline def setCacheAttributes(value: CacheAttributes): Self = StObject.set(x, "CacheAttributes", value.asInstanceOf[js.Any])
    
    inline def setCacheAttributesUndefined: Self = StObject.set(x, "CacheAttributes", js.undefined)
    
    inline def setFileSystemAssociationARN(value: FileSystemAssociationARN): Self = StObject.set(x, "FileSystemAssociationARN", value.asInstanceOf[js.Any])
    
    inline def setPassword(value: DomainUserPassword): Self = StObject.set(x, "Password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "Password", js.undefined)
    
    inline def setUserName(value: DomainUserName): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
    
    inline def setUserNameUndefined: Self = StObject.set(x, "UserName", js.undefined)
  }
}
