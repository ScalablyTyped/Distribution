package typings.awsSdk.clientsEvidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Variation extends StObject {
  
  /**
    * The name of the variation.
    */
  var name: js.UndefOr[VariationName] = js.undefined
  
  /**
    * The value assigned to this variation.
    */
  var value: js.UndefOr[VariableValue] = js.undefined
}
object Variation {
  
  inline def apply(): Variation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Variation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Variation] (val x: Self) extends AnyVal {
    
    inline def setName(value: VariationName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setValue(value: VariableValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
