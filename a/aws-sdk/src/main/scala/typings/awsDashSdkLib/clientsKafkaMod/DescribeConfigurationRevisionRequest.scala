package typings
package awsDashSdkLib.clientsKafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeConfigurationRevisionRequest extends js.Object {
  /**
    * 
    The Amazon Resource Name (ARN) that uniquely identifies an MSK configuration and all of its revisions.
    
    */
  var Arn: __string
  /**
    * 
    A string that uniquely identifies a revision of an MSK configuration.
    
    */
  var Revision: __long
}

object DescribeConfigurationRevisionRequest {
  @scala.inline
  def apply(Arn: __string, Revision: __long): DescribeConfigurationRevisionRequest = {
    val __obj = js.Dynamic.literal(Arn = Arn, Revision = Revision)
  
    __obj.asInstanceOf[DescribeConfigurationRevisionRequest]
  }
}

