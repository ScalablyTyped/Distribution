package typings.antDesignReactNative.noticeBarPropsTypeMod

import typings.antDesignReactNative.antDesignReactNativeStrings.closable
import typings.antDesignReactNative.antDesignReactNativeStrings.link
import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NoticeBarPropsType extends js.Object {
  var action: js.UndefOr[ReactElement] = js.native
  var icon: js.UndefOr[ReactElement] = js.native
  var mode: js.UndefOr[closable | link] = js.native
  var onPress: js.UndefOr[js.Function0[Unit]] = js.native
}

object NoticeBarPropsType {
  @scala.inline
  def apply(): NoticeBarPropsType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NoticeBarPropsType]
  }
  @scala.inline
  implicit class NoticeBarPropsTypeOps[Self <: NoticeBarPropsType] (val x: Self) extends AnyVal {
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
    def setAction(value: ReactElement): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    @scala.inline
    def setIcon(value: ReactElement): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setMode(value: closable | link): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setOnPress(value: () => Unit): Self = this.set("onPress", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnPress: Self = this.set("onPress", js.undefined)
  }
  
}

