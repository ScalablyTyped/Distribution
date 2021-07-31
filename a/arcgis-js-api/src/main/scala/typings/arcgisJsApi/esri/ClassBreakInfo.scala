package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassBreakInfo
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
    * Describes the data represented by the class break.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-ClassBreakInfo.html#label)
    */
  var label: String = js.native
  
  /**
    * Sets the maximum value for the class break.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-ClassBreakInfo.html#maxValue)
    */
  var maxValue: Double = js.native
  
  /**
    * Sets the minimum value for the class break.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-ClassBreakInfo.html#minValue)
    */
  var minValue: Double = js.native
  
  /**
    * Defines the symbol used to render features with data values that are within the bounds defined for the class break.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-ClassBreakInfo.html#symbol)
    */
  var symbol: Symbol = js.native
}
