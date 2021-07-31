package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`datetime-picker`
import typings.arcgisJsApi.arcgisJsApiStrings.`text-area`
import typings.arcgisJsApi.arcgisJsApiStrings.`text-box`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Input
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
    * The type of form element input displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-inputs-Input.html#type)
    */
  val `type`: `text-area` | `text-box` | `datetime-picker` = js.native
}
