package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAssociationResult extends StObject {
  
  /**
    * The description of the association that was updated.
    */
  var AssociationDescription: js.UndefOr[typings.awsSdk.clientsSsmMod.AssociationDescription] = js.undefined
}
object UpdateAssociationResult {
  
  inline def apply(): UpdateAssociationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateAssociationResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateAssociationResult] (val x: Self) extends AnyVal {
    
    inline def setAssociationDescription(value: AssociationDescription): Self = StObject.set(x, "AssociationDescription", value.asInstanceOf[js.Any])
    
    inline def setAssociationDescriptionUndefined: Self = StObject.set(x, "AssociationDescription", js.undefined)
  }
}
