package typings.awsSdk.clientsPinpointsmsvoicev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSenderIdsResult extends StObject {
  
  /**
    * The token to be used for the next set of paginated results. If this field is empty then there are no more results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsPinpointsmsvoicev2Mod.NextToken] = js.undefined
  
  /**
    * An array of SernderIdInformation objects that contain the details for the requested SenderIds.
    */
  var SenderIds: js.UndefOr[SenderIdInformationList] = js.undefined
}
object DescribeSenderIdsResult {
  
  inline def apply(): DescribeSenderIdsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSenderIdsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeSenderIdsResult] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSenderIds(value: SenderIdInformationList): Self = StObject.set(x, "SenderIds", value.asInstanceOf[js.Any])
    
    inline def setSenderIdsUndefined: Self = StObject.set(x, "SenderIds", js.undefined)
    
    inline def setSenderIdsVarargs(value: SenderIdInformation*): Self = StObject.set(x, "SenderIds", js.Array(value*))
  }
}
