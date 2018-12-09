package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("atom", JSImport.Namespace)
@js.native
object atomModMembers extends js.Object {
  def watchPath(
    rootPath: java.lang.String,
    options: js.Object,
    eventCallback: js.Function1[/* events */ FilesystemChangeEvent, scala.Unit]
  ): js.Promise[PathWatcher] = js.native
}

