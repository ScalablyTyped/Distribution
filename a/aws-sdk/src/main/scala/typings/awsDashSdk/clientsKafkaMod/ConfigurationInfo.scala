package typings.awsDashSdk.clientsKafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigurationInfo extends js.Object {
  /**
    * 
    ARN of the configuration to use.
    
    */
  var Arn: __string = js.native
  /**
    * 
    The revision of the configuration to use.
    
    */
  var Revision: __long = js.native
}

object ConfigurationInfo {
  @scala.inline
  def apply(Arn: __string, Revision: __long): ConfigurationInfo = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], Revision = Revision.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ConfigurationInfo]
  }
}

