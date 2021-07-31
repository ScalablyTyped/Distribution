package typings.activexLibreoffice.com_.sun.star.util

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This structure describes a single change that is part of a batch of changes. */
trait ElementChange extends StObject {
  
  /**
    * This contains the accessor to the element which changed.
    *
    * The type and the value of the accessor depends on the service.
    */
  var Accessor: js.Any
  
  /** This contains the element that was inserted or changed. */
  var Element: js.Any
  
  /** This contains the element that was replaced or removed. */
  var ReplacedElement: js.Any
}
object ElementChange {
  
  @scala.inline
  def apply(Accessor: js.Any, Element: js.Any, ReplacedElement: js.Any): ElementChange = {
    val __obj = js.Dynamic.literal(Accessor = Accessor.asInstanceOf[js.Any], Element = Element.asInstanceOf[js.Any], ReplacedElement = ReplacedElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementChange]
  }
  
  @scala.inline
  implicit class ElementChangeMutableBuilder[Self <: ElementChange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessor(value: js.Any): Self = StObject.set(x, "Accessor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElement(value: js.Any): Self = StObject.set(x, "Element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplacedElement(value: js.Any): Self = StObject.set(x, "ReplacedElement", value.asInstanceOf[js.Any])
  }
}
