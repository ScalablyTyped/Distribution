package typings
package aliDashOssLib.imageclientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ImageClientOptions extends js.Object {
   // your image service domain that binding to a OSS bucket
  var accessKeyId: java.lang.String
   // access key you create on aliyun console website
  var accessKeySecret: java.lang.String
   // access secret you create
  var bucket: java.lang.String
  var imageHost: java.lang.String
   // the bucket data region location, please see Data Regions, default is oss-cn-hangzhou
  var internal: js.UndefOr[scala.Boolean] = js.undefined
   //  the default bucket you want to access If you don't have any bucket, please use putBucket() create one first.
  var region: js.UndefOr[java.lang.String] = js.undefined
   // access OSS with aliyun internal network or not, default is false If your servers are running on aliyun too, you can set true to save lot of money.
  var timeout: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

