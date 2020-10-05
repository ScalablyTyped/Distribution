package typings.antd.anon

import typings.rcFieldForm.interfaceMod.InternalNamePath
import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemRef extends js.Object {
  /** No! Do not use this in your code! */
  var name: js.UndefOr[String] = js.native
  /** No! Do not use this in your code! */
  def itemRef(name: InternalNamePath): js.Function1[/* node */ ReactElement, Unit] = js.native
}

object ItemRef {
  @scala.inline
  def apply(itemRef: InternalNamePath => js.Function1[/* node */ ReactElement, Unit]): ItemRef = {
    val __obj = js.Dynamic.literal(itemRef = js.Any.fromFunction1(itemRef))
    __obj.asInstanceOf[ItemRef]
  }
  @scala.inline
  implicit class ItemRefOps[Self <: ItemRef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setItemRef(value: InternalNamePath => js.Function1[/* node */ ReactElement, Unit]): Self = this.set("itemRef", js.Any.fromFunction1(value))
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

