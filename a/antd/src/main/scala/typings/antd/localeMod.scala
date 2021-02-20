package typings.antd

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object localeMod {
  
  @JSImport("antd/lib/modal/locale", "changeConfirmLocale")
  @js.native
  def changeConfirmLocale(): Unit = js.native
  @JSImport("antd/lib/modal/locale", "changeConfirmLocale")
  @js.native
  def changeConfirmLocale(newLocale: ModalLocale): Unit = js.native
  
  @JSImport("antd/lib/modal/locale", "getConfirmLocale")
  @js.native
  def getConfirmLocale(): ModalLocale = js.native
  
  @js.native
  trait ModalLocale extends StObject {
    
    var cancelText: String = js.native
    
    var justOkText: String = js.native
    
    var okText: String = js.native
  }
  object ModalLocale {
    
    @scala.inline
    def apply(cancelText: String, justOkText: String, okText: String): ModalLocale = {
      val __obj = js.Dynamic.literal(cancelText = cancelText.asInstanceOf[js.Any], justOkText = justOkText.asInstanceOf[js.Any], okText = okText.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModalLocale]
    }
    
    @scala.inline
    implicit class ModalLocaleMutableBuilder[Self <: ModalLocale] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancelText(value: String): Self = StObject.set(x, "cancelText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJustOkText(value: String): Self = StObject.set(x, "justOkText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOkText(value: String): Self = StObject.set(x, "okText", value.asInstanceOf[js.Any])
    }
  }
}
