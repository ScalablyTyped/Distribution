package typings.antd.anon

import typings.rcFieldForm.interfaceMod.InternalNamePath
import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemRef extends js.Object {
  /** No! Do not use this in your code! */
  var name: js.UndefOr[String] = js.undefined
  /** No! Do not use this in your code! */
  def itemRef(name: InternalNamePath): js.Function1[/* node */ ReactElement, Unit]
}

object ItemRef {
  @scala.inline
  def apply(itemRef: InternalNamePath => js.Function1[/* node */ ReactElement, Unit], name: String = null): ItemRef = {
    val __obj = js.Dynamic.literal(itemRef = js.Any.fromFunction1(itemRef))
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemRef]
  }
}

