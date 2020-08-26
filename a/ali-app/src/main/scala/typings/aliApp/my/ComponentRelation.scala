package typings.aliApp.my

import typings.aliApp.aliAppStrings.ancestor
import typings.aliApp.aliAppStrings.child
import typings.aliApp.aliAppStrings.descendant
import typings.aliApp.aliAppStrings.parent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComponentRelation extends js.Object {
  /** 关系生命周期函数，当关系在页面节点树中发生改变时触发，触发时机在组件moved生命周期之后 */
  var linkChanged: js.UndefOr[js.Function1[/* target */ Component, Unit]] = js.native
  /** 关系生命周期函数，当关系被建立在页面节点树中时触发，触发时机在组件attached生命周期之后 */
  var linked: js.UndefOr[js.Function1[/* target */ Component, Unit]] = js.native
  /** 如果这一项被设置，则它表示关联的目标节点所应具有的behavior，所有拥有这一behavior的组件节点都会被关联 */
  var target: js.UndefOr[String] = js.native
  /** 目标组件的相对关系，可选的值为 parent 、 child 、 ancestor 、 descendant */
  var `type`: parent | child | ancestor | descendant = js.native
  /** 关系生命周期函数，当关系脱离页面节点树时触发，触发时机在组件detached生命周期之后 */
  var unlinked: js.UndefOr[js.Function1[/* target */ Component, Unit]] = js.native
}

object ComponentRelation {
  @scala.inline
  def apply(`type`: parent | child | ancestor | descendant): ComponentRelation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentRelation]
  }
  @scala.inline
  implicit class ComponentRelationOps[Self <: ComponentRelation] (val x: Self) extends AnyVal {
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
    def setType(value: parent | child | ancestor | descendant): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setLinkChanged(value: /* target */ Component => Unit): Self = this.set("linkChanged", js.Any.fromFunction1(value))
    @scala.inline
    def deleteLinkChanged: Self = this.set("linkChanged", js.undefined)
    @scala.inline
    def setLinked(value: /* target */ Component => Unit): Self = this.set("linked", js.Any.fromFunction1(value))
    @scala.inline
    def deleteLinked: Self = this.set("linked", js.undefined)
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    @scala.inline
    def setUnlinked(value: /* target */ Component => Unit): Self = this.set("unlinked", js.Any.fromFunction1(value))
    @scala.inline
    def deleteUnlinked: Self = this.set("unlinked", js.undefined)
  }
  
}

