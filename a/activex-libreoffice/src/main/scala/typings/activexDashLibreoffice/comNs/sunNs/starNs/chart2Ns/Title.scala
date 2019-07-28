package typings.activexDashLibreoffice.comNs.sunNs.starNs.chart2Ns

import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.Size
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.FillProperties
import typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.LineProperties
import typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs.ParagraphProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Title
  extends PropertySet
     with ParagraphProperties
     with FillProperties
     with LineProperties
     with XTitle {
  /**
    * contains the size of the page at the time when properties were set (e.g. the CharHeight).
    *
    * This way it is possible to resize objects (like text) in the view without modifying the model.
    */
  var ReferencePageSize: Size = js.native
  /**
    * The position is a relative position on the page.
    *
    * If a relative position is given the title is not automatically placed, but instead is placed relative on the page.
    */
  var RelativePosition: typings.activexDashLibreoffice.comNs.sunNs.starNs.chart2Ns.RelativePosition = js.native
  /** writes the characters of the title on top of each other if set to `TRUE` . */
  var StackCharacters: Boolean = js.native
  /** the rotation of the title's text in degrees in the range [0,360). */
  var TextRotation: Double = js.native
  /**
    * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
    * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
    */
  /* InferMemberOverrides */
  override def getPropertySetInfo(): XPropertySetInfo = js.native
}

