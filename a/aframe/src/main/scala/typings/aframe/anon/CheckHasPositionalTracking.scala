package typings.aframe.anon

import typings.std.VRDisplay
import typings.three.mod.Object3D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CheckHasPositionalTracking extends StObject {
  
  def PolyfillControls(object3D: Object3D): Unit = js.native
  
  def checkHasPositionalTracking(): Boolean = js.native
  
  def checkHeadsetConnected(): Boolean = js.native
  
  def getVRDisplay(): js.Array[VRDisplay] = js.native
  
  def isBrowserEnvironment(): Boolean = js.native
  
  def isGearVR(): Boolean = js.native
  
  def isIOS(): Boolean = js.native
  
  def isLandscape(): Boolean = js.native
  
  def isMobile(): Boolean = js.native
  
  def isNodeEnvironment(): Boolean = js.native
  
  def isOculusGo(): Boolean = js.native
  
  def isR7(): Boolean = js.native
  
  def isTablet(): Boolean = js.native
  
  var isWebXRAvailable: Boolean = js.native
}
object CheckHasPositionalTracking {
  
  @scala.inline
  def apply(
    PolyfillControls: Object3D => Unit,
    checkHasPositionalTracking: () => Boolean,
    checkHeadsetConnected: () => Boolean,
    getVRDisplay: () => js.Array[VRDisplay],
    isBrowserEnvironment: () => Boolean,
    isGearVR: () => Boolean,
    isIOS: () => Boolean,
    isLandscape: () => Boolean,
    isMobile: () => Boolean,
    isNodeEnvironment: () => Boolean,
    isOculusGo: () => Boolean,
    isR7: () => Boolean,
    isTablet: () => Boolean,
    isWebXRAvailable: Boolean
  ): CheckHasPositionalTracking = {
    val __obj = js.Dynamic.literal(PolyfillControls = js.Any.fromFunction1(PolyfillControls), checkHasPositionalTracking = js.Any.fromFunction0(checkHasPositionalTracking), checkHeadsetConnected = js.Any.fromFunction0(checkHeadsetConnected), getVRDisplay = js.Any.fromFunction0(getVRDisplay), isBrowserEnvironment = js.Any.fromFunction0(isBrowserEnvironment), isGearVR = js.Any.fromFunction0(isGearVR), isIOS = js.Any.fromFunction0(isIOS), isLandscape = js.Any.fromFunction0(isLandscape), isMobile = js.Any.fromFunction0(isMobile), isNodeEnvironment = js.Any.fromFunction0(isNodeEnvironment), isOculusGo = js.Any.fromFunction0(isOculusGo), isR7 = js.Any.fromFunction0(isR7), isTablet = js.Any.fromFunction0(isTablet), isWebXRAvailable = isWebXRAvailable.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckHasPositionalTracking]
  }
  
  @scala.inline
  implicit class CheckHasPositionalTrackingMutableBuilder[Self <: CheckHasPositionalTracking] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCheckHasPositionalTracking(value: () => Boolean): Self = StObject.set(x, "checkHasPositionalTracking", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCheckHeadsetConnected(value: () => Boolean): Self = StObject.set(x, "checkHeadsetConnected", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetVRDisplay(value: () => js.Array[VRDisplay]): Self = StObject.set(x, "getVRDisplay", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsBrowserEnvironment(value: () => Boolean): Self = StObject.set(x, "isBrowserEnvironment", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsGearVR(value: () => Boolean): Self = StObject.set(x, "isGearVR", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsIOS(value: () => Boolean): Self = StObject.set(x, "isIOS", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsLandscape(value: () => Boolean): Self = StObject.set(x, "isLandscape", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsMobile(value: () => Boolean): Self = StObject.set(x, "isMobile", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsNodeEnvironment(value: () => Boolean): Self = StObject.set(x, "isNodeEnvironment", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsOculusGo(value: () => Boolean): Self = StObject.set(x, "isOculusGo", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsR7(value: () => Boolean): Self = StObject.set(x, "isR7", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsTablet(value: () => Boolean): Self = StObject.set(x, "isTablet", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsWebXRAvailable(value: Boolean): Self = StObject.set(x, "isWebXRAvailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolyfillControls(value: Object3D => Unit): Self = StObject.set(x, "PolyfillControls", js.Any.fromFunction1(value))
  }
}
