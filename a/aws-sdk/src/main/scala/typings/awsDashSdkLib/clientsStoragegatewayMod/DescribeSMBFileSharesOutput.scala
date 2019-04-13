package typings
package awsDashSdkLib.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeSMBFileSharesOutput extends js.Object {
  /**
    * An array containing a description for each requested file share. 
    */
  var SMBFileShareInfoList: js.UndefOr[SMBFileShareInfoList] = js.undefined
}

object DescribeSMBFileSharesOutput {
  @scala.inline
  def apply(SMBFileShareInfoList: SMBFileShareInfoList = null): DescribeSMBFileSharesOutput = {
    val __obj = js.Dynamic.literal()
    if (SMBFileShareInfoList != null) __obj.updateDynamic("SMBFileShareInfoList")(SMBFileShareInfoList)
    __obj.asInstanceOf[DescribeSMBFileSharesOutput]
  }
}

