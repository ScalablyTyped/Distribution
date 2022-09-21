package typings.antvGLite

import typings.manaSyringe.mod.Syringe.DefinedToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cameraMod {
  
  @JSImport("@antv/g-lite/dist/camera", "Camera")
  @js.native
  open class Camera ()
    extends typings.antvGLite.cameraCameraMod.Camera
  
  @JSImport("@antv/g-lite/dist/camera", "CameraContribution")
  @js.native
  val CameraContribution: DefinedToken = js.native
  
  object CameraEvent {
    
    @JSImport("@antv/g-lite/dist/camera", "CameraEvent")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@antv/g-lite/dist/camera", "CameraEvent.UPDATED")
    @js.native
    def UPDATED: String = js.native
    inline def UPDATED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UPDATED")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@antv/g-lite/dist/camera", "CameraProjectionMode")
  @js.native
  object CameraProjectionMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.antvGLite.interfacesMod.CameraProjectionMode & Double] = js.native
    
    /* 0 */ val ORTHOGRAPHIC: typings.antvGLite.interfacesMod.CameraProjectionMode.ORTHOGRAPHIC & Double = js.native
    
    /* 1 */ val PERSPECTIVE: typings.antvGLite.interfacesMod.CameraProjectionMode.PERSPECTIVE & Double = js.native
  }
  
  @JSImport("@antv/g-lite/dist/camera", "CameraTrackingMode")
  @js.native
  object CameraTrackingMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.antvGLite.interfacesMod.CameraTrackingMode & Double] = js.native
    
    /* 3 */ val CINEMATIC: typings.antvGLite.interfacesMod.CameraTrackingMode.CINEMATIC & Double = js.native
    
    /* 0 */ val DEFAULT: typings.antvGLite.interfacesMod.CameraTrackingMode.DEFAULT & Double = js.native
    
    /* 1 */ val ROTATIONAL: typings.antvGLite.interfacesMod.CameraTrackingMode.ROTATIONAL & Double = js.native
    
    /* 2 */ val TRANSLATIONAL: typings.antvGLite.interfacesMod.CameraTrackingMode.TRANSLATIONAL & Double = js.native
  }
  
  @JSImport("@antv/g-lite/dist/camera", "CameraType")
  @js.native
  object CameraType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.antvGLite.interfacesMod.CameraType & Double] = js.native
    
    /* 1 */ val EXPLORING: typings.antvGLite.interfacesMod.CameraType.EXPLORING & Double = js.native
    
    /* 0 */ val ORBITING: typings.antvGLite.interfacesMod.CameraType.ORBITING & Double = js.native
    
    /* 2 */ val TRACKING: typings.antvGLite.interfacesMod.CameraType.TRACKING & Double = js.native
  }
  
  @JSImport("@antv/g-lite/dist/camera", "DefaultCamera")
  @js.native
  val DefaultCamera: DefinedToken = js.native
}
