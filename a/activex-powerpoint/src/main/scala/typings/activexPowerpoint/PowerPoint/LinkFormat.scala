package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinkFormat extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  var AutoUpdate: PpUpdateOption = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.LinkFormat_typekey")
  var PowerPointDotLinkFormat_typekey: LinkFormat = js.native
  var SourceFullName: String = js.native
  def BreakLink(): Unit = js.native
  def Update(): Unit = js.native
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
  @scala.inline
  implicit class LinkFormatOps[Self <: LinkFormat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutoUpdate(value: PpUpdateOption): Self = this.set("AutoUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def setBreakLink(value: () => Unit): Self = this.set("BreakLink", js.Any.fromFunction0(value))
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setPowerPointDotLinkFormat_typekey(value: LinkFormat): Self = this.set("PowerPoint.LinkFormat_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceFullName(value: String): Self = this.set("SourceFullName", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdate(value: () => Unit): Self = this.set("Update", js.Any.fromFunction0(value))
  }
  
}

