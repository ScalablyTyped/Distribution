package typings
package awsDashSdkLib.clientsKafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeConfigurationRequest extends js.Object {
  /**
    * 
    The Amazon Resource Name (ARN) that uniquely identifies an MSK configuration and all of its revisions.
    
    */
  var Arn: __string
}

object DescribeConfigurationRequest {
  @scala.inline
  def apply(Arn: __string): DescribeConfigurationRequest = {
    val __obj = js.Dynamic.literal(Arn = Arn)
  
    __obj.asInstanceOf[DescribeConfigurationRequest]
  }
}

