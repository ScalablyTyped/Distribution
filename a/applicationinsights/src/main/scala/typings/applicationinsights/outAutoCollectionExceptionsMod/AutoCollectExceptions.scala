package typings.applicationinsights.outAutoCollectionExceptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoCollectExceptions extends js.Object {
  var _client: js.Any
  var _exceptionListenerHandle: js.Any
  var _isInitialized: js.Any
  var _rejectionListenerHandle: js.Any
  def dispose(): Unit
  def enable(isEnabled: Boolean): Unit
  def isInitialized(): Boolean
}

object AutoCollectExceptions {
  @scala.inline
  def apply(
    _client: js.Any,
    _exceptionListenerHandle: js.Any,
    _isInitialized: js.Any,
    _rejectionListenerHandle: js.Any,
    dispose: () => Unit,
    enable: Boolean => Unit,
    isInitialized: () => Boolean
  ): AutoCollectExceptions = {
    val __obj = js.Dynamic.literal(_client = _client.asInstanceOf[js.Any], _exceptionListenerHandle = _exceptionListenerHandle.asInstanceOf[js.Any], _isInitialized = _isInitialized.asInstanceOf[js.Any], _rejectionListenerHandle = _rejectionListenerHandle.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), enable = js.Any.fromFunction1(enable), isInitialized = js.Any.fromFunction0(isInitialized))
  
    __obj.asInstanceOf[AutoCollectExceptions]
  }
}

