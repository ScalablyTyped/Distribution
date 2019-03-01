package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Printable extends js.Object {
  var loc: astDashTypesLib.genKindsMod.SourceLocationKind | scala.Null
}

object Printable {
  @scala.inline
  def apply(loc: astDashTypesLib.genKindsMod.SourceLocationKind = null): Printable = {
    val __obj = js.Dynamic.literal()
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Printable]
  }
}

