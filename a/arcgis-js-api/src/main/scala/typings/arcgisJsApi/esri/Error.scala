package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Error extends js.Object {
  /**
    * The details object provides additional details specific to the error, giving more information about why the error was raised. For example, the details object for esriRequest includes additional information to help the developer diagnose issues with a problematic request.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Error.html#details)
    */
  var details: js.Any
  /**
    * A message describing the details of the error.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Error.html#message)
    */
  var message: String
  /**
    * A unique error name. This can be used to map to a localized error message to present to the user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Error.html#name)
    */
  var name: String
}

object Error {
  @scala.inline
  def apply(details: js.Any, message: String, name: String): Error = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
}

