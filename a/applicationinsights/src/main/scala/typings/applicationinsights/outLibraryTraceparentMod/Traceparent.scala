package typings.applicationinsights.outLibraryTraceparentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Traceparent extends js.Object {
  var legacyRootId: String
  var parentId: String
  var spanId: String
  var traceFlag: String
  var traceId: String
  var version: String
  def getBackCompatRequestId(): String
  def updateSpanId(): Unit
}

object Traceparent {
  @scala.inline
  def apply(
    getBackCompatRequestId: () => String,
    legacyRootId: String,
    parentId: String,
    spanId: String,
    traceFlag: String,
    traceId: String,
    updateSpanId: () => Unit,
    version: String
  ): Traceparent = {
    val __obj = js.Dynamic.literal(getBackCompatRequestId = js.Any.fromFunction0(getBackCompatRequestId), legacyRootId = legacyRootId.asInstanceOf[js.Any], parentId = parentId.asInstanceOf[js.Any], spanId = spanId.asInstanceOf[js.Any], traceFlag = traceFlag.asInstanceOf[js.Any], traceId = traceId.asInstanceOf[js.Any], updateSpanId = js.Any.fromFunction0(updateSpanId), version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Traceparent]
  }
}

