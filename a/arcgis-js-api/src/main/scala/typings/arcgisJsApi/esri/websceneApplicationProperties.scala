package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait websceneApplicationProperties extends Accessor {
  /**
    * View-specific properties of application and UI elements.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-ApplicationProperties.html#viewing)
    */
  var viewing: Viewing = js.native
}

@JSGlobal("__esri.websceneApplicationProperties")
@js.native
object websceneApplicationProperties extends TopLevel[websceneApplicationPropertiesConstructor]

