package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait relationshipUpdateRendererParams extends Object {
  
  /**
    * The array of colors to be used by the symbols in the uniqueValueInfos of the renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-relationship.html#updateRenderer)
    */
  var colors: js.Array[Color_] = js.native
  
  /**
    * A numeric field used to explore its relationship with `field2`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-relationship.html#updateRenderer)
    */
  var field1: relationshipUpdateRendererParamsField1 = js.native
  
  /**
    * A numeric field used to explore its relationship with `field1`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-relationship.html#updateRenderer)
    */
  var field2: relationshipUpdateRendererParamsField2 = js.native
  
  /**
    * Determines the orientation of the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-relationship.html#updateRenderer)
    */
  var focus: js.UndefOr[String] = js.native
  
  /**
    * Indicates the number of classes by which to break up the values of each field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-relationship.html#updateRenderer)
    */
  var numClasses: Double = js.native
  
  /**
    * The relationship renderer (generated from [createRenderer()](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-relationship.html#createRenderer)) to update with the other parameters provided in this method.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-relationship.html#updateRenderer)
    */
  var renderer: UniqueValueRenderer = js.native
}
object relationshipUpdateRendererParams {
  
  @scala.inline
  def apply(
    colors: js.Array[Color_],
    constructor: js.Function,
    field1: relationshipUpdateRendererParamsField1,
    field2: relationshipUpdateRendererParamsField2,
    hasOwnProperty: PropertyKey => Boolean,
    numClasses: Double,
    propertyIsEnumerable: PropertyKey => Boolean,
    renderer: UniqueValueRenderer
  ): relationshipUpdateRendererParams = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], field1 = field1.asInstanceOf[js.Any], field2 = field2.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), numClasses = numClasses.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), renderer = renderer.asInstanceOf[js.Any])
    __obj.asInstanceOf[relationshipUpdateRendererParams]
  }
  
  @scala.inline
  implicit class relationshipUpdateRendererParamsOps[Self <: relationshipUpdateRendererParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setColorsVarargs(value: Color_ *): Self = this.set("colors", js.Array(value :_*))
    
    @scala.inline
    def setColors(value: js.Array[Color_]): Self = this.set("colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setField1(value: relationshipUpdateRendererParamsField1): Self = this.set("field1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setField2(value: relationshipUpdateRendererParamsField2): Self = this.set("field2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumClasses(value: Double): Self = this.set("numClasses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderer(value: UniqueValueRenderer): Self = this.set("renderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocus(value: String): Self = this.set("focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocus: Self = this.set("focus", js.undefined)
  }
}
