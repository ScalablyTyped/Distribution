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
    org.scalablytyped.runtime.StringDictionary[js.Function1[/* repeated */js.Any, scala.Unit]]
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

