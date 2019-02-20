package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * defines the a source of list entries coming from a cell range in a table document
  *
  * The component cannot be instantiated at a global service factory, instead it's usually provided by a document instance.
  * @see com.sun.star.document.OfficeDocument
  */
trait CellRangeListSource
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.bindingNs.ListEntrySource
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XInitialization {
  /** specifies the cell range within a document to which the component is bound. */
  var CellRange: CellRangeAddress
}

