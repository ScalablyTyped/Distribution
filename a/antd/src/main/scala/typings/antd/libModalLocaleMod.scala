package typings.antd

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModalLocaleMod {
  
  @JSImport("antd/lib/modal/locale", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def changeConfirmLocale(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("changeConfirmLocale")().asInstanceOf[Unit]
  inline def changeConfirmLocale(newLocale: ModalLocale): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("changeConfirmLocale")(newLocale.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getConfirmLocale(): ModalLocale = ^.asInstanceOf[js.Dynamic].applyDynamic("getConfirmLocale")().asInstanceOf[ModalLocale]
  
  trait ModalLocale extends StObject {
    
    var cancelText: String
    
    var justOkText: String
    
    var okText: String
  }
  object ModalLocale {
    
    inline def apply(cancelText: String, justOkText: String, okText: String): ModalLocale = {
      val __obj = js.Dynamic.literal(cancelText = cancelText.asInstanceOf[js.Any], justOkText = justOkText.asInstanceOf[js.Any], okText = okText.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModalLocale]
    }
    
    extension [Self <: ModalLocale](x: Self) {
      
      inline def setCancelText(value: String): Self = StObject.set(x, "cancelText", value.asInstanceOf[js.Any])
      
      inline def setJustOkText(value: String): Self = StObject.set(x, "justOkText", value.asInstanceOf[js.Any])
      
      inline def setOkText(value: String): Self = StObject.set(x, "okText", value.asInstanceOf[js.Any])
    }
  }
}
