package typings.appBuilderLib

import typings.appBuilderLib.coreMod.SourceRepositoryInfo
import typings.appBuilderLib.metadataMod.Metadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object repositoryInfoMod {
  
  @JSImport("app-builder-lib/out/util/repositoryInfo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getRepositoryInfo(projectDir: String): js.Promise[SourceRepositoryInfo | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRepositoryInfo")(projectDir.asInstanceOf[js.Any]).asInstanceOf[js.Promise[SourceRepositoryInfo | Null]]
  inline def getRepositoryInfo(projectDir: String, metadata: Unit, devMetadata: Metadata): js.Promise[SourceRepositoryInfo | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("getRepositoryInfo")(projectDir.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any], devMetadata.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SourceRepositoryInfo | Null]]
  inline def getRepositoryInfo(projectDir: String, metadata: Metadata): js.Promise[SourceRepositoryInfo | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("getRepositoryInfo")(projectDir.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SourceRepositoryInfo | Null]]
  inline def getRepositoryInfo(projectDir: String, metadata: Metadata, devMetadata: Metadata): js.Promise[SourceRepositoryInfo | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("getRepositoryInfo")(projectDir.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any], devMetadata.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SourceRepositoryInfo | Null]]
}
