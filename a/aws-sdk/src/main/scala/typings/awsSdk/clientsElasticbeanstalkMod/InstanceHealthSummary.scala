package typings.awsSdk.clientsElasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceHealthSummary extends StObject {
  
  /**
    *  Red. The health agent is reporting a high number of request failures or other issues for an instance or environment.
    */
  var Degraded: js.UndefOr[NullableInteger] = js.undefined
  
  /**
    *  Green. An operation is in progress on an instance.
    */
  var Info: js.UndefOr[NullableInteger] = js.undefined
  
  /**
    *  Grey. AWS Elastic Beanstalk and the health agent are reporting no data on an instance.
    */
  var NoData: js.UndefOr[NullableInteger] = js.undefined
  
  /**
    *  Green. An instance is passing health checks and the health agent is not reporting any problems.
    */
  var Ok: js.UndefOr[NullableInteger] = js.undefined
  
  /**
    *  Grey. An operation is in progress on an instance within the command timeout.
    */
  var Pending: js.UndefOr[NullableInteger] = js.undefined
  
  /**
    *  Red. The health agent is reporting a very high number of request failures or other issues for an instance or environment.
    */
  var Severe: js.UndefOr[NullableInteger] = js.undefined
  
  /**
    *  Grey. AWS Elastic Beanstalk and the health agent are reporting an insufficient amount of data on an instance.
    */
  var Unknown: js.UndefOr[NullableInteger] = js.undefined
  
  /**
    *  Yellow. The health agent is reporting a moderate number of request failures or other issues for an instance or environment.
    */
  var Warning: js.UndefOr[NullableInteger] = js.undefined
}
object InstanceHealthSummary {
  
  inline def apply(): InstanceHealthSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceHealthSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InstanceHealthSummary] (val x: Self) extends AnyVal {
    
    inline def setDegraded(value: NullableInteger): Self = StObject.set(x, "Degraded", value.asInstanceOf[js.Any])
    
    inline def setDegradedUndefined: Self = StObject.set(x, "Degraded", js.undefined)
    
    inline def setInfo(value: NullableInteger): Self = StObject.set(x, "Info", value.asInstanceOf[js.Any])
    
    inline def setInfoUndefined: Self = StObject.set(x, "Info", js.undefined)
    
    inline def setNoData(value: NullableInteger): Self = StObject.set(x, "NoData", value.asInstanceOf[js.Any])
    
    inline def setNoDataUndefined: Self = StObject.set(x, "NoData", js.undefined)
    
    inline def setOk(value: NullableInteger): Self = StObject.set(x, "Ok", value.asInstanceOf[js.Any])
    
    inline def setOkUndefined: Self = StObject.set(x, "Ok", js.undefined)
    
    inline def setPending(value: NullableInteger): Self = StObject.set(x, "Pending", value.asInstanceOf[js.Any])
    
    inline def setPendingUndefined: Self = StObject.set(x, "Pending", js.undefined)
    
    inline def setSevere(value: NullableInteger): Self = StObject.set(x, "Severe", value.asInstanceOf[js.Any])
    
    inline def setSevereUndefined: Self = StObject.set(x, "Severe", js.undefined)
    
    inline def setUnknown(value: NullableInteger): Self = StObject.set(x, "Unknown", value.asInstanceOf[js.Any])
    
    inline def setUnknownUndefined: Self = StObject.set(x, "Unknown", js.undefined)
    
    inline def setWarning(value: NullableInteger): Self = StObject.set(x, "Warning", value.asInstanceOf[js.Any])
    
    inline def setWarningUndefined: Self = StObject.set(x, "Warning", js.undefined)
  }
}
