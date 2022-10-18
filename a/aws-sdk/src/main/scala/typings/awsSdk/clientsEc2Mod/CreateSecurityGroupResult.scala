package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSecurityGroupResult extends StObject {
  
  /**
    * The ID of the security group.
    */
  var GroupId: js.UndefOr[String] = js.undefined
  
  /**
    * The tags assigned to the security group.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateSecurityGroupResult {
  
  inline def apply(): CreateSecurityGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSecurityGroupResult]
  }
  
  extension [Self <: CreateSecurityGroupResult](x: Self) {
    
    inline def setGroupId(value: String): Self = StObject.set(x, "GroupId", value.asInstanceOf[js.Any])
    
    inline def setGroupIdUndefined: Self = StObject.set(x, "GroupId", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
