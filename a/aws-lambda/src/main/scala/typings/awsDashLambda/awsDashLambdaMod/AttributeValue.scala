package typings.awsDashLambda.awsDashLambdaMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttributeValue extends js.Object {
  var B: js.UndefOr[String] = js.undefined
  var BOOL: js.UndefOr[Boolean] = js.undefined
  var BS: js.UndefOr[js.Array[String]] = js.undefined
  var L: js.UndefOr[js.Array[AttributeValue]] = js.undefined
  var M: js.UndefOr[StringDictionary[AttributeValue]] = js.undefined
  var N: js.UndefOr[String] = js.undefined
  var NS: js.UndefOr[js.Array[String]] = js.undefined
  var NULL: js.UndefOr[Boolean] = js.undefined
  var S: js.UndefOr[String] = js.undefined
  var SS: js.UndefOr[js.Array[String]] = js.undefined
}

object AttributeValue {
  @scala.inline
  def apply(
    B: String = null,
    BOOL: js.UndefOr[Boolean] = js.undefined,
    BS: js.Array[String] = null,
    L: js.Array[AttributeValue] = null,
    M: StringDictionary[AttributeValue] = null,
    N: String = null,
    NS: js.Array[String] = null,
    NULL: js.UndefOr[Boolean] = js.undefined,
    S: String = null,
    SS: js.Array[String] = null
  ): AttributeValue = {
    val __obj = js.Dynamic.literal()
    if (B != null) __obj.updateDynamic("B")(B)
    if (!js.isUndefined(BOOL)) __obj.updateDynamic("BOOL")(BOOL)
    if (BS != null) __obj.updateDynamic("BS")(BS)
    if (L != null) __obj.updateDynamic("L")(L)
    if (M != null) __obj.updateDynamic("M")(M)
    if (N != null) __obj.updateDynamic("N")(N)
    if (NS != null) __obj.updateDynamic("NS")(NS)
    if (!js.isUndefined(NULL)) __obj.updateDynamic("NULL")(NULL)
    if (S != null) __obj.updateDynamic("S")(S)
    if (SS != null) __obj.updateDynamic("SS")(SS)
    __obj.asInstanceOf[AttributeValue]
  }
}

