package typings.awsDashSdk.clientsRdsdataserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArrayValue extends js.Object {
  /**
    * An array of arrays.
    */
  var arrayValues: js.UndefOr[ArrayOfArray] = js.undefined
  /**
    * An array of Boolean values.
    */
  var booleanValues: js.UndefOr[BooleanArray] = js.undefined
  /**
    * An array of integers.
    */
  var doubleValues: js.UndefOr[DoubleArray] = js.undefined
  /**
    * An array of floating point numbers.
    */
  var longValues: js.UndefOr[LongArray] = js.undefined
  /**
    * An array of strings.
    */
  var stringValues: js.UndefOr[StringArray] = js.undefined
}

object ArrayValue {
  @scala.inline
  def apply(
    arrayValues: ArrayOfArray = null,
    booleanValues: BooleanArray = null,
    doubleValues: DoubleArray = null,
    longValues: LongArray = null,
    stringValues: StringArray = null
  ): ArrayValue = {
    val __obj = js.Dynamic.literal()
    if (arrayValues != null) __obj.updateDynamic("arrayValues")(arrayValues)
    if (booleanValues != null) __obj.updateDynamic("booleanValues")(booleanValues)
    if (doubleValues != null) __obj.updateDynamic("doubleValues")(doubleValues)
    if (longValues != null) __obj.updateDynamic("longValues")(longValues)
    if (stringValues != null) __obj.updateDynamic("stringValues")(stringValues)
    __obj.asInstanceOf[ArrayValue]
  }
}

