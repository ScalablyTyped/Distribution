package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttributeValue extends js.Object {
  /**
    * For number values, expressed as double.
    */
  var N: js.UndefOr[DoubleObject] = js.native
  /**
    * For single string values. Maximum string length is 100 characters.
    */
  var S: js.UndefOr[NonZeroAndMaxString] = js.native
  /**
    * For a map of up to 10 data type:value pairs. Maximum length for each string value is 100 characters. 
    */
  var SDM: js.UndefOr[StringDoubleMap] = js.native
  /**
    * For a list of up to 10 strings. Maximum length for each string is 100 characters. Duplicate values are not recognized; all occurrences of the repeated value after the first of a repeated value are ignored.
    */
  var SL: js.UndefOr[StringList] = js.native
}

object AttributeValue {
  @scala.inline
  def apply(
    N: Int | scala.Double = null,
    S: NonZeroAndMaxString = null,
    SDM: StringDoubleMap = null,
    SL: StringList = null
  ): AttributeValue = {
    val __obj = js.Dynamic.literal()
    if (N != null) __obj.updateDynamic("N")(N.asInstanceOf[js.Any])
    if (S != null) __obj.updateDynamic("S")(S.asInstanceOf[js.Any])
    if (SDM != null) __obj.updateDynamic("SDM")(SDM.asInstanceOf[js.Any])
    if (SL != null) __obj.updateDynamic("SL")(SL.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeValue]
  }
}

