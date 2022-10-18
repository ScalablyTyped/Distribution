package typings.awsSdk.clientsPinpointsmsvoicev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeKeywordsResult extends StObject {
  
  /**
    * An array of KeywordInformation objects that contain the results.
    */
  var Keywords: js.UndefOr[KeywordInformationList] = js.undefined
  
  /**
    * The token to be used for the next set of paginated results. If this field is empty then there are no more results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsPinpointsmsvoicev2Mod.NextToken] = js.undefined
  
  /**
    * The PhoneNumberId or PoolId that is associated with the OriginationIdentity.
    */
  var OriginationIdentity: js.UndefOr[String] = js.undefined
  
  /**
    * The PhoneNumberArn or PoolArn that is associated with the OriginationIdentity. 
    */
  var OriginationIdentityArn: js.UndefOr[String] = js.undefined
}
object DescribeKeywordsResult {
  
  inline def apply(): DescribeKeywordsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeKeywordsResult]
  }
  
  extension [Self <: DescribeKeywordsResult](x: Self) {
    
    inline def setKeywords(value: KeywordInformationList): Self = StObject.set(x, "Keywords", value.asInstanceOf[js.Any])
    
    inline def setKeywordsUndefined: Self = StObject.set(x, "Keywords", js.undefined)
    
    inline def setKeywordsVarargs(value: KeywordInformation*): Self = StObject.set(x, "Keywords", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setOriginationIdentity(value: String): Self = StObject.set(x, "OriginationIdentity", value.asInstanceOf[js.Any])
    
    inline def setOriginationIdentityArn(value: String): Self = StObject.set(x, "OriginationIdentityArn", value.asInstanceOf[js.Any])
    
    inline def setOriginationIdentityArnUndefined: Self = StObject.set(x, "OriginationIdentityArn", js.undefined)
    
    inline def setOriginationIdentityUndefined: Self = StObject.set(x, "OriginationIdentity", js.undefined)
  }
}
