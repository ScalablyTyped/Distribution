package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is the context for data access beans. It allows to register aliases for database access beans. It is possible to have different aliases for different
  * locales.
  *
  * A {@link DatabaseContext} stores an alias for the URL of a database access component for a given locale. It is also allowed to work with a default
  * locale. This is useful in connection with Enumeration or NameAccess to the context. In common use, the default language is set during the
  * initialization of the component.
  *
  * The service also provides a default handling for locales, where an alias isn't set. The first time an alias is registered for a programmatic name, the
  * alias becomes the default for all other known locales.
  * @deprecated Deprecated
  * @see com.sun.star.util.XLocalizedAliases
  */
trait DatabaseAccessContext
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumerationAccess
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess
     with activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XLocalizedAliases
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XLocalizable

