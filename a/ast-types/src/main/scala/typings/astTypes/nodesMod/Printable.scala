package typings.astTypes.nodesMod

import typings.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Printable extends js.Object {
  var loc: SourceLocationKind | Null
}

object Printable {
  @scala.inline
  def apply(loc: SourceLocationKind = null): Printable = {
    val __obj = js.Dynamic.literal()
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Printable]
  }
}

