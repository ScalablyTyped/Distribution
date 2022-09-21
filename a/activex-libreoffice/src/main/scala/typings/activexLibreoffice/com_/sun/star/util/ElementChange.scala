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
  var Accessor: Any
  
  /** This contains the element that was inserted or changed. */
  var Element: Any
  
  /** This contains the element that was replaced or removed. */
  var ReplacedElement: Any
}
object ElementChange {
  
  inline def apply(Accessor: Any, Element: Any, ReplacedElement: Any): ElementChange = {
    val __obj = js.Dynamic.literal(Accessor = Accessor.asInstanceOf[js.Any], Element = Element.asInstanceOf[js.Any], ReplacedElement = ReplacedElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementChange]
  }
  
  extension [Self <: ElementChange](x: Self) {
    
    inline def setAccessor(value: Any): Self = StObject.set(x, "Accessor", value.asInstanceOf[js.Any])
    
    inline def setElement(value: Any): Self = StObject.set(x, "Element", value.asInstanceOf[js.Any])
    
    inline def setReplacedElement(value: Any): Self = StObject.set(x, "ReplacedElement", value.asInstanceOf[js.Any])
  }
}
