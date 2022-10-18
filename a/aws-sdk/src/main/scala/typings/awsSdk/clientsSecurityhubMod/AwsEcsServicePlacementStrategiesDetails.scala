package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEcsServicePlacementStrategiesDetails extends StObject {
  
  /**
    * The field to apply the placement strategy against. For the spread placement strategy, valid values are instanceId (or host, which has the same effect), or any platform or custom attribute that is applied to a container instance, such as attribute:ecs.availability-zone. For the binpack placement strategy, valid values are cpu and memory. For the random placement strategy, this attribute is not used.
    */
  var Field: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The type of placement strategy. The random placement strategy randomly places tasks on available candidates. The spread placement strategy spreads placement across available candidates evenly based on the value of Field. The binpack strategy places tasks on available candidates that have the least available amount of the resource that is specified in Field. Valid values: random | spread | binpack 
    */
  var Type: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsEcsServicePlacementStrategiesDetails {
  
  inline def apply(): AwsEcsServicePlacementStrategiesDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEcsServicePlacementStrategiesDetails]
  }
  
  extension [Self <: AwsEcsServicePlacementStrategiesDetails](x: Self) {
    
    inline def setField(value: NonEmptyString): Self = StObject.set(x, "Field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "Field", js.undefined)
    
    inline def setType(value: NonEmptyString): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
