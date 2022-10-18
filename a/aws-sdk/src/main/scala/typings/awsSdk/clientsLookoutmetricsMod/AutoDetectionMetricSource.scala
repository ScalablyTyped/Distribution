package typings.awsSdk.clientsLookoutmetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoDetectionMetricSource extends StObject {
  
  /**
    * The source's source config.
    */
  var S3SourceConfig: js.UndefOr[AutoDetectionS3SourceConfig] = js.undefined
}
object AutoDetectionMetricSource {
  
  inline def apply(): AutoDetectionMetricSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoDetectionMetricSource]
  }
  
  extension [Self <: AutoDetectionMetricSource](x: Self) {
    
    inline def setS3SourceConfig(value: AutoDetectionS3SourceConfig): Self = StObject.set(x, "S3SourceConfig", value.asInstanceOf[js.Any])
    
    inline def setS3SourceConfigUndefined: Self = StObject.set(x, "S3SourceConfig", js.undefined)
  }
}
