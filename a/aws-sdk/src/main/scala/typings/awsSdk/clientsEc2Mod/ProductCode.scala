package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProductCode extends StObject {
  
  /**
    * The product code.
    */
  var ProductCodeId: js.UndefOr[String] = js.undefined
  
  /**
    * The type of product code.
    */
  var ProductCodeType: js.UndefOr[ProductCodeValues] = js.undefined
}
object ProductCode {
  
  inline def apply(): ProductCode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductCode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProductCode] (val x: Self) extends AnyVal {
    
    inline def setProductCodeId(value: String): Self = StObject.set(x, "ProductCodeId", value.asInstanceOf[js.Any])
    
    inline def setProductCodeIdUndefined: Self = StObject.set(x, "ProductCodeId", js.undefined)
    
    inline def setProductCodeType(value: ProductCodeValues): Self = StObject.set(x, "ProductCodeType", value.asInstanceOf[js.Any])
    
    inline def setProductCodeTypeUndefined: Self = StObject.set(x, "ProductCodeType", js.undefined)
  }
}
