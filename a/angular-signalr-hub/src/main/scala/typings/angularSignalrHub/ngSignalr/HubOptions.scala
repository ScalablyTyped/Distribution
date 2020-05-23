package typings.angularSignalrHub.ngSignalr

import org.scalablytyped.runtime.StringDictionary
import typings.signalr.SignalR.StateChanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HubOptions extends js.Object {
  /**
    * Function to handle hub connection errors
    */
  var errorHandler: js.UndefOr[js.Function1[/* error */ String, Unit]] = js.undefined
  /**
    * Collection of client side callbacks
    */
  var listeners: js.UndefOr[StringDictionary[js.Function1[/* repeated */ js.Any, Unit]]] = js.undefined
  /**
    * Enable/disable logging
    */
  var logging: js.UndefOr[Boolean] = js.undefined
  /**
    * String array of server side methods which the client can call
    */
  var methods: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Object representing additional query params to be sent on connection
    */
  var queryParams: js.UndefOr[StringDictionary[String]] = js.undefined
  /**
    * Sets the root path for the SignalR web service
    */
  var rootPath: js.UndefOr[String] = js.undefined
  /**
    * Function to handle hub connection state changed event
    */
  var stateChanged: js.UndefOr[js.Function1[/* state */ StateChanged, Unit]] = js.undefined
  /**
    * Sets transport method (e.g    'longPolling'    or    ['webSockets', 'longPolling'] )
    */
  var transport: js.UndefOr[js.Any] = js.undefined
  /**
    * Use a shared global connection or create a new one just for this hub, defaults to true
    */
  var useSharedConnection: js.UndefOr[Boolean] = js.undefined
}

object HubOptions {
  @scala.inline
  def apply(
    errorHandler: /* error */ String => Unit = null,
    listeners: StringDictionary[js.Function1[/* repeated */ js.Any, Unit]] = null,
    logging: js.UndefOr[Boolean] = js.undefined,
    methods: js.Array[String] = null,
    queryParams: StringDictionary[String] = null,
    rootPath: String = null,
    stateChanged: /* state */ StateChanged => Unit = null,
    transport: js.Any = null,
    useSharedConnection: js.UndefOr[Boolean] = js.undefined
  ): HubOptions = {
    val __obj = js.Dynamic.literal()
    if (errorHandler != null) __obj.updateDynamic("errorHandler")(js.Any.fromFunction1(errorHandler))
    if (listeners != null) __obj.updateDynamic("listeners")(listeners.asInstanceOf[js.Any])
    if (!js.isUndefined(logging)) __obj.updateDynamic("logging")(logging.get.asInstanceOf[js.Any])
    if (methods != null) __obj.updateDynamic("methods")(methods.asInstanceOf[js.Any])
    if (queryParams != null) __obj.updateDynamic("queryParams")(queryParams.asInstanceOf[js.Any])
    if (rootPath != null) __obj.updateDynamic("rootPath")(rootPath.asInstanceOf[js.Any])
    if (stateChanged != null) __obj.updateDynamic("stateChanged")(js.Any.fromFunction1(stateChanged))
    if (transport != null) __obj.updateDynamic("transport")(transport.asInstanceOf[js.Any])
    if (!js.isUndefined(useSharedConnection)) __obj.updateDynamic("useSharedConnection")(useSharedConnection.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[HubOptions]
  }
}

