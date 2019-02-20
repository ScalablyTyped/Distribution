package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is a {@link com.sun.star.text.TextField} whose content is specified by RDF metadata.
  * @see com.sun.star.rdf
  * @since OOo 3.2
  */
trait MetadataField
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextField
     with activexDashLibreofficeLib.comNs.sunNs.starNs.rdfNs.XMetadatable
     with activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XText
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumerationAccess
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XChild {
  /** determines whether changes in language attributes at the position of the text field also change the number format as appropriate for this language. */
  var IsFixedLanguage: scala.Boolean
  /**
    * this is the number format for this field.
    * @see com.sun.star.util.NumberFormatter
    */
  var NumberFormat: scala.Double
}

