package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceInformationStringFilter extends StObject {
  
  /**
    * The filter key name to describe your managed nodes. Valid filter key values: ActivationIds | AgentVersion | AssociationStatus | IamRole | InstanceIds | PingStatus | PlatformTypes | ResourceType | SourceIds | SourceTypes | "tag-key" | "tag:{keyname}    Valid values for the AssociationStatus filter key: Success | Pending | Failed   Valid values for the PingStatus filter key: Online | ConnectionLost | Inactive (deprecated)   Valid values for the PlatformType filter key: Windows | Linux | MacOS   Valid values for the ResourceType filter key: EC2Instance | ManagedInstance   Valid values for the SourceType filter key: AWS::EC2::Instance | AWS::SSM::ManagedInstance | AWS::IoT::Thing   Valid tag examples: Key=tag-key,Values=Purpose | Key=tag:Purpose,Values=Test.  
    */
  var Key: InstanceInformationStringFilterKey
  
  /**
    * The filter values.
    */
  var Values: InstanceInformationFilterValueSet
}
object InstanceInformationStringFilter {
  
  inline def apply(Key: InstanceInformationStringFilterKey, Values: InstanceInformationFilterValueSet): InstanceInformationStringFilter = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceInformationStringFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InstanceInformationStringFilter] (val x: Self) extends AnyVal {
    
    inline def setKey(value: InstanceInformationStringFilterKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setValues(value: InstanceInformationFilterValueSet): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: InstanceInformationFilterValue*): Self = StObject.set(x, "Values", js.Array(value*))
  }
}
