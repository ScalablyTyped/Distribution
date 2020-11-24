package typings.antDesignReactNative.stepsItemMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StepsItemProps extends js.Object {
  
  var current: js.UndefOr[Double] = js.native
  
  var description: js.UndefOr[ReactNode] = js.native
  
  var direction: js.UndefOr[String] = js.native
  
  var errorTail: js.UndefOr[Double] = js.native
  
  var icon: js.UndefOr[ReactNode] = js.native
  
  var index: js.UndefOr[Double] = js.native
  
  var last: js.UndefOr[Boolean] = js.native
  
  var renderIcon: js.UndefOr[js.Function1[/* params */ RenderIconParams, ReactNode]] = js.native
  
  var size: js.UndefOr[String] = js.native
  
  var status: js.UndefOr[String] = js.native
  
  var styles: js.UndefOr[js.Any] = js.native
  
  var title: js.UndefOr[ReactNode] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object StepsItemProps {
  
  @scala.inline
  def apply(): StepsItemProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StepsItemProps]
  }
  
  @scala.inline
  implicit class StepsItemPropsOps[Self <: StepsItemProps] (val x: Self) extends AnyVal {
    
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
    def setCurrent(value: Double): Self = this.set("current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrent: Self = this.set("current", js.undefined)
    
    @scala.inline
    def setDescription(value: ReactNode): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDirection(value: String): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setErrorTail(value: Double): Self = this.set("errorTail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorTail: Self = this.set("errorTail", js.undefined)
    
    @scala.inline
    def setIcon(value: ReactNode): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    
    @scala.inline
    def setLast(value: Boolean): Self = this.set("last", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLast: Self = this.set("last", js.undefined)
    
    @scala.inline
    def setRenderIcon(value: /* params */ RenderIconParams => ReactNode): Self = this.set("renderIcon", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRenderIcon: Self = this.set("renderIcon", js.undefined)
    
    @scala.inline
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setStyles(value: js.Any): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    
    @scala.inline
    def setTitle(value: ReactNode): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
