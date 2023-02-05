package typings.antvGLite

import typings.antvGLite.anon.Enabled
import typings.antvGLite.anon.Partialeasingstringeasing
import typings.antvGLite.anon.Partialpositionvec3vec2fo
import typings.antvGLite.distCameraLandmarkMod.Landmark
import typings.antvGLite.distDomInterfacesMod.ICanvas
import typings.antvGLite.distShapesMod.Frustum
import typings.eventemitter3.mod.default
import typings.glMatrix.mod.mat4
import typings.glMatrix.mod.vec2
import typings.glMatrix.mod.vec3
import typings.manaSyringe.mod.Syringe.DefinedToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCameraInterfacesMod {
  
  @JSImport("@antv/g-lite/dist/camera/interfaces", "CameraContribution")
  @js.native
  val CameraContribution: DefinedToken = js.native
  
  object CameraEvent {
    
    @JSImport("@antv/g-lite/dist/camera/interfaces", "CameraEvent")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@antv/g-lite/dist/camera/interfaces", "CameraEvent.UPDATED")
    @js.native
    def UPDATED: String = js.native
    inline def UPDATED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UPDATED")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  sealed trait CameraProjectionMode extends StObject
  @JSImport("@antv/g-lite/dist/camera/interfaces", "CameraProjectionMode")
  @js.native
  object CameraProjectionMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[CameraProjectionMode & Double] = js.native
    
    @js.native
    sealed trait ORTHOGRAPHIC
      extends StObject
         with CameraProjectionMode
    /* 0 */ val ORTHOGRAPHIC: typings.antvGLite.distCameraInterfacesMod.CameraProjectionMode.ORTHOGRAPHIC & Double = js.native
    
    @js.native
    sealed trait PERSPECTIVE
      extends StObject
         with CameraProjectionMode
    /* 1 */ val PERSPECTIVE: typings.antvGLite.distCameraInterfacesMod.CameraProjectionMode.PERSPECTIVE & Double = js.native
  }
  
  @js.native
  sealed trait CameraTrackingMode extends StObject
  @JSImport("@antv/g-lite/dist/camera/interfaces", "CameraTrackingMode")
  @js.native
  object CameraTrackingMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[CameraTrackingMode & Double] = js.native
    
    @js.native
    sealed trait CINEMATIC
      extends StObject
         with CameraTrackingMode
    /* 3 */ val CINEMATIC: typings.antvGLite.distCameraInterfacesMod.CameraTrackingMode.CINEMATIC & Double = js.native
    
    @js.native
    sealed trait DEFAULT
      extends StObject
         with CameraTrackingMode
    /* 0 */ val DEFAULT: typings.antvGLite.distCameraInterfacesMod.CameraTrackingMode.DEFAULT & Double = js.native
    
    @js.native
    sealed trait ROTATIONAL
      extends StObject
         with CameraTrackingMode
    /* 1 */ val ROTATIONAL: typings.antvGLite.distCameraInterfacesMod.CameraTrackingMode.ROTATIONAL & Double = js.native
    
    @js.native
    sealed trait TRANSLATIONAL
      extends StObject
         with CameraTrackingMode
    /* 2 */ val TRANSLATIONAL: typings.antvGLite.distCameraInterfacesMod.CameraTrackingMode.TRANSLATIONAL & Double = js.native
  }
  
  @js.native
  sealed trait CameraType extends StObject
  @JSImport("@antv/g-lite/dist/camera/interfaces", "CameraType")
  @js.native
  object CameraType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[CameraType & Double] = js.native
    
    /**
      * It's similar to the ORBITING camera, but it allows the camera to orbit over the north or south poles.
      *
      * In Three.js it's used in OrbitControls.
      * @see https://threejs.org/docs/#examples/en/controls/TrackballControls
      */
    @js.native
    sealed trait EXPLORING
      extends StObject
         with CameraType
    /* 1 */ val EXPLORING: typings.antvGLite.distCameraInterfacesMod.CameraType.EXPLORING & Double = js.native
    
    /**
      * Performs all the rotational operations with the focal point instead of the camera position.
      * This type of camera is useful in applications(like CAD) where 3D objects are being designed or explored.
      * Camera cannot orbits over the north & south poles.
      * @see http://voxelent.com/tutorial-cameras/
      *
      * In Three.js it's used in OrbitControls.
      * @see https://threejs.org/docs/#examples/zh/controls/OrbitControls
      */
    @js.native
    sealed trait ORBITING
      extends StObject
         with CameraType
    /* 0 */ val ORBITING: typings.antvGLite.distCameraInterfacesMod.CameraType.ORBITING & Double = js.native
    
    /**
      * Performs all the rotational operations with the camera position.
      * It's useful in first person shooting games.
      * Camera cannot orbits over the north & south poles.
      *
      * In Three.js it's used in FirstPersonControls.
      * @see https://threejs.org/docs/#examples/en/controls/FirstPersonControls
      */
    @js.native
    sealed trait TRACKING
      extends StObject
         with CameraType
    /* 2 */ val TRACKING: typings.antvGLite.distCameraInterfacesMod.CameraType.TRACKING & Double = js.native
  }
  
  @JSImport("@antv/g-lite/dist/camera/interfaces", "DefaultCamera")
  @js.native
  val DefaultCamera: DefinedToken = js.native
  
  @js.native
  trait ICamera extends StObject {
    
    var canvas: ICanvas = js.native
    
    def clearJitterProjectionMatrix(): Unit = js.native
    
    def clearViewOffset(): this.type = js.native
    
    def createLandmark(name: String): Landmark = js.native
    def createLandmark(name: String, params: Partialpositionvec3vec2fo): Landmark = js.native
    
    /**
      * 沿 n 轴移动，当距离视点远时移动速度较快，离视点越近速度越慢
      */
    def dolly(value: Double): this.type = js.native
    
    var eventEmitter: default[String | js.Symbol, Any] = js.native
    
    def getAzimuth(): Double = js.native
    
    def getDistance(): Double = js.native
    
    def getDistanceVector(): vec3 = js.native
    
    def getDollyingStep(): Double = js.native
    
    def getElevation(): Double = js.native
    
    def getFar(): Double = js.native
    
    def getFocalPoint(): vec3 = js.native
    
    def getFrustum(): Frustum = js.native
    
    def getNear(): Double = js.native
    
    def getOrthoMatrix(): mat4 = js.native
    
    def getPerspective(): mat4 = js.native
    
    def getPerspectiveInverse(): mat4 = js.native
    
    def getPosition(): vec3 = js.native
    
    def getProjectionMode(): CameraProjectionMode = js.native
    
    def getRoll(): Double = js.native
    
    def getView(): Enabled = js.native
    
    /**
      * 计算 MV 矩阵，为相机矩阵的逆矩阵
      */
    def getViewTransform(): mat4 = js.native
    
    def getWorldTransform(): mat4 = js.native
    
    def getZoom(): Double = js.native
    
    def gotoLandmark(name: String): Unit = js.native
    def gotoLandmark(name: String, options: Double): Unit = js.native
    def gotoLandmark(name: String, options: Partialeasingstringeasing): Unit = js.native
    def gotoLandmark(name: Landmark): Unit = js.native
    def gotoLandmark(name: Landmark, options: Double): Unit = js.native
    def gotoLandmark(name: Landmark, options: Partialeasingstringeasing): Unit = js.native
    
    def isOrtho(): Boolean = js.native
    
    def jitterProjectionMatrix(x: Double, y: Double): Unit = js.native
    
    /**
      * 沿水平(right) & 垂直(up)平移相机
      */
    def pan(tx: Double, ty: Double): this.type = js.native
    
    /**
      * Changes the azimuth and elevation with respect to the current camera axes
      * @param {Number} azimuth the relative azimuth
      * @param {Number} elevation the relative elevation
      * @param {Number} roll the relative roll
      */
    def rotate(azimuth: Double, elevation: Double, roll: Double): this.type = js.native
    
    def setAspect(aspect: Double): this.type = js.native
    
    /**
      * 设置相机方位角，不同相机模式下需要重新计算相机位置或者是视点位置
      * the azimuth in degrees
      */
    def setAzimuth(az: Double): this.type = js.native
    
    /**
      * Moves the camera towards/from the focal point.
      */
    def setDistance(d: Double): this.type = js.native
    
    /**
      * 设置相机方位角，不同相机模式下需要重新计算相机位置或者是视点位置
      */
    def setElevation(el: Double): this.type = js.native
    
    def setEnableUpdate(enabled: Boolean): Unit = js.native
    
    def setFar(far: Double): this.type = js.native
    
    def setFocalPoint(x: vec2 | vec3): this.type = js.native
    def setFocalPoint(x: vec2 | vec3, y: Double): this.type = js.native
    def setFocalPoint(x: vec2 | vec3, y: Double, z: Double): this.type = js.native
    def setFocalPoint(x: vec2 | vec3, y: Unit, z: Double): this.type = js.native
    /**
      * Sets the focal point of this camera in world coordinates.
      *
      * support scalars or vectors.
      * @example
      * setFocalPoint(1, 2, 3);
      * setFocalPoint([1, 2, 3]);
      */
    def setFocalPoint(x: Double): this.type = js.native
    def setFocalPoint(x: Double, y: Double): this.type = js.native
    def setFocalPoint(x: Double, y: Double, z: Double): this.type = js.native
    def setFocalPoint(x: Double, y: Unit, z: Double): this.type = js.native
    
    def setFov(fov: Double): this.type = js.native
    
    /**
      * 设置相机矩阵
      */
    def setMatrix(matrix: mat4): this.type = js.native
    
    def setMaxDistance(d: Double): this.type = js.native
    
    def setMinDistance(d: Double): this.type = js.native
    
    def setNear(near: Double): this.type = js.native
    
    def setOrthographic(l: Double, r: Double, t: Double, b: Double, near: Double, far: Double): this.type = js.native
    
    def setPerspective(near: Double, far: Double, fov: Double, aspect: Double): this.type = js.native
    
    def setPosition(x: vec2 | vec3): this.type = js.native
    def setPosition(x: vec2 | vec3, y: Double): this.type = js.native
    def setPosition(x: vec2 | vec3, y: Double, z: Double): this.type = js.native
    def setPosition(x: vec2 | vec3, y: Unit, z: Double): this.type = js.native
    /**
      * Move the camera in world coordinates.
      * It will keep looking at the current focal point.
      *
      * support scalars or vectors.
      * @example
      * setPosition(1, 2, 3);
      * setPosition([1, 2, 3]);
      */
    def setPosition(x: Double): this.type = js.native
    def setPosition(x: Double, y: Double): this.type = js.native
    def setPosition(x: Double, y: Double, z: Double): this.type = js.native
    def setPosition(x: Double, y: Unit, z: Double): this.type = js.native
    
    def setProjectionMode(projectionMode: CameraProjectionMode): this.type = js.native
    
    /**
      * 设置相机方位角，不同相机模式下需要重新计算相机位置或者是视点位置
      */
    def setRoll(angle: Double): this.type = js.native
    
    def setTrackingMode(trackingMode: CameraTrackingMode): this.type = js.native
    
    def setType(`type`: CameraType): this.type = js.native
    def setType(`type`: CameraType, trackingMode: CameraTrackingMode): this.type = js.native
    
    /**
      * Sets an offset in a larger frustum, used in PixelPicking
      */
    def setViewOffset(fullWidth: Double, fullHeight: Double, x: Double, y: Double, width: Double, height: Double): this.type = js.native
    
    /**
      * If flag is true, it reverses the azimuth and elevation angles.
      * Subsequent calls to rotate, setAzimuth, setElevation,
      * changeAzimuth or changeElevation will cause the inverted effect.
      * setRoll or changeRoll is not affected by this method.
      *
      * This inversion is useful when one wants to simulate that the world
      * is moving, instead of the camera.
      *
      * By default the camera angles are not reversed.
      * @param {Boolean} flag the boolean flag to reverse the angles.
      */
    def setWorldRotation(flag: Boolean): this.type = js.native
    
    def setZoom(zoom: Double): this.type = js.native
  }
}
