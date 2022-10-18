package typings.awsSdk.clientsLookoutmetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSampleDataRequest extends StObject {
  
  /**
    * A datasource bucket in Amazon S3.
    */
  var S3SourceConfig: js.UndefOr[SampleDataS3SourceConfig] = js.undefined
}
object GetSampleDataRequest {
  
  inline def apply(): GetSampleDataRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSampleDataRequest]
  }
  
  extension [Self <: GetSampleDataRequest](x: Self) {
    
    inline def setS3SourceConfig(value: SampleDataS3SourceConfig): Self = StObject.set(x, "S3SourceConfig", value.asInstanceOf[js.Any])
    
    inline def setS3SourceConfigUndefined: Self = StObject.set(x, "S3SourceConfig", js.undefined)
  }
}
