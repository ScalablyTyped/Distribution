package typings.awsSdk.clientsResourcegroupsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupIdentifier extends StObject {
  
  /**
    * The ARN of the resource group.
    */
  var GroupArn: js.UndefOr[typings.awsSdk.clientsResourcegroupsMod.GroupArn] = js.undefined
  
  /**
    * The name of the resource group.
    */
  var GroupName: js.UndefOr[typings.awsSdk.clientsResourcegroupsMod.GroupName] = js.undefined
}
object GroupIdentifier {
  
  inline def apply(): GroupIdentifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupIdentifier]
  }
  
  extension [Self <: GroupIdentifier](x: Self) {
    
    inline def setGroupArn(value: GroupArn): Self = StObject.set(x, "GroupArn", value.asInstanceOf[js.Any])
    
    inline def setGroupArnUndefined: Self = StObject.set(x, "GroupArn", js.undefined)
    
    inline def setGroupName(value: GroupName): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    inline def setGroupNameUndefined: Self = StObject.set(x, "GroupName", js.undefined)
  }
}
