package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpacityRampElement
  extends StObject
     with Object
     with LegendElement {
  
  /**
    * The individual opacity stops rendered in the legend that correspond to the opacity visual variable in the renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#OpacityRampElement)
    */
  var infos: js.Array[OpacityRampStop]
  
  /**
    * The title of the opacity ramp as displayed in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#OpacityRampElement)
    */
  var title: js.UndefOr[String | RampTitle] = js.undefined
  
  /**
    * The type of this element is always `opacity-ramp`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#OpacityRampElement)
    */
  var `type`: String
}
object OpacityRampElement {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    infos: js.Array[OpacityRampStop],
    propertyIsEnumerable: PropertyKey => Boolean,
    `type`: String
  ): OpacityRampElement = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), infos = infos.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpacityRampElement]
  }
  
  @scala.inline
  implicit class OpacityRampElementMutableBuilder[Self <: OpacityRampElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInfos(value: js.Array[OpacityRampStop]): Self = StObject.set(x, "infos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfosVarargs(value: OpacityRampStop*): Self = StObject.set(x, "infos", js.Array(value :_*))
    
    @scala.inline
    def setTitle(value: String | RampTitle): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
