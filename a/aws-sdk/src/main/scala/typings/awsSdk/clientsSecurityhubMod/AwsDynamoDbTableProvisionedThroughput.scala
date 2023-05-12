package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsDynamoDbTableProvisionedThroughput extends StObject {
  
  /**
    * Indicates when the provisioned throughput was last decreased. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces, and date and time should be separated by T. For example, 2020-03-22T13:22:13.933Z.
    */
  var LastDecreaseDateTime: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Indicates when the provisioned throughput was last increased. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces, and date and time should be separated by T. For example, 2020-03-22T13:22:13.933Z.
    */
  var LastIncreaseDateTime: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The number of times during the current UTC calendar day that the provisioned throughput was decreased.
    */
  var NumberOfDecreasesToday: js.UndefOr[Integer] = js.undefined
  
  /**
    * The maximum number of strongly consistent reads consumed per second before DynamoDB returns a ThrottlingException.
    */
  var ReadCapacityUnits: js.UndefOr[Integer] = js.undefined
  
  /**
    * The maximum number of writes consumed per second before DynamoDB returns a ThrottlingException.
    */
  var WriteCapacityUnits: js.UndefOr[Integer] = js.undefined
}
object AwsDynamoDbTableProvisionedThroughput {
  
  inline def apply(): AwsDynamoDbTableProvisionedThroughput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsDynamoDbTableProvisionedThroughput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsDynamoDbTableProvisionedThroughput] (val x: Self) extends AnyVal {
    
    inline def setLastDecreaseDateTime(value: NonEmptyString): Self = StObject.set(x, "LastDecreaseDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastDecreaseDateTimeUndefined: Self = StObject.set(x, "LastDecreaseDateTime", js.undefined)
    
    inline def setLastIncreaseDateTime(value: NonEmptyString): Self = StObject.set(x, "LastIncreaseDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastIncreaseDateTimeUndefined: Self = StObject.set(x, "LastIncreaseDateTime", js.undefined)
    
    inline def setNumberOfDecreasesToday(value: Integer): Self = StObject.set(x, "NumberOfDecreasesToday", value.asInstanceOf[js.Any])
    
    inline def setNumberOfDecreasesTodayUndefined: Self = StObject.set(x, "NumberOfDecreasesToday", js.undefined)
    
    inline def setReadCapacityUnits(value: Integer): Self = StObject.set(x, "ReadCapacityUnits", value.asInstanceOf[js.Any])
    
    inline def setReadCapacityUnitsUndefined: Self = StObject.set(x, "ReadCapacityUnits", js.undefined)
    
    inline def setWriteCapacityUnits(value: Integer): Self = StObject.set(x, "WriteCapacityUnits", value.asInstanceOf[js.Any])
    
    inline def setWriteCapacityUnitsUndefined: Self = StObject.set(x, "WriteCapacityUnits", js.undefined)
  }
}
