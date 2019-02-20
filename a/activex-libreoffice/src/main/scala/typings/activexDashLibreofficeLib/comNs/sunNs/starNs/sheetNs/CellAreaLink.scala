package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a linked cell range.
  *
  * A linked cell range is a range which is linked to an equal-sized range in an external document. The contents of the external range is copied into the
  * range of this document.
  * @see com.sun.star.sheet.CellAreaLinks
  */
trait CellAreaLink
  extends XAreaLink
     with activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XRefreshable
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet {
  /** specifies the name of the filter used to load the source document. */
  var Filter: java.lang.String
  /** specifies the filter options needed to load the source document. */
  var FilterOptions: java.lang.String
  /**
    * specifies the delay time between two refresh actions in seconds.
    * @deprecated Deprecated
    */
  var RefreshDelay: scala.Double
  /**
    * specifies the time between two refresh actions in seconds.
    * @since OOo 2.0
    */
  var RefreshPeriod: scala.Double
  /** specifies the URL of the source document. */
  var Url: java.lang.String
}

