package typings.awsSdk.clientsCodegurureviewerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3RepositoryDetails extends StObject {
  
  /**
    * The name of the S3 bucket used for associating a new S3 repository. It must begin with codeguru-reviewer-. 
    */
  var BucketName: js.UndefOr[S3BucketName] = js.undefined
  
  /**
    * A CodeArtifacts object. The CodeArtifacts object includes the S3 object key for a source code .zip file and for a build artifacts .zip file that contains .jar or .class files.
    */
  var CodeArtifacts: js.UndefOr[typings.awsSdk.clientsCodegurureviewerMod.CodeArtifacts] = js.undefined
}
object S3RepositoryDetails {
  
  inline def apply(): S3RepositoryDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3RepositoryDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: S3RepositoryDetails] (val x: Self) extends AnyVal {
    
    inline def setBucketName(value: S3BucketName): Self = StObject.set(x, "BucketName", value.asInstanceOf[js.Any])
    
    inline def setBucketNameUndefined: Self = StObject.set(x, "BucketName", js.undefined)
    
    inline def setCodeArtifacts(value: CodeArtifacts): Self = StObject.set(x, "CodeArtifacts", value.asInstanceOf[js.Any])
    
    inline def setCodeArtifactsUndefined: Self = StObject.set(x, "CodeArtifacts", js.undefined)
  }
}
