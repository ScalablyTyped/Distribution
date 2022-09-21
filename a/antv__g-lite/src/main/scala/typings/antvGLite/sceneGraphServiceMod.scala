package typings.antvGLite

import typings.antvGLite.domInterfacesMod.INode
import typings.antvGLite.sceneGraphSelectorMod.SceneGraphSelector
import typings.antvGLite.servicesInterfacesMod.SceneGraphService
import typings.antvGLite.transformMod.Transform
import typings.glMatrix.mod.quat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sceneGraphServiceMod {
  
  @JSImport("@antv/g-lite/dist/services/SceneGraphService", "DefaultSceneGraphService")
  @js.native
  open class DefaultSceneGraphService protected ()
    extends StObject
       with SceneGraphService {
    def this(sceneGraphSelectorFactory: js.Function0[SceneGraphSelector]) = this()
    
    /* private */ var boundsChangedEvent: Any = js.native
    
    /* private */ var calcLocalTransform: Any = js.native
    
    def dirtifyLocal(element: INode, transform: Transform): Unit = js.native
    
    def dirtifyWorld(element: INode, transform: Transform): Unit = js.native
    
    /* private */ var dirtifyWorldInternal: Any = js.native
    
    /* private */ var getTransformedGeometryBounds: Any = js.native
    
    /* private */ var pendingEvents: Any = js.native
    
    /* private */ var sceneGraphSelectorFactory: Any = js.native
    
    def setRotation(): js.Function5[
        /* element */ INode, 
        /* rotation */ quat | Double, 
        /* y */ js.UndefOr[Double], 
        /* z */ js.UndefOr[Double], 
        /* w */ js.UndefOr[Double], 
        Unit
      ] = js.native
    
    /* private */ var sync: Any = js.native
    
    /* private */ var unfreezeParentToRoot: Any = js.native
  }
}
