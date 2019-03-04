package typings
package actionsDashOnDashGoogleLib.responseDashBuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemBasicCard extends RichResponseItem {
  var basicCard: BasicCard
}

object ItemBasicCard {
  @scala.inline
  def apply(basicCard: BasicCard): ItemBasicCard = {
    val __obj = js.Dynamic.literal(basicCard = basicCard)
  
    __obj.asInstanceOf[ItemBasicCard]
  }
}

