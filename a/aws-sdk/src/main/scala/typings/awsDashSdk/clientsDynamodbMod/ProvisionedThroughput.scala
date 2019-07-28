package typings.awsDashSdk.clientsDynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProvisionedThroughput extends js.Object {
  /**
    * The maximum number of strongly consistent reads consumed per second before DynamoDB returns a ThrottlingException. For more information, see Specifying Read and Write Requirements in the Amazon DynamoDB Developer Guide. If read/write capacity mode is PAY_PER_REQUEST the value is set to 0.
    */
  var ReadCapacityUnits: PositiveLongObject
  /**
    * The maximum number of writes consumed per second before DynamoDB returns a ThrottlingException. For more information, see Specifying Read and Write Requirements in the Amazon DynamoDB Developer Guide. If read/write capacity mode is PAY_PER_REQUEST the value is set to 0.
    */
  var WriteCapacityUnits: PositiveLongObject
}

object ProvisionedThroughput {
  @scala.inline
  def apply(ReadCapacityUnits: PositiveLongObject, WriteCapacityUnits: PositiveLongObject): ProvisionedThroughput = {
    val __obj = js.Dynamic.literal(ReadCapacityUnits = ReadCapacityUnits, WriteCapacityUnits = WriteCapacityUnits)
  
    __obj.asInstanceOf[ProvisionedThroughput]
  }
}

