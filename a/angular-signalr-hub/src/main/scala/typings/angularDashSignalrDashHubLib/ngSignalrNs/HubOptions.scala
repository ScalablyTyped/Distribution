package typings
package angularDashSignalrDashHubLib.ngSignalrNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HubOptions extends js.Object {
  /**
    * Function to handle hub connection errors
    */
  var errorHandler: js.UndefOr[js.Function1[/* error */ java.lang.String, scala.Unit]] = js.undefined
  /**
    * Collection of client side callbacks
    */
  var listeners: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[js.Function1[/* repeated */ js.Any, scala.Unit]]
  ] = js.undefined
  /**
    * Enable/disable logging
    */
  var logging: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * String array of server side methods which the client can call
    */
  var methods: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Object representing additional query params to be sent on connection
    */
  var queryParams: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  /**
    * Sets the root path for the SignalR web service
    */
  var rootPath: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Function to handle hub connection state changed event
    */
  var stateChanged: js.UndefOr[js.Function1[/* state */ signalrLib.SignalRNs.StateChanged, scala.Unit]] = js.undefined
  /**
    * Sets transport method (e.g    'longPolling'    or    ['webSockets', 'longPolling'] )
    */
  var transport: js.UndefOr[js.Any] = js.undefined
  /**
    * Use a shared global connection or create a new one just for this hub, defaults to true
    */
  var useSharedConnection: js.UndefOr[scala.Boolean] = js.undefined
}

object HubOptions {
  @scala.inline
  def apply(
    errorHandler: /* error */ java.lang.String => scala.Unit = null,
    listeners: org.scalablytyped.runtime.StringDictionary[js.Function1[/* repeated */ js.Any, scala.Unit]] = null,
    logging: js.UndefOr[scala.Boolean] = js.undefined,
    methods: js.Array[java.lang.String] = null,
    queryParams: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    rootPath: java.lang.String = null,
    stateChanged: /* state */ signalrLib.SignalRNs.StateChanged => scala.Unit = null,
    transport: js.Any = null,
    useSharedConnection: js.UndefOr[scala.Boolean] = js.undefined
  ): HubOptions = {
    val __obj = js.Dynamic.literal()
    if (errorHandler != null) __obj.updateDynamic("errorHandler")(js.Any.fromFunction1(errorHandler))
    if (listeners != null) __obj.updateDynamic("listeners")(listeners)
    if (!js.isUndefined(logging)) __obj.updateDynamic("logging")(logging)
    if (methods != null) __obj.updateDynamic("methods")(methods)
    if (queryParams != null) __obj.updateDynamic("queryParams")(queryParams)
    if (rootPath != null) __obj.updateDynamic("rootPath")(rootPath)
    if (stateChanged != null) __obj.updateDynamic("stateChanged")(js.Any.fromFunction1(stateChanged))
    if (transport != null) __obj.updateDynamic("transport")(transport)
    if (!js.isUndefined(useSharedConnection)) __obj.updateDynamic("useSharedConnection")(useSharedConnection)
    __obj.asInstanceOf[HubOptions]
  }
}

