package typings.awsSdk.clientsFsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDataRepositoryAssociationResponse extends StObject {
  
  /**
    * The ID of the data repository association being deleted.
    */
  var AssociationId: js.UndefOr[DataRepositoryAssociationId] = js.undefined
  
  /**
    * Indicates whether data in the file system that corresponds to the data repository association is being deleted. Default is false.
    */
  var DeleteDataInFileSystem: js.UndefOr[typings.awsSdk.clientsFsxMod.DeleteDataInFileSystem] = js.undefined
  
  /**
    * Describes the lifecycle state of the data repository association being deleted.
    */
  var Lifecycle: js.UndefOr[DataRepositoryLifecycle] = js.undefined
}
object DeleteDataRepositoryAssociationResponse {
  
  inline def apply(): DeleteDataRepositoryAssociationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteDataRepositoryAssociationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteDataRepositoryAssociationResponse] (val x: Self) extends AnyVal {
    
    inline def setAssociationId(value: DataRepositoryAssociationId): Self = StObject.set(x, "AssociationId", value.asInstanceOf[js.Any])
    
    inline def setAssociationIdUndefined: Self = StObject.set(x, "AssociationId", js.undefined)
    
    inline def setDeleteDataInFileSystem(value: DeleteDataInFileSystem): Self = StObject.set(x, "DeleteDataInFileSystem", value.asInstanceOf[js.Any])
    
    inline def setDeleteDataInFileSystemUndefined: Self = StObject.set(x, "DeleteDataInFileSystem", js.undefined)
    
    inline def setLifecycle(value: DataRepositoryLifecycle): Self = StObject.set(x, "Lifecycle", value.asInstanceOf[js.Any])
    
    inline def setLifecycleUndefined: Self = StObject.set(x, "Lifecycle", js.undefined)
  }
}
