package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** allows to retrieve information about controller's border. */
trait XControllerBorder
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * allows to get current border sizes of the document.
    * @returns {@link BorderWidths} representing the sizes of border
    */
  val Border: BorderWidths
  /** adds the specified listener to receive events about controller's border resizing. */
  def addBorderResizeListener(xListener: XBorderResizeListener): scala.Unit
  /**
    * allows to get current border sizes of the document.
    * @returns {@link BorderWidths} representing the sizes of border
    */
  def getBorder(): BorderWidths
  /**
    * allows to get suggestion for resizing of object area surrounded by the border.
    *
    * If the view is going to be resized/moved this method can be used to get suggested object area. Pixels are used as units.
    * @returns suggestion for the resizing
    */
  def queryBorderedArea(aPreliminaryRectangle: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle
  /** removes the specified listener. */
  def removeBorderResizeListener(xListener: XBorderResizeListener): scala.Unit
}

object XControllerBorder {
  @scala.inline
  def apply(
    Border: BorderWidths,
    acquire: js.Function0[scala.Unit],
    addBorderResizeListener: js.Function1[XBorderResizeListener, scala.Unit],
    getBorder: js.Function0[BorderWidths],
    queryBorderedArea: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeBorderResizeListener: js.Function1[XBorderResizeListener, scala.Unit]
  ): XControllerBorder = {
    val __obj = js.Dynamic.literal(Border = Border, acquire = acquire, addBorderResizeListener = addBorderResizeListener, getBorder = getBorder, queryBorderedArea = queryBorderedArea, queryInterface = queryInterface, release = release, removeBorderResizeListener = removeBorderResizeListener)
  
    __obj.asInstanceOf[XControllerBorder]
  }
}

