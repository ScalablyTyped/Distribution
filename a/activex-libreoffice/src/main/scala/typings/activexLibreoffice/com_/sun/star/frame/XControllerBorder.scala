package typings.activexLibreoffice.com_.sun.star.frame

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.Rectangle
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** allows to retrieve information about controller's border. */
@js.native
trait XControllerBorder extends XInterface {
  /**
    * allows to get current border sizes of the document.
    * @returns {@link BorderWidths} representing the sizes of border
    */
  val Border: BorderWidths = js.native
  /** adds the specified listener to receive events about controller's border resizing. */
  def addBorderResizeListener(xListener: XBorderResizeListener): Unit = js.native
  /**
    * allows to get current border sizes of the document.
    * @returns {@link BorderWidths} representing the sizes of border
    */
  def getBorder(): BorderWidths = js.native
  /**
    * allows to get suggestion for resizing of object area surrounded by the border.
    *
    * If the view is going to be resized/moved this method can be used to get suggested object area. Pixels are used as units.
    * @returns suggestion for the resizing
    */
  def queryBorderedArea(aPreliminaryRectangle: Rectangle): Rectangle = js.native
  /** removes the specified listener. */
  def removeBorderResizeListener(xListener: XBorderResizeListener): Unit = js.native
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
    val __obj = js.Dynamic.literal(Border = Border.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addBorderResizeListener = js.Any.fromFunction1(addBorderResizeListener), getBorder = js.Any.fromFunction0(getBorder), queryBorderedArea = js.Any.fromFunction1(queryBorderedArea), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeBorderResizeListener = js.Any.fromFunction1(removeBorderResizeListener))
    __obj.asInstanceOf[XControllerBorder]
  }
  @scala.inline
  implicit class XControllerBorderOps[Self <: XControllerBorder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBorder(value: BorderWidths): Self = this.set("Border", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddBorderResizeListener(value: XBorderResizeListener => Unit): Self = this.set("addBorderResizeListener", js.Any.fromFunction1(value))
    @scala.inline
    def setGetBorder(value: () => BorderWidths): Self = this.set("getBorder", js.Any.fromFunction0(value))
    @scala.inline
    def setQueryBorderedArea(value: Rectangle => Rectangle): Self = this.set("queryBorderedArea", js.Any.fromFunction1(value))
    @scala.inline
    def setRemoveBorderResizeListener(value: XBorderResizeListener => Unit): Self = this.set("removeBorderResizeListener", js.Any.fromFunction1(value))
  }
  
}

