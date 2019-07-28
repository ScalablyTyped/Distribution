package typings.atAngularCore.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core", "NgModuleFactoryLoader")
@js.native
abstract class NgModuleFactoryLoader () extends js.Object {
  def load(path: String): js.Promise[NgModuleFactory[_]] = js.native
}

