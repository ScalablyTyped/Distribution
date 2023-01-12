package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAssociationResult extends StObject {
  
  /**
    * Information about the association.
    */
  var AssociationDescription: js.UndefOr[typings.awsSdk.clientsSsmMod.AssociationDescription] = js.undefined
}
object DescribeAssociationResult {
  
  inline def apply(): DescribeAssociationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAssociationResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeAssociationResult] (val x: Self) extends AnyVal {
    
    inline def setAssociationDescription(value: AssociationDescription): Self = StObject.set(x, "AssociationDescription", value.asInstanceOf[js.Any])
    
    inline def setAssociationDescriptionUndefined: Self = StObject.set(x, "AssociationDescription", js.undefined)
  }
}
