package typings.angularWebsocket.mod.angularAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object websocket {
  
  /**
    * Creates and opens an IWebSocket instance.
    *
    * @param url url to connect to
    * @return websocket instance
    */
  type IWebSocketProvider = js.Function3[
    /* url */ java.lang.String, 
    /* protocols */ js.UndefOr[
      java.lang.String | js.Array[java.lang.String] | typings.angularWebsocket.mod.angularAugmentingMod.websocket.IWebSocketConfigOptions
    ], 
    /* options */ js.UndefOr[
      typings.angularWebsocket.mod.angularAugmentingMod.websocket.IWebSocketConfigOptions
    ], 
    typings.angularWebsocket.mod.angularAugmentingMod.websocket.IWebSocket
  ]
}
