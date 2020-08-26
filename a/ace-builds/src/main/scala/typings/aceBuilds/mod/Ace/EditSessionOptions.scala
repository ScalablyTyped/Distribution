package typings.aceBuilds.mod.Ace

import typings.aceBuilds.aceBuildsStrings.auto
import typings.aceBuilds.aceBuildsStrings.code
import typings.aceBuilds.aceBuildsStrings.free
import typings.aceBuilds.aceBuildsStrings.manual
import typings.aceBuilds.aceBuildsStrings.markbegin
import typings.aceBuilds.aceBuildsStrings.markbeginend
import typings.aceBuilds.aceBuildsStrings.off
import typings.aceBuilds.aceBuildsStrings.printmargin_
import typings.aceBuilds.aceBuildsStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditSessionOptions extends js.Object {
  var firstLineNumber: Double = js.native
  var foldStyle: markbegin | markbeginend | manual = js.native
  var indentedSoftWrap: Boolean = js.native
  var mode: String = js.native
  var navigateWithinSoftTabs: Boolean = js.native
  var newLineMode: NewLineMode = js.native
  var overwrite: Boolean = js.native
  var tabSize: Double = js.native
  var useSoftTabs: Boolean = js.native
  var useWorker: Boolean = js.native
  var wrap: off | free | printmargin_ | Boolean | Double = js.native
  var wrapMethod: code | text | auto = js.native
}

object EditSessionOptions {
  @scala.inline
  def apply(
    firstLineNumber: Double,
    foldStyle: markbegin | markbeginend | manual,
    indentedSoftWrap: Boolean,
    mode: String,
    navigateWithinSoftTabs: Boolean,
    newLineMode: NewLineMode,
    overwrite: Boolean,
    tabSize: Double,
    useSoftTabs: Boolean,
    useWorker: Boolean,
    wrap: off | free | printmargin_ | Boolean | Double,
    wrapMethod: code | text | auto
  ): EditSessionOptions = {
    val __obj = js.Dynamic.literal(firstLineNumber = firstLineNumber.asInstanceOf[js.Any], foldStyle = foldStyle.asInstanceOf[js.Any], indentedSoftWrap = indentedSoftWrap.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], navigateWithinSoftTabs = navigateWithinSoftTabs.asInstanceOf[js.Any], newLineMode = newLineMode.asInstanceOf[js.Any], overwrite = overwrite.asInstanceOf[js.Any], tabSize = tabSize.asInstanceOf[js.Any], useSoftTabs = useSoftTabs.asInstanceOf[js.Any], useWorker = useWorker.asInstanceOf[js.Any], wrap = wrap.asInstanceOf[js.Any], wrapMethod = wrapMethod.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditSessionOptions]
  }
  @scala.inline
  implicit class EditSessionOptionsOps[Self <: EditSessionOptions] (val x: Self) extends AnyVal {
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
    def setFirstLineNumber(value: Double): Self = this.set("firstLineNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def setFoldStyle(value: markbegin | markbeginend | manual): Self = this.set("foldStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndentedSoftWrap(value: Boolean): Self = this.set("indentedSoftWrap", value.asInstanceOf[js.Any])
    @scala.inline
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def setNavigateWithinSoftTabs(value: Boolean): Self = this.set("navigateWithinSoftTabs", value.asInstanceOf[js.Any])
    @scala.inline
    def setNewLineMode(value: NewLineMode): Self = this.set("newLineMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setOverwrite(value: Boolean): Self = this.set("overwrite", value.asInstanceOf[js.Any])
    @scala.inline
    def setTabSize(value: Double): Self = this.set("tabSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setUseSoftTabs(value: Boolean): Self = this.set("useSoftTabs", value.asInstanceOf[js.Any])
    @scala.inline
    def setUseWorker(value: Boolean): Self = this.set("useWorker", value.asInstanceOf[js.Any])
    @scala.inline
    def setWrap(value: off | free | printmargin_ | Boolean | Double): Self = this.set("wrap", value.asInstanceOf[js.Any])
    @scala.inline
    def setWrapMethod(value: code | text | auto): Self = this.set("wrapMethod", value.asInstanceOf[js.Any])
  }
  
}

