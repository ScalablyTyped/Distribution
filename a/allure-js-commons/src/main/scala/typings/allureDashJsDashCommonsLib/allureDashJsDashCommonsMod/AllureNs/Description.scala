package typings
package allureDashJsDashCommonsLib.allureDashJsDashCommonsMod.AllureNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Description extends js.Object {
  def toXML(): java.lang.String
}

object Description {
  @scala.inline
  def apply(toXML: () => java.lang.String): Description = {
    val __obj = js.Dynamic.literal(toXML = js.Any.fromFunction0(toXML))
  
    __obj.asInstanceOf[Description]
  }
}

