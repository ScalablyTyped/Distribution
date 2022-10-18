package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpsResultAttribute extends StObject {
  
  /**
    * Name of the data type. Valid value: AWS:OpsItem, AWS:EC2InstanceInformation, AWS:OpsItemTrendline, or AWS:ComplianceSummary.
    */
  var TypeName: OpsDataTypeName
}
object OpsResultAttribute {
  
  inline def apply(TypeName: OpsDataTypeName): OpsResultAttribute = {
    val __obj = js.Dynamic.literal(TypeName = TypeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpsResultAttribute]
  }
  
  extension [Self <: OpsResultAttribute](x: Self) {
    
    inline def setTypeName(value: OpsDataTypeName): Self = StObject.set(x, "TypeName", value.asInstanceOf[js.Any])
  }
}
