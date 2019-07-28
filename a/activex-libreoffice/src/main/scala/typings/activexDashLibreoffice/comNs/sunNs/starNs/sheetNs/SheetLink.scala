package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XVetoableChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XNamed
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.XRefreshListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.XRefreshable
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
  extends XNamed
     with XRefreshable
     with XPropertySet {
  /** specifies the name of the filter needed to load the source document. */
  var Filter: String
  /** specifies the filter options needed to load the source document. */
  var FilterOptions: String
  /** specifies the URL of the source document. */
  var Url: String
}

object SheetLink {
  @scala.inline
  def apply(
    Filter: String,
    FilterOptions: String,
    Name: String,
    PropertySetInfo: XPropertySetInfo,
    Url: String,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addRefreshListener: XRefreshListener => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    getName: () => String,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    queryInterface: `type` => js.Any,
    refresh: () => Unit,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeRefreshListener: XRefreshListener => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setName: String => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): SheetLink = {
    val __obj = js.Dynamic.literal(Filter = Filter, FilterOptions = FilterOptions, Name = Name, PropertySetInfo = PropertySetInfo, Url = Url, acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addRefreshListener = js.Any.fromFunction1(addRefreshListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getName = js.Any.fromFunction0(getName), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), refresh = js.Any.fromFunction0(refresh), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeRefreshListener = js.Any.fromFunction1(removeRefreshListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setName = js.Any.fromFunction1(setName), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
  
    __obj.asInstanceOf[SheetLink]
  }
}

