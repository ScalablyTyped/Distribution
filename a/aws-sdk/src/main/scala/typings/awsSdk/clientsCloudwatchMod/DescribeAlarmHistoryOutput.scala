package typings.awsSdk.clientsCloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAlarmHistoryOutput extends StObject {
  
  /**
    * The alarm histories, in JSON format.
    */
  var AlarmHistoryItems: js.UndefOr[typings.awsSdk.clientsCloudwatchMod.AlarmHistoryItems] = js.undefined
  
  /**
    * The token that marks the start of the next batch of returned results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsCloudwatchMod.NextToken] = js.undefined
}
object DescribeAlarmHistoryOutput {
  
  inline def apply(): DescribeAlarmHistoryOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAlarmHistoryOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeAlarmHistoryOutput] (val x: Self) extends AnyVal {
    
    inline def setAlarmHistoryItems(value: AlarmHistoryItems): Self = StObject.set(x, "AlarmHistoryItems", value.asInstanceOf[js.Any])
    
    inline def setAlarmHistoryItemsUndefined: Self = StObject.set(x, "AlarmHistoryItems", js.undefined)
    
    inline def setAlarmHistoryItemsVarargs(value: AlarmHistoryItem*): Self = StObject.set(x, "AlarmHistoryItems", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
