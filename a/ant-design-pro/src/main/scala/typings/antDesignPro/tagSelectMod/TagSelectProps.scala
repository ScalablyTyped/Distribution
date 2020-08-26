package typings.antDesignPro.tagSelectMod

import typings.antDesignPro.anon.CollapseText
import typings.antDesignPro.tagSelectOptionMod.TagSelectOptionProps
import typings.react.mod.CSSProperties
import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagSelectProps extends js.Object {
  var Option: TagSelectOptionProps = js.native
  var actionsText: js.UndefOr[CollapseText] = js.native
  var children: ReactElement | js.Array[ReactElement] = js.native
  var className: String = js.native
  var expandable: js.UndefOr[Boolean] = js.native
  var hideCheckAll: js.UndefOr[Boolean] = js.native
  var onChange: js.UndefOr[js.Function1[/* value */ js.Array[String], Unit]] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var value: js.UndefOr[js.Array[Double | String]] = js.native
}

object TagSelectProps {
  @scala.inline
  def apply(Option: TagSelectOptionProps, children: ReactElement | js.Array[ReactElement], className: String): TagSelectProps = {
    val __obj = js.Dynamic.literal(Option = Option.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagSelectProps]
  }
  @scala.inline
  implicit class TagSelectPropsOps[Self <: TagSelectProps] (val x: Self) extends AnyVal {
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
    def setOption(value: TagSelectOptionProps): Self = this.set("Option", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildrenVarargs(value: ReactElement*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: ReactElement | js.Array[ReactElement]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def setActionsText(value: CollapseText): Self = this.set("actionsText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActionsText: Self = this.set("actionsText", js.undefined)
    @scala.inline
    def setExpandable(value: Boolean): Self = this.set("expandable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpandable: Self = this.set("expandable", js.undefined)
    @scala.inline
    def setHideCheckAll(value: Boolean): Self = this.set("hideCheckAll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideCheckAll: Self = this.set("hideCheckAll", js.undefined)
    @scala.inline
    def setOnChange(value: /* value */ js.Array[String] => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setValueVarargs(value: (Double | String)*): Self = this.set("value", js.Array(value :_*))
    @scala.inline
    def setValue(value: js.Array[Double | String]): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

