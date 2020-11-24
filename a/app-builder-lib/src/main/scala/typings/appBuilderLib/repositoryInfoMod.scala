package typings.appBuilderLib

import typings.appBuilderLib.coreMod.SourceRepositoryInfo
import typings.appBuilderLib.metadataMod.Metadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("app-builder-lib/out/util/repositoryInfo", JSImport.Namespace)
@js.native
object repositoryInfoMod extends js.Object {
  
  def getRepositoryInfo(projectDir: String): js.Promise[SourceRepositoryInfo | Null] = js.native
  def getRepositoryInfo(projectDir: String, metadata: js.UndefOr[scala.Nothing], devMetadata: Metadata): js.Promise[SourceRepositoryInfo | Null] = js.native
  def getRepositoryInfo(projectDir: String, metadata: Metadata): js.Promise[SourceRepositoryInfo | Null] = js.native
  def getRepositoryInfo(projectDir: String, metadata: Metadata, devMetadata: Metadata): js.Promise[SourceRepositoryInfo | Null] = js.native
}
