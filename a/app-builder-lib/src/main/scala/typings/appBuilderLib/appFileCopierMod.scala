package typings.appBuilderLib

import typings.appBuilderLib.packagerMod.Packager
import typings.appBuilderLib.platformPackagerMod.PlatformPackager
import typings.builderUtil.fsMod.FileTransformer
import typings.fsExtra.mod.Stats
import typings.node.Buffer
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appFileCopierMod {
  
  @JSImport("app-builder-lib/out/util/appFileCopier", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def computeFileSets(
    matchers: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileMatcher */ js.Any
    ],
    transformer: Null,
    platformPackager: PlatformPackager[js.Any],
    isElectronCompile: Boolean
  ): js.Promise[js.Array[ResolvedFileSet]] = (^.asInstanceOf[js.Dynamic].applyDynamic("computeFileSets")(matchers.asInstanceOf[js.Any], transformer.asInstanceOf[js.Any], platformPackager.asInstanceOf[js.Any], isElectronCompile.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[ResolvedFileSet]]]
  @scala.inline
  def computeFileSets(
    matchers: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileMatcher */ js.Any
    ],
    transformer: FileTransformer,
    platformPackager: PlatformPackager[js.Any],
    isElectronCompile: Boolean
  ): js.Promise[js.Array[ResolvedFileSet]] = (^.asInstanceOf[js.Dynamic].applyDynamic("computeFileSets")(matchers.asInstanceOf[js.Any], transformer.asInstanceOf[js.Any], platformPackager.asInstanceOf[js.Any], isElectronCompile.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[ResolvedFileSet]]]
  
  @scala.inline
  def copyAppFiles(fileSet: ResolvedFileSet, packager: Packager, transformer: FileTransformer): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyAppFiles")(fileSet.asInstanceOf[js.Any], packager.asInstanceOf[js.Any], transformer.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @scala.inline
  def getDestinationPath(file: String, fileSet: ResolvedFileSet): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getDestinationPath")(file.asInstanceOf[js.Any], fileSet.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def transformFiles(transformer: FileTransformer, fileSet: ResolvedFileSet): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformFiles")(transformer.asInstanceOf[js.Any], fileSet.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  trait ResolvedFileSet extends StObject {
    
    var destination: String
    
    var files: js.Array[String]
    
    var metadata: Map[String, Stats]
    
    var src: String
    
    var transformedFiles: js.UndefOr[(Map[Double, String | Buffer]) | Null] = js.undefined
  }
  object ResolvedFileSet {
    
    @scala.inline
    def apply(destination: String, files: js.Array[String], metadata: Map[String, Stats], src: String): ResolvedFileSet = {
      val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResolvedFileSet]
    }
    
    @scala.inline
    implicit class ResolvedFileSetMutableBuilder[Self <: ResolvedFileSet] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiles(value: js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value :_*))
      
      @scala.inline
      def setMetadata(value: Map[String, Stats]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransformedFiles(value: Map[Double, String | Buffer]): Self = StObject.set(x, "transformedFiles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransformedFilesNull: Self = StObject.set(x, "transformedFiles", null)
      
      @scala.inline
      def setTransformedFilesUndefined: Self = StObject.set(x, "transformedFiles", js.undefined)
    }
  }
}
