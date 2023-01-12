package typings.awsSdk.clientsSesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListConfigurationSetsResponse extends StObject {
  
  /**
    * An array that contains all of the configuration sets in your Amazon SES account in the current Amazon Web Services Region.
    */
  var ConfigurationSets: js.UndefOr[ConfigurationSetNameList] = js.undefined
  
  /**
    * A token that indicates that there are additional configuration sets to list. To view additional configuration sets, issue another request to ListConfigurationSets, and pass this token in the NextToken parameter.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSesv2Mod.NextToken] = js.undefined
}
object ListConfigurationSetsResponse {
  
  inline def apply(): ListConfigurationSetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListConfigurationSetsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListConfigurationSetsResponse] (val x: Self) extends AnyVal {
    
    inline def setConfigurationSets(value: ConfigurationSetNameList): Self = StObject.set(x, "ConfigurationSets", value.asInstanceOf[js.Any])
    
    inline def setConfigurationSetsUndefined: Self = StObject.set(x, "ConfigurationSets", js.undefined)
    
    inline def setConfigurationSetsVarargs(value: ConfigurationSetName*): Self = StObject.set(x, "ConfigurationSets", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
