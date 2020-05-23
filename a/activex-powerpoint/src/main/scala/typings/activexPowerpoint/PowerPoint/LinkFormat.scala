package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkFormat extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application
  var AutoUpdate: PpUpdateOption
  val Parent: js.Any
  @JSName("PowerPoint.LinkFormat_typekey")
  var PowerPointDotLinkFormat_typekey: LinkFormat
  var SourceFullName: String
  def BreakLink(): Unit
  def Update(): Unit
}

object LinkFormat {
  @scala.inline
  def apply(
    Application: Application,
    AutoUpdate: PpUpdateOption,
    BreakLink: () => Unit,
    Parent: js.Any,
    PowerPointDotLinkFormat_typekey: LinkFormat,
    SourceFullName: String,
    Update: () => Unit
  ): LinkFormat = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], AutoUpdate = AutoUpdate.asInstanceOf[js.Any], BreakLink = js.Any.fromFunction0(BreakLink), Parent = Parent.asInstanceOf[js.Any], SourceFullName = SourceFullName.asInstanceOf[js.Any], Update = js.Any.fromFunction0(Update))
    __obj.updateDynamic("PowerPoint.LinkFormat_typekey")(PowerPointDotLinkFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkFormat]
  }
}

