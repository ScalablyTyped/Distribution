package typings.awsSdk.clientsSagemakergeospatialMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteEarthObservationJobInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Earth Observation job being deleted.
    */
  var Arn: EarthObservationJobArn
}
object DeleteEarthObservationJobInput {
  
  inline def apply(Arn: EarthObservationJobArn): DeleteEarthObservationJobInput = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEarthObservationJobInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteEarthObservationJobInput] (val x: Self) extends AnyVal {
    
    inline def setArn(value: EarthObservationJobArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
  }
}
