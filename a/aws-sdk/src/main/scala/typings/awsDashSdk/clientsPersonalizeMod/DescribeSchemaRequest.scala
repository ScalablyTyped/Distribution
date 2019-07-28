package typings.awsDashSdk.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeSchemaRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the schema to retrieve.
    */
  var schemaArn: Arn
}

object DescribeSchemaRequest {
  @scala.inline
  def apply(schemaArn: Arn): DescribeSchemaRequest = {
    val __obj = js.Dynamic.literal(schemaArn = schemaArn)
  
    __obj.asInstanceOf[DescribeSchemaRequest]
  }
}

