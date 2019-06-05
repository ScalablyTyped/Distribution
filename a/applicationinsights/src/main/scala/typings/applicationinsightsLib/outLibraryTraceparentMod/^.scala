package typings
package applicationinsightsLib.outLibraryTraceparentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("applicationinsights/out/Library/Traceparent", JSImport.Namespace)
@js.native
class ^ () extends Traceparent {
  def this(traceparent: java.lang.String) = this()
  def this(traceparent: java.lang.String, parentId: java.lang.String) = this()
  /* CompleteClass */
  override var legacyRootId: java.lang.String = js.native
  /* CompleteClass */
  override var parentId: java.lang.String = js.native
  /* CompleteClass */
  override var spanId: java.lang.String = js.native
  /* CompleteClass */
  override var traceFlag: java.lang.String = js.native
  /* CompleteClass */
  override var traceId: java.lang.String = js.native
  /* CompleteClass */
  override var version: java.lang.String = js.native
  /* CompleteClass */
  override def getBackCompatRequestId(): java.lang.String = js.native
  /* CompleteClass */
  override def updateSpanId(): scala.Unit = js.native
}

@JSImport("applicationinsights/out/Library/Traceparent", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var DEFAULT_TRACE_FLAG: js.Any = js.native
  var DEFAULT_VERSION: js.Any = js.native
  def isValidSpanId(id: java.lang.String): scala.Boolean = js.native
  def isValidTraceId(id: java.lang.String): scala.Boolean = js.native
}

