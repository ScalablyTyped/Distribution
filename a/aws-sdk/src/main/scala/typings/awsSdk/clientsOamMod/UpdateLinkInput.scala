package typings.awsSdk.clientsOamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateLinkInput extends StObject {
  
  /**
    * The ARN of the link that you want to update.
    */
  var Identifier: ResourceIdentifier
  
  /**
    * An array of strings that define which types of data that the source account will send to the monitoring account. Your input here replaces the current set of data types that are shared.
    */
  var ResourceTypes: ResourceTypesInput
}
object UpdateLinkInput {
  
  inline def apply(Identifier: ResourceIdentifier, ResourceTypes: ResourceTypesInput): UpdateLinkInput = {
    val __obj = js.Dynamic.literal(Identifier = Identifier.asInstanceOf[js.Any], ResourceTypes = ResourceTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateLinkInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateLinkInput] (val x: Self) extends AnyVal {
    
    inline def setIdentifier(value: ResourceIdentifier): Self = StObject.set(x, "Identifier", value.asInstanceOf[js.Any])
    
    inline def setResourceTypes(value: ResourceTypesInput): Self = StObject.set(x, "ResourceTypes", value.asInstanceOf[js.Any])
    
    inline def setResourceTypesVarargs(value: ResourceType*): Self = StObject.set(x, "ResourceTypes", js.Array(value*))
  }
}
