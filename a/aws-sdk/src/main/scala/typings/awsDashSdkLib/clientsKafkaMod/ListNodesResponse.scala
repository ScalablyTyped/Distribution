package typings
package awsDashSdkLib.clientsKafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListNodesResponse extends js.Object {
  /**
    * 
    The paginated results marker. When the result of a ListNodes operation is truncated, the call returns NextToken in the response. 
    To get another batch of nodes, provide this token in your next request.
    
    */
  var NextToken: js.UndefOr[__string] = js.undefined
  /**
    * 
    List containing a NodeInfo object.
    
    */
  var NodeInfoList: js.UndefOr[__listOfNodeInfo] = js.undefined
}

object ListNodesResponse {
  @scala.inline
  def apply(NextToken: __string = null, NodeInfoList: __listOfNodeInfo = null): ListNodesResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (NodeInfoList != null) __obj.updateDynamic("NodeInfoList")(NodeInfoList)
    __obj.asInstanceOf[ListNodesResponse]
  }
}

