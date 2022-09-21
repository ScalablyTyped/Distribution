package typings.aframe.anon

import typings.three.eventDispatcherMod.Event
import typings.three.mod.Object3D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckHasPositionalTracking extends StObject {
  
  def PolyfillControls(object3D: Object3D[Event]): Unit
  
  def checkHasPositionalTracking(): Boolean
  
  def checkHeadsetConnected(): Boolean
  
  def isBrowserEnvironment(): Boolean
  
  def isGearVR(): Boolean
  
  def isIOS(): Boolean
  
  def isLandscape(): Boolean
  
  def isMobile(): Boolean
  
  def isNodeEnvironment(): Boolean
  
  def isOculusGo(): Boolean
  
  def isR7(): Boolean
  
  def isTablet(): Boolean
  
  var isWebXRAvailable: Boolean
}
object CheckHasPositionalTracking {
  
  inline def apply(
    PolyfillControls: Object3D[Event] => Unit,
    checkHasPositionalTracking: () => Boolean,
    checkHeadsetConnected: () => Boolean,
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
    val __obj = js.Dynamic.literal(PolyfillControls = js.Any.fromFunction1(PolyfillControls), checkHasPositionalTracking = js.Any.fromFunction0(checkHasPositionalTracking), checkHeadsetConnected = js.Any.fromFunction0(checkHeadsetConnected), isBrowserEnvironment = js.Any.fromFunction0(isBrowserEnvironment), isGearVR = js.Any.fromFunction0(isGearVR), isIOS = js.Any.fromFunction0(isIOS), isLandscape = js.Any.fromFunction0(isLandscape), isMobile = js.Any.fromFunction0(isMobile), isNodeEnvironment = js.Any.fromFunction0(isNodeEnvironment), isOculusGo = js.Any.fromFunction0(isOculusGo), isR7 = js.Any.fromFunction0(isR7), isTablet = js.Any.fromFunction0(isTablet), isWebXRAvailable = isWebXRAvailable.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckHasPositionalTracking]
  }
  
  extension [Self <: CheckHasPositionalTracking](x: Self) {
    
    inline def setCheckHasPositionalTracking(value: () => Boolean): Self = StObject.set(x, "checkHasPositionalTracking", js.Any.fromFunction0(value))
    
    inline def setCheckHeadsetConnected(value: () => Boolean): Self = StObject.set(x, "checkHeadsetConnected", js.Any.fromFunction0(value))
    
    inline def setIsBrowserEnvironment(value: () => Boolean): Self = StObject.set(x, "isBrowserEnvironment", js.Any.fromFunction0(value))
    
    inline def setIsGearVR(value: () => Boolean): Self = StObject.set(x, "isGearVR", js.Any.fromFunction0(value))
    
    inline def setIsIOS(value: () => Boolean): Self = StObject.set(x, "isIOS", js.Any.fromFunction0(value))
    
    inline def setIsLandscape(value: () => Boolean): Self = StObject.set(x, "isLandscape", js.Any.fromFunction0(value))
    
    inline def setIsMobile(value: () => Boolean): Self = StObject.set(x, "isMobile", js.Any.fromFunction0(value))
    
    inline def setIsNodeEnvironment(value: () => Boolean): Self = StObject.set(x, "isNodeEnvironment", js.Any.fromFunction0(value))
    
    inline def setIsOculusGo(value: () => Boolean): Self = StObject.set(x, "isOculusGo", js.Any.fromFunction0(value))
    
    inline def setIsR7(value: () => Boolean): Self = StObject.set(x, "isR7", js.Any.fromFunction0(value))
    
    inline def setIsTablet(value: () => Boolean): Self = StObject.set(x, "isTablet", js.Any.fromFunction0(value))
    
    inline def setIsWebXRAvailable(value: Boolean): Self = StObject.set(x, "isWebXRAvailable", value.asInstanceOf[js.Any])
    
    inline def setPolyfillControls(value: Object3D[Event] => Unit): Self = StObject.set(x, "PolyfillControls", js.Any.fromFunction1(value))
  }
}
