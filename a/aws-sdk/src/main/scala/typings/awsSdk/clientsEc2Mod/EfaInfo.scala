package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EfaInfo extends StObject {
  
  /**
    * The maximum number of Elastic Fabric Adapters for the instance type.
    */
  var MaximumEfaInterfaces: js.UndefOr[typings.awsSdk.clientsEc2Mod.MaximumEfaInterfaces] = js.undefined
}
object EfaInfo {
  
  inline def apply(): EfaInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EfaInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EfaInfo] (val x: Self) extends AnyVal {
    
    inline def setMaximumEfaInterfaces(value: MaximumEfaInterfaces): Self = StObject.set(x, "MaximumEfaInterfaces", value.asInstanceOf[js.Any])
    
    inline def setMaximumEfaInterfacesUndefined: Self = StObject.set(x, "MaximumEfaInterfaces", js.undefined)
  }
}
