package typings
package angularDashWebsocketLib.angularDashWebsocketMod.angularMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object websocketNs {
  /**
           * Creates and opens an IWebSocket instance.
           *
           * @param url url to connect to
           * @return websocket instance
           */
  type IWebSocketProvider = js.Function3[
    /* url */ java.lang.String, 
    /* protocols */ js.UndefOr[java.lang.String | js.Array[java.lang.String] | IWebSocketConfigOptions], 
    /* options */ js.UndefOr[IWebSocketConfigOptions], 
    IWebSocket
  ]
}
