package typings.awsSdk.clientsDynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProvisionedThroughputDescription extends StObject {
  
  /**
    * The date and time of the last provisioned throughput decrease for this table.
    */
  var LastDecreaseDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The date and time of the last provisioned throughput increase for this table.
    */
  var LastIncreaseDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The number of provisioned throughput decreases for this table during this UTC calendar day. For current maximums on provisioned throughput decreases, see Service, Account, and Table Quotas in the Amazon DynamoDB Developer Guide.
    */
  var NumberOfDecreasesToday: js.UndefOr[PositiveLongObject] = js.undefined
  
  /**
    * The maximum number of strongly consistent reads consumed per second before DynamoDB returns a ThrottlingException. Eventually consistent reads require less effort than strongly consistent reads, so a setting of 50 ReadCapacityUnits per second provides 100 eventually consistent ReadCapacityUnits per second.
    */
  var ReadCapacityUnits: js.UndefOr[NonNegativeLongObject] = js.undefined
  
  /**
    * The maximum number of writes consumed per second before DynamoDB returns a ThrottlingException.
    */
  var WriteCapacityUnits: js.UndefOr[NonNegativeLongObject] = js.undefined
}
object ProvisionedThroughputDescription {
  
  inline def apply(): ProvisionedThroughputDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProvisionedThroughputDescription]
  }
  
  extension [Self <: ProvisionedThroughputDescription](x: Self) {
    
    inline def setLastDecreaseDateTime(value: js.Date): Self = StObject.set(x, "LastDecreaseDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastDecreaseDateTimeUndefined: Self = StObject.set(x, "LastDecreaseDateTime", js.undefined)
    
    inline def setLastIncreaseDateTime(value: js.Date): Self = StObject.set(x, "LastIncreaseDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastIncreaseDateTimeUndefined: Self = StObject.set(x, "LastIncreaseDateTime", js.undefined)
    
    inline def setNumberOfDecreasesToday(value: PositiveLongObject): Self = StObject.set(x, "NumberOfDecreasesToday", value.asInstanceOf[js.Any])
    
    inline def setNumberOfDecreasesTodayUndefined: Self = StObject.set(x, "NumberOfDecreasesToday", js.undefined)
    
    inline def setReadCapacityUnits(value: NonNegativeLongObject): Self = StObject.set(x, "ReadCapacityUnits", value.asInstanceOf[js.Any])
    
    inline def setReadCapacityUnitsUndefined: Self = StObject.set(x, "ReadCapacityUnits", js.undefined)
    
    inline def setWriteCapacityUnits(value: NonNegativeLongObject): Self = StObject.set(x, "WriteCapacityUnits", value.asInstanceOf[js.Any])
    
    inline def setWriteCapacityUnitsUndefined: Self = StObject.set(x, "WriteCapacityUnits", js.undefined)
  }
}
