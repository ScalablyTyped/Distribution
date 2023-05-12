package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociatedStandard extends StObject {
  
  /**
    * The unique identifier of a standard in which a control is enabled. This field consists of the resource portion of the Amazon Resource Name (ARN) returned for a standard in the DescribeStandards API response. 
    */
  var StandardsId: js.UndefOr[NonEmptyString] = js.undefined
}
object AssociatedStandard {
  
  inline def apply(): AssociatedStandard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociatedStandard]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssociatedStandard] (val x: Self) extends AnyVal {
    
    inline def setStandardsId(value: NonEmptyString): Self = StObject.set(x, "StandardsId", value.asInstanceOf[js.Any])
    
    inline def setStandardsIdUndefined: Self = StObject.set(x, "StandardsId", js.undefined)
  }
}
