package typings.awsSdk.clientsLexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuiltinIntentSlot extends StObject {
  
  /**
    * A list of the slots defined for the intent.
    */
  var name: js.UndefOr[String] = js.undefined
}
object BuiltinIntentSlot {
  
  inline def apply(): BuiltinIntentSlot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuiltinIntentSlot]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BuiltinIntentSlot] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
