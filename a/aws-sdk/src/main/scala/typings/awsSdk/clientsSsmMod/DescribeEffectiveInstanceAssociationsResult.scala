package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEffectiveInstanceAssociationsResult extends StObject {
  
  /**
    * The associations for the requested managed node.
    */
  var Associations: js.UndefOr[InstanceAssociationList] = js.undefined
  
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSsmMod.NextToken] = js.undefined
}
object DescribeEffectiveInstanceAssociationsResult {
  
  inline def apply(): DescribeEffectiveInstanceAssociationsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEffectiveInstanceAssociationsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeEffectiveInstanceAssociationsResult] (val x: Self) extends AnyVal {
    
    inline def setAssociations(value: InstanceAssociationList): Self = StObject.set(x, "Associations", value.asInstanceOf[js.Any])
    
    inline def setAssociationsUndefined: Self = StObject.set(x, "Associations", js.undefined)
    
    inline def setAssociationsVarargs(value: InstanceAssociation*): Self = StObject.set(x, "Associations", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
