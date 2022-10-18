package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdditionalLimit extends StObject {
  
  /**
    *  Additional limit is specific to a given InstanceType and for each of its  InstanceRole  etc.  Attributes and their details:   MaximumNumberOfDataNodesSupported This attribute is present on the master node only to specify how much data nodes up to which given  ESPartitionInstanceType  can support as master node. MaximumNumberOfDataNodesWithoutMasterNode This attribute is present on data node only to specify how much data nodes of given  ESPartitionInstanceType  up to which you don't need any master nodes to govern them.  
    */
  var LimitName: js.UndefOr[typings.awsSdk.clientsOpensearchMod.LimitName] = js.undefined
  
  /**
    *  Value for a given  AdditionalLimit$LimitName  . 
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
