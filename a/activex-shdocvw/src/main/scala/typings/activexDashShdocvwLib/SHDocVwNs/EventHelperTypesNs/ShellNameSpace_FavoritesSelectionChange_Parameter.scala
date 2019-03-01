package typings
package activexDashShdocvwLib.SHDocVwNs.EventHelperTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShellNameSpace_FavoritesSelectionChange_Parameter extends js.Object {
  val cItems: scala.Double
  val cVisits: scala.Double
  val fAvailableOffline: scala.Double
  val hItem: scala.Double
  val strDate: java.lang.String
  val strName: java.lang.String
  val strUrl: java.lang.String
}

object ShellNameSpace_FavoritesSelectionChange_Parameter {
  @scala.inline
  def apply(
    cItems: scala.Double,
    cVisits: scala.Double,
    fAvailableOffline: scala.Double,
    hItem: scala.Double,
    strDate: java.lang.String,
    strName: java.lang.String,
    strUrl: java.lang.String
  ): ShellNameSpace_FavoritesSelectionChange_Parameter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cItems")(cItems)
    __obj.updateDynamic("cVisits")(cVisits)
    __obj.updateDynamic("fAvailableOffline")(fAvailableOffline)
    __obj.updateDynamic("hItem")(hItem)
    __obj.updateDynamic("strDate")(strDate)
    __obj.updateDynamic("strName")(strName)
    __obj.updateDynamic("strUrl")(strUrl)
    __obj.asInstanceOf[ShellNameSpace_FavoritesSelectionChange_Parameter]
  }
}

