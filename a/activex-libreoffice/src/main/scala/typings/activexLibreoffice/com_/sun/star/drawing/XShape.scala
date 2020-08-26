package typings.activexLibreoffice.com_.sun.star.drawing

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.Point
import typings.activexLibreoffice.com_.sun.star.awt.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** lets you do a basic transformation on a {@link Shape} and get its type. */
@js.native
trait XShape extends XShapeDescriptor {
  /**
    * gets the current position of this object.
    * @returns the position of the top left edge in 100/th mm
    */
  var Position: Point = js.native
  /**
    * gets the size of this object.
    * @returns the size in 100/th mm
    */
  var Size: typings.activexLibreoffice.com_.sun.star.awt.Size = js.native
  /**
    * gets the current position of this object.
    * @returns the position of the top left edge in 100/th mm
    */
  def getPosition(): Point = js.native
  /**
    * gets the size of this object.
    * @returns the size in 100/th mm
    */
  def getSize(): Size = js.native
  /**
    * sets the current position of this object
    * @param aPosition the position of the top left edge in 100/th mm
    */
  def setPosition(aPosition: Point): Unit = js.native
  /**
    * sets the size of this object.
    * @param aSize the size in 100/th mm
    */
  def setSize(aSize: Size): Unit = js.native
}

object XShape {
  @scala.inline
  def apply(
    Position: Point,
    ShapeType: String,
    Size: Size,
    acquire: () => Unit,
    getPosition: () => Point,
    getShapeType: () => String,
    getSize: () => Size,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setPosition: Point => Unit,
    setSize: Size => Unit
  ): XShape = {
    val __obj = js.Dynamic.literal(Position = Position.asInstanceOf[js.Any], ShapeType = ShapeType.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getPosition = js.Any.fromFunction0(getPosition), getShapeType = js.Any.fromFunction0(getShapeType), getSize = js.Any.fromFunction0(getSize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setPosition = js.Any.fromFunction1(setPosition), setSize = js.Any.fromFunction1(setSize))
    __obj.asInstanceOf[XShape]
  }
  @scala.inline
  implicit class XShapeOps[Self <: XShape] (val x: Self) extends AnyVal {
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
    def setPosition(value: Point): Self = this.set("Position", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Size): Self = this.set("Size", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetPosition(value: () => Point): Self = this.set("getPosition", js.Any.fromFunction0(value))
    @scala.inline
    def setGetSize(value: () => Size): Self = this.set("getSize", js.Any.fromFunction0(value))
    @scala.inline
    def setSetPosition(value: Point => Unit): Self = this.set("setPosition", js.Any.fromFunction1(value))
    @scala.inline
    def setSetSize(value: Size => Unit): Self = this.set("setSize", js.Any.fromFunction1(value))
  }
  
}

