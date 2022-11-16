package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.InputQuantizationParametersProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.InputQuantizationParameters")
@js.native
/**
  * Custom quantization parameters for input geometry that compresses geometry for transfer to the server.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-InputQuantizationParameters.html)
  */
open class InputQuantizationParameters ()
  extends StObject
     with typings.arcgisJsApi.esri.InputQuantizationParameters {
  def this(properties: InputQuantizationParametersProperties) = this()
}
