package typings.angularMocks.mod.angularAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

///////////////////////////////////////////////////////////////////////////
// AngularStatic
// We reopen it to add the MockStatic definition
///////////////////////////////////////////////////////////////////////////
trait IAngularStatic extends js.Object {
  var mock: IMockStatic
}

object IAngularStatic {
  @scala.inline
  def apply(mock: IMockStatic): IAngularStatic = {
    val __obj = js.Dynamic.literal(mock = mock.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IAngularStatic]
  }
}

