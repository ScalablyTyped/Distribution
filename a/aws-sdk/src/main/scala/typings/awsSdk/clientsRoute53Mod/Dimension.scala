package typings.awsSdk.clientsRoute53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dimension extends StObject {
  
  /**
    * For the metric that the CloudWatch alarm is associated with, the name of one dimension.
    */
  var Name: DimensionField
  
  /**
    * For the metric that the CloudWatch alarm is associated with, the value of one dimension.
    */
  var Value: DimensionField
}
object Dimension {
  
  inline def apply(Name: DimensionField, Value: DimensionField): Dimension = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dimension]
  }
  
  extension [Self <: Dimension](x: Self) {
    
    inline def setName(value: DimensionField): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: DimensionField): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
