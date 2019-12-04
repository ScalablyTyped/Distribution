package typings.applicationinsights.outAutoCollectionConsoleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoCollectConsole extends js.Object {
  var _client: js.Any
  var _isInitialized: js.Any
  def dispose(): Unit
  def enable(isEnabled: Boolean, collectConsoleLog: Boolean): Unit
  def isInitialized(): Boolean
}

object AutoCollectConsole {
  @scala.inline
  def apply(
    _client: js.Any,
    _isInitialized: js.Any,
    dispose: () => Unit,
    enable: (Boolean, Boolean) => Unit,
    isInitialized: () => Boolean
  ): AutoCollectConsole = {
    val __obj = js.Dynamic.literal(_client = _client.asInstanceOf[js.Any], _isInitialized = _isInitialized.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), enable = js.Any.fromFunction2(enable), isInitialized = js.Any.fromFunction0(isInitialized))
  
    __obj.asInstanceOf[AutoCollectConsole]
  }
}

