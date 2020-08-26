package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdentityManagerGenerateTokenOptions extends Object {
  /**
    * The server URL.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-IdentityManager.html#generateToken)
    */
  var serverUrl: String = js.native
  /**
    * Indicates if the server requires SSL.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-IdentityManager.html#generateToken)
    */
  var ssl: Boolean = js.native
  /**
    * The server token.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-IdentityManager.html#generateToken)
    */
  var token: String = js.native
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
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), serverUrl = serverUrl.asInstanceOf[js.Any], ssl = ssl.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityManagerGenerateTokenOptions]
  }
  @scala.inline
  implicit class IdentityManagerGenerateTokenOptionsOps[Self <: IdentityManagerGenerateTokenOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setServerUrl(value: String): Self = this.set("serverUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setSsl(value: Boolean): Self = this.set("ssl", value.asInstanceOf[js.Any])
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
  }
  
}

