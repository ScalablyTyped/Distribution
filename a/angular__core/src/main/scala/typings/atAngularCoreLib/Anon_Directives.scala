package typings
package atAngularCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Directives extends js.Object {
  var directives: nodeLib.Set[_]
  var pipes: nodeLib.Set[_]
}

object Anon_Directives {
  @scala.inline
  def apply(directives: nodeLib.Set[_], pipes: nodeLib.Set[_]): Anon_Directives = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("directives")(directives)
    __obj.updateDynamic("pipes")(pipes)
    __obj.asInstanceOf[Anon_Directives]
  }
}

