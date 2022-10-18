package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricsSource extends StObject {
  
  /**
    * The hash key used for the metrics source.
    */
  var ContentDigest: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ContentDigest] = js.undefined
  
  /**
    * The metric source content type.
    */
  var ContentType: typings.awsSdk.clientsSagemakerMod.ContentType
  
  /**
    * The S3 URI for the metrics source.
    */
  var S3Uri: typings.awsSdk.clientsSagemakerMod.S3Uri
}
object MetricsSource {
  
  inline def apply(ContentType: ContentType, S3Uri: S3Uri): MetricsSource = {
    val __obj = js.Dynamic.literal(ContentType = ContentType.asInstanceOf[js.Any], S3Uri = S3Uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricsSource]
  }
  
  extension [Self <: MetricsSource](x: Self) {
    
    inline def setContentDigest(value: ContentDigest): Self = StObject.set(x, "ContentDigest", value.asInstanceOf[js.Any])
    
    inline def setContentDigestUndefined: Self = StObject.set(x, "ContentDigest", js.undefined)
    
    inline def setContentType(value: ContentType): Self = StObject.set(x, "ContentType", value.asInstanceOf[js.Any])
    
    inline def setS3Uri(value: S3Uri): Self = StObject.set(x, "S3Uri", value.asInstanceOf[js.Any])
  }
}
