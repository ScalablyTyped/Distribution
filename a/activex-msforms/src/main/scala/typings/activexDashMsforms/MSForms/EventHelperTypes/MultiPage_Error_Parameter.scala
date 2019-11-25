package typings.activexDashMsforms.MSForms.EventHelperTypes

import typings.activexDashMsforms.MSForms.ReturnBoolean
import typings.activexDashMsforms.MSForms.ReturnString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiPage_Error_Parameter extends js.Object {
  val CancelDisplay: ReturnBoolean
  val Description: ReturnString
  val HelpContext: Double
  val HelpFile: String
  val Index: Double
  val Number: Double
  val SCode: Double
  val Source: String
}

object MultiPage_Error_Parameter {
  @scala.inline
  def apply(
    CancelDisplay: ReturnBoolean,
    Description: ReturnString,
    HelpContext: Double,
    HelpFile: String,
    Index: Double,
    Number: Double,
    SCode: Double,
    Source: String
  ): MultiPage_Error_Parameter = {
    val __obj = js.Dynamic.literal(CancelDisplay = CancelDisplay.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], HelpContext = HelpContext.asInstanceOf[js.Any], HelpFile = HelpFile.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], Number = Number.asInstanceOf[js.Any], SCode = SCode.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MultiPage_Error_Parameter]
  }
}

