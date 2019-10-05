package typings.activexDashMsforms.MSForms.EventHelperTypes

import typings.activexDashMsforms.MSForms.ReturnBoolean
import typings.activexDashMsforms.MSForms.ReturnString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Error_Parameter extends js.Object {
  val CancelDisplay: ReturnBoolean
  val Description: ReturnString
  val HelpContext: Double
  val HelpFile: String
  val Number: Double
  val SCode: Double
  val Source: String
}

object Error_Parameter {
  @scala.inline
  def apply(
    CancelDisplay: ReturnBoolean,
    Description: ReturnString,
    HelpContext: Double,
    HelpFile: String,
    Number: Double,
    SCode: Double,
    Source: String
  ): Error_Parameter = {
    val __obj = js.Dynamic.literal(CancelDisplay = CancelDisplay, Description = Description, HelpContext = HelpContext, HelpFile = HelpFile, Number = Number, SCode = SCode, Source = Source)
  
    __obj.asInstanceOf[Error_Parameter]
  }
}

