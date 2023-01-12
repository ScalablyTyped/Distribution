package typings.awsSdk.clientsFmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionTarget extends StObject {
  
  /**
    * A description of the remediation action target.
    */
  var Description: js.UndefOr[LengthBoundedString] = js.undefined
  
  /**
    * The ID of the remediation target.
    */
  var ResourceId: js.UndefOr[typings.awsSdk.clientsFmsMod.ResourceId] = js.undefined
}
object ActionTarget {
  
  inline def apply(): ActionTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionTarget]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActionTarget] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: LengthBoundedString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setResourceId(value: ResourceId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "ResourceId", js.undefined)
  }
}
