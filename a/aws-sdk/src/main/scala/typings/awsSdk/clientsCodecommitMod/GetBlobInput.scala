package typings.awsSdk.clientsCodecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBlobInput extends StObject {
  
  /**
    * The ID of the blob, which is its SHA-1 pointer.
    */
  var blobId: ObjectId
  
  /**
    * The name of the repository that contains the blob.
    */
  var repositoryName: RepositoryName
}
object GetBlobInput {
  
  inline def apply(blobId: ObjectId, repositoryName: RepositoryName): GetBlobInput = {
    val __obj = js.Dynamic.literal(blobId = blobId.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBlobInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetBlobInput] (val x: Self) extends AnyVal {
    
    inline def setBlobId(value: ObjectId): Self = StObject.set(x, "blobId", value.asInstanceOf[js.Any])
    
    inline def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
  }
}
