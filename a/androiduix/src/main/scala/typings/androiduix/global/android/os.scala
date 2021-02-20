package typings.androiduix.global.android

import typings.androiduix.android.os.Handler.Callback
import typings.androiduix.java_.lang.Runnable
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object os {
  
  @JSGlobal("android.os.Bundle")
  @js.native
  class Bundle ()
    extends typings.androiduix.android.os.Bundle {
    def this(copy: typings.androiduix.android.os.Bundle) = this()
  }
  
  @JSGlobal("android.os.Handler")
  @js.native
  class Handler ()
    extends typings.androiduix.android.os.Handler {
    def this(callback: Callback) = this()
  }
  object Handler {
    
    /* static member */
    @JSGlobal("android.os.Handler.getPostMessage")
    @js.native
    def getPostMessage(r: js.Any, token: js.Any): js.Any = js.native
  }
  
  @JSGlobal("android.os.Message")
  @js.native
  class Message ()
    extends typings.androiduix.android.os.Message
  object Message {
    
    @JSGlobal("android.os.Message")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("android.os.Message.Type_Normal")
    @js.native
    def TypeNormal: Double = js.native
    
    @scala.inline
    def TypeNormal_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Type_Normal")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("android.os.Message.Type_Traversal")
    @js.native
    def TypeTraversal: Double = js.native
    
    @scala.inline
    def TypeTraversal_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Type_Traversal")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("android.os.Message.obtain")
    @js.native
    def obtain(): typings.androiduix.android.os.Message = js.native
    /* static member */
    @JSGlobal("android.os.Message.obtain")
    @js.native
    def obtain(h: typings.androiduix.android.os.Handler): typings.androiduix.android.os.Message = js.native
    /* static member */
    @JSGlobal("android.os.Message.obtain")
    @js.native
    def obtain(h: typings.androiduix.android.os.Handler, callback: Runnable): typings.androiduix.android.os.Message = js.native
    /* static member */
    @JSGlobal("android.os.Message.obtain")
    @js.native
    def obtain(h: typings.androiduix.android.os.Handler, what: Double): typings.androiduix.android.os.Message = js.native
    /* static member */
    @JSGlobal("android.os.Message.obtain")
    @js.native
    def obtain(h: typings.androiduix.android.os.Handler, what: Double, arg1: Double, arg2: Double): typings.androiduix.android.os.Message = js.native
    /* static member */
    @JSGlobal("android.os.Message.obtain")
    @js.native
    def obtain(h: typings.androiduix.android.os.Handler, what: Double, arg1: Double, arg2: Double, obj: js.Any): typings.androiduix.android.os.Message = js.native
    /* static member */
    @JSGlobal("android.os.Message.obtain")
    @js.native
    def obtain(h: typings.androiduix.android.os.Handler, what: Double, obj: js.Any): typings.androiduix.android.os.Message = js.native
    /* static member */
    @JSGlobal("android.os.Message.obtain")
    @js.native
    def obtain(orig: typings.androiduix.android.os.Message): typings.androiduix.android.os.Message = js.native
    
    /* static member */
    @JSGlobal("android.os.Message.sPool")
    @js.native
    def sPool: js.Any = js.native
    @scala.inline
    def sPool_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sPool")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("android.os.MessageQueue")
  @js.native
  class MessageQueue ()
    extends typings.androiduix.android.os.MessageQueue
  object MessageQueue {
    
    @JSGlobal("android.os.MessageQueue")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("android.os.MessageQueue.checkLoop")
    @js.native
    def checkLoop(): js.Any = js.native
    
    /* static member */
    @JSGlobal("android.os.MessageQueue.dispatchMessage")
    @js.native
    def dispatchMessage(msg: js.Any): js.Any = js.native
    
    /* static member */
    @JSGlobal("android.os.MessageQueue.enqueueMessage")
    @js.native
    def enqueueMessage(msg: typings.androiduix.android.os.Message, when: Double): Boolean = js.native
    
    /* static member */
    @JSGlobal("android.os.MessageQueue.getMessages")
    @js.native
    def getMessages(h: typings.androiduix.android.os.Handler, r: Runnable, `object`: js.Any): js.Array[typings.androiduix.android.os.Message] = js.native
    /* static member */
    @JSGlobal("android.os.MessageQueue.getMessages")
    @js.native
    def getMessages(h: typings.androiduix.android.os.Handler, what: Double, `object`: js.Any): js.Array[typings.androiduix.android.os.Message] = js.native
    
    /* static member */
    @JSGlobal("android.os.MessageQueue.hasMessages")
    @js.native
    def hasMessages(h: typings.androiduix.android.os.Handler, r: Runnable, `object`: js.Any): Boolean = js.native
    /* static member */
    @JSGlobal("android.os.MessageQueue.hasMessages")
    @js.native
    def hasMessages(h: typings.androiduix.android.os.Handler, what: Double, `object`: js.Any): Boolean = js.native
    
    /* static member */
    @JSGlobal("android.os.MessageQueue.loop")
    @js.native
    def loop(): js.Any = js.native
    
    /* static member */
    @JSGlobal("android.os.MessageQueue._loopActive")
    @js.native
    def loopActive: js.Any = js.native
    
    @scala.inline
    def loopActive_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_loopActive")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("android.os.MessageQueue.messages")
    @js.native
    def messages: Set[typings.androiduix.android.os.Message] = js.native
    @scala.inline
    def messages_=(x: Set[typings.androiduix.android.os.Message]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("messages")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("android.os.MessageQueue.recycleMessage")
    @js.native
    def recycleMessage(handler: typings.androiduix.android.os.Handler, message: typings.androiduix.android.os.Message): Unit = js.native
    
    /* static member */
    @JSGlobal("android.os.MessageQueue.removeCallbacksAndMessages")
    @js.native
    def removeCallbacksAndMessages(h: typings.androiduix.android.os.Handler, `object`: js.Any): Unit = js.native
    
    /* static member */
    @JSGlobal("android.os.MessageQueue.removeMessages")
    @js.native
    def removeMessages(h: typings.androiduix.android.os.Handler, r: Runnable, `object`: js.Any): js.Any = js.native
    /* static member */
    @JSGlobal("android.os.MessageQueue.removeMessages")
    @js.native
    def removeMessages(h: typings.androiduix.android.os.Handler, what: Double, `object`: js.Any): js.Any = js.native
    
    /* static member */
    @JSGlobal("android.os.MessageQueue.requestNextLoop")
    @js.native
    def requestNextLoop(): js.Any = js.native
  }
  
  @JSGlobal("android.os.SystemClock")
  @js.native
  class SystemClock ()
    extends typings.androiduix.android.os.SystemClock
  object SystemClock {
    
    /* static member */
    @JSGlobal("android.os.SystemClock.uptimeMillis")
    @js.native
    def uptimeMillis(): Double = js.native
  }
  
  @JSGlobal("android.os.Trace")
  @js.native
  class Trace ()
    extends typings.androiduix.android.os.Trace
  object Trace {
    
    @JSGlobal("android.os.Trace")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("android.os.Trace.MAX_SECTION_NAME_LEN")
    @js.native
    def MAX_SECTION_NAME_LEN: js.Any = js.native
    @scala.inline
    def MAX_SECTION_NAME_LEN_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_SECTION_NAME_LEN")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("android.os.Trace.TAG")
    @js.native
    def TAG: js.Any = js.native
    @scala.inline
    def TAG_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TAG")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("android.os.Trace.TRACE_TAG_ACTIVITY_MANAGER")
    @js.native
    def TRACE_TAG_ACTIVITY_MANAGER: Double = js.native
    @scala.inline
    def TRACE_TAG_ACTIVITY_MANAGER_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TRACE_TAG_ACTIVITY_MANAGER")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("android.os.Trace.TRACE_TAG_ALWAYS")
    @js.native
    def TRACE_TAG_ALWAYS: Double = js.native
    @scala.inline
    def TRACE_TAG_ALWAYS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TRACE_TAG_ALWAYS")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("android.os.Trace.TRACE_TAG_APP")
    @js.native
    def TRACE_TAG_APP: Double = js.native
    @scala.inline
    def TRACE_TAG_APP_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TRACE_TAG_APP")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("android.os.Trace.TRACE_TAG_AUDIO")
    @js.native
    def TRACE_TAG_AUDIO: Double = js.native
    @scala.inline
    def TRACE_TAG_AUDIO_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TRACE_TAG_AUDIO")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("android.os.Trace.TRACE_TAG_CAMERA")
    @js.native
    def TRACE_TAG_CAMERA: Double = js.native
    @scala.inline
    def TRACE_TAG_CAMERA_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TRACE_TAG_CAMERA")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("android.os.Trace.TRACE_TAG_DALVIK")
    @js.native
    def TRACE_TAG_DALVIK: Double = js.native
    @scala.inline
    def TRACE_TAG_DALVIK_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TRACE_TAG_DALVIK")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("android.os.Trace.TRACE_TAG_GRAPHICS")
    @js.native
    def TRACE_TAG_GRAPHICS: Double = js.native
    @scala.inline
    def TRACE_TAG_GRAPHICS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TRACE_TAG_GRAPHICS")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("android.os.Trace.TRACE_TAG_HAL")
    @js.native
    def TRACE_TAG_HAL: Double = js.native
    @scala.inline
    def TRACE_TAG_HAL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TRACE_TAG_HAL")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("android.os.Trace.TRACE_TAG_INPUT")
    @js.native
    def TRACE_TAG_INPUT: Double = js.native
    @scala.inline
    def TRACE_TAG_INPUT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TRACE_TAG_INPUT")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("android.os.Trace.TRACE_TAG_NEVER")
    @js.native
    def TRACE_TAG_NEVER: Double = js.native
    @scala.inline
    def TRACE_TAG_NEVER_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TRACE_TAG_NEVER")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("android.os.Trace.TRACE_TAG_NOT_READY")
    @js.native
    def TRACE_TAG_NOT_READY: js.Any = js.native
    @scala.inline
    def TRACE_TAG_NOT_READY_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TRACE_TAG_NOT_READY")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("android.os.Trace.TRACE_TAG_RESOURCES")
    @js.native
    def TRACE_TAG_RESOURCES: Double = js.native
    @scala.inline
    def TRACE_TAG_RESOURCES_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TRACE_TAG_RESOURCES")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("android.os.Trace.TRACE_TAG_RS")
    @js.native
    def TRACE_TAG_RS: Double = js.native
    @scala.inline
    def TRACE_TAG_RS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TRACE_TAG_RS")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("android.os.Trace.TRACE_TAG_SYNC_MANAGER")
    @js.native
    def TRACE_TAG_SYNC_MANAGER: Double = js.native
    @scala.inline
    def TRACE_TAG_SYNC_MANAGER_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TRACE_TAG_SYNC_MANAGER")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("android.os.Trace.TRACE_TAG_VIDEO")
    @js.native
    def TRACE_TAG_VIDEO: Double = js.native
    @scala.inline
    def TRACE_TAG_VIDEO_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TRACE_TAG_VIDEO")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("android.os.Trace.TRACE_TAG_VIEW")
    @js.native
    def TRACE_TAG_VIEW: Double = js.native
    @scala.inline
    def TRACE_TAG_VIEW_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TRACE_TAG_VIEW")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("android.os.Trace.TRACE_TAG_WEBVIEW")
    @js.native
    def TRACE_TAG_WEBVIEW: Double = js.native
    @scala.inline
    def TRACE_TAG_WEBVIEW_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TRACE_TAG_WEBVIEW")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("android.os.Trace.TRACE_TAG_WINDOW_MANAGER")
    @js.native
    def TRACE_TAG_WINDOW_MANAGER: Double = js.native
    @scala.inline
    def TRACE_TAG_WINDOW_MANAGER_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TRACE_TAG_WINDOW_MANAGER")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("android.os.Trace.asyncTraceBegin")
    @js.native
    def asyncTraceBegin(traceTag: Double, methodName: String, cookie: Double): Unit = js.native
    
    /* static member */
    @JSGlobal("android.os.Trace.asyncTraceEnd")
    @js.native
    def asyncTraceEnd(traceTag: Double, methodName: String, cookie: Double): Unit = js.native
    
    /* static member */
    @JSGlobal("android.os.Trace.beginSection")
    @js.native
    def beginSection(sectionName: String): Unit = js.native
    
    /* static member */
    @JSGlobal("android.os.Trace.cacheEnabledTags")
    @js.native
    def cacheEnabledTags(): js.Any = js.native
    
    /* static member */
    @JSGlobal("android.os.Trace.endSection")
    @js.native
    def endSection(): Unit = js.native
    
    /* static member */
    @JSGlobal("android.os.Trace.isTagEnabled")
    @js.native
    def isTagEnabled(traceTag: Double): Boolean = js.native
    
    /* static member */
    @JSGlobal("android.os.Trace.nativeAsyncTraceBegin")
    @js.native
    def nativeAsyncTraceBegin(tag: js.Any, name: js.Any, cookie: js.Any): js.Any = js.native
    
    /* static member */
    @JSGlobal("android.os.Trace.nativeAsyncTraceEnd")
    @js.native
    def nativeAsyncTraceEnd(tag: js.Any, name: js.Any, cookie: js.Any): js.Any = js.native
    
    /* static member */
    @JSGlobal("android.os.Trace.nativeGetEnabledTags")
    @js.native
    def nativeGetEnabledTags(): js.Any = js.native
    
    /* static member */
    @JSGlobal("android.os.Trace.nativeSetAppTracingAllowed")
    @js.native
    def nativeSetAppTracingAllowed(allowed: js.Any): js.Any = js.native
    
    /* static member */
    @JSGlobal("android.os.Trace.nativeSetTracingEnabled")
    @js.native
    def nativeSetTracingEnabled(allowed: js.Any): js.Any = js.native
    
    /* static member */
    @JSGlobal("android.os.Trace.nativeTraceBegin")
    @js.native
    def nativeTraceBegin(tag: js.Any, name: js.Any): js.Any = js.native
    
    /* static member */
    @JSGlobal("android.os.Trace.nativeTraceCounter")
    @js.native
    def nativeTraceCounter(tag: js.Any, name: js.Any, value: js.Any): js.Any = js.native
    
    /* static member */
    @JSGlobal("android.os.Trace.nativeTraceEnd")
    @js.native
    def nativeTraceEnd(tag: js.Any): js.Any = js.native
    
    /* static member */
    @JSGlobal("android.os.Trace.sEnabledTags")
    @js.native
    def sEnabledTags: js.Any = js.native
    @scala.inline
    def sEnabledTags_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sEnabledTags")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("android.os.Trace.setAppTracingAllowed")
    @js.native
    def setAppTracingAllowed(allowed: Boolean): Unit = js.native
    
    /* static member */
    @JSGlobal("android.os.Trace.setTracingEnabled")
    @js.native
    def setTracingEnabled(enabled: Boolean): Unit = js.native
    
    /* static member */
    @JSGlobal("android.os.Trace.traceBegin")
    @js.native
    def traceBegin(traceTag: Double, methodName: String): Unit = js.native
    
    /* static member */
    @JSGlobal("android.os.Trace.traceCounter")
    @js.native
    def traceCounter(traceTag: Double, counterName: String, counterValue: Double): Unit = js.native
    
    /* static member */
    @JSGlobal("android.os.Trace.traceEnd")
    @js.native
    def traceEnd(traceTag: Double): Unit = js.native
  }
}
