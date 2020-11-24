package typings.activexLibreoffice.com_.sun.star

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object inspection {
  
  /**
    * implements a general-purpose {@link XPropertyHandler}
    *
    * The property handler implemented by this service will do an introspection on the provided components, and expose the properties obtained via
    * XIntrospectionAccess::getProperties.
    *
    * The handler will automatically determine the best type of property control to represent a certain property, depending on the property type. This
    * includes, for example, list box controls to represent enumeration properties.
    * @see XPropertyHandler
    * @see scom.sun.star.beans.XIntrospectionAccess
    * @see XPropertyControl
    * @since OOo 2.0.3
    */
  type GenericPropertyHandler = typings.activexLibreoffice.com_.sun.star.inspection.XPropertyHandler
}
