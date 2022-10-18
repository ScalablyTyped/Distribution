package typings.appBuilderLib

import typings.appBuilderLib.outPackagerMod.Packager
import typings.appBuilderLib.outPlatformPackagerMod.PlatformPackager
import typings.builderUtil.outFsMod.FileTransformer
import typings.node.bufferMod.global.Buffer
import typings.node.fsMod.Stats
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outUtilAppFileCopierMod {
  
  @JSImport("app-builder-lib/out/util/appFileCopier", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def computeFileSets(
    matchers: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileMatcher */ Any
    ],
    transformer: Null,
    platformPackager: PlatformPackager[Any],
    isElectronCompile: Boolean
  ): js.Promise[js.Array[ResolvedFileSet]] = (^.asInstanceOf[js.Dynamic].applyDynamic("computeFileSets")(matchers.asInstanceOf[js.Any], transformer.asInstanceOf[js.Any], platformPackager.asInstanceOf[js.Any], isElectronCompile.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[ResolvedFileSet]]]
  inline def computeFileSets(
    matchers: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileMatcher */ Any
    ],
    transformer: FileTransformer,
    platformPackager: PlatformPackager[Any],
    isElectronCompile: Boolean
  ): js.Promise[js.Array[ResolvedFileSet]] = (^.asInstanceOf[js.Dynamic].applyDynamic("computeFileSets")(matchers.asInstanceOf[js.Any], transformer.asInstanceOf[js.Any], platformPackager.asInstanceOf[js.Any], isElectronCompile.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[ResolvedFileSet]]]
  
  inline def copyAppFiles(fileSet: ResolvedFileSet, packager: Packager, transformer: FileTransformer): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyAppFiles")(fileSet.asInstanceOf[js.Any], packager.asInstanceOf[js.Any], transformer.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def getDestinationPath(file: String, fileSet: ResolvedFileSet): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getDestinationPath")(file.asInstanceOf[js.Any], fileSet.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def transformFiles(transformer: FileTransformer, fileSet: ResolvedFileSet): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformFiles")(transformer.asInstanceOf[js.Any], fileSet.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  trait ResolvedFileSet extends StObject {
    
    var destination: String
    
    var files: js.Array[String]
    
    var metadata: Map[String, Stats]
    
    var src: String
    
    var transformedFiles: js.UndefOr[(Map[Double, String | Buffer]) | Null] = js.undefined
  }
  object ResolvedFileSet {
    
    inline def apply(destination: String, files: js.Array[String], metadata: Map[String, Stats], src: String): ResolvedFileSet = {
      val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResolvedFileSet]
    }
    
    extension [Self <: ResolvedFileSet](x: Self) {
      
      inline def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
      
      inline def setFiles(value: js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value*))
      
      inline def setMetadata(value: Map[String, Stats]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setTransformedFiles(value: Map[Double, String | Buffer]): Self = StObject.set(x, "transformedFiles", value.asInstanceOf[js.Any])
      
      inline def setTransformedFilesNull: Self = StObject.set(x, "transformedFiles", null)
      
      inline def setTransformedFilesUndefined: Self = StObject.set(x, "transformedFiles", js.undefined)
    }
  }
}
