package typings.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Datum extends js.Object {
  /**
    * The value of the datum.
    */
  var VarCharValue: js.UndefOr[datumString] = js.native
}

object Datum {
  @scala.inline
  def apply(): Datum = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Datum]
  }
  @scala.inline
  implicit class DatumOps[Self <: Datum] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setVarCharValue(value: datumString): Self = this.set("VarCharValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVarCharValue: Self = this.set("VarCharValue", js.undefined)
  }
  
}

