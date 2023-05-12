package typings.awsSdk.clientsSagemakergeospatialMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopEarthObservationJobInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Earth Observation job being stopped.
    */
  var Arn: EarthObservationJobArn
}
object StopEarthObservationJobInput {
  
  inline def apply(Arn: EarthObservationJobArn): StopEarthObservationJobInput = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopEarthObservationJobInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StopEarthObservationJobInput] (val x: Self) extends AnyVal {
    
    inline def setArn(value: EarthObservationJobArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
  }
}
