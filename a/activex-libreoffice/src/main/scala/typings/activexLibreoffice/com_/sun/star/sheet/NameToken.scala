package typings.activexLibreoffice.com_.sun.star.sheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** contains the information regarding named tokens */
trait NameToken extends js.Object {
  var Index: Double
  var Sheet: Double
}

object NameToken {
  @scala.inline
  def apply(Index: Double, Sheet: Double): NameToken = {
    val __obj = js.Dynamic.literal(Index = Index.asInstanceOf[js.Any], Sheet = Sheet.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameToken]
  }
}

