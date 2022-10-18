package typings.awsSdk.clientsPinpointsmsvoicev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeOptedOutNumbersResult extends StObject {
  
  /**
    * The token to be used for the next set of paginated results. If this field is empty then there are no more results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsPinpointsmsvoicev2Mod.NextToken] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the OptOutList.
    */
  var OptOutListArn: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the OptOutList.
    */
  var OptOutListName: js.UndefOr[typings.awsSdk.clientsPinpointsmsvoicev2Mod.OptOutListName] = js.undefined
  
  /**
    * An array of OptedOutNumbersInformation objects that provide information about the requested OptedOutNumbers.
    */
  var OptedOutNumbers: js.UndefOr[OptedOutNumberInformationList] = js.undefined
}
object DescribeOptedOutNumbersResult {
  
  inline def apply(): DescribeOptedOutNumbersResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeOptedOutNumbersResult]
  }
  
  extension [Self <: DescribeOptedOutNumbersResult](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setOptOutListArn(value: String): Self = StObject.set(x, "OptOutListArn", value.asInstanceOf[js.Any])
    
    inline def setOptOutListArnUndefined: Self = StObject.set(x, "OptOutListArn", js.undefined)
    
    inline def setOptOutListName(value: OptOutListName): Self = StObject.set(x, "OptOutListName", value.asInstanceOf[js.Any])
    
    inline def setOptOutListNameUndefined: Self = StObject.set(x, "OptOutListName", js.undefined)
    
    inline def setOptedOutNumbers(value: OptedOutNumberInformationList): Self = StObject.set(x, "OptedOutNumbers", value.asInstanceOf[js.Any])
    
    inline def setOptedOutNumbersUndefined: Self = StObject.set(x, "OptedOutNumbers", js.undefined)
    
    inline def setOptedOutNumbersVarargs(value: OptedOutNumberInformation*): Self = StObject.set(x, "OptedOutNumbers", js.Array(value*))
  }
}
