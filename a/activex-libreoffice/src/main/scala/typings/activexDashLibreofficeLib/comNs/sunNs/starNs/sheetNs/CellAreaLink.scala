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

object CellAreaLink {
  @scala.inline
  def apply(
    DestArea: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress,
    Filter: java.lang.String,
    FilterOptions: java.lang.String,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    RefreshDelay: scala.Double,
    RefreshPeriod: scala.Double,
    SourceArea: java.lang.String,
    Url: java.lang.String,
    acquire: () => scala.Unit,
    addPropertyChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener) => scala.Unit,
    addRefreshListener: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XRefreshListener => scala.Unit,
    addVetoableChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener) => scala.Unit,
    getDestArea: () => activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress,
    getPropertySetInfo: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    getPropertyValue: java.lang.String => js.Any,
    getSourceArea: () => java.lang.String,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    refresh: () => scala.Unit,
    release: () => scala.Unit,
    removePropertyChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener) => scala.Unit,
    removeRefreshListener: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XRefreshListener => scala.Unit,
    removeVetoableChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener) => scala.Unit,
    setDestArea: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress => scala.Unit,
    setPropertyValue: (java.lang.String, js.Any) => scala.Unit,
    setSourceArea: java.lang.String => scala.Unit
  ): CellAreaLink = {
    val __obj = js.Dynamic.literal(DestArea = DestArea, Filter = Filter, FilterOptions = FilterOptions, PropertySetInfo = PropertySetInfo, RefreshDelay = RefreshDelay, RefreshPeriod = RefreshPeriod, SourceArea = SourceArea, Url = Url, acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addRefreshListener = js.Any.fromFunction1(addRefreshListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getDestArea = js.Any.fromFunction0(getDestArea), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getSourceArea = js.Any.fromFunction0(getSourceArea), queryInterface = js.Any.fromFunction1(queryInterface), refresh = js.Any.fromFunction0(refresh), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeRefreshListener = js.Any.fromFunction1(removeRefreshListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setDestArea = js.Any.fromFunction1(setDestArea), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setSourceArea = js.Any.fromFunction1(setSourceArea))
  
    __obj.asInstanceOf[CellAreaLink]
  }
}

