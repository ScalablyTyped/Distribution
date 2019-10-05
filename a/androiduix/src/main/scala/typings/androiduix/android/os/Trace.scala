package typings.androiduix.android.os

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.os.Trace")
@js.native
class Trace () extends js.Object

/* static members */
@JSGlobal("android.os.Trace")
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

