package typings.apidoc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocOptions extends js.Object {
  var apiprivate: js.UndefOr[Boolean] = js.native
  var colorize: js.UndefOr[Boolean] = js.native
  var config: js.UndefOr[String] = js.native
  var debug: js.UndefOr[Boolean] = js.native
  var dest: js.UndefOr[String] = js.native
  var encoding: js.UndefOr[String] = js.native
  var markdown: js.UndefOr[Boolean] = js.native
  var parse: js.UndefOr[Boolean] = js.native
  var silent: js.UndefOr[Boolean] = js.native
  var simulate: js.UndefOr[Boolean] = js.native
  var single: js.UndefOr[Boolean] = js.native
  var template: js.UndefOr[String] = js.native
  var templateSingleFile: js.UndefOr[String] = js.native
  var verbose: js.UndefOr[Boolean] = js.native
}

object DocOptions {
  @scala.inline
  def apply(): DocOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocOptions]
  }
  @scala.inline
  implicit class DocOptionsOps[Self <: DocOptions] (val x: Self) extends AnyVal {
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
    def setApiprivate(value: Boolean): Self = this.set("apiprivate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApiprivate: Self = this.set("apiprivate", js.undefined)
    @scala.inline
    def setColorize(value: Boolean): Self = this.set("colorize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorize: Self = this.set("colorize", js.undefined)
    @scala.inline
    def setConfig(value: String): Self = this.set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    @scala.inline
    def setDest(value: String): Self = this.set("dest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDest: Self = this.set("dest", js.undefined)
    @scala.inline
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    @scala.inline
    def setMarkdown(value: Boolean): Self = this.set("markdown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkdown: Self = this.set("markdown", js.undefined)
    @scala.inline
    def setParse(value: Boolean): Self = this.set("parse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParse: Self = this.set("parse", js.undefined)
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSilent: Self = this.set("silent", js.undefined)
    @scala.inline
    def setSimulate(value: Boolean): Self = this.set("simulate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSimulate: Self = this.set("simulate", js.undefined)
    @scala.inline
    def setSingle(value: Boolean): Self = this.set("single", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSingle: Self = this.set("single", js.undefined)
    @scala.inline
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    @scala.inline
    def setTemplateSingleFile(value: String): Self = this.set("templateSingleFile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplateSingleFile: Self = this.set("templateSingleFile", js.undefined)
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerbose: Self = this.set("verbose", js.undefined)
  }
  
}

