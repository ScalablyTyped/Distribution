package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XVetoableChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.CellRangeAddress
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.XRefreshListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.XRefreshable
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
     with XRefreshable
     with XPropertySet {
  /** specifies the name of the filter used to load the source document. */
  var Filter: String
  /** specifies the filter options needed to load the source document. */
  var FilterOptions: String
  /**
    * specifies the delay time between two refresh actions in seconds.
    * @deprecated Deprecated
    */
  var RefreshDelay: Double
  /**
    * specifies the time between two refresh actions in seconds.
    * @since OOo 2.0
    */
  var RefreshPeriod: Double
  /** specifies the URL of the source document. */
  var Url: String
}

object CellAreaLink {
  @scala.inline
  def apply(
    DestArea: CellRangeAddress,
    Filter: String,
    FilterOptions: String,
    PropertySetInfo: XPropertySetInfo,
    RefreshDelay: Double,
    RefreshPeriod: Double,
    SourceArea: String,
    Url: String,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addRefreshListener: XRefreshListener => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    getDestArea: () => CellRangeAddress,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    getSourceArea: () => String,
    queryInterface: `type` => js.Any,
    refresh: () => Unit,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeRefreshListener: XRefreshListener => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setDestArea: CellRangeAddress => Unit,
    setPropertyValue: (String, js.Any) => Unit,
    setSourceArea: String => Unit
  ): CellAreaLink = {
    val __obj = js.Dynamic.literal(DestArea = DestArea, Filter = Filter, FilterOptions = FilterOptions, PropertySetInfo = PropertySetInfo, RefreshDelay = RefreshDelay, RefreshPeriod = RefreshPeriod, SourceArea = SourceArea, Url = Url, acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addRefreshListener = js.Any.fromFunction1(addRefreshListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getDestArea = js.Any.fromFunction0(getDestArea), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getSourceArea = js.Any.fromFunction0(getSourceArea), queryInterface = js.Any.fromFunction1(queryInterface), refresh = js.Any.fromFunction0(refresh), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeRefreshListener = js.Any.fromFunction1(removeRefreshListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setDestArea = js.Any.fromFunction1(setDestArea), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setSourceArea = js.Any.fromFunction1(setSourceArea))
  
    __obj.asInstanceOf[CellAreaLink]
  }
}

