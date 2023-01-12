package typings.awsSdk.clientsElbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceSecurityGroup extends StObject {
  
  /**
    * The name of the security group.
    */
  var GroupName: js.UndefOr[SecurityGroupName] = js.undefined
  
  /**
    * The owner of the security group.
    */
  var OwnerAlias: js.UndefOr[SecurityGroupOwnerAlias] = js.undefined
}
object SourceSecurityGroup {
  
  inline def apply(): SourceSecurityGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceSecurityGroup]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SourceSecurityGroup] (val x: Self) extends AnyVal {
    
    inline def setGroupName(value: SecurityGroupName): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    inline def setGroupNameUndefined: Self = StObject.set(x, "GroupName", js.undefined)
    
    inline def setOwnerAlias(value: SecurityGroupOwnerAlias): Self = StObject.set(x, "OwnerAlias", value.asInstanceOf[js.Any])
    
    inline def setOwnerAliasUndefined: Self = StObject.set(x, "OwnerAlias", js.undefined)
  }
}
