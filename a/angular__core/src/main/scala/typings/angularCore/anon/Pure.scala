package typings.angularCore.anon

import typings.angularCore.mod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pure[T] extends js.Object {
  /** Name of the pipe. Used for matching pipes in template to pipe defs. */
  var name: String = js.native
  /** Whether the pipe is pure. */
  var pure: js.UndefOr[Boolean] = js.native
  /** Pipe class reference. Needed to extract pipe lifecycle hooks. */
  var `type`: Type[T] = js.native
}

object Pure {
  @scala.inline
  def apply[T](name: String, `type`: Type[T]): Pure[T] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pure[T]]
  }
  @scala.inline
  implicit class PureOps[Self <: Pure[_], T] (val x: Self with Pure[T]) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: Type[T]): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setPure(value: Boolean): Self = this.set("pure", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePure: Self = this.set("pure", js.undefined)
  }
  
}

