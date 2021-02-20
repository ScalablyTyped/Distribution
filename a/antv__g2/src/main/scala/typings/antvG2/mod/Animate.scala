package typings.antvG2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Animate extends StObject {
  
  def registerAnimation(animationType: String, animationName: String, animationFun: js.Any): Unit = js.native
}
object Animate {
  
  @JSImport("@antv/g2", "Animate")
  @js.native
  val ^ : Animate = js.native
  
  @scala.inline
  implicit class AnimateMutableBuilder[Self <: Animate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRegisterAnimation(value: (String, String, js.Any) => Unit): Self = StObject.set(x, "registerAnimation", js.Any.fromFunction3(value))
  }
}
