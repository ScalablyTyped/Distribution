package typings.awsSdk.clientsLicensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3Location extends StObject {
  
  /**
    * Name of the S3 bucket reports are published to.
    */
  var bucket: js.UndefOr[String] = js.undefined
  
  /**
    * Prefix of the S3 bucket reports are published to.
    */
  var keyPrefix: js.UndefOr[String] = js.undefined
}
object S3Location {
  
  inline def apply(): S3Location = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3Location]
  }
  
  extension [Self <: S3Location](x: Self) {
    
    inline def setBucket(value: String): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    inline def setBucketUndefined: Self = StObject.set(x, "bucket", js.undefined)
    
    inline def setKeyPrefix(value: String): Self = StObject.set(x, "keyPrefix", value.asInstanceOf[js.Any])
    
    inline def setKeyPrefixUndefined: Self = StObject.set(x, "keyPrefix", js.undefined)
  }
}
