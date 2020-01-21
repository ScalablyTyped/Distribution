package typings.atom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScopeDescriptor extends js.Object {
  /** Returns all scopes for this descriptor. */
  def getScopesArray(): js.Array[String]
}

object ScopeDescriptor {
  @scala.inline
  def apply(getScopesArray: () => js.Array[String]): ScopeDescriptor = {
    val __obj = js.Dynamic.literal(getScopesArray = js.Any.fromFunction0(getScopesArray))
  
    __obj.asInstanceOf[ScopeDescriptor]
  }
}

