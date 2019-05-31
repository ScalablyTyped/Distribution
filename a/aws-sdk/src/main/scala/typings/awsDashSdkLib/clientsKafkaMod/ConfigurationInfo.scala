package typings
package awsDashSdkLib.clientsKafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigurationInfo extends js.Object {
  /**
    * 
    ARN of the configuration to use.
    
    */
  var Arn: __string
  /**
    * 
    The revision of the configuration to use.
    
    */
  var Revision: __long
}

object ConfigurationInfo {
  @scala.inline
  def apply(Arn: __string, Revision: __long): ConfigurationInfo = {
    val __obj = js.Dynamic.literal(Arn = Arn, Revision = Revision)
  
    __obj.asInstanceOf[ConfigurationInfo]
  }
}

