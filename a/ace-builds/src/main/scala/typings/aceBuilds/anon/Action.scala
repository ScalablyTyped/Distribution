package typings.aceBuilds.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Action extends StObject {
  
  var action: String = js.native
  
  var data: typings.aceBuilds.mod.Ace.Fold = js.native
}
object Action {
  
  @scala.inline
  def apply(action: String, data: typings.aceBuilds.mod.Ace.Fold): Action = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  
  @scala.inline
  implicit class ActionMutableBuilder[Self <: Action] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: typings.aceBuilds.mod.Ace.Fold): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
