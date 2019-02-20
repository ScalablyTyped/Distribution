package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** this interface is used for a wrapper of objects implementing the service {@link com.sun.star.drawing.Shape} */
trait XChartShape
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** the method corresponds to the identical methods of the interface {@link com.sun.star.drawing.XShape} */
  var Position: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point
  /** the method corresponds to the identical methods of the interface {@link com.sun.star.drawing.XShape} ??????????? deprecated */
  val ShapeType: java.lang.String
  /** the method corresponds to the identical methods of the interface {@link com.sun.star.drawing.XShape} */
  var Size: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size
  /** the method corresponds to the identical methods of the interface {@link com.sun.star.drawing.XShape} */
  def getPosition(): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point
  /** the method corresponds to the identical methods of the interface {@link com.sun.star.beans.XPropertySet} */
  def getPropertyValue(PropertyName: java.lang.String): js.Any
  /** the method corresponds to the identical methods of the interface {@link com.sun.star.drawing.XShape} ??????????? deprecated */
  def getShapeType(): java.lang.String
  /** the method corresponds to the identical methods of the interface {@link com.sun.star.drawing.XShape} */
  def getSize(): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size
  /** the method corresponds to the identical methods of the interface {@link com.sun.star.drawing.XShape} */
  def setPosition(aPosition: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point): scala.Unit
  /** the method corresponds to the identical methods of the interface {@link com.sun.star.beans.XPropertySet} */
  def setPropertyValue(aPropertyName: java.lang.String, aValue: js.Any): scala.Unit
  /** the method corresponds to the identical methods of the interface {@link com.sun.star.drawing.XShape} */
  def setSize(aSize: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size): scala.Unit
}

