package typings
package aliDashOssLib.aliDashOssMod.OSSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var accessKeyId: java.lang.String
   // access secret you create
  var accessKeySecret: java.lang.String
   // used by temporary authorization
  var bucket: js.UndefOr[java.lang.String] = js.undefined
   // instance level timeout for all operations, default is 60s
  var cname: js.UndefOr[scala.Boolean] = js.undefined
   //  the default bucket you want to access If you don't have any bucket, please use putBucket() create one first.
  var endpoint: js.UndefOr[java.lang.String] = js.undefined
   // the bucket data region location, please see Data Regions, default is oss-cn-hangzhou.
  var internal: js.UndefOr[scala.Boolean] = js.undefined
   // oss region domain. It takes priority over region.
  var region: js.UndefOr[java.lang.String] = js.undefined
   //  access OSS with aliyun internal network or not, default is false. If your servers are running on aliyun too, you can set true to save lot of money.
  var secure: js.UndefOr[scala.Boolean] = js.undefined
   // access secret you create
  var stsToken: js.UndefOr[java.lang.String] = js.undefined
   // instruct OSS client to use HTTPS (secure: true) or HTTP (secure: false) protocol.
  var timeout: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    accessKeyId: java.lang.String,
    accessKeySecret: java.lang.String,
    bucket: java.lang.String = null,
    cname: js.UndefOr[scala.Boolean] = js.undefined,
    endpoint: java.lang.String = null,
    internal: js.UndefOr[scala.Boolean] = js.undefined,
    region: java.lang.String = null,
    secure: js.UndefOr[scala.Boolean] = js.undefined,
    stsToken: java.lang.String = null,
    timeout: java.lang.String | scala.Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("accessKeyId")(accessKeyId)
    __obj.updateDynamic("accessKeySecret")(accessKeySecret)
    if (bucket != null) __obj.updateDynamic("bucket")(bucket)
    if (!js.isUndefined(cname)) __obj.updateDynamic("cname")(cname)
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint)
    if (!js.isUndefined(internal)) __obj.updateDynamic("internal")(internal)
    if (region != null) __obj.updateDynamic("region")(region)
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure)
    if (stsToken != null) __obj.updateDynamic("stsToken")(stsToken)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

