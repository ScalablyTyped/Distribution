package typings.awsSdk.clientsForecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExplainabilityInfo extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Explainability.
    */
  var ExplainabilityArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The status of the Explainability. States include:     ACTIVE     CREATE_PENDING, CREATE_IN_PROGRESS, CREATE_FAILED     CREATE_STOPPING, CREATE_STOPPED     DELETE_PENDING, DELETE_IN_PROGRESS, DELETE_FAILED   
    */
  var Status: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.Status] = js.undefined
}
object ExplainabilityInfo {
  
  inline def apply(): ExplainabilityInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExplainabilityInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExplainabilityInfo] (val x: Self) extends AnyVal {
    
    inline def setExplainabilityArn(value: Arn): Self = StObject.set(x, "ExplainabilityArn", value.asInstanceOf[js.Any])
    
    inline def setExplainabilityArnUndefined: Self = StObject.set(x, "ExplainabilityArn", js.undefined)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
