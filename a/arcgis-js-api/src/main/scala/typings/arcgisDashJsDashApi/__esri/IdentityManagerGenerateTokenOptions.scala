package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentityManagerGenerateTokenOptions extends Object {
  /**
    * The server URL.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-IdentityManager.html#generateToken)
    */
  var serverUrl: String
  /**
    * Indicates if the server requires SSL.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-IdentityManager.html#generateToken)
    */
  var ssl: Boolean
  /**
    * The server token.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-IdentityManager.html#generateToken)
    */
  var token: String
}

object IdentityManagerGenerateTokenOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    serverUrl: String,
    ssl: Boolean,
    token: String
  ): IdentityManagerGenerateTokenOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), serverUrl = serverUrl, ssl = ssl, token = token)
  
    __obj.asInstanceOf[IdentityManagerGenerateTokenOptions]
  }
}

