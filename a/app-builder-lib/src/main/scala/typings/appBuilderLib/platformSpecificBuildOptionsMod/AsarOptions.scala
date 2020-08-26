package typings.appBuilderLib.platformSpecificBuildOptionsMod

import typings.appBuilderLib.integrityMod.AsarIntegrityOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsarOptions extends AsarIntegrityOptions {
  var ordering: js.UndefOr[String | Null] = js.native
  /**
    * Whether to automatically unpack executables files.
    * @default true
    */
  var smartUnpack: js.UndefOr[Boolean] = js.native
}

object AsarOptions {
  @scala.inline
  def apply(): AsarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsarOptions]
  }
  @scala.inline
  implicit class AsarOptionsOps[Self <: AsarOptions] (val x: Self) extends AnyVal {
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
    def setOrdering(value: String): Self = this.set("ordering", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrdering: Self = this.set("ordering", js.undefined)
    @scala.inline
    def setOrderingNull: Self = this.set("ordering", null)
    @scala.inline
    def setSmartUnpack(value: Boolean): Self = this.set("smartUnpack", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSmartUnpack: Self = this.set("smartUnpack", js.undefined)
  }
  
}

