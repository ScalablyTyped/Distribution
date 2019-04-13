package typings
package awsDashSdkLib.clientsEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdditionalLimit extends js.Object {
  /**
    *  Name of Additional Limit is specific to a given InstanceType and for each of it's  InstanceRole  etc.  Attributes and their details:   MaximumNumberOfDataNodesSupported This attribute will be present in Master node only to specify how much data nodes upto which given  ESPartitionInstanceType  can support as master node. MaximumNumberOfDataNodesWithoutMasterNode This attribute will be present in Data node only to specify how much data nodes of given  ESPartitionInstanceType  upto which you don't need any master nodes to govern them.  
    */
  var LimitName: js.UndefOr[LimitName] = js.undefined
  /**
    *  Value for given  AdditionalLimit$LimitName  . 
    */
  var LimitValues: js.UndefOr[LimitValueList] = js.undefined
}

object AdditionalLimit {
  @scala.inline
  def apply(LimitName: LimitName = null, LimitValues: LimitValueList = null): AdditionalLimit = {
    val __obj = js.Dynamic.literal()
    if (LimitName != null) __obj.updateDynamic("LimitName")(LimitName)
    if (LimitValues != null) __obj.updateDynamic("LimitValues")(LimitValues)
    __obj.asInstanceOf[AdditionalLimit]
  }
}

