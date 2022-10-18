package typings.angularCompilerCli.anon

import typings.angularCompilerCli.srcNgtscShimsSrcExpandoMod.NgFileShimData
import typings.typescript.mod.FileReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @angular/compiler-cli.@angular/compiler-cli/src/ngtsc/shims/src/expando.NgExtensionData & {  fileShim :@angular/compiler-cli.@angular/compiler-cli/src/ngtsc/shims/src/expando.NgFileShimData} */
trait NgExtensionDatafileShimNg extends StObject {
  
  var fileShim: (NgFileShimData | Null) & NgFileShimData
  
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
  
  inline def apply(fileShim: (NgFileShimData | Null) & NgFileShimData, isTopLevelShim: Boolean): NgExtensionDatafileShimNg = {
    val __obj = js.Dynamic.literal(fileShim = fileShim.asInstanceOf[js.Any], isTopLevelShim = isTopLevelShim.asInstanceOf[js.Any], originalReferencedFiles = null, taggedReferenceFiles = null)
    __obj.asInstanceOf[NgExtensionDatafileShimNg]
  }
  
  extension [Self <: NgExtensionDatafileShimNg](x: Self) {
    
    inline def setFileShim(value: (NgFileShimData | Null) & NgFileShimData): Self = StObject.set(x, "fileShim", value.asInstanceOf[js.Any])
    
    inline def setIsTopLevelShim(value: Boolean): Self = StObject.set(x, "isTopLevelShim", value.asInstanceOf[js.Any])
    
    inline def setOriginalReferencedFiles(value: js.Array[FileReference]): Self = StObject.set(x, "originalReferencedFiles", value.asInstanceOf[js.Any])
    
    inline def setOriginalReferencedFilesNull: Self = StObject.set(x, "originalReferencedFiles", null)
    
    inline def setOriginalReferencedFilesVarargs(value: FileReference*): Self = StObject.set(x, "originalReferencedFiles", js.Array(value*))
    
    inline def setTaggedReferenceFiles(value: js.Array[FileReference]): Self = StObject.set(x, "taggedReferenceFiles", value.asInstanceOf[js.Any])
    
    inline def setTaggedReferenceFilesNull: Self = StObject.set(x, "taggedReferenceFiles", null)
    
    inline def setTaggedReferenceFilesVarargs(value: FileReference*): Self = StObject.set(x, "taggedReferenceFiles", js.Array(value*))
  }
}
