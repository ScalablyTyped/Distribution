package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IcmpTypeCode extends StObject {
  
  /**
    * The ICMP code for which to deny or allow access. To deny or allow all codes, use the value -1.
    */
  var Code: js.UndefOr[Integer] = js.undefined
  
  /**
    * The ICMP type for which to deny or allow access. To deny or allow all types, use the value -1.
    */
  var Type: js.UndefOr[Integer] = js.undefined
}
object IcmpTypeCode {
  
  inline def apply(): IcmpTypeCode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IcmpTypeCode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IcmpTypeCode] (val x: Self) extends AnyVal {
    
    inline def setCode(value: Integer): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
    
    inline def setType(value: Integer): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
