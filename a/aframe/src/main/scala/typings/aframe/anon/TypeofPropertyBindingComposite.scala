package typings.aframe.anon

import org.scalablytyped.runtime.Instantiable2
import typings.three.mod.PropertyBinding.Composite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofPropertyBindingComposite extends js.Object {
  var Composite: Instantiable2[
    /* targetGroup */ js.Any, 
    /* path */ js.Any, 
    typings.three.mod.PropertyBinding.Composite
  ] = js.native
}

object TypeofPropertyBindingComposite {
  @scala.inline
  def apply(Composite: Instantiable2[/* targetGroup */ js.Any, /* path */ js.Any, Composite]): TypeofPropertyBindingComposite = {
    val __obj = js.Dynamic.literal(Composite = Composite.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPropertyBindingComposite]
  }
  @scala.inline
  implicit class TypeofPropertyBindingCompositeOps[Self <: TypeofPropertyBindingComposite] (val x: Self) extends AnyVal {
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
    def setComposite(value: Instantiable2[/* targetGroup */ js.Any, /* path */ js.Any, Composite]): Self = this.set("Composite", value.asInstanceOf[js.Any])
  }
  
}

