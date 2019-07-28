package typings.activexDashLibreoffice.comNs.sunNs.starNs.frameNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.Rectangle
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** allows to retrieve information about controller's border. */
trait XControllerBorder extends XInterface {
  /**
    * allows to get current border sizes of the document.
    * @returns {@link BorderWidths} representing the sizes of border
    */
  val Border: BorderWidths
  /** adds the specified listener to receive events about controller's border resizing. */
  def addBorderResizeListener(xListener: XBorderResizeListener): Unit
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
  def queryBorderedArea(aPreliminaryRectangle: Rectangle): Rectangle
  /** removes the specified listener. */
  def removeBorderResizeListener(xListener: XBorderResizeListener): Unit
}

object XControllerBorder {
  @scala.inline
  def apply(
    Border: BorderWidths,
    acquire: () => Unit,
    addBorderResizeListener: XBorderResizeListener => Unit,
    getBorder: () => BorderWidths,
    queryBorderedArea: Rectangle => Rectangle,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeBorderResizeListener: XBorderResizeListener => Unit
  ): XControllerBorder = {
    val __obj = js.Dynamic.literal(Border = Border, acquire = js.Any.fromFunction0(acquire), addBorderResizeListener = js.Any.fromFunction1(addBorderResizeListener), getBorder = js.Any.fromFunction0(getBorder), queryBorderedArea = js.Any.fromFunction1(queryBorderedArea), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeBorderResizeListener = js.Any.fromFunction1(removeBorderResizeListener))
  
    __obj.asInstanceOf[XControllerBorder]
  }
}

