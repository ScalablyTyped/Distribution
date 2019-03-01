package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentityManagerSetProtocolErrorHandlerHandlerFunction
  extends stdLib.Object {
  /**
    * The secure resource URL.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-IdentityManager.html#setProtocolErrorHandler)
    */
  var resourceUrl: java.lang.String
  /**
    * ServerInfo object describing the server where the secure resource is hosted.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-IdentityManager.html#setProtocolErrorHandler)
    */
  var serverInfo: ServerInfo
}

object IdentityManagerSetProtocolErrorHandlerHandlerFunction {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    resourceUrl: java.lang.String,
    serverInfo: ServerInfo
  ): IdentityManagerSetProtocolErrorHandlerHandlerFunction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("constructor")(constructor)
    __obj.updateDynamic("hasOwnProperty")(hasOwnProperty)
    __obj.updateDynamic("propertyIsEnumerable")(propertyIsEnumerable)
    __obj.updateDynamic("resourceUrl")(resourceUrl)
    __obj.updateDynamic("serverInfo")(serverInfo)
    __obj.asInstanceOf[IdentityManagerSetProtocolErrorHandlerHandlerFunction]
  }
}

