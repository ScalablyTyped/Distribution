package typings.awsSdk.clientsPinpointsmsvoicev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeConfigurationSetsResult extends StObject {
  
  /**
    * An array of ConfigurationSets objects.
    */
  var ConfigurationSets: js.UndefOr[ConfigurationSetInformationList] = js.undefined
  
  /**
    * The token to be used for the next set of paginated results. If this field is empty then there are no more results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsPinpointsmsvoicev2Mod.NextToken] = js.undefined
}
object DescribeConfigurationSetsResult {
  
  inline def apply(): DescribeConfigurationSetsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeConfigurationSetsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeConfigurationSetsResult] (val x: Self) extends AnyVal {
    
    inline def setConfigurationSets(value: ConfigurationSetInformationList): Self = StObject.set(x, "ConfigurationSets", value.asInstanceOf[js.Any])
    
    inline def setConfigurationSetsUndefined: Self = StObject.set(x, "ConfigurationSets", js.undefined)
    
    inline def setConfigurationSetsVarargs(value: ConfigurationSetInformation*): Self = StObject.set(x, "ConfigurationSets", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
