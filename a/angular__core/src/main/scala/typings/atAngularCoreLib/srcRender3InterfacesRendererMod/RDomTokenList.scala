package typings
package atAngularCoreLib.srcRender3InterfacesRendererMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RDomTokenList extends js.Object {
  def add(token: java.lang.String): scala.Unit
  def remove(token: java.lang.String): scala.Unit
}

object RDomTokenList {
  @scala.inline
  def apply(
    add: js.Function1[java.lang.String, scala.Unit],
    remove: js.Function1[java.lang.String, scala.Unit]
  ): RDomTokenList = {
    val __obj = js.Dynamic.literal(add = add, remove = remove)
  
    __obj.asInstanceOf[RDomTokenList]
  }
}

