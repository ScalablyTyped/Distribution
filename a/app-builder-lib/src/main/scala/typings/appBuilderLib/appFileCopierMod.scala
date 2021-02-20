package typings.appBuilderLib

import typings.appBuilderLib.packagerMod.Packager
import typings.appBuilderLib.platformPackagerMod.PlatformPackager
import typings.builderUtil.fsMod.FileTransformer
import typings.fsExtra.mod.Stats
import typings.node.Buffer
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appFileCopierMod {
  
  @JSImport("app-builder-lib/out/util/appFileCopier", "computeFileSets")
  @js.native
  def computeFileSets(
    matchers: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileMatcher */ _
    ],
    transformer: Null,
    platformPackager: PlatformPackager[_],
    isElectronCompile: Boolean
  ): js.Promise[js.Array[ResolvedFileSet]] = js.native
  @JSImport("app-builder-lib/out/util/appFileCopier", "computeFileSets")
  @js.native
  def computeFileSets(
    matchers: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileMatcher */ _
    ],
    transformer: FileTransformer,
    platformPackager: PlatformPackager[_],
    isElectronCompile: Boolean
  ): js.Promise[js.Array[ResolvedFileSet]] = js.native
  
  @JSImport("app-builder-lib/out/util/appFileCopier", "copyAppFiles")
  @js.native
  def copyAppFiles(fileSet: ResolvedFileSet, packager: Packager, transformer: FileTransformer): js.Promise[Unit] = js.native
  
  @JSImport("app-builder-lib/out/util/appFileCopier", "getDestinationPath")
  @js.native
  def getDestinationPath(file: String, fileSet: ResolvedFileSet): String = js.native
  
  @JSImport("app-builder-lib/out/util/appFileCopier", "transformFiles")
  @js.native
  def transformFiles(transformer: FileTransformer, fileSet: ResolvedFileSet): js.Promise[Unit] = js.native
  
  @js.native
  trait ResolvedFileSet extends StObject {
    
    var destination: String = js.native
    
    var files: js.Array[String] = js.native
    
    var metadata: Map[String, Stats] = js.native
    
    var src: String = js.native
    
    var transformedFiles: js.UndefOr[(Map[Double, String | Buffer]) | Null] = js.native
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
