package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides easy read-only access to the complete configuration.
  *
  * This service is still unpublished and unstable.
  * @since LibreOffice 4.0
  */
trait ReadOnlyAccess
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XHierarchicalNameAccess {
  /**
    * Service constructor.
    * @param locale a string representation of the locale to use for localized properties; use `*` for all-locale access
    */
  def create(locale: java.lang.String): scala.Unit
}

