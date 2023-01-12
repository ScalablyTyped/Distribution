package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEcsTaskDefinitionContainerDefinitionsUlimitsDetails extends StObject {
  
  /**
    * The hard limit for the ulimit type.
    */
  var HardLimit: js.UndefOr[Integer] = js.undefined
  
  /**
    * The type of the ulimit. Valid values are as follows:    core     cpu     data     fsize     locks     memlock     msgqueue     nice     nofile     nproc     rss     rtprio     rttime     sigpending     stack   
    */
  var Name: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The soft limit for the ulimit type.
    */
  var SoftLimit: js.UndefOr[Integer] = js.undefined
}
object AwsEcsTaskDefinitionContainerDefinitionsUlimitsDetails {
  
  inline def apply(): AwsEcsTaskDefinitionContainerDefinitionsUlimitsDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEcsTaskDefinitionContainerDefinitionsUlimitsDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsEcsTaskDefinitionContainerDefinitionsUlimitsDetails] (val x: Self) extends AnyVal {
    
    inline def setHardLimit(value: Integer): Self = StObject.set(x, "HardLimit", value.asInstanceOf[js.Any])
    
    inline def setHardLimitUndefined: Self = StObject.set(x, "HardLimit", js.undefined)
    
    inline def setName(value: NonEmptyString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setSoftLimit(value: Integer): Self = StObject.set(x, "SoftLimit", value.asInstanceOf[js.Any])
    
    inline def setSoftLimitUndefined: Self = StObject.set(x, "SoftLimit", js.undefined)
  }
}
