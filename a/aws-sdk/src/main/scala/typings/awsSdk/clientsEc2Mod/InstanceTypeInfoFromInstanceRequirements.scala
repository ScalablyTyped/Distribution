package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceTypeInfoFromInstanceRequirements extends StObject {
  
  /**
    * The matching instance type.
    */
  var InstanceType: js.UndefOr[String] = js.undefined
}
object InstanceTypeInfoFromInstanceRequirements {
  
  inline def apply(): InstanceTypeInfoFromInstanceRequirements = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceTypeInfoFromInstanceRequirements]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InstanceTypeInfoFromInstanceRequirements] (val x: Self) extends AnyVal {
    
    inline def setInstanceType(value: String): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
  }
}
