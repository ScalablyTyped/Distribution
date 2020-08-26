package typings.aliOss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageClientOptions extends js.Object {
   // your image service domain that binding to a OSS bucket
  var accessKeyId: String = js.native
   // access key you create on aliyun console website
  var accessKeySecret: String = js.native
   // access secret you create
  var bucket: String = js.native
  var imageHost: String = js.native
   // the bucket data region location, please see Data Regions, default is oss-cn-hangzhou
  var internal: js.UndefOr[Boolean] = js.native
   //  the default bucket you want to access If you don't have any bucket, please use putBucket() create one first.
  var region: js.UndefOr[String] = js.native
   // access OSS with aliyun internal network or not, default is false If your servers are running on aliyun too, you can set true to save lot of money.
  var timeout: js.UndefOr[String | Double] = js.native
}

object ImageClientOptions {
  @scala.inline
  def apply(accessKeyId: String, accessKeySecret: String, bucket: String, imageHost: String): ImageClientOptions = {
    val __obj = js.Dynamic.literal(accessKeyId = accessKeyId.asInstanceOf[js.Any], accessKeySecret = accessKeySecret.asInstanceOf[js.Any], bucket = bucket.asInstanceOf[js.Any], imageHost = imageHost.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageClientOptions]
  }
  @scala.inline
  implicit class ImageClientOptionsOps[Self <: ImageClientOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccessKeyId(value: String): Self = this.set("accessKeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccessKeySecret(value: String): Self = this.set("accessKeySecret", value.asInstanceOf[js.Any])
    @scala.inline
    def setBucket(value: String): Self = this.set("bucket", value.asInstanceOf[js.Any])
    @scala.inline
    def setImageHost(value: String): Self = this.set("imageHost", value.asInstanceOf[js.Any])
    @scala.inline
    def setInternal(value: Boolean): Self = this.set("internal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInternal: Self = this.set("internal", js.undefined)
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    @scala.inline
    def setTimeout(value: String | Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

