package typings
package androiduixLib.androidNs.osNs

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
  var TRACE_TAG_ACTIVITY_MANAGER: scala.Double = js.native
  var TRACE_TAG_ALWAYS: scala.Double = js.native
  var TRACE_TAG_APP: scala.Double = js.native
  var TRACE_TAG_AUDIO: scala.Double = js.native
  var TRACE_TAG_CAMERA: scala.Double = js.native
  var TRACE_TAG_DALVIK: scala.Double = js.native
  var TRACE_TAG_GRAPHICS: scala.Double = js.native
  var TRACE_TAG_HAL: scala.Double = js.native
  var TRACE_TAG_INPUT: scala.Double = js.native
  var TRACE_TAG_NEVER: scala.Double = js.native
  var TRACE_TAG_NOT_READY: js.Any = js.native
  var TRACE_TAG_RESOURCES: scala.Double = js.native
  var TRACE_TAG_RS: scala.Double = js.native
  var TRACE_TAG_SYNC_MANAGER: scala.Double = js.native
  var TRACE_TAG_VIDEO: scala.Double = js.native
  var TRACE_TAG_VIEW: scala.Double = js.native
  var TRACE_TAG_WEBVIEW: scala.Double = js.native
  var TRACE_TAG_WINDOW_MANAGER: scala.Double = js.native
  var sEnabledTags: js.Any = js.native
  def asyncTraceBegin(traceTag: scala.Double, methodName: java.lang.String, cookie: scala.Double): scala.Unit = js.native
  def asyncTraceEnd(traceTag: scala.Double, methodName: java.lang.String, cookie: scala.Double): scala.Unit = js.native
  def beginSection(sectionName: java.lang.String): scala.Unit = js.native
  /* private */ def cacheEnabledTags(): js.Any = js.native
  def endSection(): scala.Unit = js.native
  def isTagEnabled(traceTag: scala.Double): scala.Boolean = js.native
  /* private */ def nativeAsyncTraceBegin(tag: js.Any, name: js.Any, cookie: js.Any): js.Any = js.native
  /* private */ def nativeAsyncTraceEnd(tag: js.Any, name: js.Any, cookie: js.Any): js.Any = js.native
  /* private */ def nativeGetEnabledTags(): js.Any = js.native
  /* private */ def nativeSetAppTracingAllowed(allowed: js.Any): js.Any = js.native
  /* private */ def nativeSetTracingEnabled(allowed: js.Any): js.Any = js.native
  /* private */ def nativeTraceBegin(tag: js.Any, name: js.Any): js.Any = js.native
  /* private */ def nativeTraceCounter(tag: js.Any, name: js.Any, value: js.Any): js.Any = js.native
  /* private */ def nativeTraceEnd(tag: js.Any): js.Any = js.native
  def setAppTracingAllowed(allowed: scala.Boolean): scala.Unit = js.native
  def setTracingEnabled(enabled: scala.Boolean): scala.Unit = js.native
  def traceBegin(traceTag: scala.Double, methodName: java.lang.String): scala.Unit = js.native
  def traceCounter(traceTag: scala.Double, counterName: java.lang.String, counterValue: scala.Double): scala.Unit = js.native
  def traceEnd(traceTag: scala.Double): scala.Unit = js.native
}

