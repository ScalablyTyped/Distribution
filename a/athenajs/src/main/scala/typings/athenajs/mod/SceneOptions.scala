package typings.athenajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SceneOptions extends StObject {
  
  var hudScene: js.UndefOr[Scene] = js.undefined
  
  var layers: js.UndefOr[Double] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var opacity: js.UndefOr[Double] = js.undefined
  
  var resources: js.UndefOr[js.Array[Res]] = js.undefined
}
object SceneOptions {
  
  inline def apply(): SceneOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SceneOptions]
  }
  
  extension [Self <: SceneOptions](x: Self) {
    
    inline def setHudScene(value: Scene): Self = StObject.set(x, "hudScene", value.asInstanceOf[js.Any])
    
    inline def setHudSceneUndefined: Self = StObject.set(x, "hudScene", js.undefined)
    
    inline def setLayers(value: Double): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
    
    inline def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setResources(value: js.Array[Res]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    inline def setResourcesVarargs(value: Res*): Self = StObject.set(x, "resources", js.Array(value*))
  }
}
