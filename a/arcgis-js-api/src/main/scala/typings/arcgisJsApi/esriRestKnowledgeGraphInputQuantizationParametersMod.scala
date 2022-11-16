package typings.arcgisJsApi

import typings.arcgisJsApi.esri.InputQuantizationParameters
import typings.arcgisJsApi.esri.InputQuantizationParametersProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriRestKnowledgeGraphInputQuantizationParametersMod {
  
  @JSImport("esri/rest/knowledgeGraph/InputQuantizationParameters", JSImport.Namespace)
  @js.native
  /**
    * Custom quantization parameters for input geometry that compresses geometry for transfer to the server.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-InputQuantizationParameters.html)
    */
  open class ^ ()
    extends StObject
       with InputQuantizationParameters {
    def this(properties: InputQuantizationParametersProperties) = this()
  }
}
