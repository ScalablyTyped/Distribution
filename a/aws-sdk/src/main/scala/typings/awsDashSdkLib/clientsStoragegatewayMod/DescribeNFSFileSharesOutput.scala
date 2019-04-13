package typings
package awsDashSdkLib.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeNFSFileSharesOutput extends js.Object {
  /**
    * An array containing a description for each requested file share. 
    */
  var NFSFileShareInfoList: js.UndefOr[NFSFileShareInfoList] = js.undefined
}

object DescribeNFSFileSharesOutput {
  @scala.inline
  def apply(NFSFileShareInfoList: NFSFileShareInfoList = null): DescribeNFSFileSharesOutput = {
    val __obj = js.Dynamic.literal()
    if (NFSFileShareInfoList != null) __obj.updateDynamic("NFSFileShareInfoList")(NFSFileShareInfoList)
    __obj.asInstanceOf[DescribeNFSFileSharesOutput]
  }
}

