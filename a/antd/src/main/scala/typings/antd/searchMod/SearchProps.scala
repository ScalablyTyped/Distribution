package typings.antd.searchMod

import typings.antd.inputInputMod.InputProps
import typings.react.mod.ChangeEvent
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchProps extends InputProps {
  var enterButton: js.UndefOr[ReactNode] = js.native
  var inputPrefixCls: js.UndefOr[String] = js.native
  var loading: js.UndefOr[Boolean] = js.native
  var onSearch: js.UndefOr[
    js.Function2[
      /* value */ String, 
      /* event */ js.UndefOr[
        ChangeEvent[HTMLInputElement] | (MouseEvent[HTMLElement, NativeMouseEvent]) | KeyboardEvent[HTMLInputElement]
      ], 
      Unit
    ]
  ] = js.native
}

object SearchProps {
  @scala.inline
  def apply(): SearchProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchProps]
  }
  @scala.inline
  implicit class SearchPropsOps[Self <: SearchProps] (val x: Self) extends AnyVal {
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
    def setEnterButton(value: ReactNode): Self = this.set("enterButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnterButton: Self = this.set("enterButton", js.undefined)
    @scala.inline
    def setInputPrefixCls(value: String): Self = this.set("inputPrefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputPrefixCls: Self = this.set("inputPrefixCls", js.undefined)
    @scala.inline
    def setLoading(value: Boolean): Self = this.set("loading", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoading: Self = this.set("loading", js.undefined)
    @scala.inline
    def setOnSearch(
      value: (/* value */ String, /* event */ js.UndefOr[
          ChangeEvent[HTMLInputElement] | (MouseEvent[HTMLElement, NativeMouseEvent]) | KeyboardEvent[HTMLInputElement]
        ]) => Unit
    ): Self = this.set("onSearch", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnSearch: Self = this.set("onSearch", js.undefined)
  }
  
}

