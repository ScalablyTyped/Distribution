package typings.awsSdk.clientsRbinMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RetentionPeriod extends StObject {
  
  /**
    * The unit of time in which the retention period is measured. Currently, only DAYS is supported.
    */
  var RetentionPeriodUnit: typings.awsSdk.clientsRbinMod.RetentionPeriodUnit
  
  /**
    * The period value for which the retention rule is to retain resources. The period is measured using the unit specified for RetentionPeriodUnit.
    */
  var RetentionPeriodValue: typings.awsSdk.clientsRbinMod.RetentionPeriodValue
}
object RetentionPeriod {
  
  inline def apply(RetentionPeriodUnit: RetentionPeriodUnit, RetentionPeriodValue: RetentionPeriodValue): RetentionPeriod = {
    val __obj = js.Dynamic.literal(RetentionPeriodUnit = RetentionPeriodUnit.asInstanceOf[js.Any], RetentionPeriodValue = RetentionPeriodValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetentionPeriod]
  }
  
  extension [Self <: RetentionPeriod](x: Self) {
    
    inline def setRetentionPeriodUnit(value: RetentionPeriodUnit): Self = StObject.set(x, "RetentionPeriodUnit", value.asInstanceOf[js.Any])
    
    inline def setRetentionPeriodValue(value: RetentionPeriodValue): Self = StObject.set(x, "RetentionPeriodValue", value.asInstanceOf[js.Any])
  }
}
