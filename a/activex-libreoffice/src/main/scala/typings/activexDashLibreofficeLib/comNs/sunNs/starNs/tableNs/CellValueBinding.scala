package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * defines the binding to a single cell in a table document
  *
  * Read/Write access to the cell represented by this component is supported, as well as active broadcasting of value changes.
  *
  * The binding supports exchanging **double** values, **string** values.
  *
  * The component cannot be instantiated at a global service factory, instead it's usually provided by a document instance.
  * @see com.sun.star.document.OfficeDocument
  */
trait CellValueBinding
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.bindingNs.ValueBinding
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XInitialization {
  /** specifies the cell within a document whose value is reflected by the binding. */
  var BoundCell: CellAddress
}

