package typings.antvGLite

import typings.antvGLite.anon.Enabled
import typings.antvGLite.anon.Partialpositionnumbernumb
import typings.antvGLite.distCameraInterfacesMod.CameraProjectionMode
import typings.antvGLite.distCameraInterfacesMod.CameraTrackingMode
import typings.antvGLite.distCameraInterfacesMod.CameraType
import typings.antvGLite.distCameraInterfacesMod.ICamera
import typings.antvGLite.distCameraLandmarkMod.Landmark
import typings.antvGLite.distCanvasMod.Canvas
import typings.antvGLite.distShapesMod.Frustum
import typings.glMatrix.mod.mat4
import typings.glMatrix.mod.vec3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCameraCameraMod {
  
  @JSImport("@antv/g-lite/dist/camera/Camera", "Camera")
  @js.native
  open class Camera ()
    extends StObject
       with ICamera {
    
    /**
      * Recalculates euler angles based on the current state
      */
    /* protected */ def _getAngles(): Unit = js.native
    
    /**
      * Recalculates axes based on the current matrix
      */
    /* protected */ def _getAxes(): Unit = js.native
    
    /**
      * 重新计算视距
      */
    /* protected */ def _getDistance(): Unit = js.native
    
    /**
      * 重新计算视点，只有 TRACKING 模式视点才会发生变化
      */
    /* protected */ def _getFocalPoint(): Unit = js.native
    
    /* protected */ def _getOrthoMatrix(): Unit = js.native
    
    /**
      * 重新计算相机位置，只有 ORBITING 模式相机位置才会发生变化
      */
    /* protected */ def _getPosition(): Unit = js.native
    
    /**
      * Sets the camera position in the camera matrix
      */
    /* protected */ def _setPosition(x: Double): Unit = js.native
    /* protected */ def _setPosition(x: Double, y: Double): Unit = js.native
    /* protected */ def _setPosition(x: Double, y: Double, z: Double): Unit = js.native
    /* protected */ def _setPosition(x: Double, y: Unit, z: Double): Unit = js.native
    /* protected */ def _setPosition(x: vec3): Unit = js.native
    /* protected */ def _setPosition(x: vec3, y: Double): Unit = js.native
    /* protected */ def _setPosition(x: vec3, y: Double, z: Double): Unit = js.native
    /* protected */ def _setPosition(x: vec3, y: Unit, z: Double): Unit = js.native
    
    /**
      * 根据相机矩阵重新计算各种相机参数
      */
    /* protected */ def _update(): Unit = js.native
    
    /* protected */ var aspect: Double = js.native
    
    /**
      * @see https://en.wikipedia.org/wiki/Azimuth
      */
    /* protected */ var azimuth: Double = js.native
    
    /* protected */ var bottom: Double = js.native
    
    @JSName("canvas")
    var canvas_Camera: Canvas = js.native
    
    /**
      * 计算相机矩阵
      */
    /* protected */ def computeMatrix(): Unit = js.native
    
    def createLandmark(name: String, params: Partialpositionnumbernumb): Landmark = js.native
    
    /**
      * 相机位置到视点距离
      * length(focalPoint - position)
      */
    /* protected */ var distance: Double = js.native
    
    /**
      * 视点到相机位置的向量
      * focalPoint - position
      */
    /* protected */ var distanceVector: vec3 = js.native
    
    /**
      * 沿 n 轴移动时，保证移动速度从快到慢
      */
    /* protected */ var dollyingStep: Double = js.native
    
    /* protected */ var elevation: Double = js.native
    
    /* protected */ var enableUpdate: Boolean = js.native
    
    /* protected */ var far: Double = js.native
    
    /**
      * 视点位置
      */
    /* protected */ var focalPoint: vec3 = js.native
    
    /**
      * n 轴 +Z is inside
      */
    /* protected */ var forward: vec3 = js.native
    
    /**
      * 投影矩阵参数
      */
    /**
      * field of view [0-360]
      * @see http://en.wikipedia.org/wiki/Angle_of_view
      */
    /* protected */ var fov: Double = js.native
    
    /**
      * for culling use
      */
    /* protected */ var frustum: Frustum = js.native
    
    /* protected */ var jitteredProjectionMatrix: js.UndefOr[mat4] = js.native
    
    /* protected */ var left: Double = js.native
    
    /**
      * 相机矩阵
      */
    /* protected */ var matrix: mat4 = js.native
    
    /* protected */ var maxDistance: Double = js.native
    
    /* protected */ var minDistance: Double = js.native
    
    /* protected */ var near: Double = js.native
    
    /**
      * ortho matrix for Canvas2D & SVG
      */
    /* protected */ var orthoMatrix: mat4 = js.native
    
    /**
      * 相机位置
      */
    /* protected */ var position: vec3 = js.native
    
    /* protected */ var projectionMatrix: mat4 = js.native
    
    /* protected */ var projectionMatrixInverse: mat4 = js.native
    
    /* protected */ var projectionMode: CameraProjectionMode = js.native
    
    /* protected */ var relAzimuth: Double = js.native
    
    /* protected */ var relElevation: Double = js.native
    
    /* protected */ var relRoll: Double = js.native
    
    /**
      * u 轴
      * @see http://learnwebgl.brown37.net/07_cameras/camera_introduction.html#a-camera-definition
      */
    /* protected */ var right: vec3 = js.native
    
    /* protected */ var roll: Double = js.native
    
    /**
      * invert the horizontal coordinate system HCS
      */
    /* protected */ var rotateWorld: Boolean = js.native
    
    /* protected */ var rright: Double = js.native
    
    /* protected */ var top: Double = js.native
    
    /* protected */ var trackingMode: CameraTrackingMode = js.native
    
    /* protected */ def triggerUpdate(): Unit = js.native
    
    /* protected */ var `type`: CameraType = js.native
    
    /**
      * v 轴 +Y is down
      */
    /* protected */ var up: vec3 = js.native
    
    /* protected */ var view: js.UndefOr[Enabled] = js.native
    
    /**
      * zoom factor of the camera, default is 1
      * eg. https://threejs.org/docs/#api/en/cameras/OrthographicCamera.zoom
      */
    /* protected */ var zoom: Double = js.native
  }
}
