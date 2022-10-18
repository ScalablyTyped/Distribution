package typings.awsSdk.clientsDynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointInTimeRecoverySpecification extends StObject {
  
  /**
    * Indicates whether point in time recovery is enabled (true) or disabled (false) on the table.
    */
  var PointInTimeRecoveryEnabled: BooleanObject
}
object PointInTimeRecoverySpecification {
  
  inline def apply(PointInTimeRecoveryEnabled: BooleanObject): PointInTimeRecoverySpecification = {
    val __obj = js.Dynamic.literal(PointInTimeRecoveryEnabled = PointInTimeRecoveryEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointInTimeRecoverySpecification]
  }
  
  extension [Self <: PointInTimeRecoverySpecification](x: Self) {
    
    inline def setPointInTimeRecoveryEnabled(value: BooleanObject): Self = StObject.set(x, "PointInTimeRecoveryEnabled", value.asInstanceOf[js.Any])
  }
}
