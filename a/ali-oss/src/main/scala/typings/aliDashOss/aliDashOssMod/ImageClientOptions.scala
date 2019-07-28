package typings.aliDashOss.aliDashOssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageClientOptions extends js.Object {
   // your image service domain that binding to a OSS bucket
  var accessKeyId: String
   // access key you create on aliyun console website
  var accessKeySecret: String
   // access secret you create
  var bucket: String
  var imageHost: String
   // the bucket data region location, please see Data Regions, default is oss-cn-hangzhou
  var internal: js.UndefOr[Boolean] = js.undefined
   //  the default bucket you want to access If you don't have any bucket, please use putBucket() create one first.
  var region: js.UndefOr[String] = js.undefined
   // access OSS with aliyun internal network or not, default is false If your servers are running on aliyun too, you can set true to save lot of money.
  var timeout: js.UndefOr[String | Double] = js.undefined
}

object ImageClientOptions {
  @scala.inline
  def apply(
    accessKeyId: String,
    accessKeySecret: String,
    bucket: String,
    imageHost: String,
    internal: js.UndefOr[Boolean] = js.undefined,
    region: String = null,
    timeout: String | Double = null
  ): ImageClientOptions = {
    val __obj = js.Dynamic.literal(accessKeyId = accessKeyId, accessKeySecret = accessKeySecret, bucket = bucket, imageHost = imageHost)
    if (!js.isUndefined(internal)) __obj.updateDynamic("internal")(internal)
    if (region != null) __obj.updateDynamic("region")(region)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageClientOptions]
  }
}

