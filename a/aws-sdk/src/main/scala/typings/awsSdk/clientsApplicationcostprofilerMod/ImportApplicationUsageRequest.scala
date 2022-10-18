package typings.awsSdk.clientsApplicationcostprofilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportApplicationUsageRequest extends StObject {
  
  /**
    * Amazon S3 location to import application usage data from.
    */
  var sourceS3Location: SourceS3Location
}
object ImportApplicationUsageRequest {
  
  inline def apply(sourceS3Location: SourceS3Location): ImportApplicationUsageRequest = {
    val __obj = js.Dynamic.literal(sourceS3Location = sourceS3Location.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportApplicationUsageRequest]
  }
  
  extension [Self <: ImportApplicationUsageRequest](x: Self) {
    
    inline def setSourceS3Location(value: SourceS3Location): Self = StObject.set(x, "sourceS3Location", value.asInstanceOf[js.Any])
  }
}
