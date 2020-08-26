package typings.appBuilderLib.windowsCodeSignMod

import typings.appBuilderLib.winOptionsMod.WindowsConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowsSignTaskConfiguration extends WindowsSignOptions {
  var hash: String = js.native
  var isNest: Boolean = js.native
  var resultOutputPath: js.UndefOr[String] = js.native
}

object WindowsSignTaskConfiguration {
  @scala.inline
  def apply(hash: String, isNest: Boolean, options: WindowsConfiguration, path: String): WindowsSignTaskConfiguration = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], isNest = isNest.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowsSignTaskConfiguration]
  }
  @scala.inline
  implicit class WindowsSignTaskConfigurationOps[Self <: WindowsSignTaskConfiguration] (val x: Self) extends AnyVal {
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
    def setHash(value: String): Self = this.set("hash", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsNest(value: Boolean): Self = this.set("isNest", value.asInstanceOf[js.Any])
    @scala.inline
    def setResultOutputPath(value: String): Self = this.set("resultOutputPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResultOutputPath: Self = this.set("resultOutputPath", js.undefined)
  }
  
}

