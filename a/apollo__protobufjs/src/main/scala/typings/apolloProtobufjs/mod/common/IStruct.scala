package typings.apolloProtobufjs.mod.common

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a google.protobuf.Struct message. */
trait IStruct extends js.Object {
  var fields: js.UndefOr[StringDictionary[IValue]] = js.undefined
}

object IStruct {
  @scala.inline
  def apply(fields: StringDictionary[IValue] = null): IStruct = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStruct]
  }
}

