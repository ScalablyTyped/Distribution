package typings.activexDashMsforms.MSFormsNs.EventHelperTypesNs

import typings.activexDashMsforms.MSFormsNs.ReturnBoolean
import typings.activexDashMsforms.MSFormsNs.ReturnString
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
    val __obj = js.Dynamic.literal(CancelDisplay = CancelDisplay, Description = Description, HelpContext = HelpContext, HelpFile = HelpFile, Index = Index, Number = Number, SCode = SCode, Source = Source)
  
    __obj.asInstanceOf[MultiPage_Error_Parameter]
  }
}

