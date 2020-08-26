package typings.args.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigurationOptions extends js.Object {
  var help: js.UndefOr[Boolean] = js.native
  var mainColor: String | js.Array[String] = js.native
  var minimist: js.UndefOr[MinimistOptions] = js.native
  var mri: MriOptions = js.native
  var name: js.UndefOr[String] = js.native
  var subColor: String | js.Array[String] = js.native
  var usageFilter: js.UndefOr[js.Function1[/* output */ js.Any, _]] = js.native
  var value: js.UndefOr[String] = js.native
  var version: js.UndefOr[Boolean] = js.native
}

object ConfigurationOptions {
  @scala.inline
  def apply(mainColor: String | js.Array[String], mri: MriOptions, subColor: String | js.Array[String]): ConfigurationOptions = {
    val __obj = js.Dynamic.literal(mainColor = mainColor.asInstanceOf[js.Any], mri = mri.asInstanceOf[js.Any], subColor = subColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationOptions]
  }
  @scala.inline
  implicit class ConfigurationOptionsOps[Self <: ConfigurationOptions] (val x: Self) extends AnyVal {
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
    def setMainColorVarargs(value: String*): Self = this.set("mainColor", js.Array(value :_*))
    @scala.inline
    def setMainColor(value: String | js.Array[String]): Self = this.set("mainColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setMri(value: MriOptions): Self = this.set("mri", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubColorVarargs(value: String*): Self = this.set("subColor", js.Array(value :_*))
    @scala.inline
    def setSubColor(value: String | js.Array[String]): Self = this.set("subColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setHelp(value: Boolean): Self = this.set("help", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHelp: Self = this.set("help", js.undefined)
    @scala.inline
    def setMinimist(value: MinimistOptions): Self = this.set("minimist", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimist: Self = this.set("minimist", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setUsageFilter(value: /* output */ js.Any => _): Self = this.set("usageFilter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteUsageFilter: Self = this.set("usageFilter", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setVersion(value: Boolean): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

