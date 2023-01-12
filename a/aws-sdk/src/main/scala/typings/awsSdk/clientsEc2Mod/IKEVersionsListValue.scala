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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IKEVersionsListValue] (val x: Self) extends AnyVal {
    
    inline def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
