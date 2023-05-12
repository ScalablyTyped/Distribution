package typings.awsSdk.clientsSagemakergeospatialMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEarthObservationJobInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Earth Observation job.
    */
  var Arn: EarthObservationJobArn
}
object GetEarthObservationJobInput {
  
  inline def apply(Arn: EarthObservationJobArn): GetEarthObservationJobInput = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEarthObservationJobInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetEarthObservationJobInput] (val x: Self) extends AnyVal {
    
    inline def setArn(value: EarthObservationJobArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
  }
}
