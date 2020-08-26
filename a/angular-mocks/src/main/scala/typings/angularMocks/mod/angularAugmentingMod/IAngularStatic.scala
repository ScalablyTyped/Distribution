package typings.angularMocks.mod.angularAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

///////////////////////////////////////////////////////////////////////////
// AngularStatic
// We reopen it to add the MockStatic definition
///////////////////////////////////////////////////////////////////////////
@js.native
trait IAngularStatic extends js.Object {
  var mock: IMockStatic = js.native
}

object IAngularStatic {
  @scala.inline
  def apply(mock: IMockStatic): IAngularStatic = {
    val __obj = js.Dynamic.literal(mock = mock.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAngularStatic]
  }
  @scala.inline
  implicit class IAngularStaticOps[Self <: IAngularStatic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMock(value: IMockStatic): Self = this.set("mock", value.asInstanceOf[js.Any])
  }
  
}

