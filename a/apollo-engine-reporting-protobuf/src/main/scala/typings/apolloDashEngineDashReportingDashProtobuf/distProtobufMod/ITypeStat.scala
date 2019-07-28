package typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod

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
    if (field != null) __obj.updateDynamic("field")(field)
    if (name != null) __obj.updateDynamic("name")(name)
    if (perFieldStat != null) __obj.updateDynamic("perFieldStat")(perFieldStat)
    __obj.asInstanceOf[ITypeStat]
  }
}

