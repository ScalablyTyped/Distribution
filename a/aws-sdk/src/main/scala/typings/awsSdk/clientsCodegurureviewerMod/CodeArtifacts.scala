package typings.awsSdk.clientsCodegurureviewerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeArtifacts extends StObject {
  
  /**
    * The S3 object key for a build artifacts .zip file that contains .jar or .class files. This is required for a code review with security analysis. For more information, see Create code reviews with GitHub Actions in the Amazon CodeGuru Reviewer User Guide.
    */
  var BuildArtifactsObjectKey: js.UndefOr[typings.awsSdk.clientsCodegurureviewerMod.BuildArtifactsObjectKey] = js.undefined
  
  /**
    * The S3 object key for a source code .zip file. This is required for all code reviews.
    */
  var SourceCodeArtifactsObjectKey: typings.awsSdk.clientsCodegurureviewerMod.SourceCodeArtifactsObjectKey
}
object CodeArtifacts {
  
  inline def apply(SourceCodeArtifactsObjectKey: SourceCodeArtifactsObjectKey): CodeArtifacts = {
    val __obj = js.Dynamic.literal(SourceCodeArtifactsObjectKey = SourceCodeArtifactsObjectKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeArtifacts]
  }
  
  extension [Self <: CodeArtifacts](x: Self) {
    
    inline def setBuildArtifactsObjectKey(value: BuildArtifactsObjectKey): Self = StObject.set(x, "BuildArtifactsObjectKey", value.asInstanceOf[js.Any])
    
    inline def setBuildArtifactsObjectKeyUndefined: Self = StObject.set(x, "BuildArtifactsObjectKey", js.undefined)
    
    inline def setSourceCodeArtifactsObjectKey(value: SourceCodeArtifactsObjectKey): Self = StObject.set(x, "SourceCodeArtifactsObjectKey", value.asInstanceOf[js.Any])
  }
}
