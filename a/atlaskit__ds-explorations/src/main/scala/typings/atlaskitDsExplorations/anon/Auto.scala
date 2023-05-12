package typings.atlaskitDsExplorations.anon

import typings.emotionUtils.mod.SerializedStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Auto extends StObject {
  
  var auto: SerializedStyles
  
  var hidden: SerializedStyles
}
object Auto {
  
  inline def apply(auto: SerializedStyles, hidden: SerializedStyles): Auto = {
    val __obj = js.Dynamic.literal(auto = auto.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any])
    __obj.asInstanceOf[Auto]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Auto] (val x: Self) extends AnyVal {
    
    inline def setAuto(value: SerializedStyles): Self = StObject.set(x, "auto", value.asInstanceOf[js.Any])
    
    inline def setHidden(value: SerializedStyles): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
  }
}
