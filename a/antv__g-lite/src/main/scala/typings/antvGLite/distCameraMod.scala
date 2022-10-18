package typings.antvGLite

import typings.manaSyringe.mod.Syringe.DefinedToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCameraMod {
  
  @JSImport("@antv/g-lite/dist/camera", "Camera")
  @js.native
  open class Camera ()
    extends typings.antvGLite.distCameraCameraMod.Camera
  
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
    def apply(value: Double): js.UndefOr[typings.antvGLite.distCameraInterfacesMod.CameraProjectionMode & Double] = js.native
    
    /* 0 */ val ORTHOGRAPHIC: typings.antvGLite.distCameraInterfacesMod.CameraProjectionMode.ORTHOGRAPHIC & Double = js.native
    
    /* 1 */ val PERSPECTIVE: typings.antvGLite.distCameraInterfacesMod.CameraProjectionMode.PERSPECTIVE & Double = js.native
  }
  
  @JSImport("@antv/g-lite/dist/camera", "CameraTrackingMode")
  @js.native
  object CameraTrackingMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.antvGLite.distCameraInterfacesMod.CameraTrackingMode & Double] = js.native
    
    /* 3 */ val CINEMATIC: typings.antvGLite.distCameraInterfacesMod.CameraTrackingMode.CINEMATIC & Double = js.native
    
    /* 0 */ val DEFAULT: typings.antvGLite.distCameraInterfacesMod.CameraTrackingMode.DEFAULT & Double = js.native
    
    /* 1 */ val ROTATIONAL: typings.antvGLite.distCameraInterfacesMod.CameraTrackingMode.ROTATIONAL & Double = js.native
    
    /* 2 */ val TRANSLATIONAL: typings.antvGLite.distCameraInterfacesMod.CameraTrackingMode.TRANSLATIONAL & Double = js.native
  }
  
  @JSImport("@antv/g-lite/dist/camera", "CameraType")
  @js.native
  object CameraType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.antvGLite.distCameraInterfacesMod.CameraType & Double] = js.native
    
    /* 1 */ val EXPLORING: typings.antvGLite.distCameraInterfacesMod.CameraType.EXPLORING & Double = js.native
    
    /* 0 */ val ORBITING: typings.antvGLite.distCameraInterfacesMod.CameraType.ORBITING & Double = js.native
    
    /* 2 */ val TRACKING: typings.antvGLite.distCameraInterfacesMod.CameraType.TRACKING & Double = js.native
  }
  
  @JSImport("@antv/g-lite/dist/camera", "DefaultCamera")
  @js.native
  val DefaultCamera: DefinedToken = js.native
}
