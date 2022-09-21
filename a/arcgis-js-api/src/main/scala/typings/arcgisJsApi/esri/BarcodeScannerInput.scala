package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`barcode-scanner`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BarcodeScannerInput
  extends StObject
     with Accessor
     with TextInput
     with JSONSupport
     with inputsInput {
  
  /**
    * The type of form element input.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-inputs-BarcodeScannerInput.html#type)
    */
  val `type`: `barcode-scanner` = js.native
}
