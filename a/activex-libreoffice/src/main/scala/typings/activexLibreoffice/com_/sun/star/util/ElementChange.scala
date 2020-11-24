package typings.activexLibreoffice.com_.sun.star.util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This structure describes a single change that is part of a batch of changes. */
@js.native
trait ElementChange extends js.Object {
  
  /**
    * This contains the accessor to the element which changed.
    *
    * The type and the value of the accessor depends on the service.
    */
  var Accessor: js.Any = js.native
  
  /** This contains the element that was inserted or changed. */
  var Element: js.Any = js.native
  
  /** This contains the element that was replaced or removed. */
  var ReplacedElement: js.Any = js.native
}
object ElementChange {
  
  @scala.inline
  def apply(Accessor: js.Any, Element: js.Any, ReplacedElement: js.Any): ElementChange = {
    val __obj = js.Dynamic.literal(Accessor = Accessor.asInstanceOf[js.Any], Element = Element.asInstanceOf[js.Any], ReplacedElement = ReplacedElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementChange]
  }
  
  @scala.inline
  implicit class ElementChangeOps[Self <: ElementChange] (val x: Self) extends AnyVal {
    
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
    def setAccessor(value: js.Any): Self = this.set("Accessor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElement(value: js.Any): Self = this.set("Element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplacedElement(value: js.Any): Self = this.set("ReplacedElement", value.asInstanceOf[js.Any])
  }
}
