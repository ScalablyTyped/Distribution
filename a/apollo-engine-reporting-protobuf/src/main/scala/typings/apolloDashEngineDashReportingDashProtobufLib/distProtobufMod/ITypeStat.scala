package typings
package apolloDashEngineDashReportingDashProtobufLib.distProtobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITypeStat extends js.Object {
  /** TypeStat field */
  var field: js.UndefOr[js.Array[IFieldStat] | scala.Null] = js.undefined
  /** TypeStat name */
  var name: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /** TypeStat perFieldStat */
  var perFieldStat: js.UndefOr[org.scalablytyped.runtime.StringDictionary[IFieldStat] | scala.Null] = js.undefined
}

object ITypeStat {
  @scala.inline
  def apply(
    field: js.Array[IFieldStat] = null,
    name: java.lang.String = null,
    perFieldStat: org.scalablytyped.runtime.StringDictionary[IFieldStat] = null
  ): ITypeStat = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field)
    if (name != null) __obj.updateDynamic("name")(name)
    if (perFieldStat != null) __obj.updateDynamic("perFieldStat")(perFieldStat)
    __obj.asInstanceOf[ITypeStat]
  }
}

