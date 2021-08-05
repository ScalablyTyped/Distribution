package typings.aceBuilds.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Action extends StObject {
  
  var action: String
  
  var data: typings.aceBuilds.mod.Ace.Fold
}
object Action {
  
  inline def apply(action: String, data: typings.aceBuilds.mod.Ace.Fold): Action = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  
  extension [Self <: Action](x: Self) {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setData(value: typings.aceBuilds.mod.Ace.Fold): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
