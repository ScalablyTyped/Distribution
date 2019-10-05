package typings.arangodb.Foxx

import typings.arangodb.Anon_Charset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaType extends js.Object {
  var parameters: Anon_Charset
  var subtype: String
  var suffix: js.UndefOr[String] = js.undefined
  var `type`: String
}

object MediaType {
  @scala.inline
  def apply(parameters: Anon_Charset, subtype: String, `type`: String, suffix: String = null): MediaType = {
    val __obj = js.Dynamic.literal(parameters = parameters, subtype = subtype)
    __obj.updateDynamic("type")(`type`)
    if (suffix != null) __obj.updateDynamic("suffix")(suffix)
    __obj.asInstanceOf[MediaType]
  }
}

