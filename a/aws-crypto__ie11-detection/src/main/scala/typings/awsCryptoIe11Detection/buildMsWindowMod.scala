package typings.awsCryptoIe11Detection

import typings.awsCryptoIe11Detection.buildMsSubtleCryptoMod.MsSubtleCrypto
import typings.std.AddEventListenerOptions
import typings.std.EventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildMsWindowMod {
  
  @JSImport("@aws-crypto/ie11-detection/build/MsWindow", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isMsWindow(window: Window): /* is @aws-crypto/ie11-detection.@aws-crypto/ie11-detection/build/MsWindow.MsWindow */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMsWindow")(window.asInstanceOf[js.Any]).asInstanceOf[/* is @aws-crypto/ie11-detection.@aws-crypto/ie11-detection/build/MsWindow.MsWindow */ Boolean]
  
  trait MsCrypto extends StObject {
    
    def getRandomValues(toFill: js.typedarray.Uint8Array): Unit
    
    var subtle: MsSubtleCrypto
  }
  object MsCrypto {
    
    inline def apply(getRandomValues: js.typedarray.Uint8Array => Unit, subtle: MsSubtleCrypto): MsCrypto = {
      val __obj = js.Dynamic.literal(getRandomValues = js.Any.fromFunction1(getRandomValues), subtle = subtle.asInstanceOf[js.Any])
      __obj.asInstanceOf[MsCrypto]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MsCrypto] (val x: Self) extends AnyVal {
      
      inline def setGetRandomValues(value: js.typedarray.Uint8Array => Unit): Self = StObject.set(x, "getRandomValues", js.Any.fromFunction1(value))
      
      inline def setSubtle(value: MsSubtleCrypto): Self = StObject.set(x, "subtle", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MsWindow
    extends StObject
       with Window {
    
    var MSInputMethodContext: Any = js.native
    
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    
    var msCrypto: MsCrypto = js.native
    
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
  }
}
