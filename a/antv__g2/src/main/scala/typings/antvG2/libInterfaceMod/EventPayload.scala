package typings.antvG2.libInterfaceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventPayload
  extends StObject
     with LooseObject {
  
  /**
    * @title 触发事件的来源
    */
  var source: js.UndefOr[String] = js.undefined
}
object EventPayload {
  
  inline def apply(): EventPayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventPayload]
  }
  
  extension [Self <: EventPayload](x: Self) {
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
