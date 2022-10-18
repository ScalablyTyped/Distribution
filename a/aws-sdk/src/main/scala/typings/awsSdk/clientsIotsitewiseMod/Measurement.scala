package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Measurement extends StObject {
  
  /**
    * The processing configuration for the given measurement property. You can configure measurements to be kept at the edge or forwarded to the Amazon Web Services Cloud. By default, measurements are forwarded to the cloud.
    */
  var processingConfig: js.UndefOr[MeasurementProcessingConfig] = js.undefined
}
object Measurement {
  
  inline def apply(): Measurement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Measurement]
  }
  
  extension [Self <: Measurement](x: Self) {
    
    inline def setProcessingConfig(value: MeasurementProcessingConfig): Self = StObject.set(x, "processingConfig", value.asInstanceOf[js.Any])
    
    inline def setProcessingConfigUndefined: Self = StObject.set(x, "processingConfig", js.undefined)
  }
}
