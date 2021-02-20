package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RampTitle extends Object {
  
  /**
    * The field name used in a visual variable of a renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#RampTitle)
    */
  var field: String = js.native
  
  /**
    * If provided, the normalization field name used in a visual variable of a renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#RampTitle)
    */
  var normField: String = js.native
  
  /**
    * If `true`, the legend formats to display the field and normalization field as a ratio.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#RampTitle)
    */
  var ratio: Boolean = js.native
  
  /**
    * If `true`, the legend formats to display the field and normalization field as a percentage.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#RampTitle)
    */
  var ratioPercent: Boolean = js.native
  
  /**
    * If `true`, the legend formats to display the field and normalization field as a percentage of total.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#RampTitle)
    */
  var ratioPercentTotal: Boolean = js.native
}
object RampTitle {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    field: String,
    hasOwnProperty: PropertyKey => Boolean,
    normField: String,
    propertyIsEnumerable: PropertyKey => Boolean,
    ratio: Boolean,
    ratioPercent: Boolean,
    ratioPercentTotal: Boolean
  ): RampTitle = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), normField = normField.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), ratio = ratio.asInstanceOf[js.Any], ratioPercent = ratioPercent.asInstanceOf[js.Any], ratioPercentTotal = ratioPercentTotal.asInstanceOf[js.Any])
    __obj.asInstanceOf[RampTitle]
  }
  
  @scala.inline
  implicit class RampTitleMutableBuilder[Self <: RampTitle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormField(value: String): Self = StObject.set(x, "normField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRatio(value: Boolean): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRatioPercent(value: Boolean): Self = StObject.set(x, "ratioPercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRatioPercentTotal(value: Boolean): Self = StObject.set(x, "ratioPercentTotal", value.asInstanceOf[js.Any])
  }
}
