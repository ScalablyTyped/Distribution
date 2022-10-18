package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IKEVersionsListValue extends StObject {
  
  /**
    * The IKE version.
    */
  var Value: js.UndefOr[String] = js.undefined
}
object IKEVersionsListValue {
  
  inline def apply(): IKEVersionsListValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IKEVersionsListValue]
  }
  
  extension [Self <: IKEVersionsListValue](x: Self) {
    
    inline def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
