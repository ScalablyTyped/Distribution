package typings.awsSdk.clientsFsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDataRepositoryAssociationRequest extends StObject {
  
  /**
    * The ID of the data repository association that you want to delete.
    */
  var AssociationId: DataRepositoryAssociationId
  
  var ClientRequestToken: js.UndefOr[typings.awsSdk.clientsFsxMod.ClientRequestToken] = js.undefined
  
  /**
    * Set to true to delete the data in the file system that corresponds to the data repository association.
    */
  var DeleteDataInFileSystem: js.UndefOr[typings.awsSdk.clientsFsxMod.DeleteDataInFileSystem] = js.undefined
}
object DeleteDataRepositoryAssociationRequest {
  
  inline def apply(AssociationId: DataRepositoryAssociationId): DeleteDataRepositoryAssociationRequest = {
    val __obj = js.Dynamic.literal(AssociationId = AssociationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDataRepositoryAssociationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteDataRepositoryAssociationRequest] (val x: Self) extends AnyVal {
    
    inline def setAssociationId(value: DataRepositoryAssociationId): Self = StObject.set(x, "AssociationId", value.asInstanceOf[js.Any])
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    inline def setDeleteDataInFileSystem(value: DeleteDataInFileSystem): Self = StObject.set(x, "DeleteDataInFileSystem", value.asInstanceOf[js.Any])
    
    inline def setDeleteDataInFileSystemUndefined: Self = StObject.set(x, "DeleteDataInFileSystem", js.undefined)
  }
}
