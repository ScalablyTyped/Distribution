package typings.aliOss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options extends StObject {
  
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
  
  inline def apply(accessKeyId: String, accessKeySecret: String): Options = {
    val __obj = js.Dynamic.literal(accessKeyId = accessKeyId.asInstanceOf[js.Any], accessKeySecret = accessKeySecret.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  extension [Self <: Options](x: Self) {
    
    inline def setAccessKeyId(value: String): Self = StObject.set(x, "accessKeyId", value.asInstanceOf[js.Any])
    
    inline def setAccessKeySecret(value: String): Self = StObject.set(x, "accessKeySecret", value.asInstanceOf[js.Any])
    
    inline def setBucket(value: String): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    inline def setBucketUndefined: Self = StObject.set(x, "bucket", js.undefined)
    
    inline def setCname(value: Boolean): Self = StObject.set(x, "cname", value.asInstanceOf[js.Any])
    
    inline def setCnameUndefined: Self = StObject.set(x, "cname", js.undefined)
    
    inline def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
    
    inline def setInternal(value: Boolean): Self = StObject.set(x, "internal", value.asInstanceOf[js.Any])
    
    inline def setInternalUndefined: Self = StObject.set(x, "internal", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
    
    inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
    
    inline def setStsToken(value: String): Self = StObject.set(x, "stsToken", value.asInstanceOf[js.Any])
    
    inline def setStsTokenUndefined: Self = StObject.set(x, "stsToken", js.undefined)
    
    inline def setTimeout(value: String | Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
