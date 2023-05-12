package typings.awsSdk.clientsChimesdkmediapipelinesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SentimentConfiguration extends StObject {
  
  /**
    * The name of the rule in the sentiment configuration.
    */
  var RuleName: typings.awsSdk.clientsChimesdkmediapipelinesMod.RuleName
  
  /**
    * The type of sentiment, POSITIVE, NEGATIVE, or NEUTRAL.
    */
  var SentimentType: typings.awsSdk.clientsChimesdkmediapipelinesMod.SentimentType
  
  /**
    * Specifies the analysis interval.
    */
  var TimePeriod: SentimentTimePeriodInSeconds
}
object SentimentConfiguration {
  
  inline def apply(RuleName: RuleName, SentimentType: SentimentType, TimePeriod: SentimentTimePeriodInSeconds): SentimentConfiguration = {
    val __obj = js.Dynamic.literal(RuleName = RuleName.asInstanceOf[js.Any], SentimentType = SentimentType.asInstanceOf[js.Any], TimePeriod = TimePeriod.asInstanceOf[js.Any])
    __obj.asInstanceOf[SentimentConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SentimentConfiguration] (val x: Self) extends AnyVal {
    
    inline def setRuleName(value: RuleName): Self = StObject.set(x, "RuleName", value.asInstanceOf[js.Any])
    
    inline def setSentimentType(value: SentimentType): Self = StObject.set(x, "SentimentType", value.asInstanceOf[js.Any])
    
    inline def setTimePeriod(value: SentimentTimePeriodInSeconds): Self = StObject.set(x, "TimePeriod", value.asInstanceOf[js.Any])
  }
}
