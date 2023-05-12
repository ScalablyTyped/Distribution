package typings.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RdsRecommendation extends StObject {
  
  /**
    * Supplemental information about the requirements to the recommended target database on Amazon RDS.
    */
  var RequirementsToTarget: js.UndefOr[RdsRequirements] = js.undefined
  
  /**
    * Supplemental information about the configuration of the recommended target database on Amazon RDS.
    */
  var TargetConfiguration: js.UndefOr[RdsConfiguration] = js.undefined
}
object RdsRecommendation {
  
  inline def apply(): RdsRecommendation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RdsRecommendation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RdsRecommendation] (val x: Self) extends AnyVal {
    
    inline def setRequirementsToTarget(value: RdsRequirements): Self = StObject.set(x, "RequirementsToTarget", value.asInstanceOf[js.Any])
    
    inline def setRequirementsToTargetUndefined: Self = StObject.set(x, "RequirementsToTarget", js.undefined)
    
    inline def setTargetConfiguration(value: RdsConfiguration): Self = StObject.set(x, "TargetConfiguration", value.asInstanceOf[js.Any])
    
    inline def setTargetConfigurationUndefined: Self = StObject.set(x, "TargetConfiguration", js.undefined)
  }
}
