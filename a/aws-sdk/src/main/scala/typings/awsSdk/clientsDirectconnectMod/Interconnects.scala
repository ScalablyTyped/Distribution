package typings.awsSdk.clientsDirectconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Interconnects extends StObject {
  
  /**
    * The interconnects.
    */
  var interconnects: js.UndefOr[InterconnectList] = js.undefined
}
object Interconnects {
  
  inline def apply(): Interconnects = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Interconnects]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Interconnects] (val x: Self) extends AnyVal {
    
    inline def setInterconnects(value: InterconnectList): Self = StObject.set(x, "interconnects", value.asInstanceOf[js.Any])
    
    inline def setInterconnectsUndefined: Self = StObject.set(x, "interconnects", js.undefined)
    
    inline def setInterconnectsVarargs(value: Interconnect*): Self = StObject.set(x, "interconnects", js.Array(value*))
  }
}
