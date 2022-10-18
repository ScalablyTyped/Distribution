package typings.awsSdk.clientsEmrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SupportedProductConfig extends StObject {
  
  /**
    * The list of user-supplied arguments.
    */
  var Args: js.UndefOr[XmlStringList] = js.undefined
  
  /**
    * The name of the product configuration.
    */
  var Name: js.UndefOr[XmlStringMaxLen256] = js.undefined
}
object SupportedProductConfig {
  
  inline def apply(): SupportedProductConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SupportedProductConfig]
  }
  
  extension [Self <: SupportedProductConfig](x: Self) {
    
    inline def setArgs(value: XmlStringList): Self = StObject.set(x, "Args", value.asInstanceOf[js.Any])
    
    inline def setArgsUndefined: Self = StObject.set(x, "Args", js.undefined)
    
    inline def setArgsVarargs(value: XmlString*): Self = StObject.set(x, "Args", js.Array(value*))
    
    inline def setName(value: XmlStringMaxLen256): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
