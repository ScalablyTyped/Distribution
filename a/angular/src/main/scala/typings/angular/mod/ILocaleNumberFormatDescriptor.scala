package typings.angular.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILocaleNumberFormatDescriptor extends js.Object {
  var CURRENCY_SYM: String = js.native
  var DECIMAL_SEP: String = js.native
  var GROUP_SEP: String = js.native
  var PATTERNS: js.Array[ILocaleNumberPatternDescriptor] = js.native
}

object ILocaleNumberFormatDescriptor {
  @scala.inline
  def apply(
    CURRENCY_SYM: String,
    DECIMAL_SEP: String,
    GROUP_SEP: String,
    PATTERNS: js.Array[ILocaleNumberPatternDescriptor]
  ): ILocaleNumberFormatDescriptor = {
    val __obj = js.Dynamic.literal(CURRENCY_SYM = CURRENCY_SYM.asInstanceOf[js.Any], DECIMAL_SEP = DECIMAL_SEP.asInstanceOf[js.Any], GROUP_SEP = GROUP_SEP.asInstanceOf[js.Any], PATTERNS = PATTERNS.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILocaleNumberFormatDescriptor]
  }
  @scala.inline
  implicit class ILocaleNumberFormatDescriptorOps[Self <: ILocaleNumberFormatDescriptor] (val x: Self) extends AnyVal {
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
    def setCURRENCY_SYM(value: String): Self = this.set("CURRENCY_SYM", value.asInstanceOf[js.Any])
    @scala.inline
    def setDECIMAL_SEP(value: String): Self = this.set("DECIMAL_SEP", value.asInstanceOf[js.Any])
    @scala.inline
    def setGROUP_SEP(value: String): Self = this.set("GROUP_SEP", value.asInstanceOf[js.Any])
    @scala.inline
    def setPATTERNSVarargs(value: ILocaleNumberPatternDescriptor*): Self = this.set("PATTERNS", js.Array(value :_*))
    @scala.inline
    def setPATTERNS(value: js.Array[ILocaleNumberPatternDescriptor]): Self = this.set("PATTERNS", value.asInstanceOf[js.Any])
  }
  
}

