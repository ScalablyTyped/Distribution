package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EbsInfo extends js.Object {
  /**
    * Indicates that the instance type is Amazon EBS-optimized. For more information, see Amazon EBS-Optimized Instances in Amazon EC2 User Guide for Linux Instances.
    */
  var EbsOptimizedSupport: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.EbsOptimizedSupport] = js.native
  /**
    * Indicates whether Amazon EBS encryption is supported.
    */
  var EncryptionSupport: js.UndefOr[EbsEncryptionSupport] = js.native
}

object EbsInfo {
  @scala.inline
  def apply(EbsOptimizedSupport: EbsOptimizedSupport = null, EncryptionSupport: EbsEncryptionSupport = null): EbsInfo = {
    val __obj = js.Dynamic.literal()
    if (EbsOptimizedSupport != null) __obj.updateDynamic("EbsOptimizedSupport")(EbsOptimizedSupport.asInstanceOf[js.Any])
    if (EncryptionSupport != null) __obj.updateDynamic("EncryptionSupport")(EncryptionSupport.asInstanceOf[js.Any])
    __obj.asInstanceOf[EbsInfo]
  }
}

