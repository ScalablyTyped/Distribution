package typings.activexMsforms.MSForms.EventHelperTypes

import typings.activexMsforms.MSForms.ReturnBoolean
import typings.activexMsforms.MSForms.ReturnString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorParameter extends js.Object {
  val CancelDisplay: ReturnBoolean
  val Description: ReturnString
  val HelpContext: Double
  val HelpFile: String
  val Number: Double
  val SCode: Double
  val Source: String
}

object ErrorParameter {
  @scala.inline
  def apply(
    CancelDisplay: ReturnBoolean,
    Description: ReturnString,
    HelpContext: Double,
    HelpFile: String,
    Number: Double,
    SCode: Double,
    Source: String
  ): ErrorParameter = {
    val __obj = js.Dynamic.literal(CancelDisplay = CancelDisplay.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], HelpContext = HelpContext.asInstanceOf[js.Any], HelpFile = HelpFile.asInstanceOf[js.Any], Number = Number.asInstanceOf[js.Any], SCode = SCode.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ErrorParameter]
  }
}

