package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConditionFormatEntry extends XConditionEntry {
  var Formula1: String = js.native
  var Formula2: String = js.native
  /** See {@link com.sun.star.sheet.ConditionFormatOperator} for valid values */
  var Operator: Double = js.native
  var StyleName: String = js.native
}

object ConditionFormatEntry {
  @scala.inline
  def apply(
    Formula1: String,
    Formula2: String,
    Operator: Double,
    StyleName: String,
    Type: Double,
    acquire: () => Unit,
    getType: () => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): ConditionFormatEntry = {
    val __obj = js.Dynamic.literal(Formula1 = Formula1.asInstanceOf[js.Any], Formula2 = Formula2.asInstanceOf[js.Any], Operator = Operator.asInstanceOf[js.Any], StyleName = StyleName.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getType = js.Any.fromFunction0(getType), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[ConditionFormatEntry]
  }
  @scala.inline
  implicit class ConditionFormatEntryOps[Self <: ConditionFormatEntry] (val x: Self) extends AnyVal {
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
    def setFormula1(value: String): Self = this.set("Formula1", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormula2(value: String): Self = this.set("Formula2", value.asInstanceOf[js.Any])
    @scala.inline
    def setOperator(value: Double): Self = this.set("Operator", value.asInstanceOf[js.Any])
    @scala.inline
    def setStyleName(value: String): Self = this.set("StyleName", value.asInstanceOf[js.Any])
  }
  
}

