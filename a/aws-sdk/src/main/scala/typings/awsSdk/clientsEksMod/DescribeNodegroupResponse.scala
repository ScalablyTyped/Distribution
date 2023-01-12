package typings.awsSdk.clientsEksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeNodegroupResponse extends StObject {
  
  /**
    * The full description of your node group.
    */
  var nodegroup: js.UndefOr[Nodegroup] = js.undefined
}
object DescribeNodegroupResponse {
  
  inline def apply(): DescribeNodegroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeNodegroupResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeNodegroupResponse] (val x: Self) extends AnyVal {
    
    inline def setNodegroup(value: Nodegroup): Self = StObject.set(x, "nodegroup", value.asInstanceOf[js.Any])
    
    inline def setNodegroupUndefined: Self = StObject.set(x, "nodegroup", js.undefined)
  }
}
