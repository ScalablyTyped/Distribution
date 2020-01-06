package typings.awsDashSdk.clientsSimpledbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Attribute extends js.Object {
  /**
    * 
    */
  var AlternateNameEncoding: js.UndefOr[String] = js.native
  /**
    * 
    */
  var AlternateValueEncoding: js.UndefOr[String] = js.native
  /**
    * The name of the attribute.
    */
  var Name: String = js.native
  /**
    * The value of the attribute.
    */
  var Value: String = js.native
}

object Attribute {
  @scala.inline
  def apply(
    Name: String,
    Value: String,
    AlternateNameEncoding: String = null,
    AlternateValueEncoding: String = null
  ): Attribute = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    if (AlternateNameEncoding != null) __obj.updateDynamic("AlternateNameEncoding")(AlternateNameEncoding.asInstanceOf[js.Any])
    if (AlternateValueEncoding != null) __obj.updateDynamic("AlternateValueEncoding")(AlternateValueEncoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attribute]
  }
}

