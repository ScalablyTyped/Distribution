package typings.angularCore

import typings.angularCore.angularCoreBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAttribute extends js.Object {
  /**
    * If an `@Attribute` decorator is used, this represents the injected attribute's name. If the
    * attribute name is a dynamic expression instead of a string literal, this will be the unknown
    * type.
    */
  var attribute: js.UndefOr[String | js.Any] = js.undefined
  /**
    * If `@Host` is used, this key is set to true.
    */
  var host: js.UndefOr[`true`] = js.undefined
  /**
    * If `@Optional()` is used, this key is set to true.
    */
  var optional: js.UndefOr[`true`] = js.undefined
  /**
    * If `@Self` is used, this key is set to true.
    */
  var self: js.UndefOr[`true`] = js.undefined
  /**
    * If `@SkipSelf` is used, this key is set to true.
    */
  var skipSelf: js.UndefOr[`true`] = js.undefined
}

object AnonAttribute {
  @scala.inline
  def apply(
    attribute: String | js.Any = null,
    host: `true` = null,
    optional: `true` = null,
    self: `true` = null,
    skipSelf: `true` = null
  ): AnonAttribute = {
    val __obj = js.Dynamic.literal()
    if (attribute != null) __obj.updateDynamic("attribute")(attribute.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (optional != null) __obj.updateDynamic("optional")(optional.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (skipSelf != null) __obj.updateDynamic("skipSelf")(skipSelf.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAttribute]
  }
}

