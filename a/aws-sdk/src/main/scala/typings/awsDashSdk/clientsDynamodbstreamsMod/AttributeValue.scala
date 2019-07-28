package typings.awsDashSdk.clientsDynamodbstreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttributeValue extends js.Object {
  /**
    * A Binary data type.
    */
  var B: js.UndefOr[BinaryAttributeValue] = js.undefined
  /**
    * A Boolean data type.
    */
  var BOOL: js.UndefOr[BooleanAttributeValue] = js.undefined
  /**
    * A Binary Set data type.
    */
  var BS: js.UndefOr[BinarySetAttributeValue] = js.undefined
  /**
    * A List data type.
    */
  var L: js.UndefOr[ListAttributeValue] = js.undefined
  /**
    * A Map data type.
    */
  var M: js.UndefOr[MapAttributeValue] = js.undefined
  /**
    * A Number data type.
    */
  var N: js.UndefOr[NumberAttributeValue] = js.undefined
  /**
    * A Number Set data type.
    */
  var NS: js.UndefOr[NumberSetAttributeValue] = js.undefined
  /**
    * A Null data type.
    */
  var NULL: js.UndefOr[NullAttributeValue] = js.undefined
  /**
    * A String data type.
    */
  var S: js.UndefOr[StringAttributeValue] = js.undefined
  /**
    * A String Set data type.
    */
  var SS: js.UndefOr[StringSetAttributeValue] = js.undefined
}

object AttributeValue {
  @scala.inline
  def apply(
    B: BinaryAttributeValue = null,
    BOOL: js.UndefOr[BooleanAttributeValue] = js.undefined,
    BS: BinarySetAttributeValue = null,
    L: ListAttributeValue = null,
    M: MapAttributeValue = null,
    N: NumberAttributeValue = null,
    NS: NumberSetAttributeValue = null,
    NULL: js.UndefOr[NullAttributeValue] = js.undefined,
    S: StringAttributeValue = null,
    SS: StringSetAttributeValue = null
  ): AttributeValue = {
    val __obj = js.Dynamic.literal()
    if (B != null) __obj.updateDynamic("B")(B.asInstanceOf[js.Any])
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

