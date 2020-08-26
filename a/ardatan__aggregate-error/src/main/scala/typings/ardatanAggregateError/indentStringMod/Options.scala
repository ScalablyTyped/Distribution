package typings.ardatanAggregateError.indentStringMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    Also indent empty lines.
    @default false
    */
  val includeEmptyLines: js.UndefOr[Boolean] = js.native
  /**
    The string to use for the indent.
    @default ' '
    */
  val indent: js.UndefOr[String] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setIncludeEmptyLines(value: Boolean): Self = this.set("includeEmptyLines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeEmptyLines: Self = this.set("includeEmptyLines", js.undefined)
    @scala.inline
    def setIndent(value: String): Self = this.set("indent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndent: Self = this.set("indent", js.undefined)
  }
  
}

