package typings.activexShdocvw.SHDocVw.EventHelperTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShellNameSpaceFavoritesSelectionChangeParameter extends js.Object {
  val cItems: Double
  val cVisits: Double
  val fAvailableOffline: Double
  val hItem: Double
  val strDate: String
  val strName: String
  val strUrl: String
}

object ShellNameSpaceFavoritesSelectionChangeParameter {
  @scala.inline
  def apply(
    cItems: Double,
    cVisits: Double,
    fAvailableOffline: Double,
    hItem: Double,
    strDate: String,
    strName: String,
    strUrl: String
  ): ShellNameSpaceFavoritesSelectionChangeParameter = {
    val __obj = js.Dynamic.literal(cItems = cItems.asInstanceOf[js.Any], cVisits = cVisits.asInstanceOf[js.Any], fAvailableOffline = fAvailableOffline.asInstanceOf[js.Any], hItem = hItem.asInstanceOf[js.Any], strDate = strDate.asInstanceOf[js.Any], strName = strName.asInstanceOf[js.Any], strUrl = strUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShellNameSpaceFavoritesSelectionChangeParameter]
  }
}

