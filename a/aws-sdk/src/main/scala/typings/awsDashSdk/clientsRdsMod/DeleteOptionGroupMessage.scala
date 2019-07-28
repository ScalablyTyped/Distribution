package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteOptionGroupMessage extends js.Object {
  /**
    * The name of the option group to be deleted.  You can't delete default option groups. 
    */
  var OptionGroupName: String
}

object DeleteOptionGroupMessage {
  @scala.inline
  def apply(OptionGroupName: String): DeleteOptionGroupMessage = {
    val __obj = js.Dynamic.literal(OptionGroupName = OptionGroupName)
  
    __obj.asInstanceOf[DeleteOptionGroupMessage]
  }
}

