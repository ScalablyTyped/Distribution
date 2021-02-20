package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Edges3DProperties extends StObject {
  
  /**
    * The color of the edges.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-edges-Edges3D.html#color)
    */
  var color: js.UndefOr[Color_ | js.Array[Double] | String] = js.native
  
  /**
    * A size in points by which to extend edges beyond their original end points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-edges-Edges3D.html#extensionLength)
    */
  var extensionLength: js.UndefOr[Double | String] = js.native
  
  /**
    * The size of the edges in points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-edges-Edges3D.html#size)
    */
  var size: js.UndefOr[Double | String] = js.native
}
object Edges3DProperties {
  
  @scala.inline
  def apply(): Edges3DProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Edges3DProperties]
  }
  
  @scala.inline
  implicit class Edges3DPropertiesMutableBuilder[Self <: Edges3DProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: Color_ | js.Array[Double] | String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setColorVarargs(value: Double*): Self = StObject.set(x, "color", js.Array(value :_*))
    
    @scala.inline
    def setExtensionLength(value: Double | String): Self = StObject.set(x, "extensionLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionLengthUndefined: Self = StObject.set(x, "extensionLength", js.undefined)
    
    @scala.inline
    def setSize(value: Double | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
