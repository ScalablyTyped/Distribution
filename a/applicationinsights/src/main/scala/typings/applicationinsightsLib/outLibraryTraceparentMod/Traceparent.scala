package typings
package applicationinsightsLib.outLibraryTraceparentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Traceparent extends js.Object {
  var legacyRootId: java.lang.String
  var parentId: java.lang.String
  var spanId: java.lang.String
  var traceFlag: java.lang.String
  var traceId: java.lang.String
  var version: java.lang.String
  def getBackCompatRequestId(): java.lang.String
  def updateSpanId(): scala.Unit
}

object Traceparent {
  @scala.inline
  def apply(
    getBackCompatRequestId: () => java.lang.String,
    legacyRootId: java.lang.String,
    parentId: java.lang.String,
    spanId: java.lang.String,
    toString: () => java.lang.String,
    traceFlag: java.lang.String,
    traceId: java.lang.String,
    updateSpanId: () => scala.Unit,
    version: java.lang.String
  ): Traceparent = {
    val __obj = js.Dynamic.literal(getBackCompatRequestId = js.Any.fromFunction0(getBackCompatRequestId), legacyRootId = legacyRootId, parentId = parentId, spanId = spanId, toString = js.Any.fromFunction0(toString), traceFlag = traceFlag, traceId = traceId, updateSpanId = js.Any.fromFunction0(updateSpanId), version = version)
  
    __obj.asInstanceOf[Traceparent]
  }
}

