package typings.aceBuilds.mod.Ace

import typings.aceBuilds.aceBuildsStrings.auto
import typings.aceBuilds.aceBuildsStrings.code
import typings.aceBuilds.aceBuildsStrings.manual
import typings.aceBuilds.aceBuildsStrings.markbegin
import typings.aceBuilds.aceBuildsStrings.markbeginend
import typings.aceBuilds.aceBuildsStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditSessionOptions extends js.Object {
  var firstLineNumber: Double
  var foldStyle: markbegin | markbeginend | manual
  var indentedSoftWrap: Boolean
  var mode: String
  var navigateWithinSoftTabs: Boolean
  var newLineMode: NewLineMode
  var overwrite: Boolean
  var tabSize: Double
  var useSoftTabs: Boolean
  var useWorker: Boolean
  var wrap: String | Double
  var wrapMethod: code | text | auto
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
    wrap: String | Double,
    wrapMethod: code | text | auto
  ): EditSessionOptions = {
    val __obj = js.Dynamic.literal(firstLineNumber = firstLineNumber.asInstanceOf[js.Any], foldStyle = foldStyle.asInstanceOf[js.Any], indentedSoftWrap = indentedSoftWrap.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], navigateWithinSoftTabs = navigateWithinSoftTabs.asInstanceOf[js.Any], newLineMode = newLineMode.asInstanceOf[js.Any], overwrite = overwrite.asInstanceOf[js.Any], tabSize = tabSize.asInstanceOf[js.Any], useSoftTabs = useSoftTabs.asInstanceOf[js.Any], useWorker = useWorker.asInstanceOf[js.Any], wrap = wrap.asInstanceOf[js.Any], wrapMethod = wrapMethod.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditSessionOptions]
  }
}

