package typings.awsSdk.clientsFsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDataRepositoryAssociationsResponse extends StObject {
  
  /**
    * An array of one or more data repository association descriptions.
    */
  var Associations: js.UndefOr[DataRepositoryAssociations] = js.undefined
  
  var NextToken: js.UndefOr[typings.awsSdk.clientsFsxMod.NextToken] = js.undefined
}
object DescribeDataRepositoryAssociationsResponse {
  
  inline def apply(): DescribeDataRepositoryAssociationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDataRepositoryAssociationsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeDataRepositoryAssociationsResponse] (val x: Self) extends AnyVal {
    
    inline def setAssociations(value: DataRepositoryAssociations): Self = StObject.set(x, "Associations", value.asInstanceOf[js.Any])
    
    inline def setAssociationsUndefined: Self = StObject.set(x, "Associations", js.undefined)
    
    inline def setAssociationsVarargs(value: DataRepositoryAssociation*): Self = StObject.set(x, "Associations", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
