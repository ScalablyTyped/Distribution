package typings
package atAngularCoreLib.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Definition[DF /* <: DefinitionFactory[_] */] extends js.Object {
  var factory: DF | scala.Null
}

object Definition {
  @scala.inline
  def apply[DF /* <: DefinitionFactory[_] */](factory: DF = null): Definition[DF] = {
    val __obj = js.Dynamic.literal()
    if (factory != null) __obj.updateDynamic("factory")(factory.asInstanceOf[js.Any])
    __obj.asInstanceOf[Definition[DF]]
  }
}

