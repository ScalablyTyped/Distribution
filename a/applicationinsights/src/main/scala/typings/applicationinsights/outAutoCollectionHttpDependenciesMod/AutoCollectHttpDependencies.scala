package typings.applicationinsights.outAutoCollectionHttpDependenciesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoCollectHttpDependencies extends js.Object {
  var _client: js.Any
  var _isEnabled: js.Any
  var _isInitialized: js.Any
  /* private */ def _initialize(): js.Any
  def dispose(): Unit
  def enable(isEnabled: Boolean): Unit
  def isInitialized(): Boolean
}

object AutoCollectHttpDependencies {
  @scala.inline
  def apply(
    _client: js.Any,
    _initialize: () => js.Any,
    _isEnabled: js.Any,
    _isInitialized: js.Any,
    dispose: () => Unit,
    enable: Boolean => Unit,
    isInitialized: () => Boolean
  ): AutoCollectHttpDependencies = {
    val __obj = js.Dynamic.literal(_client = _client.asInstanceOf[js.Any], _initialize = js.Any.fromFunction0(_initialize), _isEnabled = _isEnabled.asInstanceOf[js.Any], _isInitialized = _isInitialized.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), enable = js.Any.fromFunction1(enable), isInitialized = js.Any.fromFunction0(isInitialized))
  
    __obj.asInstanceOf[AutoCollectHttpDependencies]
  }
}

