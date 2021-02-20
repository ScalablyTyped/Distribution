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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPanelService extends StObject {
  
  var absPosition: BOTTOM = js.native
  
  var animation: FADE = js.native
  
  var closeReasons: CLICKOUTSIDE = js.native
  
  def create(opt_config: IPanelConfig): IPanelRef = js.native
  
  var interceptorTypes: CLOSE_ = js.native
  
  def newPanelAnimation(): IPanelAnimation = js.native
  
  def newPanelPosition(): IPanelPosition = js.native
  
  def open(opt_config: IPanelConfig): IPromise[IPanelRef] = js.native
  
  var xPosition: ALIGNEND = js.native
  
  var yPosition: ABOVE = js.native
}
object IPanelService {
  
  @scala.inline
  def apply(
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
  implicit class IPanelServiceMutableBuilder[Self <: IPanelService] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbsPosition(value: BOTTOM): Self = StObject.set(x, "absPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimation(value: FADE): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseReasons(value: CLICKOUTSIDE): Self = StObject.set(x, "closeReasons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreate(value: IPanelConfig => IPanelRef): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInterceptorTypes(value: CLOSE_): Self = StObject.set(x, "interceptorTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewPanelAnimation(value: () => IPanelAnimation): Self = StObject.set(x, "newPanelAnimation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewPanelPosition(value: () => IPanelPosition): Self = StObject.set(x, "newPanelPosition", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOpen(value: IPanelConfig => IPromise[IPanelRef]): Self = StObject.set(x, "open", js.Any.fromFunction1(value))
    
    @scala.inline
    def setXPosition(value: ALIGNEND): Self = StObject.set(x, "xPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYPosition(value: ABOVE): Self = StObject.set(x, "yPosition", value.asInstanceOf[js.Any])
  }
}
