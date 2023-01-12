package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutRetentionConfigurationRequest extends StObject {
  
  /**
    * Number of days Config stores your historical information.  Currently, only applicable to the configuration item history. 
    */
  var RetentionPeriodInDays: typings.awsSdk.clientsConfigserviceMod.RetentionPeriodInDays
}
object PutRetentionConfigurationRequest {
  
  inline def apply(RetentionPeriodInDays: RetentionPeriodInDays): PutRetentionConfigurationRequest = {
    val __obj = js.Dynamic.literal(RetentionPeriodInDays = RetentionPeriodInDays.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutRetentionConfigurationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutRetentionConfigurationRequest] (val x: Self) extends AnyVal {
    
    inline def setRetentionPeriodInDays(value: RetentionPeriodInDays): Self = StObject.set(x, "RetentionPeriodInDays", value.asInstanceOf[js.Any])
  }
}
