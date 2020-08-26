package typings.activexLibreoffice.com_.sun.star.inspection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * a factory for XPropertyControls
  * @since OOo 2.0.3
  */
@js.native
trait XPropertyControlFactory extends js.Object {
  /**
    * creates a {@link XPropertyControl}
    *
    * A {@link XPropertyControlFactory} can create any of the control types denoted by the {@link PropertyControlType} constants.
    * @param ControlType the type of the requested control
    * @param CreateReadOnly determines whether the newly created control should be readonly.  If this argument is `TRUE` , this does not necessarily mean that
    * @returns a control of the given type.
    * @throws com::sun::star::lang::IllegalArgumentException if the given ControlType is not a value {@link PropertyControlType}
    */
  def createPropertyControl(ControlType: Double, CreateReadOnly: Boolean): XPropertyControl = js.native
}

object XPropertyControlFactory {
  @scala.inline
  def apply(createPropertyControl: (Double, Boolean) => XPropertyControl): XPropertyControlFactory = {
    val __obj = js.Dynamic.literal(createPropertyControl = js.Any.fromFunction2(createPropertyControl))
    __obj.asInstanceOf[XPropertyControlFactory]
  }
  @scala.inline
  implicit class XPropertyControlFactoryOps[Self <: XPropertyControlFactory] (val x: Self) extends AnyVal {
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
    def setCreatePropertyControl(value: (Double, Boolean) => XPropertyControl): Self = this.set("createPropertyControl", js.Any.fromFunction2(value))
  }
  
}

