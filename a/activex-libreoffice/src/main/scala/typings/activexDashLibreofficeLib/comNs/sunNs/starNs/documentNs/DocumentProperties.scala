package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides document-specific information such as the author, creation date, and user-defined fields.
  *
  * This service replaces the deprecated DocumentInfo and StandaloneDocumentInfo services.
  * @see XDocumentProperties
  * @see XDocumentPropertiesSupplier
  * @since OOo 3.0
  */
trait DocumentProperties extends XDocumentProperties {
  /** constructs default-initialized instance */
  def create(): scala.Unit
}

