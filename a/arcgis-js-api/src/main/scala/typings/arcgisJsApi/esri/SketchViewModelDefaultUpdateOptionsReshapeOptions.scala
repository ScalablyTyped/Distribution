package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`move-xy`
import typings.arcgisJsApi.arcgisJsApiStrings.move
import typings.arcgisJsApi.arcgisJsApiStrings.none_
import typings.arcgisJsApi.arcgisJsApiStrings.offset
import typings.arcgisJsApi.arcgisJsApiStrings.split
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SketchViewModelDefaultUpdateOptionsReshapeOptions extends StObject {
  
  /**
  		 * Sets the reshape operation on the edge.
  		 *
  		 * @default "split"
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#defaultUpdateOptions)
  		 */
  var edgeOperation: js.UndefOr[none_ | split | offset] = js.undefined
  
  /**
  		 * Sets the move constraints for the whole shape.
  		 *
  		 * @default "move"
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#defaultUpdateOptions)
  		 */
  var shapeOperation: js.UndefOr[none_ | move | `move-xy`] = js.undefined
  
  /**
  		 * Sets the move constraints for the vertex.
  		 *
  		 * @default "move"
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#defaultUpdateOptions)
  		 */
  var vertexOperation: js.UndefOr[move | `move-xy`] = js.undefined
}
object SketchViewModelDefaultUpdateOptionsReshapeOptions {
  
  inline def apply(): SketchViewModelDefaultUpdateOptionsReshapeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SketchViewModelDefaultUpdateOptionsReshapeOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SketchViewModelDefaultUpdateOptionsReshapeOptions] (val x: Self) extends AnyVal {
    
    inline def setEdgeOperation(value: none_ | split | offset): Self = StObject.set(x, "edgeOperation", value.asInstanceOf[js.Any])
    
    inline def setEdgeOperationUndefined: Self = StObject.set(x, "edgeOperation", js.undefined)
    
    inline def setShapeOperation(value: none_ | move | `move-xy`): Self = StObject.set(x, "shapeOperation", value.asInstanceOf[js.Any])
    
    inline def setShapeOperationUndefined: Self = StObject.set(x, "shapeOperation", js.undefined)
    
    inline def setVertexOperation(value: move | `move-xy`): Self = StObject.set(x, "vertexOperation", value.asInstanceOf[js.Any])
    
    inline def setVertexOperationUndefined: Self = StObject.set(x, "vertexOperation", js.undefined)
  }
}
