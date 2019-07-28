package typings.awsDashSdk.clientsCloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndexFieldStatus extends js.Object {
  var Options: IndexField
  var Status: OptionStatus
}

object IndexFieldStatus {
  @scala.inline
  def apply(Options: IndexField, Status: OptionStatus): IndexFieldStatus = {
    val __obj = js.Dynamic.literal(Options = Options, Status = Status)
  
    __obj.asInstanceOf[IndexFieldStatus]
  }
}

