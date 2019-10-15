package typings.arcgisDashJsDashApi.esriCoreErrorMod

import typings.arcgisDashJsDashApi.__esri.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/core/Error", JSImport.Namespace)
@js.native
class Class () extends Error {
  /**
    * The details object provides additional details specific to the error, giving more information about why the error was raised. For example, the details object for esriRequest includes additional information to help the developer diagnose issues with a problematic request.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Error.html#details)
    */
  /* CompleteClass */
  override var details: js.Any = js.native
  /**
    * A message describing the details of the error.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Error.html#message)
    */
  /* CompleteClass */
  override var message: String = js.native
  /**
    * A unique error name. This can be used to map to a localized error message to present to the user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Error.html#name)
    */
  /* CompleteClass */
  override var name: String = js.native
}

