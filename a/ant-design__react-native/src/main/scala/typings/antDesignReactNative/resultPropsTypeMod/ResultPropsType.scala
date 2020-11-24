package typings.antDesignReactNative.resultPropsTypeMod

import typings.antDesignReactNative.antDesignReactNativeStrings.ghost
import typings.antDesignReactNative.antDesignReactNativeStrings.primary
import typings.react.mod.ReactNode
import typings.reactNative.mod.ImagePropertiesSourceOptions
import typings.reactNative.mod.ImageURISource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResultPropsType extends js.Object {
  
  var buttonText: js.UndefOr[String] = js.native
  
  var buttonType: js.UndefOr[primary | ghost] = js.native
  
  var img: js.UndefOr[ReactNode] = js.native
  
  var imgUrl: js.UndefOr[ImagePropertiesSourceOptions] = js.native
  
  var message: js.UndefOr[ReactNode] = js.native
  
  var onButtonClick: js.UndefOr[js.Function1[/* e */ js.Any, Unit]] = js.native
  
  var title: js.UndefOr[ReactNode] = js.native
}
object ResultPropsType {
  
  @scala.inline
  def apply(): ResultPropsType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResultPropsType]
  }
  
  @scala.inline
  implicit class ResultPropsTypeOps[Self <: ResultPropsType] (val x: Self) extends AnyVal {
    
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
    def setButtonText(value: String): Self = this.set("buttonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtonText: Self = this.set("buttonText", js.undefined)
    
    @scala.inline
    def setButtonType(value: primary | ghost): Self = this.set("buttonType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtonType: Self = this.set("buttonType", js.undefined)
    
    @scala.inline
    def setImg(value: ReactNode): Self = this.set("img", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImg: Self = this.set("img", js.undefined)
    
    @scala.inline
    def setImgUrlVarargs(value: ImageURISource*): Self = this.set("imgUrl", js.Array(value :_*))
    
    @scala.inline
    def setImgUrl(value: ImagePropertiesSourceOptions): Self = this.set("imgUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImgUrl: Self = this.set("imgUrl", js.undefined)
    
    @scala.inline
    def setMessage(value: ReactNode): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    
    @scala.inline
    def setOnButtonClick(value: /* e */ js.Any => Unit): Self = this.set("onButtonClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnButtonClick: Self = this.set("onButtonClick", js.undefined)
    
    @scala.inline
    def setTitle(value: ReactNode): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
