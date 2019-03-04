package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScopeDescriptor extends js.Object {
  /** Returns all scopes for this descriptor. */
  def getScopesArray(): js.Array[java.lang.String]
}

object ScopeDescriptor {
  @scala.inline
  def apply(getScopesArray: js.Function0[js.Array[java.lang.String]]): ScopeDescriptor = {
    val __obj = js.Dynamic.literal(getScopesArray = getScopesArray)
  
    __obj.asInstanceOf[ScopeDescriptor]
  }
}

