package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.line
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineCallout3DProperties
  extends StObject
     with Callout3DProperties {
  
  /**
    * The border settings of the callout line.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-callouts-LineCallout3D.html#border)
    */
  var border: js.UndefOr[LineCallout3DBorderProperties] = js.undefined
  
  /**
    * The color of the callout line.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-callouts-LineCallout3D.html#color)
    */
  var color: js.UndefOr[Color_ | js.Array[Double] | String] = js.undefined
  
  /**
    * The width of the callout line in points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-callouts-LineCallout3D.html#size)
    */
  var size: js.UndefOr[Double | String] = js.undefined
  
  var `type`: js.UndefOr[line] = js.undefined
}
object LineCallout3DProperties {
  
  @scala.inline
  def apply(): LineCallout3DProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineCallout3DProperties]
  }
  
  @scala.inline
  implicit class LineCallout3DPropertiesMutableBuilder[Self <: LineCallout3DProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorder(value: LineCallout3DBorderProperties): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    @scala.inline
    def setColor(value: Color_ | js.Array[Double] | String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setColorVarargs(value: Double*): Self = StObject.set(x, "color", js.Array(value :_*))
    
    @scala.inline
    def setSize(value: Double | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setType(value: line): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
