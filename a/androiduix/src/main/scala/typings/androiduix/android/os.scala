package typings.androiduix.android

import typings.androiduix.android.os.Handler.Callback
import typings.androiduix.java_.lang.Runnable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object os {
  
  @js.native
  trait Bundle extends StObject {
    
    def containsKey(key: String): Boolean = js.native
    
    def get(key: String, defaultValue: js.Any): js.Any = js.native
    
    def put(key: String, value: js.Any): Unit = js.native
  }
  object Bundle {
    
    @scala.inline
    def apply(containsKey: String => Boolean, get: (String, js.Any) => js.Any, put: (String, js.Any) => Unit): Bundle = {
      val __obj = js.Dynamic.literal(containsKey = js.Any.fromFunction1(containsKey), get = js.Any.fromFunction2(get), put = js.Any.fromFunction2(put))
      __obj.asInstanceOf[Bundle]
    }
    
    @scala.inline
    implicit class BundleMutableBuilder[Self <: Bundle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContainsKey(value: String => Boolean): Self = StObject.set(x, "containsKey", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGet(value: (String, js.Any) => js.Any): Self = StObject.set(x, "get", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPut(value: (String, js.Any) => Unit): Self = StObject.set(x, "put", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait Handler extends StObject {
    
    def dispatchMessage(msg: Message): Unit = js.native
    
    def handleMessage(msg: Message): Unit = js.native
    
    def hasMessages(what: Double): Boolean = js.native
    def hasMessages(what: Double, `object`: js.Any): Boolean = js.native
    
    var mCallback: Callback = js.native
    
    def obtainMessage(): Message = js.native
    def obtainMessage(what: Double): Message = js.native
    def obtainMessage(what: Double, arg1: Double, arg2: Double): Message = js.native
    def obtainMessage(what: Double, arg1: Double, arg2: Double, obj: js.Any): Message = js.native
    def obtainMessage(what: Double, obj: js.Any): Message = js.native
    
    def post(r: Runnable): Boolean = js.native
    
    /* protected */ def postAsTraversal(r: Runnable): Boolean = js.native
    
    def postAtFrontOfQueue(r: Runnable): Boolean = js.native
    
    def postAtTime(r: Runnable, token: js.Any, uptimeMillis: Double): Boolean = js.native
    def postAtTime(r: Runnable, uptimeMillis: Double): Boolean = js.native
    
    def postDelayed(r: Runnable, delayMillis: Double): Boolean = js.native
    
    def removeCallbacks(r: Runnable): Unit = js.native
    def removeCallbacks(r: Runnable, token: js.Any): Unit = js.native
    
    def removeCallbacksAndMessages(): Unit = js.native
    def removeCallbacksAndMessages(token: js.Any): Unit = js.native
    
    def removeMessages(what: Double): Unit = js.native
    def removeMessages(what: Double, `object`: js.Any): Unit = js.native
    
    def sendEmptyMessage(what: Double): Boolean = js.native
    
    def sendEmptyMessageAtTime(what: Double, uptimeMillis: Double): Boolean = js.native
    
    def sendEmptyMessageDelayed(what: Double, delayMillis: Double): Boolean = js.native
    
    def sendMessage(msg: Message): Boolean = js.native
    
    def sendMessageAtFrontOfQueue(msg: Message): Boolean = js.native
    
    def sendMessageAtTime(msg: Message, uptimeMillis: Double): Boolean = js.native
    
    def sendMessageDelayed(msg: Message, delayMillis: Double): Boolean = js.native
  }
  object Handler {
    
    @js.native
    trait Callback extends StObject {
      
      def handleMessage(msg: Message): Boolean = js.native
    }
    object Callback {
      
      @scala.inline
      def apply(handleMessage: Message => Boolean): Callback = {
        val __obj = js.Dynamic.literal(handleMessage = js.Any.fromFunction1(handleMessage))
        __obj.asInstanceOf[Callback]
      }
      
      @scala.inline
      implicit class CallbackMutableBuilder[Self <: Callback] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setHandleMessage(value: Message => Boolean): Self = StObject.set(x, "handleMessage", js.Any.fromFunction1(value))
      }
    }
  }
  
  @js.native
  trait Message extends StObject {
    
    var arg1: Double = js.native
    
    var arg2: Double = js.native
    
    var callback: Runnable = js.native
    
    /* protected */ def clearForRecycle(): Unit = js.native
    
    def copyFrom(o: Message): Unit = js.native
    
    def getTarget(): Handler = js.native
    
    var mType: js.Any = js.native
    
    var obj: js.Any = js.native
    
    def recycle(): Unit = js.native
    
    def sendToTarget(): Unit = js.native
    
    def setTarget(target: Handler): Unit = js.native
    
    var target: Handler = js.native
    
    def toString(now: Double): String = js.native
    
    var what: Double = js.native
    
    var when: Double = js.native
  }
  
  @js.native
  trait MessageQueue extends StObject
  
  @js.native
  trait SystemClock extends StObject
  
  @js.native
  trait Trace extends StObject
}
