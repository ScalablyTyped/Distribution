package typings.antvGLite

import typings.antvGLite.displayObjectsMod.DisplayObject
import typings.antvGLite.displayObjectsMod.Group
import typings.manaSyringe.mod.Syringe.DefinedToken
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderingContextMod {
  
  @js.native
  sealed trait RenderReason extends StObject
  @JSImport("@antv/g-lite/dist/services/RenderingContext", "RenderReason")
  @js.native
  object RenderReason extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[RenderReason & Double] = js.native
    
    @js.native
    sealed trait CAMERA_CHANGED
      extends StObject
         with RenderReason
    /* 0 */ val CAMERA_CHANGED: typings.antvGLite.renderingContextMod.RenderReason.CAMERA_CHANGED & Double = js.native
    
    @js.native
    sealed trait DISPLAY_OBJECT_CHANGED
      extends StObject
         with RenderReason
    /* 1 */ val DISPLAY_OBJECT_CHANGED: typings.antvGLite.renderingContextMod.RenderReason.DISPLAY_OBJECT_CHANGED & Double = js.native
    
    @js.native
    sealed trait NONE
      extends StObject
         with RenderReason
    /* 2 */ val NONE: typings.antvGLite.renderingContextMod.RenderReason.NONE & Double = js.native
  }
  
  trait RenderingContext extends StObject {
    
    var dirty: Boolean
    
    /**
      * force rendering at next frame
      */
    var force: Boolean
    
    var renderListCurrentFrame: js.Array[DisplayObject[Any, Any]]
    
    /**
      * reason of re-render, reset after every renderred frame
      */
    var renderReasons: Set[RenderReason]
    
    /**
      * root of scenegraph
      */
    var root: Group
    
    var unculledEntities: js.Array[Double]
  }
  object RenderingContext {
    
    @JSImport("@antv/g-lite/dist/services/RenderingContext", "RenderingContext")
    @js.native
    val ^ : DefinedToken = js.native
    
    extension [Self <: RenderingContext](x: Self) {
      
      inline def setDirty(value: Boolean): Self = StObject.set(x, "dirty", value.asInstanceOf[js.Any])
      
      inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      inline def setRenderListCurrentFrame(value: js.Array[DisplayObject[Any, Any]]): Self = StObject.set(x, "renderListCurrentFrame", value.asInstanceOf[js.Any])
      
      inline def setRenderListCurrentFrameVarargs(value: (DisplayObject[Any, Any])*): Self = StObject.set(x, "renderListCurrentFrame", js.Array(value*))
      
      inline def setRenderReasons(value: Set[RenderReason]): Self = StObject.set(x, "renderReasons", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: Group): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setUnculledEntities(value: js.Array[Double]): Self = StObject.set(x, "unculledEntities", value.asInstanceOf[js.Any])
      
      inline def setUnculledEntitiesVarargs(value: Double*): Self = StObject.set(x, "unculledEntities", js.Array(value*))
    }
  }
}
