package typings.apolloEngineReportingProtobuf.protobufMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITypeStat extends js.Object {
  /** TypeStat perFieldStat */
  var perFieldStat: js.UndefOr[StringDictionary[IFieldStat] | Null] = js.undefined
}

object ITypeStat {
  @scala.inline
  def apply(perFieldStat: js.UndefOr[Null | StringDictionary[IFieldStat]] = js.undefined): ITypeStat = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(perFieldStat)) __obj.updateDynamic("perFieldStat")(perFieldStat.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITypeStat]
  }
}

