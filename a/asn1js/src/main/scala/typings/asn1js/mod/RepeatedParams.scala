package typings.asn1js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<asn1js.asn1js.IRepeated> */
trait RepeatedParams extends StObject {
  
  var local: js.UndefOr[scala.Boolean] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var optional: js.UndefOr[scala.Boolean] = js.undefined
  
  var value: js.UndefOr[Any] = js.undefined
}
object RepeatedParams {
  
  inline def apply(): RepeatedParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RepeatedParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RepeatedParams] (val x: Self) extends AnyVal {
    
    inline def setLocal(value: scala.Boolean): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    
    inline def setLocalUndefined: Self = StObject.set(x, "local", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOptional(value: scala.Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    inline def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
