package typings.awsDashSdk.clientsDynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttributeValue extends js.Object {
  /**
    * An attribute of type Binary. For example:  "B": "dGhpcyB0ZXh0IGlzIGJhc2U2NC1lbmNvZGVk" 
    */
  var B: js.UndefOr[BinaryAttributeValue] = js.undefined
  /**
    * An attribute of type Boolean. For example:  "BOOL": true 
    */
  var BOOL: js.UndefOr[BooleanAttributeValue] = js.undefined
  /**
    * An attribute of type Binary Set. For example:  "BS": ["U3Vubnk=", "UmFpbnk=", "U25vd3k="] 
    */
  var BS: js.UndefOr[BinarySetAttributeValue] = js.undefined
  /**
    * An attribute of type List. For example:  "L": [ {"S": "Cookies"} , {"S": "Coffee"}, {"N", "3.14159"}] 
    */
  var L: js.UndefOr[ListAttributeValue] = js.undefined
  /**
    * An attribute of type Map. For example:  "M": {"Name": {"S": "Joe"}, "Age": {"N": "35"}} 
    */
  var M: js.UndefOr[MapAttributeValue] = js.undefined
  /**
    * An attribute of type Number. For example:  "N": "123.45"  Numbers are sent across the network to DynamoDB as strings, to maximize compatibility across languages and libraries. However, DynamoDB treats them as number type attributes for mathematical operations.
    */
  var N: js.UndefOr[NumberAttributeValue] = js.undefined
  /**
    * An attribute of type Number Set. For example:  "NS": ["42.2", "-19", "7.5", "3.14"]  Numbers are sent across the network to DynamoDB as strings, to maximize compatibility across languages and libraries. However, DynamoDB treats them as number type attributes for mathematical operations.
    */
  var NS: js.UndefOr[NumberSetAttributeValue] = js.undefined
  /**
    * An attribute of type Null. For example:  "NULL": true 
    */
  var NULL: js.UndefOr[NullAttributeValue] = js.undefined
  /**
    * An attribute of type String. For example:  "S": "Hello" 
    */
  var S: js.UndefOr[StringAttributeValue] = js.undefined
  /**
    * An attribute of type String Set. For example:  "SS": ["Giraffe", "Hippo" ,"Zebra"] 
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

