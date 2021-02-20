package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RendererResultClassBreaks extends Object {
  
  /**
    * The class breaks generated for values in the `field1` parameter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-relationship.html#RendererResult)
    */
  var field1: ClassBreaksResult = js.native
  
  /**
    * The class breaks generated for values in the `field2` parameter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-relationship.html#RendererResult)
    */
  var field2: ClassBreaksResult = js.native
}
object RendererResultClassBreaks {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    field1: ClassBreaksResult,
    field2: ClassBreaksResult,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): RendererResultClassBreaks = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], field1 = field1.asInstanceOf[js.Any], field2 = field2.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[RendererResultClassBreaks]
  }
  
  @scala.inline
  implicit class RendererResultClassBreaksMutableBuilder[Self <: RendererResultClassBreaks] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setField1(value: ClassBreaksResult): Self = StObject.set(x, "field1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setField2(value: ClassBreaksResult): Self = StObject.set(x, "field2", value.asInstanceOf[js.Any])
  }
}
