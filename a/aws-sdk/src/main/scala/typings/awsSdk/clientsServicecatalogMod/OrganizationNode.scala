package typings.awsSdk.clientsServicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrganizationNode extends StObject {
  
  /**
    * The organization node type.
    */
  var Type: js.UndefOr[OrganizationNodeType] = js.undefined
  
  /**
    * The identifier of the organization node.
    */
  var Value: js.UndefOr[OrganizationNodeValue] = js.undefined
}
object OrganizationNode {
  
  inline def apply(): OrganizationNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrganizationNode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OrganizationNode] (val x: Self) extends AnyVal {
    
    inline def setType(value: OrganizationNodeType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    inline def setValue(value: OrganizationNodeValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
