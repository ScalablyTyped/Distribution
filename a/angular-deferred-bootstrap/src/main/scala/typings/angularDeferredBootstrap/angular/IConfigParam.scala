package typings.angularDeferredBootstrap.angular

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IConfigParam extends js.Object {
  var element: js.UndefOr[Node] = js.native
  var module: js.UndefOr[String] = js.native
  var resolve: js.Any = js.native
}

object IConfigParam {
  @scala.inline
  def apply(resolve: js.Any): IConfigParam = {
    val __obj = js.Dynamic.literal(resolve = resolve.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConfigParam]
  }
  @scala.inline
  implicit class IConfigParamOps[Self <: IConfigParam] (val x: Self) extends AnyVal {
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
    def setResolve(value: js.Any): Self = this.set("resolve", value.asInstanceOf[js.Any])
    @scala.inline
    def setElement(value: Node): Self = this.set("element", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    @scala.inline
    def setModule(value: String): Self = this.set("module", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModule: Self = this.set("module", js.undefined)
  }
  
}

