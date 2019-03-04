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
    acquire: js.Function0[scala.Unit],
    addPropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    addRefreshListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XRefreshListener, scala.Unit],
    addVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    getDestArea: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    getSourceArea: js.Function0[java.lang.String],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    refresh: js.Function0[scala.Unit],
    release: js.Function0[scala.Unit],
    removePropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    removeRefreshListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XRefreshListener, scala.Unit],
    removeVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    setDestArea: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress, scala.Unit],
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit],
    setSourceArea: js.Function1[java.lang.String, scala.Unit]
  ): CellAreaLink = {
    val __obj = js.Dynamic.literal(DestArea = DestArea, Filter = Filter, FilterOptions = FilterOptions, PropertySetInfo = PropertySetInfo, RefreshDelay = RefreshDelay, RefreshPeriod = RefreshPeriod, SourceArea = SourceArea, Url = Url, acquire = acquire, addPropertyChangeListener = addPropertyChangeListener, addRefreshListener = addRefreshListener, addVetoableChangeListener = addVetoableChangeListener, getDestArea = getDestArea, getPropertySetInfo = getPropertySetInfo, getPropertyValue = getPropertyValue, getSourceArea = getSourceArea, queryInterface = queryInterface, refresh = refresh, release = release, removePropertyChangeListener = removePropertyChangeListener, removeRefreshListener = removeRefreshListener, removeVetoableChangeListener = removeVetoableChangeListener, setDestArea = setDestArea, setPropertyValue = setPropertyValue, setSourceArea = setSourceArea)
  
    __obj.asInstanceOf[CellAreaLink]
  }
}

