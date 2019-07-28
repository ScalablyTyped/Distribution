package typings.awsDashSdk.clientsSimpledbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attribute extends js.Object {
  /**
    * 
    */
  var AlternateNameEncoding: js.UndefOr[String] = js.undefined
  /**
    * 
    */
  var AlternateValueEncoding: js.UndefOr[String] = js.undefined
  /**
    * The name of the attribute.
    */
  var Name: String
  /**
    * The value of the attribute.
    */
  var Value: String
}

object Attribute {
  @scala.inline
  def apply(
    Name: String,
    Value: String,
    AlternateNameEncoding: String = null,
    AlternateValueEncoding: String = null
  ): Attribute = {
    val __obj = js.Dynamic.literal(Name = Name, Value = Value)
    if (AlternateNameEncoding != null) __obj.updateDynamic("AlternateNameEncoding")(AlternateNameEncoding)
    if (AlternateValueEncoding != null) __obj.updateDynamic("AlternateValueEncoding")(AlternateValueEncoding)
    __obj.asInstanceOf[Attribute]
  }
}

