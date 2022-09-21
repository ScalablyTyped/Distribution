package typings.aliOss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageClientOptions extends StObject {
  
  /** access key you create on aliyun console website */
  var accessKeyId: String
  
  /** access secret you create */
  var accessKeySecret: String
  
  /** the default bucket you want to access If you don't have any bucket, please use putBucket() create one first. */
  var bucket: String
  
  /** your image service domain that binding to a OSS bucket */
  var imageHost: String
  
  /** access OSS with aliyun internal network or not, default is false If your servers are running on aliyun too, you can set true to save lot of money. */
  var internal: js.UndefOr[Boolean] = js.undefined
  
  /** the bucket data region location, please see Data Regions, default is oss-cn-hangzhou */
  var region: js.UndefOr[String] = js.undefined
  
  /** instance level timeout for all operations, default is 60s */
  var timeout: js.UndefOr[String | Double] = js.undefined
}
object ImageClientOptions {
  
  inline def apply(accessKeyId: String, accessKeySecret: String, bucket: String, imageHost: String): ImageClientOptions = {
    val __obj = js.Dynamic.literal(accessKeyId = accessKeyId.asInstanceOf[js.Any], accessKeySecret = accessKeySecret.asInstanceOf[js.Any], bucket = bucket.asInstanceOf[js.Any], imageHost = imageHost.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageClientOptions]
  }
  
  extension [Self <: ImageClientOptions](x: Self) {
    
    inline def setAccessKeyId(value: String): Self = StObject.set(x, "accessKeyId", value.asInstanceOf[js.Any])
    
    inline def setAccessKeySecret(value: String): Self = StObject.set(x, "accessKeySecret", value.asInstanceOf[js.Any])
    
    inline def setBucket(value: String): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    inline def setImageHost(value: String): Self = StObject.set(x, "imageHost", value.asInstanceOf[js.Any])
    
    inline def setInternal(value: Boolean): Self = StObject.set(x, "internal", value.asInstanceOf[js.Any])
    
    inline def setInternalUndefined: Self = StObject.set(x, "internal", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setTimeout(value: String | Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
