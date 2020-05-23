package typings.activexLibreoffice.com_.sun.star.drawing

import typings.activexLibreoffice.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @deprecated Deprecated */
trait XUniversalShapeDescriptor extends XShapeDescriptor {
  def setShapeType(aShapeTypeName: String): Unit
}

object XUniversalShapeDescriptor {
  @scala.inline
  def apply(
    ShapeType: String,
    acquire: () => Unit,
    getShapeType: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setShapeType: String => Unit
  ): XUniversalShapeDescriptor = {
    val __obj = js.Dynamic.literal(ShapeType = ShapeType.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getShapeType = js.Any.fromFunction0(getShapeType), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setShapeType = js.Any.fromFunction1(setShapeType))
    __obj.asInstanceOf[XUniversalShapeDescriptor]
  }
}

