package typings.awsSdk.clientsDirectoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SharedDirectory extends StObject {
  
  /**
    * The date and time that the shared directory was created.
    */
  var CreatedDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The date and time that the shared directory was last updated.
    */
  var LastUpdatedDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Identifier of the directory owner account, which contains the directory that has been shared to the consumer account.
    */
  var OwnerAccountId: js.UndefOr[CustomerId] = js.undefined
  
  /**
    * Identifier of the directory in the directory owner account. 
    */
  var OwnerDirectoryId: js.UndefOr[DirectoryId] = js.undefined
  
  /**
    * The method used when sharing a directory to determine whether the directory should be shared within your Amazon Web Services organization (ORGANIZATIONS) or with any Amazon Web Services account by sending a shared directory request (HANDSHAKE).
    */
  var ShareMethod: js.UndefOr[typings.awsSdk.clientsDirectoryserviceMod.ShareMethod] = js.undefined
  
  /**
    * A directory share request that is sent by the directory owner to the directory consumer. The request includes a typed message to help the directory consumer administrator determine whether to approve or reject the share invitation.
    */
  var ShareNotes: js.UndefOr[Notes] = js.undefined
  
  /**
    * Current directory status of the shared Managed Microsoft AD directory.
    */
  var ShareStatus: js.UndefOr[typings.awsSdk.clientsDirectoryserviceMod.ShareStatus] = js.undefined
  
  /**
    * Identifier of the directory consumer account that has access to the shared directory (OwnerDirectoryId) in the directory owner account.
    */
  var SharedAccountId: js.UndefOr[CustomerId] = js.undefined
  
  /**
    * Identifier of the shared directory in the directory consumer account. This identifier is different for each directory owner account.
    */
  var SharedDirectoryId: js.UndefOr[DirectoryId] = js.undefined
}
object SharedDirectory {
  
  inline def apply(): SharedDirectory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharedDirectory]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SharedDirectory] (val x: Self) extends AnyVal {
    
    inline def setCreatedDateTime(value: js.Date): Self = StObject.set(x, "CreatedDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateTimeUndefined: Self = StObject.set(x, "CreatedDateTime", js.undefined)
    
    inline def setLastUpdatedDateTime(value: js.Date): Self = StObject.set(x, "LastUpdatedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedDateTimeUndefined: Self = StObject.set(x, "LastUpdatedDateTime", js.undefined)
    
    inline def setOwnerAccountId(value: CustomerId): Self = StObject.set(x, "OwnerAccountId", value.asInstanceOf[js.Any])
    
    inline def setOwnerAccountIdUndefined: Self = StObject.set(x, "OwnerAccountId", js.undefined)
    
    inline def setOwnerDirectoryId(value: DirectoryId): Self = StObject.set(x, "OwnerDirectoryId", value.asInstanceOf[js.Any])
    
    inline def setOwnerDirectoryIdUndefined: Self = StObject.set(x, "OwnerDirectoryId", js.undefined)
    
    inline def setShareMethod(value: ShareMethod): Self = StObject.set(x, "ShareMethod", value.asInstanceOf[js.Any])
    
    inline def setShareMethodUndefined: Self = StObject.set(x, "ShareMethod", js.undefined)
    
    inline def setShareNotes(value: Notes): Self = StObject.set(x, "ShareNotes", value.asInstanceOf[js.Any])
    
    inline def setShareNotesUndefined: Self = StObject.set(x, "ShareNotes", js.undefined)
    
    inline def setShareStatus(value: ShareStatus): Self = StObject.set(x, "ShareStatus", value.asInstanceOf[js.Any])
    
    inline def setShareStatusUndefined: Self = StObject.set(x, "ShareStatus", js.undefined)
    
    inline def setSharedAccountId(value: CustomerId): Self = StObject.set(x, "SharedAccountId", value.asInstanceOf[js.Any])
    
    inline def setSharedAccountIdUndefined: Self = StObject.set(x, "SharedAccountId", js.undefined)
    
    inline def setSharedDirectoryId(value: DirectoryId): Self = StObject.set(x, "SharedDirectoryId", value.asInstanceOf[js.Any])
    
    inline def setSharedDirectoryIdUndefined: Self = StObject.set(x, "SharedDirectoryId", js.undefined)
  }
}
