package typings.atom.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("atom", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def watchPath(
    rootPath: String,
    options: js.Object,
    eventCallback: js.Function1[/* events */ FilesystemChangeEvent, Unit]
  ): js.Promise[PathWatcher] = js.native
}

