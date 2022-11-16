package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`move-xy`
import typings.arcgisJsApi.arcgisJsApiStrings.move
import typings.arcgisJsApi.arcgisJsApiStrings.none_
import typings.arcgisJsApi.arcgisJsApiStrings.offset
import typings.arcgisJsApi.arcgisJsApiStrings.split
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SketchDefaultUpdateOptionsReshapeOptions extends StObject {
  
  /**
    * Sets the reshape operation on the edge.
    *
    * @default "split"
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#defaultUpdateOptions)
    */
  var edgeOperation: js.UndefOr[none_ | split | offset] = js.undefined
  
  /**
    * Sets the move constraints for the whole shape.
    *
    * @default "move"
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#defaultUpdateOptions)
    */
  var shapeOperation: js.UndefOr[none_ | move | `move-xy`] = js.undefined
  
  /**
    * Sets the move constraints for the vertex.
    *
    * @default "move"
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#defaultUpdateOptions)
    */
  var vertexOperation: js.UndefOr[move | `move-xy`] = js.undefined
}
object SketchDefaultUpdateOptionsReshapeOptions {
  
  inline def apply(): SketchDefaultUpdateOptionsReshapeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SketchDefaultUpdateOptionsReshapeOptions]
  }
  
  extension [Self <: SketchDefaultUpdateOptionsReshapeOptions](x: Self) {
    
    inline def setEdgeOperation(value: none_ | split | offset): Self = StObject.set(x, "edgeOperation", value.asInstanceOf[js.Any])
    
    inline def setEdgeOperationUndefined: Self = StObject.set(x, "edgeOperation", js.undefined)
    
    inline def setShapeOperation(value: none_ | move | `move-xy`): Self = StObject.set(x, "shapeOperation", value.asInstanceOf[js.Any])
    
    inline def setShapeOperationUndefined: Self = StObject.set(x, "shapeOperation", js.undefined)
    
    inline def setVertexOperation(value: move | `move-xy`): Self = StObject.set(x, "vertexOperation", value.asInstanceOf[js.Any])
    
    inline def setVertexOperationUndefined: Self = StObject.set(x, "vertexOperation", js.undefined)
  }
}
