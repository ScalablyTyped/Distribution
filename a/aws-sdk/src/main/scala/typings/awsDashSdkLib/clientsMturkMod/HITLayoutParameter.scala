package typings
package awsDashSdkLib.clientsMturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HITLayoutParameter extends js.Object {
  /**
    *  The name of the parameter in the HITLayout. 
    */
  var Name: String
  /**
    * The value substituted for the parameter referenced in the HITLayout. 
    */
  var Value: String
}

object HITLayoutParameter {
  @scala.inline
  def apply(Name: String, Value: String): HITLayoutParameter = {
    val __obj = js.Dynamic.literal(Name = Name, Value = Value)
  
    __obj.asInstanceOf[HITLayoutParameter]
  }
}

