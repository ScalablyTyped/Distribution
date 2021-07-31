package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.sketch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SketchEdges3DProperties
  extends StObject
     with Edges3DProperties {
  
  /**
    * The symbol type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-edges-SketchEdges3D.html#type)
    */
  var `type`: js.UndefOr[sketch] = js.undefined
}
object SketchEdges3DProperties {
  
  @scala.inline
  def apply(): SketchEdges3DProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SketchEdges3DProperties]
  }
  
  @scala.inline
  implicit class SketchEdges3DPropertiesMutableBuilder[Self <: SketchEdges3DProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: sketch): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
