package typings.apolloProtobufjs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOneOf extends js.Object {
  /** Oneof field names */
  var oneof: js.Array[String]
  /** Oneof options */
  var options: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object IOneOf {
  @scala.inline
  def apply(oneof: js.Array[String], options: StringDictionary[js.Any] = null): IOneOf = {
    val __obj = js.Dynamic.literal(oneof = oneof.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOneOf]
  }
}

