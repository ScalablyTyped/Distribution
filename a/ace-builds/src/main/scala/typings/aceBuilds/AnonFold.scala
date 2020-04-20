package typings.aceBuilds

import typings.aceBuilds.mod.Ace.Fold
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFold extends js.Object {
  var fold: Fold
  var kind: String
}

object AnonFold {
  @scala.inline
  def apply(fold: Fold, kind: String): AnonFold = {
    val __obj = js.Dynamic.literal(fold = fold.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFold]
  }
}

