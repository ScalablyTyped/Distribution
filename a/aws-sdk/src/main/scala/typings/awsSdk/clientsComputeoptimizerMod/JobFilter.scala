package typings.awsSdk.clientsComputeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobFilter extends StObject {
  
  /**
    * The name of the filter. Specify ResourceType to return export jobs of a specific resource type (for example, Ec2Instance). Specify JobStatus to return export jobs with a specific status (e.g, Complete).
    */
  var name: js.UndefOr[JobFilterName] = js.undefined
  
  /**
    * The value of the filter. The valid values for this parameter are as follows, depending on what you specify for the name parameter:   Specify Ec2Instance or AutoScalingGroup if you specify the name parameter as ResourceType. There is no filter for EBS volumes because volume recommendations cannot be exported at this time.   Specify Queued, InProgress, Complete, or Failed if you specify the name parameter as JobStatus.  
    */
  var values: js.UndefOr[FilterValues] = js.undefined
}
object JobFilter {
  
  inline def apply(): JobFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobFilter]
  }
  
  extension [Self <: JobFilter](x: Self) {
    
    inline def setName(value: JobFilterName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setValues(value: FilterValues): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: FilterValue*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
