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

