package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityGroupIdentifier extends StObject {
  
  /**
    * The ID of the security group.
    */
  var GroupId: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the security group.
    */
  var GroupName: js.UndefOr[String] = js.undefined
}
object SecurityGroupIdentifier {
  
  inline def apply(): SecurityGroupIdentifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityGroupIdentifier]
  }
  
  extension [Self <: SecurityGroupIdentifier](x: Self) {
    
    inline def setGroupId(value: String): Self = StObject.set(x, "GroupId", value.asInstanceOf[js.Any])
    
    inline def setGroupIdUndefined: Self = StObject.set(x, "GroupId", js.undefined)
    
    inline def setGroupName(value: String): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    inline def setGroupNameUndefined: Self = StObject.set(x, "GroupName", js.undefined)
  }
}
