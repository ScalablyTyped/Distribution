package typings.awsDashSdk.clientsDynamodbstreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttributeValue extends js.Object {
  /**
    * A Binary data type.
    */
  var B: js.UndefOr[BinaryAttributeValue] = js.native
  /**
    * A Boolean data type.
    */
  var BOOL: js.UndefOr[BooleanAttributeValue] = js.native
  /**
    * A Binary Set data type.
    */
  var BS: js.UndefOr[BinarySetAttributeValue] = js.native
  /**
    * A List data type.
    */
  var L: js.UndefOr[ListAttributeValue] = js.native
  /**
    * A Map data type.
    */
  var M: js.UndefOr[MapAttributeValue] = js.native
  /**
    * A Number data type.
    */
  var N: js.UndefOr[NumberAttributeValue] = js.native
  /**
    * A Number Set data type.
    */
  var NS: js.UndefOr[NumberSetAttributeValue] = js.native
  /**
    * A Null data type.
    */
  var NULL: js.UndefOr[NullAttributeValue] = js.native
  /**
    * A String data type.
    */
  var S: js.UndefOr[StringAttributeValue] = js.native
  /**
    * A String Set data type.
    */
  var SS: js.UndefOr[StringSetAttributeValue] = js.native
}

object AttributeValue {
  @scala.inline
  def apply(
    B: BinaryAttributeValue = null,
    BOOL: js.UndefOr[Boolean] = js.undefined,
    BS: BinarySetAttributeValue = null,
    L: ListAttributeValue = null,
    M: MapAttributeValue = null,
    N: NumberAttributeValue = null,
    NS: NumberSetAttributeValue = null,
    NULL: js.UndefOr[Boolean] = js.undefined,
    S: StringAttributeValue = null,
    SS: StringSetAttributeValue = null
  ): AttributeValue = {
    val __obj = js.Dynamic.literal()
    if (B != null) __obj.updateDynamic("B")(B.asInstanceOf[js.Any])
    if (!js.isUndefined(BOOL)) __obj.updateDynamic("BOOL")(BOOL.asInstanceOf[js.Any])
    if (BS != null) __obj.updateDynamic("BS")(BS.asInstanceOf[js.Any])
    if (L != null) __obj.updateDynamic("L")(L.asInstanceOf[js.Any])
    if (M != null) __obj.updateDynamic("M")(M.asInstanceOf[js.Any])
    if (N != null) __obj.updateDynamic("N")(N.asInstanceOf[js.Any])
    if (NS != null) __obj.updateDynamic("NS")(NS.asInstanceOf[js.Any])
    if (!js.isUndefined(NULL)) __obj.updateDynamic("NULL")(NULL.asInstanceOf[js.Any])
    if (S != null) __obj.updateDynamic("S")(S.asInstanceOf[js.Any])
    if (SS != null) __obj.updateDynamic("SS")(SS.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeValue]
  }
}

