package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The {@link AccessibleChartDocumentView} service is supported by a Component that represents the view of a Chart document to provide an entry point to
  * the document tree for accessibility.
  *
  * An object that implements the {@link AccessibleChartDocumentView} service provides information about itself and about the chart subcomponents
  * contained in the chart document displayed in a window. This service gives a simplified view on the underlying implementation. It tries both to keep
  * the structure of the accessibility representation tree as simple as possible and provide as much relevant information as possible.
  * @since OOo 1.1.2
  */
trait AccessibleChartDocumentView
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessible
     with activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleContext
     with activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleComponent

