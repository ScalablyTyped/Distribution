package typings.angularCompilerCli

import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.AbsoluteFsPath
import typings.typescript.mod.FileReference
import typings.typescript.mod.Program
import typings.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscShimsSrcExpandoMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/shims/src/expando", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler-cli/src/ngtsc/shims/src/expando", "NgExtension")
  @js.native
  val NgExtension: js.Symbol = js.native
  
  inline def copyFileShimData(from: SourceFile, to: SourceFile): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("copyFileShimData")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def isExtended(sf: SourceFile): /* is @angular/compiler-cli.@angular/compiler-cli/src/ngtsc/shims/src/expando.NgExtendedSourceFile */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExtended")(sf.asInstanceOf[js.Any]).asInstanceOf[/* is @angular/compiler-cli.@angular/compiler-cli/src/ngtsc/shims/src/expando.NgExtendedSourceFile */ Boolean]
  
  inline def isFileShimSourceFile(sf: SourceFile): /* is @angular/compiler-cli.@angular/compiler-cli/src/ngtsc/shims/src/expando.NgFileShimSourceFile */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFileShimSourceFile")(sf.asInstanceOf[js.Any]).asInstanceOf[/* is @angular/compiler-cli.@angular/compiler-cli/src/ngtsc/shims/src/expando.NgFileShimSourceFile */ Boolean]
  
  inline def isShim(sf: SourceFile): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isShim")(sf.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def retagAllTsFiles(program: Program): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("retagAllTsFiles")(program.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def retagTsFile(sf: SourceFile): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("retagTsFile")(sf.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def sfExtensionData(sf: SourceFile): NgExtensionData = ^.asInstanceOf[js.Dynamic].applyDynamic("sfExtensionData")(sf.asInstanceOf[js.Any]).asInstanceOf[NgExtensionData]
  
  inline def untagAllTsFiles(program: Program): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("untagAllTsFiles")(program.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def untagTsFile(sf: SourceFile): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("untagTsFile")(sf.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @js.native
  trait NgExtendedSourceFile
    extends StObject
       with SourceFile
  
  trait NgExtensionData extends StObject {
    
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
  object NgExtensionData {
    
    inline def apply(isTopLevelShim: Boolean): NgExtensionData = {
      val __obj = js.Dynamic.literal(isTopLevelShim = isTopLevelShim.asInstanceOf[js.Any], fileShim = null, originalReferencedFiles = null, taggedReferenceFiles = null)
      __obj.asInstanceOf[NgExtensionData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NgExtensionData] (val x: Self) extends AnyVal {
      
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
  
  trait NgFileShimData extends StObject {
    
    var `extension`: String
    
    var generatedFrom: AbsoluteFsPath
  }
  object NgFileShimData {
    
    inline def apply(`extension`: String, generatedFrom: AbsoluteFsPath): NgFileShimData = {
      val __obj = js.Dynamic.literal(generatedFrom = generatedFrom.asInstanceOf[js.Any])
      __obj.updateDynamic("extension")(`extension`.asInstanceOf[js.Any])
      __obj.asInstanceOf[NgFileShimData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NgFileShimData] (val x: Self) extends AnyVal {
      
      inline def setExtension(value: String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
      
      inline def setGeneratedFrom(value: AbsoluteFsPath): Self = StObject.set(x, "generatedFrom", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NgFileShimSourceFile
    extends StObject
       with NgExtendedSourceFile
}
