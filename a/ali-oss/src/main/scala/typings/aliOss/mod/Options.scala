package typings.aliOss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var accessKeyId: String
   // access secret you create
  var accessKeySecret: String
   // used by temporary authorization
  var bucket: js.UndefOr[String] = js.undefined
   // instance level timeout for all operations, default is 60s
  var cname: js.UndefOr[Boolean] = js.undefined
   //  the default bucket you want to access If you don't have any bucket, please use putBucket() create one first.
  var endpoint: js.UndefOr[String] = js.undefined
   // the bucket data region location, please see Data Regions, default is oss-cn-hangzhou.
  var internal: js.UndefOr[Boolean] = js.undefined
   // oss region domain. It takes priority over region.
  var region: js.UndefOr[String] = js.undefined
   //  access OSS with aliyun internal network or not, default is false. If your servers are running on aliyun too, you can set true to save lot of money.
  var secure: js.UndefOr[Boolean] = js.undefined
   // access secret you create
  var stsToken: js.UndefOr[String] = js.undefined
   // instruct OSS client to use HTTPS (secure: true) or HTTP (secure: false) protocol.
  var timeout: js.UndefOr[String | Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    accessKeyId: String,
    accessKeySecret: String,
    bucket: String = null,
    cname: js.UndefOr[Boolean] = js.undefined,
    endpoint: String = null,
    internal: js.UndefOr[Boolean] = js.undefined,
    region: String = null,
    secure: js.UndefOr[Boolean] = js.undefined,
    stsToken: String = null,
    timeout: String | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal(accessKeyId = accessKeyId.asInstanceOf[js.Any], accessKeySecret = accessKeySecret.asInstanceOf[js.Any])
    if (bucket != null) __obj.updateDynamic("bucket")(bucket.asInstanceOf[js.Any])
    if (!js.isUndefined(cname)) __obj.updateDynamic("cname")(cname.get.asInstanceOf[js.Any])
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint.asInstanceOf[js.Any])
    if (!js.isUndefined(internal)) __obj.updateDynamic("internal")(internal.get.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure.get.asInstanceOf[js.Any])
    if (stsToken != null) __obj.updateDynamic("stsToken")(stsToken.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

