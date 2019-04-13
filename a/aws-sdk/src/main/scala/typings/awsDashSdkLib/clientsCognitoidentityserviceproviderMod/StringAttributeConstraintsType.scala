package typings
package awsDashSdkLib.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringAttributeConstraintsType extends js.Object {
  /**
    * The maximum length.
    */
  var MaxLength: js.UndefOr[StringType] = js.undefined
  /**
    * The minimum length.
    */
  var MinLength: js.UndefOr[StringType] = js.undefined
}

object StringAttributeConstraintsType {
  @scala.inline
  def apply(MaxLength: StringType = null, MinLength: StringType = null): StringAttributeConstraintsType = {
    val __obj = js.Dynamic.literal()
    if (MaxLength != null) __obj.updateDynamic("MaxLength")(MaxLength)
    if (MinLength != null) __obj.updateDynamic("MinLength")(MinLength)
    __obj.asInstanceOf[StringAttributeConstraintsType]
  }
}

