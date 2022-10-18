package typings.awsSdk.clientsAccessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3PublicAccessBlockConfiguration extends StObject {
  
  /**
    *  Specifies whether Amazon S3 should ignore public ACLs for this bucket and objects in this bucket. 
    */
  var ignorePublicAcls: Boolean
  
  /**
    *  Specifies whether Amazon S3 should restrict public bucket policies for this bucket. 
    */
  var restrictPublicBuckets: Boolean
}
object S3PublicAccessBlockConfiguration {
  
  inline def apply(ignorePublicAcls: Boolean, restrictPublicBuckets: Boolean): S3PublicAccessBlockConfiguration = {
    val __obj = js.Dynamic.literal(ignorePublicAcls = ignorePublicAcls.asInstanceOf[js.Any], restrictPublicBuckets = restrictPublicBuckets.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3PublicAccessBlockConfiguration]
  }
  
  extension [Self <: S3PublicAccessBlockConfiguration](x: Self) {
    
    inline def setIgnorePublicAcls(value: Boolean): Self = StObject.set(x, "ignorePublicAcls", value.asInstanceOf[js.Any])
    
    inline def setRestrictPublicBuckets(value: Boolean): Self = StObject.set(x, "restrictPublicBuckets", value.asInstanceOf[js.Any])
  }
}
