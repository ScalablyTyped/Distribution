package typings.apolloEngineReportingProtobuf.protobufMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITypeStat extends js.Object {
  /** TypeStat field */
  var field: js.UndefOr[js.Array[IFieldStat] | Null] = js.undefined
  /** TypeStat name */
  var name: js.UndefOr[String | Null] = js.undefined
  /** TypeStat perFieldStat */
  var perFieldStat: js.UndefOr[StringDictionary[IFieldStat] | Null] = js.undefined
}

object ITypeStat {
  @scala.inline
  def apply(
    field: js.Array[IFieldStat] = null,
    name: String = null,
    perFieldStat: StringDictionary[IFieldStat] = null
  ): ITypeStat = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (perFieldStat != null) __obj.updateDynamic("perFieldStat")(perFieldStat.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITypeStat]
  }
}

