package typings.activexLibreoffice.com_.sun.star.presentation

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typings.activexLibreoffice.com_.sun.star.container.XNameAccess
import typings.activexLibreoffice.com_.sun.star.container.XNameContainer
import typings.activexLibreoffice.com_.sun.star.document.LinkTarget
import typings.activexLibreoffice.com_.sun.star.drawing.XDrawPage
import typings.activexLibreoffice.com_.sun.star.drawing.XShape
import typings.activexLibreoffice.com_.sun.star.drawing.XShapeGroup
import typings.activexLibreoffice.com_.sun.star.drawing.XShapes
import typings.activexLibreoffice.com_.sun.star.view.PaperOrientation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is the service provided by a {@link com.sun.star.drawing.DrawPage} inside a {@link PresentationDocument} .
  * @see PresentationDocument
  */
trait DrawPage
  extends StObject
     with typings.activexLibreoffice.com_.sun.star.drawing.DrawPage
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
  
  inline def apply(
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
    getByIndex: Double => Any,
    getCount: () => Double,
    getElementType: () => `type`,
    getForms: () => XNameContainer,
    getLinks: () => XNameAccess,
    getMasterPage: () => XDrawPage,
    getName: () => String,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => Any,
    group: XShapes => XShapeGroup,
    hasElements: () => Boolean,
    queryInterface: `type` => Any,
    release: () => Unit,
    remove: XShape => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setMasterPage: XDrawPage => Unit,
    setName: String => Unit,
    setPropertyValue: (String, Any) => Unit,
    split: XShape => Unit,
    unbind: XShape => Unit,
    ungroup: XShapeGroup => Unit
  ): DrawPage = {
    val __obj = js.Dynamic.literal(BorderBottom = BorderBottom.asInstanceOf[js.Any], BorderLeft = BorderLeft.asInstanceOf[js.Any], BorderRight = BorderRight.asInstanceOf[js.Any], BorderTop = BorderTop.asInstanceOf[js.Any], Change = Change.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], DateTimeFormat = DateTimeFormat.asInstanceOf[js.Any], DateTimeText = DateTimeText.asInstanceOf[js.Any], Duration = Duration.asInstanceOf[js.Any], Effect = Effect.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], FooterText = FooterText.asInstanceOf[js.Any], Forms = Forms.asInstanceOf[js.Any], HeaderText = HeaderText.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], HighResDuration = HighResDuration.asInstanceOf[js.Any], IsBackgroundDark = IsBackgroundDark.asInstanceOf[js.Any], IsDateTimeFixed = IsDateTimeFixed.asInstanceOf[js.Any], IsDateTimeVisible = IsDateTimeVisible.asInstanceOf[js.Any], IsFooterVisible = IsFooterVisible.asInstanceOf[js.Any], IsHeaderVisible = IsHeaderVisible.asInstanceOf[js.Any], IsPageNumberVisible = IsPageNumberVisible.asInstanceOf[js.Any], Layout = Layout.asInstanceOf[js.Any], LinkDisplayName = LinkDisplayName.asInstanceOf[js.Any], Links = Links.asInstanceOf[js.Any], MasterPage = MasterPage.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NavigationOrder = NavigationOrder.asInstanceOf[js.Any], Number = Number.asInstanceOf[js.Any], Orientation = Orientation.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], Speed = Speed.asInstanceOf[js.Any], UserDefinedAttributes = UserDefinedAttributes.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), add = js.Any.fromFunction1(add), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), bind = js.Any.fromFunction1(bind), combine = js.Any.fromFunction1(combine), getByIndex = js.Any.fromFunction1(getByIndex), getCount = js.Any.fromFunction0(getCount), getElementType = js.Any.fromFunction0(getElementType), getForms = js.Any.fromFunction0(getForms), getLinks = js.Any.fromFunction0(getLinks), getMasterPage = js.Any.fromFunction0(getMasterPage), getName = js.Any.fromFunction0(getName), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), group = js.Any.fromFunction1(group), hasElements = js.Any.fromFunction0(hasElements), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), remove = js.Any.fromFunction1(remove), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setMasterPage = js.Any.fromFunction1(setMasterPage), setName = js.Any.fromFunction1(setName), setPropertyValue = js.Any.fromFunction2(setPropertyValue), split = js.Any.fromFunction1(split), unbind = js.Any.fromFunction1(unbind), ungroup = js.Any.fromFunction1(ungroup))
    __obj.asInstanceOf[DrawPage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DrawPage] (val x: Self) extends AnyVal {
    
    inline def setChange(value: Double): Self = StObject.set(x, "Change", value.asInstanceOf[js.Any])
    
    inline def setDateTimeFormat(value: Double): Self = StObject.set(x, "DateTimeFormat", value.asInstanceOf[js.Any])
    
    inline def setDateTimeText(value: String): Self = StObject.set(x, "DateTimeText", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: Double): Self = StObject.set(x, "Duration", value.asInstanceOf[js.Any])
    
    inline def setEffect(value: FadeEffect): Self = StObject.set(x, "Effect", value.asInstanceOf[js.Any])
    
    inline def setFooterText(value: String): Self = StObject.set(x, "FooterText", value.asInstanceOf[js.Any])
    
    inline def setHeaderText(value: String): Self = StObject.set(x, "HeaderText", value.asInstanceOf[js.Any])
    
    inline def setHighResDuration(value: Double): Self = StObject.set(x, "HighResDuration", value.asInstanceOf[js.Any])
    
    inline def setIsDateTimeFixed(value: Boolean): Self = StObject.set(x, "IsDateTimeFixed", value.asInstanceOf[js.Any])
    
    inline def setIsDateTimeVisible(value: Boolean): Self = StObject.set(x, "IsDateTimeVisible", value.asInstanceOf[js.Any])
    
    inline def setIsFooterVisible(value: Boolean): Self = StObject.set(x, "IsFooterVisible", value.asInstanceOf[js.Any])
    
    inline def setIsHeaderVisible(value: Boolean): Self = StObject.set(x, "IsHeaderVisible", value.asInstanceOf[js.Any])
    
    inline def setIsPageNumberVisible(value: Boolean): Self = StObject.set(x, "IsPageNumberVisible", value.asInstanceOf[js.Any])
    
    inline def setLayout(value: Double): Self = StObject.set(x, "Layout", value.asInstanceOf[js.Any])
    
    inline def setSpeed(value: AnimationSpeed): Self = StObject.set(x, "Speed", value.asInstanceOf[js.Any])
  }
}
