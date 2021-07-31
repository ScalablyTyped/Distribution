package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VisualVariablesResultSize
  extends StObject
     with Object {
  
  /**
    * The size scheme used by the visual variable.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-univariateColorSize.html#VisualVariablesResult)
    */
  var sizeScheme: SizeScheme
  
  /**
    * The size visual variable(s) configured based on the statistics of the data and the view scale.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-univariateColorSize.html#VisualVariablesResult)
    */
  var visualVariables: js.Array[SizeVariable]
}
object VisualVariablesResultSize {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    sizeScheme: SizeScheme,
    visualVariables: js.Array[SizeVariable]
  ): VisualVariablesResultSize = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), sizeScheme = sizeScheme.asInstanceOf[js.Any], visualVariables = visualVariables.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisualVariablesResultSize]
  }
  
  @scala.inline
  implicit class VisualVariablesResultSizeMutableBuilder[Self <: VisualVariablesResultSize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSizeScheme(value: SizeScheme): Self = StObject.set(x, "sizeScheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisualVariables(value: js.Array[SizeVariable]): Self = StObject.set(x, "visualVariables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisualVariablesVarargs(value: SizeVariable*): Self = StObject.set(x, "visualVariables", js.Array(value :_*))
  }
}
