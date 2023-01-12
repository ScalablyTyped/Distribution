package typings.awsSdk.clientsCodedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetOnPremisesInstanceOutput extends StObject {
  
  /**
    *  Information about the on-premises instance. 
    */
  var instanceInfo: js.UndefOr[InstanceInfo] = js.undefined
}
object GetOnPremisesInstanceOutput {
  
  inline def apply(): GetOnPremisesInstanceOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetOnPremisesInstanceOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetOnPremisesInstanceOutput] (val x: Self) extends AnyVal {
    
    inline def setInstanceInfo(value: InstanceInfo): Self = StObject.set(x, "instanceInfo", value.asInstanceOf[js.Any])
    
    inline def setInstanceInfoUndefined: Self = StObject.set(x, "instanceInfo", js.undefined)
  }
}
