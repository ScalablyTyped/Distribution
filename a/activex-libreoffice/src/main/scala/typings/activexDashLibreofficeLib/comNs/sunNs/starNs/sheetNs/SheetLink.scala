package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a sheet link.
  *
  * A sheet link contains the source data of linked sheets, i.e. the URL and sheet name of the external document.
  *
  * To create a linked sheet, the sheet which will be used as linked sheet has to exist already. The method {@link XSheetLinkable.link()} creates a {@link
  * SheetLink} object in the document's {@link SheetLinks} collection and links the sheet to the specified external sheet.
  */
trait SheetLink
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNamed
     with activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XRefreshable
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet {
  /** specifies the name of the filter needed to load the source document. */
  var Filter: java.lang.String
  /** specifies the filter options needed to load the source document. */
  var FilterOptions: java.lang.String
  /** specifies the URL of the source document. */
  var Url: java.lang.String
}

object SheetLink {
  @scala.inline
  def apply(
    Filter: java.lang.String,
    FilterOptions: java.lang.String,
    Name: java.lang.String,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
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
    getName: js.Function0[java.lang.String],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
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
    setName: js.Function1[java.lang.String, scala.Unit],
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit]
  ): SheetLink = {
    val __obj = js.Dynamic.literal(Filter = Filter, FilterOptions = FilterOptions, Name = Name, PropertySetInfo = PropertySetInfo, Url = Url, acquire = acquire, addPropertyChangeListener = addPropertyChangeListener, addRefreshListener = addRefreshListener, addVetoableChangeListener = addVetoableChangeListener, getName = getName, getPropertySetInfo = getPropertySetInfo, getPropertyValue = getPropertyValue, queryInterface = queryInterface, refresh = refresh, release = release, removePropertyChangeListener = removePropertyChangeListener, removeRefreshListener = removeRefreshListener, removeVetoableChangeListener = removeVetoableChangeListener, setName = setName, setPropertyValue = setPropertyValue)
  
    __obj.asInstanceOf[SheetLink]
  }
}

