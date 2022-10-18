package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeThingTypeRequest extends StObject {
  
  /**
    * The name of the thing type.
    */
  var thingTypeName: ThingTypeName
}
object DescribeThingTypeRequest {
  
  inline def apply(thingTypeName: ThingTypeName): DescribeThingTypeRequest = {
    val __obj = js.Dynamic.literal(thingTypeName = thingTypeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeThingTypeRequest]
  }
  
  extension [Self <: DescribeThingTypeRequest](x: Self) {
    
    inline def setThingTypeName(value: ThingTypeName): Self = StObject.set(x, "thingTypeName", value.asInstanceOf[js.Any])
  }
}
