package typings.angularMaterial.mod.angularAugmentingMod.material

import typings.angular.mod.IPromise
import typings.angularMaterial.anon.ABOVE
import typings.angularMaterial.anon.ALIGNEND
import typings.angularMaterial.anon.BOTTOM
import typings.angularMaterial.anon.CLICKOUTSIDE
import typings.angularMaterial.anon.CLOSE_
import typings.angularMaterial.anon.FADE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPanelService extends StObject {
  
  var absPosition: BOTTOM
  
  var animation: FADE
  
  var closeReasons: CLICKOUTSIDE
  
  def create(opt_config: IPanelConfig): IPanelRef
  
  var interceptorTypes: CLOSE_
  
  def newPanelAnimation(): IPanelAnimation
  
  def newPanelPosition(): IPanelPosition
  
  def open(opt_config: IPanelConfig): IPromise[IPanelRef]
  
  var xPosition: ALIGNEND
  
  var yPosition: ABOVE
}
object IPanelService {
  
  inline def apply(
    absPosition: BOTTOM,
    animation: FADE,
    closeReasons: CLICKOUTSIDE,
    create: IPanelConfig => IPanelRef,
    interceptorTypes: CLOSE_,
    newPanelAnimation: () => IPanelAnimation,
    newPanelPosition: () => IPanelPosition,
    open: IPanelConfig => IPromise[IPanelRef],
    xPosition: ALIGNEND,
    yPosition: ABOVE
  ): IPanelService = {
    val __obj = js.Dynamic.literal(absPosition = absPosition.asInstanceOf[js.Any], animation = animation.asInstanceOf[js.Any], closeReasons = closeReasons.asInstanceOf[js.Any], create = js.Any.fromFunction1(create), interceptorTypes = interceptorTypes.asInstanceOf[js.Any], newPanelAnimation = js.Any.fromFunction0(newPanelAnimation), newPanelPosition = js.Any.fromFunction0(newPanelPosition), open = js.Any.fromFunction1(open), xPosition = xPosition.asInstanceOf[js.Any], yPosition = yPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPanelService]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IPanelService] (val x: Self) extends AnyVal {
    
    inline def setAbsPosition(value: BOTTOM): Self = StObject.set(x, "absPosition", value.asInstanceOf[js.Any])
    
    inline def setAnimation(value: FADE): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setCloseReasons(value: CLICKOUTSIDE): Self = StObject.set(x, "closeReasons", value.asInstanceOf[js.Any])
    
    inline def setCreate(value: IPanelConfig => IPanelRef): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
    
    inline def setInterceptorTypes(value: CLOSE_): Self = StObject.set(x, "interceptorTypes", value.asInstanceOf[js.Any])
    
    inline def setNewPanelAnimation(value: () => IPanelAnimation): Self = StObject.set(x, "newPanelAnimation", js.Any.fromFunction0(value))
    
    inline def setNewPanelPosition(value: () => IPanelPosition): Self = StObject.set(x, "newPanelPosition", js.Any.fromFunction0(value))
    
    inline def setOpen(value: IPanelConfig => IPromise[IPanelRef]): Self = StObject.set(x, "open", js.Any.fromFunction1(value))
    
    inline def setXPosition(value: ALIGNEND): Self = StObject.set(x, "xPosition", value.asInstanceOf[js.Any])
    
    inline def setYPosition(value: ABOVE): Self = StObject.set(x, "yPosition", value.asInstanceOf[js.Any])
  }
}
