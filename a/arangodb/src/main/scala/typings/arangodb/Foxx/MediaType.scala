package typings.arangodb.Foxx

import typings.arangodb.AnonCharset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaType extends js.Object {
  var parameters: AnonCharset
  var subtype: String
  var suffix: js.UndefOr[String] = js.undefined
  var `type`: String
}

object MediaType {
  @scala.inline
  def apply(parameters: AnonCharset, subtype: String, `type`: String, suffix: String = null): MediaType = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], subtype = subtype.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (suffix != null) __obj.updateDynamic("suffix")(suffix.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaType]
  }
}

