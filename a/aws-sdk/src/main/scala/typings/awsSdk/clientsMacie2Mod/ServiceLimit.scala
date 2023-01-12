package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceLimit extends StObject {
  
  /**
    * Specifies whether the account has met the quota that corresponds to the metric specified by the UsageByAccount.type field in the response.
    */
  var isServiceLimited: js.UndefOr[boolean] = js.undefined
  
  /**
    * The unit of measurement for the value specified by the value field.
    */
  var unit: js.UndefOr[Unit] = js.undefined
  
  /**
    * The value for the metric specified by the UsageByAccount.type field in the response.
    */
  var value: js.UndefOr[long] = js.undefined
}
object ServiceLimit {
  
  inline def apply(): ServiceLimit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceLimit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServiceLimit] (val x: Self) extends AnyVal {
    
    inline def setIsServiceLimited(value: boolean): Self = StObject.set(x, "isServiceLimited", value.asInstanceOf[js.Any])
    
    inline def setIsServiceLimitedUndefined: Self = StObject.set(x, "isServiceLimited", js.undefined)
    
    inline def setUnit(value: Unit): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    
    inline def setValue(value: long): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
