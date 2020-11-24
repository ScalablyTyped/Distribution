package typings.artyomJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SayCallbacksObject extends js.Object {
  
  var lang: js.UndefOr[String] = js.native
  
  var onEnd: js.UndefOr[js.Function] = js.native
  
  var onStart: js.UndefOr[js.Function] = js.native
}
object SayCallbacksObject {
  
  @scala.inline
  def apply(): SayCallbacksObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SayCallbacksObject]
  }
  
  @scala.inline
  implicit class SayCallbacksObjectOps[Self <: SayCallbacksObject] (val x: Self) extends AnyVal {
    
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
    def setLang(value: String): Self = this.set("lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLang: Self = this.set("lang", js.undefined)
    
    @scala.inline
    def setOnEnd(value: js.Function): Self = this.set("onEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnEnd: Self = this.set("onEnd", js.undefined)
    
    @scala.inline
    def setOnStart(value: js.Function): Self = this.set("onStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnStart: Self = this.set("onStart", js.undefined)
  }
}
