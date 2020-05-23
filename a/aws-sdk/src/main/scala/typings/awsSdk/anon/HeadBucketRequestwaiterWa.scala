package typings.awsSdk.anon

import typings.awsSdk.s3Mod.BucketName
import typings.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/s3.HeadBucketRequest & {  $waiter ? :aws-sdk.aws-sdk/lib/service.WaiterConfiguration} */
@js.native
trait HeadBucketRequestwaiterWa extends js.Object {
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  /**
    * The bucket name.
    */
  var Bucket: BucketName = js.native
}

object HeadBucketRequestwaiterWa {
  @scala.inline
  def apply(Bucket: BucketName, $waiter: WaiterConfiguration = null): HeadBucketRequestwaiterWa = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
    if ($waiter != null) __obj.updateDynamic("$waiter")($waiter.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeadBucketRequestwaiterWa]
  }
}

