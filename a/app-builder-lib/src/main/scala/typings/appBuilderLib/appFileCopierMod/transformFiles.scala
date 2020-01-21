package typings.appBuilderLib.appFileCopierMod

import typings.builderUtil.fsMod.FileTransformer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/out/util/appFileCopier", "transformFiles")
@js.native
object transformFiles extends js.Object {
  def apply(transformer: FileTransformer, fileSet: ResolvedFileSet): js.Promise[Unit] = js.native
}

