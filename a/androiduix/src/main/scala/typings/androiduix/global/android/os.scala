package typings.androiduix.global.android

import typings.androiduix.android.os.Handler.Callback
import typings.androiduix.java_.lang.Runnable
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.os")
@js.native
object os extends js.Object {
  @js.native
  class Bundle ()
    extends typings.androiduix.android.os.Bundle {
    def this(copy: typings.androiduix.android.os.Bundle) = this()
  }
  
  @js.native
  class Handler ()
    extends typings.androiduix.android.os.Handler {
    def this(callback: Callback) = this()
  }
  
  @js.native
  class Message ()
    extends typings.androiduix.android.os.Message
  
  @js.native
  class MessageQueue ()
    extends typings.androiduix.android.os.MessageQueue
  
  @js.native
  class SystemClock ()
    extends typings.androiduix.android.os.SystemClock
  
  @js.native
  class Trace ()
    extends typings.androiduix.android.os.Trace
  
  /* static members */
  @js.native
  object Handler extends js.Object {
    /* private */ def getPostMessage(r: js.Any, token: js.Any): js.Any = js.native
  }
  
  /* static members */
  @js.native
  object Message extends js.Object {
    var Type_Normal: Double = js.native
    var Type_Traversal: Double = js.native
    var sPool: js.Any = js.native
    def obtain(): typings.androiduix.android.os.Message = js.native
    def obtain(h: typings.androiduix.android.os.Handler): typings.androiduix.android.os.Message = js.native
    def obtain(h: typings.androiduix.android.os.Handler, callback: Runnable): typings.androiduix.android.os.Message = js.native
    def obtain(h: typings.androiduix.android.os.Handler, what: Double): typings.androiduix.android.os.Message = js.native
    def obtain(h: typings.androiduix.android.os.Handler, what: Double, arg1: Double, arg2: Double): typings.androiduix.android.os.Message = js.native
    def obtain(h: typings.androiduix.android.os.Handler, what: Double, arg1: Double, arg2: Double, obj: js.Any): typings.androiduix.android.os.Message = js.native
    def obtain(h: typings.androiduix.android.os.Handler, what: Double, obj: js.Any): typings.androiduix.android.os.Message = js.native
    def obtain(orig: typings.androiduix.android.os.Message): typings.androiduix.android.os.Message = js.native
  }
  
  /* static members */
  @js.native
  object MessageQueue extends js.Object {
    var _loopActive: js.Any = js.native
    var messages: Set[typings.androiduix.android.os.Message] = js.native
    /* private */ def checkLoop(): js.Any = js.native
    /* private */ def dispatchMessage(msg: js.Any): js.Any = js.native
    def enqueueMessage(msg: typings.androiduix.android.os.Message, when: Double): Boolean = js.native
    def getMessages(h: typings.androiduix.android.os.Handler, r: Runnable, `object`: js.Any): js.Array[typings.androiduix.android.os.Message] = js.native
    def getMessages(h: typings.androiduix.android.os.Handler, what: Double, `object`: js.Any): js.Array[typings.androiduix.android.os.Message] = js.native
    def hasMessages(h: typings.androiduix.android.os.Handler, r: Runnable, `object`: js.Any): Boolean = js.native
    def hasMessages(h: typings.androiduix.android.os.Handler, what: Double, `object`: js.Any): Boolean = js.native
    /* private */ def loop(): js.Any = js.native
    def recycleMessage(handler: typings.androiduix.android.os.Handler, message: typings.androiduix.android.os.Message): Unit = js.native
    def removeCallbacksAndMessages(h: typings.androiduix.android.os.Handler, `object`: js.Any): Unit = js.native
    def removeMessages(h: typings.androiduix.android.os.Handler, r: Runnable, `object`: js.Any): js.Any = js.native
    def removeMessages(h: typings.androiduix.android.os.Handler, what: Double, `object`: js.Any): js.Any = js.native
    /* private */ def requestNextLoop(): js.Any = js.native
  }
  
  /* static members */
  @js.native
  object SystemClock extends js.Object {
    def uptimeMillis(): Double = js.native
  }
  
  /* static members */
  @js.native
  object Trace extends js.Object {
    var MAX_SECTION_NAME_LEN: js.Any = js.native
    var TAG: js.Any = js.native
    var TRACE_TAG_ACTIVITY_MANAGER: Double = js.native
    var TRACE_TAG_ALWAYS: Double = js.native
    var TRACE_TAG_APP: Double = js.native
    var TRACE_TAG_AUDIO: Double = js.native
    var TRACE_TAG_CAMERA: Double = js.native
    var TRACE_TAG_DALVIK: Double = js.native
    var TRACE_TAG_GRAPHICS: Double = js.native
    var TRACE_TAG_HAL: Double = js.native
    var TRACE_TAG_INPUT: Double = js.native
    var TRACE_TAG_NEVER: Double = js.native
    var TRACE_TAG_NOT_READY: js.Any = js.native
    var TRACE_TAG_RESOURCES: Double = js.native
    var TRACE_TAG_RS: Double = js.native
    var TRACE_TAG_SYNC_MANAGER: Double = js.native
    var TRACE_TAG_VIDEO: Double = js.native
    var TRACE_TAG_VIEW: Double = js.native
    var TRACE_TAG_WEBVIEW: Double = js.native
    var TRACE_TAG_WINDOW_MANAGER: Double = js.native
    var sEnabledTags: js.Any = js.native
    def asyncTraceBegin(traceTag: Double, methodName: String, cookie: Double): Unit = js.native
    def asyncTraceEnd(traceTag: Double, methodName: String, cookie: Double): Unit = js.native
    def beginSection(sectionName: String): Unit = js.native
    /* private */ def cacheEnabledTags(): js.Any = js.native
    def endSection(): Unit = js.native
    def isTagEnabled(traceTag: Double): Boolean = js.native
    /* private */ def nativeAsyncTraceBegin(tag: js.Any, name: js.Any, cookie: js.Any): js.Any = js.native
    /* private */ def nativeAsyncTraceEnd(tag: js.Any, name: js.Any, cookie: js.Any): js.Any = js.native
    /* private */ def nativeGetEnabledTags(): js.Any = js.native
    /* private */ def nativeSetAppTracingAllowed(allowed: js.Any): js.Any = js.native
    /* private */ def nativeSetTracingEnabled(allowed: js.Any): js.Any = js.native
    /* private */ def nativeTraceBegin(tag: js.Any, name: js.Any): js.Any = js.native
    /* private */ def nativeTraceCounter(tag: js.Any, name: js.Any, value: js.Any): js.Any = js.native
    /* private */ def nativeTraceEnd(tag: js.Any): js.Any = js.native
    def setAppTracingAllowed(allowed: Boolean): Unit = js.native
    def setTracingEnabled(enabled: Boolean): Unit = js.native
    def traceBegin(traceTag: Double, methodName: String): Unit = js.native
    def traceCounter(traceTag: Double, counterName: String, counterValue: Double): Unit = js.native
    def traceEnd(traceTag: Double): Unit = js.native
  }
  
}

