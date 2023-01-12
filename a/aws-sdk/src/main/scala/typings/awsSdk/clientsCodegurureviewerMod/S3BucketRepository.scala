package typings.awsSdk.clientsCodegurureviewerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3BucketRepository extends StObject {
  
  /**
    * An S3RepositoryDetails object that specifies the name of an S3 bucket and a CodeArtifacts object. The CodeArtifacts object includes the S3 object keys for a source code .zip file and for a build artifacts .zip file.
    */
  var Details: js.UndefOr[S3RepositoryDetails] = js.undefined
  
  /**
    * The name of the repository when the ProviderType is S3Bucket.
    */
  var Name: typings.awsSdk.clientsCodegurureviewerMod.Name
}
object S3BucketRepository {
  
  inline def apply(Name: Name): S3BucketRepository = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3BucketRepository]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: S3BucketRepository] (val x: Self) extends AnyVal {
    
    inline def setDetails(value: S3RepositoryDetails): Self = StObject.set(x, "Details", value.asInstanceOf[js.Any])
    
    inline def setDetailsUndefined: Self = StObject.set(x, "Details", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
