package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Appear extends StObject {
  
  var appear: js.Any = js.native
  
  var enter: Duration = js.native
  
  var leave: Duration = js.native
  
  var update: Duration = js.native
}
object Appear {
  
  @scala.inline
  def apply(appear: js.Any, enter: Duration, leave: Duration, update: Duration): Appear = {
    val __obj = js.Dynamic.literal(appear = appear.asInstanceOf[js.Any], enter = enter.asInstanceOf[js.Any], leave = leave.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any])
    __obj.asInstanceOf[Appear]
  }
  
  @scala.inline
  implicit class AppearMutableBuilder[Self <: Appear] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppear(value: js.Any): Self = StObject.set(x, "appear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnter(value: Duration): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeave(value: Duration): Self = StObject.set(x, "leave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdate(value: Duration): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
  }
}
