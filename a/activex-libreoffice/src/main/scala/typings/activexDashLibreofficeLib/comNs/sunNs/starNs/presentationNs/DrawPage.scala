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
    acquire: js.Function0[scala.Unit],
    add: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape, scala.Unit],
    addPropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    addVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    bind: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShapes, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape
    ],
    combine: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShapes, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape
    ],
    getByIndex: js.Function1[scala.Double, js.Any],
    getCount: js.Function0[scala.Double],
    getElementType: js.Function0[activexDashLibreofficeLib.`type`],
    getForms: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer],
    getLinks: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess],
    getMasterPage: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XDrawPage],
    getName: js.Function0[java.lang.String],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    group: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShapes, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShapeGroup
    ],
    hasElements: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    remove: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape, scala.Unit],
    removePropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    removeVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    setMasterPage: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XDrawPage, scala.Unit],
    setName: js.Function1[java.lang.String, scala.Unit],
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit],
    split: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape, scala.Unit],
    unbind: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape, scala.Unit],
    ungroup: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShapeGroup, scala.Unit]
  ): DrawPage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("BorderBottom")(BorderBottom)
    __obj.updateDynamic("BorderLeft")(BorderLeft)
    __obj.updateDynamic("BorderRight")(BorderRight)
    __obj.updateDynamic("BorderTop")(BorderTop)
    __obj.updateDynamic("Change")(Change)
    __obj.updateDynamic("Count")(Count)
    __obj.updateDynamic("DateTimeFormat")(DateTimeFormat)
    __obj.updateDynamic("DateTimeText")(DateTimeText)
    __obj.updateDynamic("Duration")(Duration)
    __obj.updateDynamic("Effect")(Effect)
    __obj.updateDynamic("ElementType")(ElementType)
    __obj.updateDynamic("FooterText")(FooterText)
    __obj.updateDynamic("Forms")(Forms)
    __obj.updateDynamic("HeaderText")(HeaderText)
    __obj.updateDynamic("Height")(Height)
    __obj.updateDynamic("HighResDuration")(HighResDuration)
    __obj.updateDynamic("IsBackgroundDark")(IsBackgroundDark)
    __obj.updateDynamic("IsDateTimeFixed")(IsDateTimeFixed)
    __obj.updateDynamic("IsDateTimeVisible")(IsDateTimeVisible)
    __obj.updateDynamic("IsFooterVisible")(IsFooterVisible)
    __obj.updateDynamic("IsHeaderVisible")(IsHeaderVisible)
    __obj.updateDynamic("IsPageNumberVisible")(IsPageNumberVisible)
    __obj.updateDynamic("Layout")(Layout)
    __obj.updateDynamic("LinkDisplayName")(LinkDisplayName)
    __obj.updateDynamic("Links")(Links)
    __obj.updateDynamic("MasterPage")(MasterPage)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("NavigationOrder")(NavigationOrder)
    __obj.updateDynamic("Number")(Number)
    __obj.updateDynamic("Orientation")(Orientation)
    __obj.updateDynamic("PropertySetInfo")(PropertySetInfo)
    __obj.updateDynamic("Speed")(Speed)
    __obj.updateDynamic("UserDefinedAttributes")(UserDefinedAttributes)
    __obj.updateDynamic("Width")(Width)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("add")(add)
    __obj.updateDynamic("addPropertyChangeListener")(addPropertyChangeListener)
    __obj.updateDynamic("addVetoableChangeListener")(addVetoableChangeListener)
    __obj.updateDynamic("bind")(bind)
    __obj.updateDynamic("combine")(combine)
    __obj.updateDynamic("getByIndex")(getByIndex)
    __obj.updateDynamic("getCount")(getCount)
    __obj.updateDynamic("getElementType")(getElementType)
    __obj.updateDynamic("getForms")(getForms)
    __obj.updateDynamic("getLinks")(getLinks)
    __obj.updateDynamic("getMasterPage")(getMasterPage)
    __obj.updateDynamic("getName")(getName)
    __obj.updateDynamic("getPropertySetInfo")(getPropertySetInfo)
    __obj.updateDynamic("getPropertyValue")(getPropertyValue)
    __obj.updateDynamic("group")(group)
    __obj.updateDynamic("hasElements")(hasElements)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("remove")(remove)
    __obj.updateDynamic("removePropertyChangeListener")(removePropertyChangeListener)
    __obj.updateDynamic("removeVetoableChangeListener")(removeVetoableChangeListener)
    __obj.updateDynamic("setMasterPage")(setMasterPage)
    __obj.updateDynamic("setName")(setName)
    __obj.updateDynamic("setPropertyValue")(setPropertyValue)
    __obj.updateDynamic("split")(split)
    __obj.updateDynamic("unbind")(unbind)
    __obj.updateDynamic("ungroup")(ungroup)
    __obj.asInstanceOf[DrawPage]
  }
}

