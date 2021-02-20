package typings.antdMobile.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaskTransitionName extends StObject {
  
  var WrapComponent: String = js.native
  
  var maskTransitionName: String = js.native
  
  var transitionName: String = js.native
}
object MaskTransitionName {
  
  @scala.inline
  def apply(WrapComponent: String, maskTransitionName: String, transitionName: String): MaskTransitionName = {
    val __obj = js.Dynamic.literal(WrapComponent = WrapComponent.asInstanceOf[js.Any], maskTransitionName = maskTransitionName.asInstanceOf[js.Any], transitionName = transitionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaskTransitionName]
  }
  
  @scala.inline
  implicit class MaskTransitionNameMutableBuilder[Self <: MaskTransitionName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaskTransitionName(value: String): Self = StObject.set(x, "maskTransitionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionName(value: String): Self = StObject.set(x, "transitionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapComponent(value: String): Self = StObject.set(x, "WrapComponent", value.asInstanceOf[js.Any])
  }
}
