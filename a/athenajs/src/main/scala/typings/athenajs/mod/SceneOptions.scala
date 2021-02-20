package typings.athenajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SceneOptions extends StObject {
  
  var hudScene: js.UndefOr[Scene] = js.native
  
  var layers: js.UndefOr[Double] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var opacity: js.UndefOr[Double] = js.native
  
  var resources: js.UndefOr[js.Array[Res]] = js.native
}
object SceneOptions {
  
  @scala.inline
  def apply(): SceneOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SceneOptions]
  }
  
  @scala.inline
  implicit class SceneOptionsMutableBuilder[Self <: SceneOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHudScene(value: Scene): Self = StObject.set(x, "hudScene", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHudSceneUndefined: Self = StObject.set(x, "hudScene", js.undefined)
    
    @scala.inline
    def setLayers(value: Double): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setResources(value: js.Array[Res]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    @scala.inline
    def setResourcesVarargs(value: Res*): Self = StObject.set(x, "resources", js.Array(value :_*))
  }
}
