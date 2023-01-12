package typings.awsSdk.clientsAppstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeUserStackAssociationsResult extends StObject {
  
  /**
    * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages, this value is null.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The UserStackAssociation objects.
    */
  var UserStackAssociations: js.UndefOr[UserStackAssociationList] = js.undefined
}
object DescribeUserStackAssociationsResult {
  
  inline def apply(): DescribeUserStackAssociationsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeUserStackAssociationsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeUserStackAssociationsResult] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setUserStackAssociations(value: UserStackAssociationList): Self = StObject.set(x, "UserStackAssociations", value.asInstanceOf[js.Any])
    
    inline def setUserStackAssociationsUndefined: Self = StObject.set(x, "UserStackAssociations", js.undefined)
    
    inline def setUserStackAssociationsVarargs(value: UserStackAssociation*): Self = StObject.set(x, "UserStackAssociations", js.Array(value*))
  }
}
