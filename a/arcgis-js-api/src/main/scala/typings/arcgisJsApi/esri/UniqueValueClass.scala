package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UniqueValueClass
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
    * Describes the [values](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-UniqueValueClass.html#values) represented by the [symbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-UniqueValueClass.html#symbol) in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-UniqueValueClass.html#label)
    */
  var label: String = js.native
  
  /**
    * Defines the symbol used to represent features containing the given [values](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-UniqueValueClass.html#values).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-UniqueValueClass.html#symbol)
    */
  var symbol: Symbol = js.native
  
  /**
    * An array of unique values that should be rendered with the same symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-UniqueValueClass.html#values)
    */
  var values: js.Array[UniqueValue_] = js.native
}
