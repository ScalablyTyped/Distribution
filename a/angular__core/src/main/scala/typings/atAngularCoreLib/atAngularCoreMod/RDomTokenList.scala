package typings
package atAngularCoreLib.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RDomTokenList extends js.Object {
  def add(token: java.lang.String): scala.Unit
  def remove(token: java.lang.String): scala.Unit
}

object RDomTokenList {
  @scala.inline
  def apply(add: java.lang.String => scala.Unit, remove: java.lang.String => scala.Unit): RDomTokenList = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), remove = js.Any.fromFunction1(remove))
  
    __obj.asInstanceOf[RDomTokenList]
  }
}

