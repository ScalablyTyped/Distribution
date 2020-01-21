package typings.applicationinsights.traceparentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("applicationinsights/out/Library/Traceparent", JSImport.Namespace)
@js.native
class ^ () extends Traceparent {
  def this(traceparent: String) = this()
  def this(traceparent: String, parentId: String) = this()
  /* CompleteClass */
  override var legacyRootId: String = js.native
  /* CompleteClass */
  override var parentId: String = js.native
  /* CompleteClass */
  override var spanId: String = js.native
  /* CompleteClass */
  override var traceFlag: String = js.native
  /* CompleteClass */
  override var traceId: String = js.native
  /* CompleteClass */
  override var version: String = js.native
  /* CompleteClass */
  override def getBackCompatRequestId(): String = js.native
  /* CompleteClass */
  override def updateSpanId(): Unit = js.native
}

@JSImport("applicationinsights/out/Library/Traceparent", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var DEFAULT_TRACE_FLAG: js.Any = js.native
  var DEFAULT_VERSION: js.Any = js.native
  def isValidSpanId(id: String): Boolean = js.native
  def isValidTraceId(id: String): Boolean = js.native
}

