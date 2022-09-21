package typings.antvGLite

import typings.antvGLite.displayObjectsMod.DisplayObject
import typings.antvGLite.servicesInterfacesMod.SceneGraphService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object csspropertyclippathMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in keyof @antv/g-lite.@antv/g-lite/dist/css/CSSProperty.CSSProperty<@antv/g-lite.@antv/g-lite/dist/display-objects.DisplayObject<any, any>, @antv/g-lite.@antv/g-lite/dist/display-objects.DisplayObject<any, any>> ]:? @antv/g-lite.@antv/g-lite/dist/css/CSSProperty.CSSProperty<@antv/g-lite.@antv/g-lite/dist/display-objects.DisplayObject<any, any>, @antv/g-lite.@antv/g-lite/dist/display-objects.DisplayObject<any, any>>[P]} */ @JSImport("@antv/g-lite/dist/css/properties/CSSPropertyClipPath", "CSSPropertyClipPath")
  @js.native
  open class CSSPropertyClipPath protected () extends StObject {
    def this(sceneGraphService: SceneGraphService) = this()
    
    def calculator(
      name: String,
      oldClipPath: DisplayObject[Any, Any],
      newClipPath: DisplayObject[Any, Any],
      `object`: DisplayObject[Any, Any]
    ): DisplayObject[Any, Any] = js.native
    
    /* private */ var sceneGraphService: Any = js.native
  }
}
