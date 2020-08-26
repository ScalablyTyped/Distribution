package typings.aceDiff.mod

import typings.aceDiff.aceDiffStrings.broad
import typings.aceDiff.aceDiffStrings.specific
import typings.aceDiff.anon.Connector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AceDiffOpts extends js.Object {
  var classes: js.UndefOr[Connector] = js.native
  var diffGranularity: js.UndefOr[specific | broad] = js.native
  var left: js.UndefOr[AceDiffLROpts] = js.native
  var maxDiffs: js.UndefOr[Double] = js.native
  var mode: js.UndefOr[String] = js.native
  var right: js.UndefOr[AceDiffLROpts] = js.native
  var showConnectors: js.UndefOr[Boolean] = js.native
  var showDiffs: js.UndefOr[Boolean] = js.native
  var theme: js.UndefOr[String] = js.native
}

object AceDiffOpts {
  @scala.inline
  def apply(): AceDiffOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AceDiffOpts]
  }
  @scala.inline
  implicit class AceDiffOptsOps[Self <: AceDiffOpts] (val x: Self) extends AnyVal {
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
    def setClasses(value: Connector): Self = this.set("classes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClasses: Self = this.set("classes", js.undefined)
    @scala.inline
    def setDiffGranularity(value: specific | broad): Self = this.set("diffGranularity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiffGranularity: Self = this.set("diffGranularity", js.undefined)
    @scala.inline
    def setLeft(value: AceDiffLROpts): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    @scala.inline
    def setMaxDiffs(value: Double): Self = this.set("maxDiffs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxDiffs: Self = this.set("maxDiffs", js.undefined)
    @scala.inline
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setRight(value: AceDiffLROpts): Self = this.set("right", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRight: Self = this.set("right", js.undefined)
    @scala.inline
    def setShowConnectors(value: Boolean): Self = this.set("showConnectors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowConnectors: Self = this.set("showConnectors", js.undefined)
    @scala.inline
    def setShowDiffs(value: Boolean): Self = this.set("showDiffs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowDiffs: Self = this.set("showDiffs", js.undefined)
    @scala.inline
    def setTheme(value: String): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
  
}

