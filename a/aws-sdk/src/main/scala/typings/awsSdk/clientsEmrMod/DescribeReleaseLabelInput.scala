package typings.awsSdk.clientsEmrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeReleaseLabelInput extends StObject {
  
  /**
    * Reserved for future use. Currently set to null.
    */
  var MaxResults: js.UndefOr[MaxResultsNumber] = js.undefined
  
  /**
    * The pagination token. Reserved for future use. Currently set to null.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The target release label to be described.
    */
  var ReleaseLabel: js.UndefOr[String] = js.undefined
}
object DescribeReleaseLabelInput {
  
  inline def apply(): DescribeReleaseLabelInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeReleaseLabelInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeReleaseLabelInput] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: MaxResultsNumber): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setReleaseLabel(value: String): Self = StObject.set(x, "ReleaseLabel", value.asInstanceOf[js.Any])
    
    inline def setReleaseLabelUndefined: Self = StObject.set(x, "ReleaseLabel", js.undefined)
  }
}
