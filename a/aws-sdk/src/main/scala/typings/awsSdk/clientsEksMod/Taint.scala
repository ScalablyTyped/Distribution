package typings.awsSdk.clientsEksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Taint extends StObject {
  
  /**
    * The effect of the taint.
    */
  var effect: js.UndefOr[TaintEffect] = js.undefined
  
  /**
    * The key of the taint.
    */
  var key: js.UndefOr[taintKey] = js.undefined
  
  /**
    * The value of the taint.
    */
  var value: js.UndefOr[taintValue] = js.undefined
}
object Taint {
  
  inline def apply(): Taint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Taint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Taint] (val x: Self) extends AnyVal {
    
    inline def setEffect(value: TaintEffect): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
    
    inline def setEffectUndefined: Self = StObject.set(x, "effect", js.undefined)
    
    inline def setKey(value: taintKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setValue(value: taintValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
