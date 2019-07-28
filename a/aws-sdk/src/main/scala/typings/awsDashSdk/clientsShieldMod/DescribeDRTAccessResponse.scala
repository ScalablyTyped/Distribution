package typings.awsDashSdk.clientsShieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeDRTAccessResponse extends js.Object {
  /**
    * The list of Amazon S3 buckets accessed by the DRT.
    */
  var LogBucketList: js.UndefOr[typings.awsDashSdk.clientsShieldMod.LogBucketList] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the role the DRT used to access your AWS account.
    */
  var RoleArn: js.UndefOr[typings.awsDashSdk.clientsShieldMod.RoleArn] = js.undefined
}

object DescribeDRTAccessResponse {
  @scala.inline
  def apply(LogBucketList: LogBucketList = null, RoleArn: RoleArn = null): DescribeDRTAccessResponse = {
    val __obj = js.Dynamic.literal()
    if (LogBucketList != null) __obj.updateDynamic("LogBucketList")(LogBucketList)
    if (RoleArn != null) __obj.updateDynamic("RoleArn")(RoleArn)
    __obj.asInstanceOf[DescribeDRTAccessResponse]
  }
}

