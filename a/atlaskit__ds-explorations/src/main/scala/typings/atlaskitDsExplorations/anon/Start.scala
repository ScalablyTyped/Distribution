package typings.atlaskitDsExplorations.anon

import typings.emotionUtils.mod.SerializedStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Start extends StObject {
  
  var center: SerializedStyles
  
  var end: SerializedStyles
  
  var start: SerializedStyles
}
object Start {
  
  inline def apply(center: SerializedStyles, end: SerializedStyles, start: SerializedStyles): Start = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Start]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Start] (val x: Self) extends AnyVal {
    
    inline def setCenter(value: SerializedStyles): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setEnd(value: SerializedStyles): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setStart(value: SerializedStyles): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
