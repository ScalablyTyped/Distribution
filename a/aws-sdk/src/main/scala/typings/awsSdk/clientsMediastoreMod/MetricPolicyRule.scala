package typings.awsSdk.clientsMediastoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricPolicyRule extends StObject {
  
  /**
    * A path or file name that defines which objects to include in the group. Wildcards (*) are acceptable.
    */
  var ObjectGroup: typings.awsSdk.clientsMediastoreMod.ObjectGroup
  
  /**
    * A name that allows you to refer to the object group.
    */
  var ObjectGroupName: typings.awsSdk.clientsMediastoreMod.ObjectGroupName
}
object MetricPolicyRule {
  
  inline def apply(ObjectGroup: ObjectGroup, ObjectGroupName: ObjectGroupName): MetricPolicyRule = {
    val __obj = js.Dynamic.literal(ObjectGroup = ObjectGroup.asInstanceOf[js.Any], ObjectGroupName = ObjectGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricPolicyRule]
  }
  
  extension [Self <: MetricPolicyRule](x: Self) {
    
    inline def setObjectGroup(value: ObjectGroup): Self = StObject.set(x, "ObjectGroup", value.asInstanceOf[js.Any])
    
    inline def setObjectGroupName(value: ObjectGroupName): Self = StObject.set(x, "ObjectGroupName", value.asInstanceOf[js.Any])
  }
}
