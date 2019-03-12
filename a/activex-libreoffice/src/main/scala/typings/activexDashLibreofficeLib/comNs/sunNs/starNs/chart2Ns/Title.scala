package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Title
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertySet
     with activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.ParagraphProperties
     with activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.FillProperties
     with activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.LineProperties
     with XTitle {
  /**
    * contains the size of the page at the time when properties were set (e.g. the CharHeight).
    *
    * This way it is possible to resize objects (like text) in the view without modifying the model.
    */
  var ReferencePageSize: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size = js.native
  /**
    * The position is a relative position on the page.
    *
    * If a relative position is given the title is not automatically placed, but instead is placed relative on the page.
    */
  var RelativePosition: activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.RelativePosition = js.native
  /** writes the characters of the title on top of each other if set to `TRUE` . */
  var StackCharacters: scala.Boolean = js.native
  /** the rotation of the title's text in degrees in the range [0,360). */
  var TextRotation: scala.Double = js.native
  /**
    * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object to which this interface belongs. NULL is returned if the obj
    * @see XPropertySet.getPropertySetInfo
    */
  /* InferMemberOverrides */
  override def getPropertySetInfo(): activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo = js.native
}

