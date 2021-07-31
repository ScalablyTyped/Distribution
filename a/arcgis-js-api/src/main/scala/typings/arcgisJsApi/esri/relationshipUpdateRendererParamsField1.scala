package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait relationshipUpdateRendererParamsField1
  extends StObject
     with Object {
  
  /**
    * The class breaks for the first field used in the relationship visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-relationship.html#updateRenderer)
    */
  var classBreakInfos: js.Array[ClassBreak]
  
  /**
    * The name of a numeric field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-relationship.html#updateRenderer)
    */
  var field: String
  
  /**
    * The label used to describe the field or variable in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-relationship.html#updateRenderer)
    */
  var label: js.UndefOr[String] = js.undefined
  
  /**
    * The name of a numeric field used to normalize the given `field`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-relationship.html#updateRenderer)
    */
  var normalizationField: js.UndefOr[String] = js.undefined
}
object relationshipUpdateRendererParamsField1 {
  
  @scala.inline
  def apply(
    classBreakInfos: js.Array[ClassBreak],
    constructor: js.Function,
    field: String,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): relationshipUpdateRendererParamsField1 = {
    val __obj = js.Dynamic.literal(classBreakInfos = classBreakInfos.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[relationshipUpdateRendererParamsField1]
  }
  
  @scala.inline
  implicit class relationshipUpdateRendererParamsField1MutableBuilder[Self <: relationshipUpdateRendererParamsField1] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassBreakInfos(value: js.Array[ClassBreak]): Self = StObject.set(x, "classBreakInfos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassBreakInfosVarargs(value: ClassBreak*): Self = StObject.set(x, "classBreakInfos", js.Array(value :_*))
    
    @scala.inline
    def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setNormalizationField(value: String): Self = StObject.set(x, "normalizationField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalizationFieldUndefined: Self = StObject.set(x, "normalizationField", js.undefined)
  }
}
