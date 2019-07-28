package typings.activexDashLibreoffice.comNs.sunNs.starNs.presentationNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XVetoableChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XIndexAccess
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XNameAccess
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XNameContainer
import typings.activexDashLibreoffice.comNs.sunNs.starNs.documentNs.LinkTarget
import typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.XDrawPage
import typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.XShape
import typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.XShapeGroup
import typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.XShapes
import typings.activexDashLibreoffice.comNs.sunNs.starNs.viewNs.PaperOrientation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is the service provided by a {@link com.sun.star.drawing.DrawPage} inside a {@link PresentationDocument} .
  * @see PresentationDocument
  */
trait DrawPage
  extends typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.DrawPage
     with LinkTarget {
  /**
    * specifies how the page change is triggered.
    *
    * If this is 0, the user must click to start each object animation and to change the page. If set to 1, the page is automatically switched. If it is set
    * to 2, all object effects run automatically, but the user has to click on the page to change it.
    */
  var Change: Double
  /** defines the format that is used to format a date and time text field on this page. This is only used if `IsDateTimeFixed` is `FALSE` . */
  var DateTimeFormat: Double
  /** defines the text that is displayed in a date and time textfield rendered on this page. This value is only used if `IsDateTimeFixed` is `TRUE` . */
  var DateTimeText: String
  /**
    * If the property com::sun::star::drawing::DrawPage::Change is set to 1, this is the time in seconds this page is shown before switching to the next
    * page.
    */
  var Duration: Double
  /** This is the effect that is used to fade in this page. */
  var Effect: FadeEffect
  /** defines the text that is displayed in a footer textfield rendered on this page. */
  var FooterText: String
  /** defines the text that is displayed in a header textfield rendered on this page. */
  var HeaderText: String
  /**
    * If the property com::sun::star::drawing::DrawPage::Change is set to 1, this is the time in seconds this page is shown before switching to the next
    * page, also permitting sub-second precision here.
    */
  var HighResDuration: Double
  /** defines if a date and time text field shows a fixed string value or the current date on this page. */
  var IsDateTimeFixed: Boolean
  /** defines if a date and time presentation shape from the master page is visible on this page. */
  var IsDateTimeVisible: Boolean
  /** defines if a footer presentation shape from the master page is visible on this page. */
  var IsFooterVisible: Boolean
  /** defines if a header presentation shape from the master page is visible on this page. */
  var IsHeaderVisible: Boolean
  /** defines if a page number presentation shape from the master page is visible on this page. */
  var IsPageNumberVisible: Boolean
  /** If this property is not ZERO, this number specifies a presentation layout for this page. */
  var Layout: Double
  /** defines the speed of the fade-in effect of this page. */
  var Speed: AnimationSpeed
}

object DrawPage {
  @scala.inline
  def apply(
    BorderBottom: Double,
    BorderLeft: Double,
    BorderRight: Double,
    BorderTop: Double,
    Change: Double,
    Count: Double,
    DateTimeFormat: Double,
    DateTimeText: String,
    Duration: Double,
    Effect: FadeEffect,
    ElementType: `type`,
    FooterText: String,
    Forms: XNameContainer,
    HeaderText: String,
    Height: Double,
    HighResDuration: Double,
    IsBackgroundDark: Boolean,
    IsDateTimeFixed: Boolean,
    IsDateTimeVisible: Boolean,
    IsFooterVisible: Boolean,
    IsHeaderVisible: Boolean,
    IsPageNumberVisible: Boolean,
    Layout: Double,
    LinkDisplayName: String,
    Links: XNameAccess,
    MasterPage: XDrawPage,
    Name: String,
    NavigationOrder: XIndexAccess,
    Number: Double,
    Orientation: PaperOrientation,
    PropertySetInfo: XPropertySetInfo,
    Speed: AnimationSpeed,
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
    getLinks: () => XNameAccess,
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
    val __obj = js.Dynamic.literal(BorderBottom = BorderBottom, BorderLeft = BorderLeft, BorderRight = BorderRight, BorderTop = BorderTop, Change = Change, Count = Count, DateTimeFormat = DateTimeFormat, DateTimeText = DateTimeText, Duration = Duration, Effect = Effect, ElementType = ElementType, FooterText = FooterText, Forms = Forms, HeaderText = HeaderText, Height = Height, HighResDuration = HighResDuration, IsBackgroundDark = IsBackgroundDark, IsDateTimeFixed = IsDateTimeFixed, IsDateTimeVisible = IsDateTimeVisible, IsFooterVisible = IsFooterVisible, IsHeaderVisible = IsHeaderVisible, IsPageNumberVisible = IsPageNumberVisible, Layout = Layout, LinkDisplayName = LinkDisplayName, Links = Links, MasterPage = MasterPage, Name = Name, NavigationOrder = NavigationOrder, Number = Number, Orientation = Orientation, PropertySetInfo = PropertySetInfo, Speed = Speed, UserDefinedAttributes = UserDefinedAttributes, Width = Width, acquire = js.Any.fromFunction0(acquire), add = js.Any.fromFunction1(add), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), bind = js.Any.fromFunction1(bind), combine = js.Any.fromFunction1(combine), getByIndex = js.Any.fromFunction1(getByIndex), getCount = js.Any.fromFunction0(getCount), getElementType = js.Any.fromFunction0(getElementType), getForms = js.Any.fromFunction0(getForms), getLinks = js.Any.fromFunction0(getLinks), getMasterPage = js.Any.fromFunction0(getMasterPage), getName = js.Any.fromFunction0(getName), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), group = js.Any.fromFunction1(group), hasElements = js.Any.fromFunction0(hasElements), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), remove = js.Any.fromFunction1(remove), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setMasterPage = js.Any.fromFunction1(setMasterPage), setName = js.Any.fromFunction1(setName), setPropertyValue = js.Any.fromFunction2(setPropertyValue), split = js.Any.fromFunction1(split), unbind = js.Any.fromFunction1(unbind), ungroup = js.Any.fromFunction1(ungroup))
  
    __obj.asInstanceOf[DrawPage]
  }
}

