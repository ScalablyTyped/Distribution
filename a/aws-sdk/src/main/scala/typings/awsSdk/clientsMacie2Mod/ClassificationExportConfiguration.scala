package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassificationExportConfiguration extends StObject {
  
  /**
    * The S3 bucket to store data classification results in, and the encryption settings to use when storing results in that bucket.
    */
  var s3Destination: js.UndefOr[S3Destination] = js.undefined
}
object ClassificationExportConfiguration {
  
  inline def apply(): ClassificationExportConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassificationExportConfiguration]
  }
  
  extension [Self <: ClassificationExportConfiguration](x: Self) {
    
    inline def setS3Destination(value: S3Destination): Self = StObject.set(x, "s3Destination", value.asInstanceOf[js.Any])
    
    inline def setS3DestinationUndefined: Self = StObject.set(x, "s3Destination", js.undefined)
  }
}
