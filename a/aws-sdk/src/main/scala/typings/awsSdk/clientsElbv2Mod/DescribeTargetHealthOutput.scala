package typings.awsSdk.clientsElbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTargetHealthOutput extends StObject {
  
  /**
    * Information about the health of the targets.
    */
  var TargetHealthDescriptions: js.UndefOr[typings.awsSdk.clientsElbv2Mod.TargetHealthDescriptions] = js.undefined
}
object DescribeTargetHealthOutput {
  
  inline def apply(): DescribeTargetHealthOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTargetHealthOutput]
  }
  
  extension [Self <: DescribeTargetHealthOutput](x: Self) {
    
    inline def setTargetHealthDescriptions(value: TargetHealthDescriptions): Self = StObject.set(x, "TargetHealthDescriptions", value.asInstanceOf[js.Any])
    
    inline def setTargetHealthDescriptionsUndefined: Self = StObject.set(x, "TargetHealthDescriptions", js.undefined)
    
    inline def setTargetHealthDescriptionsVarargs(value: TargetHealthDescription*): Self = StObject.set(x, "TargetHealthDescriptions", js.Array(value*))
  }
}
