package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontWeight extends StObject {
  
  /**
    * The lexical name for the level of boldness of the text display.
    */
  var Name: js.UndefOr[FontWeightName] = js.undefined
}
object FontWeight {
  
  inline def apply(): FontWeight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontWeight]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FontWeight] (val x: Self) extends AnyVal {
    
    inline def setName(value: FontWeightName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
