package typings.atom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Invisibles extends js.Object {
  /**
    *  Character used to render carriage return characters (for Microsoft-style line
    *  endings) when the `Show Invisibles` setting is enabled.
    */
  var cr: js.UndefOr[Boolean | String] = js.native
  /**
    *  Character used to render newline characters (\n) when the `Show Invisibles`
    *  setting is enabled.
    */
  var eol: js.UndefOr[Boolean | String] = js.native
  /**
    *  Character used to render leading and trailing space characters when the
    *  `Show Invisibles` setting is enabled.
    */
  var space: js.UndefOr[Boolean | String] = js.native
  /**
    *  Character used to render hard tab characters (\t) when the `Show Invisibles`
    *  setting is enabled.
    */
  var tab: js.UndefOr[Boolean | String] = js.native
}

object Invisibles {
  @scala.inline
  def apply(): Invisibles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Invisibles]
  }
  @scala.inline
  implicit class InvisiblesOps[Self <: Invisibles] (val x: Self) extends AnyVal {
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
    def setCr(value: Boolean | String): Self = this.set("cr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCr: Self = this.set("cr", js.undefined)
    @scala.inline
    def setEol(value: Boolean | String): Self = this.set("eol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEol: Self = this.set("eol", js.undefined)
    @scala.inline
    def setSpace(value: Boolean | String): Self = this.set("space", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpace: Self = this.set("space", js.undefined)
    @scala.inline
    def setTab(value: Boolean | String): Self = this.set("tab", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTab: Self = this.set("tab", js.undefined)
  }
  
}

