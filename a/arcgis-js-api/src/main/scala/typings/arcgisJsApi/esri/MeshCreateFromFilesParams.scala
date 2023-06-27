package typings.arcgisJsApi.esri

import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MeshCreateFromFilesParams extends StObject {
  
  /**
  		 * The layer to which the files are to be uploaded and which will perform any necessary conversions.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#createFromFiles)
  		 */
  var layer: js.UndefOr[SceneLayer] = js.undefined
  
  /**
  		 * An [AbortSignal](https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal) to abort the loading process.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#createFromFiles)
  		 */
  var signal: js.UndefOr[AbortSignal] = js.undefined
}
object MeshCreateFromFilesParams {
  
  inline def apply(): MeshCreateFromFilesParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeshCreateFromFilesParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MeshCreateFromFilesParams] (val x: Self) extends AnyVal {
    
    inline def setLayer(value: SceneLayer): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setLayerUndefined: Self = StObject.set(x, "layer", js.undefined)
    
    inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
  }
}
