package typings.appBuilderLib

import typings.appBuilderLib.coreMod.SourceRepositoryInfo
import typings.appBuilderLib.metadataMod.Metadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object repositoryInfoMod {
  
  @JSImport("app-builder-lib/out/util/repositoryInfo", "getRepositoryInfo")
  @js.native
  def getRepositoryInfo(projectDir: String): js.Promise[SourceRepositoryInfo | Null] = js.native
  @JSImport("app-builder-lib/out/util/repositoryInfo", "getRepositoryInfo")
  @js.native
  def getRepositoryInfo(projectDir: String, metadata: js.UndefOr[scala.Nothing], devMetadata: Metadata): js.Promise[SourceRepositoryInfo | Null] = js.native
  @JSImport("app-builder-lib/out/util/repositoryInfo", "getRepositoryInfo")
  @js.native
  def getRepositoryInfo(projectDir: String, metadata: Metadata): js.Promise[SourceRepositoryInfo | Null] = js.native
  @JSImport("app-builder-lib/out/util/repositoryInfo", "getRepositoryInfo")
  @js.native
  def getRepositoryInfo(projectDir: String, metadata: Metadata, devMetadata: Metadata): js.Promise[SourceRepositoryInfo | Null] = js.native
}
