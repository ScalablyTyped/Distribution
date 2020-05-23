package typings.aceBuilds.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fold extends js.Object {
  var fold: typings.aceBuilds.mod.Ace.Fold
  var kind: String
}

object Fold {
  @scala.inline
  def apply(fold: typings.aceBuilds.mod.Ace.Fold, kind: String): Fold = {
    val __obj = js.Dynamic.literal(fold = fold.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fold]
  }
}

