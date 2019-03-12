package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is the service provided by a {@link com.sun.star.drawing.DrawPage} inside a {@link PresentationDocument} .
  * @see PresentationDocument
  */
trait DrawPage
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.DrawPage
     with activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.LinkTarget {
  /**
    * specifies how the page change is triggered.
    *
    * If this is 0, the user must click to start each object animation and to change the page. If set to 1, the page is automatically switched. If it is set
    * to 2, all object effects run automatically, but the user has to click on the page to change it.
    */
  var Change: scala.Double
  /** defines the format that is used to format a date and time text field on this page. This is only used if `IsDateTimeFixed` is `FALSE` . */
  var DateTimeFormat: scala.Double
  /** defines the text that is displayed in a date and time textfield rendered on this page. This value is only used if `IsDateTimeFixed` is `TRUE` . */
  var DateTimeText: java.lang.String
  /**
    * If the property com::sun::star::drawing::DrawPage::Change is set to 1, this is the time in seconds this page is shown before switching to the next
    * page.
    */
  var Duration: scala.Double
  /** This is the effect that is used to fade in this page. */
  var Effect: FadeEffect
  /** defines the text that is displayed in a footer textfield rendered on this page. */
  var FooterText: java.lang.String
  /** defines the text that is displayed in a header textfield rendered on this page. */
  var HeaderText: java.lang.String
  /**
    * If the property com::sun::star::drawing::DrawPage::Change is set to 1, this is the time in seconds this page is shown before switching to the next
    * page, also permitting sub-second precision here.
    */
  var HighResDuration: scala.Double
  /** defines if a date and time text field shows a fixed string value or the current date on this page. */
  var IsDateTimeFixed: scala.Boolean
  /** defines if a date and time presentation shape from the master page is visible on this page. */
  var IsDateTimeVisible: scala.Boolean
  /** defines if a footer presentation shape from the master page is visible on this page. */
  var IsFooterVisible: scala.Boolean
  /** defines if a header presentation shape from the master page is visible on this page. */
  var IsHeaderVisible: scala.Boolean
  /** defines if a page number presentation shape from the master page is visible on this page. */
  var IsPageNumberVisible: scala.Boolean
  /** If this property is not ZERO, this number specifies a presentation layout for this page. */
  var Layout: scala.Double
  /** defines the speed of the fade-in effect of this page. */
  var Speed: AnimationSpeed
}

object DrawPage {
  @scala.inline
  def apply(
    BorderBottom: scala.Double,
    BorderLeft: scala.Double,
    BorderRight: scala.Double,
    BorderTop: scala.Double,
    Change: scala.Double,
    Count: scala.Double,
    DateTimeFormat: scala.Double,
    DateTimeText: java.lang.String,
    Duration: scala.Double,
    Effect: FadeEffect,
    ElementType: activexDashLibreofficeLib.`type`,
    FooterText: java.lang.String,
    Forms: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer,
    HeaderText: java.lang.String,
    Height: scala.Double,
    HighResDuration: scala.Double,
    IsBackgroundDark: scala.Boolean,
    IsDateTimeFixed: scala.Boolean,
    IsDateTimeVisible: scala.Boolean,
    IsFooterVisible: scala.Boolean,
    IsHeaderVisible: scala.Boolean,
    IsPageNumberVisible: scala.Boolean,
    Layout: scala.Double,
    LinkDisplayName: java.lang.String,
    Links: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
    MasterPage: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XDrawPage,
    Name: java.lang.String,
    NavigationOrder: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess,
    Number: scala.Double,
    Orientation: activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs.PaperOrientation,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    Speed: AnimationSpeed,
    UserDefinedAttributes: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer,
    Width: scala.Double,
    acquire: () => scala.Unit,
    add: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape => scala.Unit,
    addPropertyChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener) => scala.Unit,
    addVetoableChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener) => scala.Unit,
    bind: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShapes => activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape,
    combine: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShapes => activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape,
    getByIndex: scala.Double => js.Any,
    getCount: () => scala.Double,
    getElementType: () => activexDashLibreofficeLib.`type`,
    getForms: () => activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer,
    getLinks: () => activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
    getMasterPage: () => activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XDrawPage,
    getName: () => java.lang.String,
    getPropertySetInfo: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    getPropertyValue: java.lang.String => js.Any,
    group: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShapes => activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShapeGroup,
    hasElements: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    remove: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape => scala.Unit,
    removePropertyChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener) => scala.Unit,
    removeVetoableChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener) => scala.Unit,
    setMasterPage: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XDrawPage => scala.Unit,
    setName: java.lang.String => scala.Unit,
    setPropertyValue: (java.lang.String, js.Any) => scala.Unit,
    split: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape => scala.Unit,
    unbind: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape => scala.Unit,
    ungroup: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShapeGroup => scala.Unit
  ): DrawPage = {
    val __obj = js.Dynamic.literal(BorderBottom = BorderBottom, BorderLeft = BorderLeft, BorderRight = BorderRight, BorderTop = BorderTop, Change = Change, Count = Count, DateTimeFormat = DateTimeFormat, DateTimeText = DateTimeText, Duration = Duration, Effect = Effect, ElementType = ElementType, FooterText = FooterText, Forms = Forms, HeaderText = HeaderText, Height = Height, HighResDuration = HighResDuration, IsBackgroundDark = IsBackgroundDark, IsDateTimeFixed = IsDateTimeFixed, IsDateTimeVisible = IsDateTimeVisible, IsFooterVisible = IsFooterVisible, IsHeaderVisible = IsHeaderVisible, IsPageNumberVisible = IsPageNumberVisible, Layout = Layout, LinkDisplayName = LinkDisplayName, Links = Links, MasterPage = MasterPage, Name = Name, NavigationOrder = NavigationOrder, Number = Number, Orientation = Orientation, PropertySetInfo = PropertySetInfo, Speed = Speed, UserDefinedAttributes = UserDefinedAttributes, Width = Width, acquire = js.Any.fromFunction0(acquire), add = js.Any.fromFunction1(add), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), bind = js.Any.fromFunction1(bind), combine = js.Any.fromFunction1(combine), getByIndex = js.Any.fromFunction1(getByIndex), getCount = js.Any.fromFunction0(getCount), getElementType = js.Any.fromFunction0(getElementType), getForms = js.Any.fromFunction0(getForms), getLinks = js.Any.fromFunction0(getLinks), getMasterPage = js.Any.fromFunction0(getMasterPage), getName = js.Any.fromFunction0(getName), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), group = js.Any.fromFunction1(group), hasElements = js.Any.fromFunction0(hasElements), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), remove = js.Any.fromFunction1(remove), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setMasterPage = js.Any.fromFunction1(setMasterPage), setName = js.Any.fromFunction1(setName), setPropertyValue = js.Any.fromFunction2(setPropertyValue), split = js.Any.fromFunction1(split), unbind = js.Any.fromFunction1(unbind), ungroup = js.Any.fromFunction1(ungroup))
  
    __obj.asInstanceOf[DrawPage]
  }
}

