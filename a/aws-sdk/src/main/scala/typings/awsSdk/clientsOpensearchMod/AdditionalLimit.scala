package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdditionalLimit extends StObject {
  
  /**
    *    MaximumNumberOfDataNodesSupported - This attribute only applies to master nodes and specifies the maximum number of data nodes of a given instance type a master node can support.    MaximumNumberOfDataNodesWithoutMasterNode - This attribute only applies to data nodes and specifies the maximum number of data nodes of a given instance type can exist without a master node governing them.  
    */
  var LimitName: js.UndefOr[typings.awsSdk.clientsOpensearchMod.LimitName] = js.undefined
  
  /**
    *  The values of the additional instance type limits.
    */
  var LimitValues: js.UndefOr[LimitValueList] = js.undefined
}
object AdditionalLimit {
  
  inline def apply(): AdditionalLimit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdditionalLimit]
  }
  
  extension [Self <: AdditionalLimit](x: Self) {
    
    inline def setLimitName(value: LimitName): Self = StObject.set(x, "LimitName", value.asInstanceOf[js.Any])
    
    inline def setLimitNameUndefined: Self = StObject.set(x, "LimitName", js.undefined)
    
    inline def setLimitValues(value: LimitValueList): Self = StObject.set(x, "LimitValues", value.asInstanceOf[js.Any])
    
    inline def setLimitValuesUndefined: Self = StObject.set(x, "LimitValues", js.undefined)
    
    inline def setLimitValuesVarargs(value: LimitValue*): Self = StObject.set(x, "LimitValues", js.Array(value*))
  }
}
