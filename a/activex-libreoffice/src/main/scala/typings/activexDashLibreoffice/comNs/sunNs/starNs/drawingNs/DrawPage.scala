package typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XVetoableChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XIndexAccess
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XNameContainer
import typings.activexDashLibreoffice.comNs.sunNs.starNs.formNs.XFormsSupplier
import typings.activexDashLibreoffice.comNs.sunNs.starNs.viewNs.PaperOrientation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This service specifies a page for the actual draw pages to contain the drawings.
  * @see GenericDrawPage
  * @see DrawPages
  */
trait DrawPage
  extends GenericDrawPage
     with XMasterPageTarget
     with XFormsSupplier

object DrawPage {
  @scala.inline
  def apply(
    BorderBottom: Double,
    BorderLeft: Double,
    BorderRight: Double,
    BorderTop: Double,
    Count: Double,
    ElementType: `type`,
    Forms: XNameContainer,
    Height: Double,
    IsBackgroundDark: Boolean,
    MasterPage: XDrawPage,
    Name: String,
    NavigationOrder: XIndexAccess,
    Number: Double,
    Orientation: PaperOrientation,
    PropertySetInfo: XPropertySetInfo,
    UserDefinedAttributes: XNameContainer,
    Width: Double,
    acquire: () => Unit,
    add: XShape => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    bind: XShapes => XShape,
    combine: XShapes => XShape,
    getByIndex: Double => js.Any,
    getCount: () => Double,
    getElementType: () => `type`,
    getForms: () => XNameContainer,
    getMasterPage: () => XDrawPage,
    getName: () => String,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    group: XShapes => XShapeGroup,
    hasElements: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    remove: XShape => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setMasterPage: XDrawPage => Unit,
    setName: String => Unit,
    setPropertyValue: (String, js.Any) => Unit,
    split: XShape => Unit,
    unbind: XShape => Unit,
    ungroup: XShapeGroup => Unit
  ): DrawPage = {
    val __obj = js.Dynamic.literal(BorderBottom = BorderBottom, BorderLeft = BorderLeft, BorderRight = BorderRight, BorderTop = BorderTop, Count = Count, ElementType = ElementType, Forms = Forms, Height = Height, IsBackgroundDark = IsBackgroundDark, MasterPage = MasterPage, Name = Name, NavigationOrder = NavigationOrder, Number = Number, Orientation = Orientation, PropertySetInfo = PropertySetInfo, UserDefinedAttributes = UserDefinedAttributes, Width = Width, acquire = js.Any.fromFunction0(acquire), add = js.Any.fromFunction1(add), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), bind = js.Any.fromFunction1(bind), combine = js.Any.fromFunction1(combine), getByIndex = js.Any.fromFunction1(getByIndex), getCount = js.Any.fromFunction0(getCount), getElementType = js.Any.fromFunction0(getElementType), getForms = js.Any.fromFunction0(getForms), getMasterPage = js.Any.fromFunction0(getMasterPage), getName = js.Any.fromFunction0(getName), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), group = js.Any.fromFunction1(group), hasElements = js.Any.fromFunction0(hasElements), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), remove = js.Any.fromFunction1(remove), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setMasterPage = js.Any.fromFunction1(setMasterPage), setName = js.Any.fromFunction1(setName), setPropertyValue = js.Any.fromFunction2(setPropertyValue), split = js.Any.fromFunction1(split), unbind = js.Any.fromFunction1(unbind), ungroup = js.Any.fromFunction1(ungroup))
  
    __obj.asInstanceOf[DrawPage]
  }
}

