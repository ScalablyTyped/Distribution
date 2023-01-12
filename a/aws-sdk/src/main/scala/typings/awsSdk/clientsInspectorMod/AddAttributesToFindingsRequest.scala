package typings.awsSdk.clientsInspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddAttributesToFindingsRequest extends StObject {
  
  /**
    * The array of attributes that you want to assign to specified findings.
    */
  var attributes: UserAttributeList
  
  /**
    * The ARNs that specify the findings that you want to assign attributes to.
    */
  var findingArns: AddRemoveAttributesFindingArnList
}
object AddAttributesToFindingsRequest {
  
  inline def apply(attributes: UserAttributeList, findingArns: AddRemoveAttributesFindingArnList): AddAttributesToFindingsRequest = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], findingArns = findingArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddAttributesToFindingsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddAttributesToFindingsRequest] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: UserAttributeList): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesVarargs(value: Attribute*): Self = StObject.set(x, "attributes", js.Array(value*))
    
    inline def setFindingArns(value: AddRemoveAttributesFindingArnList): Self = StObject.set(x, "findingArns", value.asInstanceOf[js.Any])
    
    inline def setFindingArnsVarargs(value: Arn*): Self = StObject.set(x, "findingArns", js.Array(value*))
  }
}
