package typings.atAngularCore.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RDomTokenList extends js.Object {
  def add(token: String): Unit
  def remove(token: String): Unit
}

object RDomTokenList {
  @scala.inline
  def apply(add: String => Unit, remove: String => Unit): RDomTokenList = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), remove = js.Any.fromFunction1(remove))
  
    __obj.asInstanceOf[RDomTokenList]
  }
}

