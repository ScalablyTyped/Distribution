package typings.applicationinsights.outAutoCollectionHttpRequestsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoCollectHttpRequests extends js.Object {
  var _client: js.Any = js.native
  var _isAutoCorrelating: js.Any = js.native
  var _isEnabled: js.Any = js.native
  var _isInitialized: js.Any = js.native
  /* private */ def _generateCorrelationContext(requestParser: js.Any): js.Any = js.native
  /* private */ def _initialize(): js.Any = js.native
  def dispose(): Unit = js.native
  def enable(isEnabled: Boolean): Unit = js.native
  def isAutoCorrelating(): Boolean = js.native
  def isInitialized(): Boolean = js.native
  def useAutoCorrelation(isEnabled: Boolean): Unit = js.native
  def useAutoCorrelation(isEnabled: Boolean, forceClsHooked: Boolean): Unit = js.native
}

