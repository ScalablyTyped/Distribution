package typings.awsSdk.clientsLookoutvisionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Anomaly extends StObject {
  
  /**
    * The name of an anomaly type found in an image. Name maps to an anomaly type in the training dataset, apart from the anomaly type background. The service automatically inserts the background anomaly type into the response from DetectAnomalies. 
    */
  var Name: js.UndefOr[AnomalyName] = js.undefined
  
  /**
    * Information about the pixel mask that covers an anomaly type.
    */
  var PixelAnomaly: js.UndefOr[typings.awsSdk.clientsLookoutvisionMod.PixelAnomaly] = js.undefined
}
object Anomaly {
  
  inline def apply(): Anomaly = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Anomaly]
  }
  
  extension [Self <: Anomaly](x: Self) {
    
    inline def setName(value: AnomalyName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setPixelAnomaly(value: PixelAnomaly): Self = StObject.set(x, "PixelAnomaly", value.asInstanceOf[js.Any])
    
    inline def setPixelAnomalyUndefined: Self = StObject.set(x, "PixelAnomaly", js.undefined)
  }
}
