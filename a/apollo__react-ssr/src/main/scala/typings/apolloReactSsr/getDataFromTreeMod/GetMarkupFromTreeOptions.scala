package typings.apolloReactSsr.getDataFromTreeMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMarkupFromTreeOptions extends js.Object {
  var context: js.UndefOr[StringDictionary[js.Any]] = js.native
  var renderFunction: js.UndefOr[js.Function1[/* tree */ ReactElement, String]] = js.native
  var tree: ReactNode = js.native
}

object GetMarkupFromTreeOptions {
  @scala.inline
  def apply(): GetMarkupFromTreeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMarkupFromTreeOptions]
  }
  @scala.inline
  implicit class GetMarkupFromTreeOptionsOps[Self <: GetMarkupFromTreeOptions] (val x: Self) extends AnyVal {
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
    def setContext(value: StringDictionary[js.Any]): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setRenderFunction(value: /* tree */ ReactElement => String): Self = this.set("renderFunction", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRenderFunction: Self = this.set("renderFunction", js.undefined)
    @scala.inline
    def setTree(value: ReactNode): Self = this.set("tree", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTree: Self = this.set("tree", js.undefined)
  }
  
}

