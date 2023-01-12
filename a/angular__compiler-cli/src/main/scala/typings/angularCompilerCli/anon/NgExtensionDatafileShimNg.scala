package typings.angularCompilerCli.anon

import typings.angularCompilerCli.srcNgtscShimsSrcExpandoMod.NgFileShimData
import typings.typescript.mod.FileReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @angular/compiler-cli.@angular/compiler-cli/src/ngtsc/shims/src/expando.NgExtensionData & {  fileShim :@angular/compiler-cli.@angular/compiler-cli/src/ngtsc/shims/src/expando.NgFileShimData} */
trait NgExtensionDatafileShimNg extends StObject {
  
  var fileShim: NgFileShimData | Null
  
  var isTopLevelShim: Boolean
  
  /**
    * The contents of the `referencedFiles` array, before modification by a `ShimReferenceTagger`.
    */
  var originalReferencedFiles: js.Array[FileReference] | Null
  
  /**
    * The contents of the `referencedFiles` array, after modification by a `ShimReferenceTagger`.
    */
  var taggedReferenceFiles: js.Array[FileReference] | Null
}
object NgExtensionDatafileShimNg {
  
  inline def apply(isTopLevelShim: Boolean): NgExtensionDatafileShimNg = {
    val __obj = js.Dynamic.literal(isTopLevelShim = isTopLevelShim.asInstanceOf[js.Any], fileShim = null, originalReferencedFiles = null, taggedReferenceFiles = null)
    __obj.asInstanceOf[NgExtensionDatafileShimNg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NgExtensionDatafileShimNg] (val x: Self) extends AnyVal {
    
    inline def setFileShim(value: NgFileShimData): Self = StObject.set(x, "fileShim", value.asInstanceOf[js.Any])
    
    inline def setFileShimNull: Self = StObject.set(x, "fileShim", null)
    
    inline def setIsTopLevelShim(value: Boolean): Self = StObject.set(x, "isTopLevelShim", value.asInstanceOf[js.Any])
    
    inline def setOriginalReferencedFiles(value: js.Array[FileReference]): Self = StObject.set(x, "originalReferencedFiles", value.asInstanceOf[js.Any])
    
    inline def setOriginalReferencedFilesNull: Self = StObject.set(x, "originalReferencedFiles", null)
    
    inline def setOriginalReferencedFilesVarargs(value: FileReference*): Self = StObject.set(x, "originalReferencedFiles", js.Array(value*))
    
    inline def setTaggedReferenceFiles(value: js.Array[FileReference]): Self = StObject.set(x, "taggedReferenceFiles", value.asInstanceOf[js.Any])
    
    inline def setTaggedReferenceFilesNull: Self = StObject.set(x, "taggedReferenceFiles", null)
    
    inline def setTaggedReferenceFilesVarargs(value: FileReference*): Self = StObject.set(x, "taggedReferenceFiles", js.Array(value*))
  }
}
