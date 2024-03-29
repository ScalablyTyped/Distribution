package typings.awsSdk.clientsDaxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSubnetGroupResponse extends StObject {
  
  /**
    * The subnet group that has been modified.
    */
  var SubnetGroup: js.UndefOr[typings.awsSdk.clientsDaxMod.SubnetGroup] = js.undefined
}
object UpdateSubnetGroupResponse {
  
  inline def apply(): UpdateSubnetGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateSubnetGroupResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateSubnetGroupResponse] (val x: Self) extends AnyVal {
    
    inline def setSubnetGroup(value: SubnetGroup): Self = StObject.set(x, "SubnetGroup", value.asInstanceOf[js.Any])
    
    inline def setSubnetGroupUndefined: Self = StObject.set(x, "SubnetGroup", js.undefined)
  }
}
