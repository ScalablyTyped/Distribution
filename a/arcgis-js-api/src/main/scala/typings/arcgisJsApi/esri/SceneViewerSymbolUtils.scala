package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
	 * Note: reserved for internal use only, this is not part of the stable public API.
	 *
	 * Symbol utilities for the Scene Viewer application.
	 */
trait SceneViewerSymbolUtils extends StObject {
  
  /**
  		 * Note: reserved for internal use only, this is not part of the stable public API.
  		 *
  		 * Returns a promise resolving to an array containing the width, height and depth of the object symbol layer resource.
  		 */
  def computeObjectLayerSize(symbolLayer: ObjectSymbol3DLayer): js.Promise[js.Array[Double]]
}
object SceneViewerSymbolUtils {
  
  inline def apply(computeObjectLayerSize: ObjectSymbol3DLayer => js.Promise[js.Array[Double]]): SceneViewerSymbolUtils = {
    val __obj = js.Dynamic.literal(computeObjectLayerSize = js.Any.fromFunction1(computeObjectLayerSize))
    __obj.asInstanceOf[SceneViewerSymbolUtils]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SceneViewerSymbolUtils] (val x: Self) extends AnyVal {
    
    inline def setComputeObjectLayerSize(value: ObjectSymbol3DLayer => js.Promise[js.Array[Double]]): Self = StObject.set(x, "computeObjectLayerSize", js.Any.fromFunction1(value))
  }
}
