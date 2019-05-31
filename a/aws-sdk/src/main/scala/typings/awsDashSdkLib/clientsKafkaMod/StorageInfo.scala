package typings
package awsDashSdkLib.clientsKafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StorageInfo extends js.Object {
  /**
    * 
    EBS volume information.
    
    */
  var EbsStorageInfo: js.UndefOr[EBSStorageInfo] = js.undefined
}

object StorageInfo {
  @scala.inline
  def apply(EbsStorageInfo: EBSStorageInfo = null): StorageInfo = {
    val __obj = js.Dynamic.literal()
    if (EbsStorageInfo != null) __obj.updateDynamic("EbsStorageInfo")(EbsStorageInfo)
    __obj.asInstanceOf[StorageInfo]
  }
}

