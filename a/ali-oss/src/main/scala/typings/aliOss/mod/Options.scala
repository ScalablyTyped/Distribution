package typings.aliOss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var accessKeyId: String = js.native
  
   // access secret you create
  var accessKeySecret: String = js.native
  
   // used by temporary authorization
  var bucket: js.UndefOr[String] = js.native
  
   // instance level timeout for all operations, default is 60s
  var cname: js.UndefOr[Boolean] = js.native
  
   //  the default bucket you want to access If you don't have any bucket, please use putBucket() create one first.
  var endpoint: js.UndefOr[String] = js.native
  
   // the bucket data region location, please see Data Regions, default is oss-cn-hangzhou.
  var internal: js.UndefOr[Boolean] = js.native
  
   // oss region domain. It takes priority over region.
  var region: js.UndefOr[String] = js.native
  
   //  access OSS with aliyun internal network or not, default is false. If your servers are running on aliyun too, you can set true to save lot of money.
  var secure: js.UndefOr[Boolean] = js.native
  
   // access secret you create
  var stsToken: js.UndefOr[String] = js.native
  
   // instruct OSS client to use HTTPS (secure: true) or HTTP (secure: false) protocol.
  var timeout: js.UndefOr[String | Double] = js.native
}
object Options {
  
  @scala.inline
  def apply(accessKeyId: String, accessKeySecret: String): Options = {
    val __obj = js.Dynamic.literal(accessKeyId = accessKeyId.asInstanceOf[js.Any], accessKeySecret = accessKeySecret.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def deleteBucket: Self = this.set("bucket", js.undefined)
    
    @scala.inline
    def setCname(value: Boolean): Self = this.set("cname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCname: Self = this.set("cname", js.undefined)
    
    @scala.inline
    def setEndpoint(value: String): Self = this.set("endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpoint: Self = this.set("endpoint", js.undefined)
    
    @scala.inline
    def setInternal(value: Boolean): Self = this.set("internal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInternal: Self = this.set("internal", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    
    @scala.inline
    def setSecure(value: Boolean): Self = this.set("secure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecure: Self = this.set("secure", js.undefined)
    
    @scala.inline
    def setStsToken(value: String): Self = this.set("stsToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStsToken: Self = this.set("stsToken", js.undefined)
    
    @scala.inline
    def setTimeout(value: String | Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
}
