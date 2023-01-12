package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeUserHierarchyStructureResponse extends StObject {
  
  /**
    * Information about the hierarchy structure.
    */
  var HierarchyStructure: js.UndefOr[typings.awsSdk.clientsConnectMod.HierarchyStructure] = js.undefined
}
object DescribeUserHierarchyStructureResponse {
  
  inline def apply(): DescribeUserHierarchyStructureResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeUserHierarchyStructureResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeUserHierarchyStructureResponse] (val x: Self) extends AnyVal {
    
    inline def setHierarchyStructure(value: HierarchyStructure): Self = StObject.set(x, "HierarchyStructure", value.asInstanceOf[js.Any])
    
    inline def setHierarchyStructureUndefined: Self = StObject.set(x, "HierarchyStructure", js.undefined)
  }
}
