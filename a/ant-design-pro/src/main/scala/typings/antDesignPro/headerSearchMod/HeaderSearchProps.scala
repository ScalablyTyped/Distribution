package typings.antDesignPro.headerSearchMod

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeaderSearchProps extends js.Object {
  var className: js.UndefOr[String] = js.native
  var dataSource: js.UndefOr[js.Array[String]] = js.native
  var defaultOpen: js.UndefOr[Boolean] = js.native
  var onChange: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.native
  var onPressEnter: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.native
  var onSearch: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.native
  var onVisibleChange: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.native
  var open: js.UndefOr[Boolean] = js.native
  var placeholder: js.UndefOr[String] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
}

object HeaderSearchProps {
  @scala.inline
  def apply(): HeaderSearchProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeaderSearchProps]
  }
  @scala.inline
  implicit class HeaderSearchPropsOps[Self <: HeaderSearchProps] (val x: Self) extends AnyVal {
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setDataSourceVarargs(value: String*): Self = this.set("dataSource", js.Array(value :_*))
    @scala.inline
    def setDataSource(value: js.Array[String]): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    @scala.inline
    def setDefaultOpen(value: Boolean): Self = this.set("defaultOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultOpen: Self = this.set("defaultOpen", js.undefined)
    @scala.inline
    def setOnChange(value: /* value */ String => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnPressEnter(value: /* value */ String => Unit): Self = this.set("onPressEnter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPressEnter: Self = this.set("onPressEnter", js.undefined)
    @scala.inline
    def setOnSearch(value: /* value */ String => Unit): Self = this.set("onSearch", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSearch: Self = this.set("onSearch", js.undefined)
    @scala.inline
    def setOnVisibleChange(value: /* visible */ Boolean => Unit): Self = this.set("onVisibleChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnVisibleChange: Self = this.set("onVisibleChange", js.undefined)
    @scala.inline
    def setOpen(value: Boolean): Self = this.set("open", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

