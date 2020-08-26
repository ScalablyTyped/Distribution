package typings.appBuilderLib.nsisOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommonNsisOptions extends js.Object {
  /**
    * See [GUID vs Application Name](../configuration/nsis#guid-vs-application-name).
    */
  val guid: js.UndefOr[String | Null] = js.native
  /**
    * Whether to create [Unicode installer](http://nsis.sourceforge.net/Docs/Chapter1.html#intro-unicode).
    * @default true
    */
  val unicode: js.UndefOr[Boolean] = js.native
  /**
    * @private
    * @default false
    */
  val useZip: js.UndefOr[Boolean] = js.native
  /**
    * If `warningsAsErrors` is `true` (default): NSIS will treat warnings as errors. If `warningsAsErrors` is `false`: NSIS will allow warnings.
    * @default true
    */
  val warningsAsErrors: js.UndefOr[Boolean] = js.native
}

object CommonNsisOptions {
  @scala.inline
  def apply(): CommonNsisOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonNsisOptions]
  }
  @scala.inline
  implicit class CommonNsisOptionsOps[Self <: CommonNsisOptions] (val x: Self) extends AnyVal {
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
    def setGuid(value: String): Self = this.set("guid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGuid: Self = this.set("guid", js.undefined)
    @scala.inline
    def setGuidNull: Self = this.set("guid", null)
    @scala.inline
    def setUnicode(value: Boolean): Self = this.set("unicode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnicode: Self = this.set("unicode", js.undefined)
    @scala.inline
    def setUseZip(value: Boolean): Self = this.set("useZip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseZip: Self = this.set("useZip", js.undefined)
    @scala.inline
    def setWarningsAsErrors(value: Boolean): Self = this.set("warningsAsErrors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWarningsAsErrors: Self = this.set("warningsAsErrors", js.undefined)
  }
  
}

