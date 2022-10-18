package typings.awsSdk.clientsEsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdditionalLimit extends StObject {
  
  /**
    *  Name of Additional Limit is specific to a given InstanceType and for each of it's  InstanceRole  etc.  Attributes and their details:   MaximumNumberOfDataNodesSupported This attribute will be present in Master node only to specify how much data nodes upto which given  ESPartitionInstanceType  can support as master node. MaximumNumberOfDataNodesWithoutMasterNode This attribute will be present in Data node only to specify how much data nodes of given  ESPartitionInstanceType  upto which you don't need any master nodes to govern them.  
    */
  var LimitName: js.UndefOr[typings.awsSdk.clientsEsMod.LimitName] = js.undefined
  
  /**
    *  Value for given  AdditionalLimit$LimitName  . 
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
