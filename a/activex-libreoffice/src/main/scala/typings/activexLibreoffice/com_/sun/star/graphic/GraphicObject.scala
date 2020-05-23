package typings.activexLibreoffice.com_.sun.star.graphic

import typings.activexLibreoffice.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The `GraphicObject` service can be used to create {@link XGraphicObject} instances.
  *
  * {@link XGraphicObject} objects are accessible using {@link GraphicObject} scheme URLs like
  * `vnd.sun.star.GraphicObject:10000000000001940000012FB99807BD` . As long as at least one instance of {@link XGraphicObject} with a particular UniqueID
  * exists, the associated image/graphic is available.
  * @see GraphicObject
  * @see GraphicProvider
  * @see MediaProperties
  */
trait GraphicObject extends XGraphicObject {
  /** Creates an {@link GraphicObject} */
  def create(): Unit
  /**
    * Creates an {@link GraphicObject} with `uniqueId`
    * @param uniqueId If another {@link XGraphicObject} with `uniqueId` exists, this {@link GraphicObject} is populated with the other {@link GraphicObject} '
    */
  def createWithId(uniqueId: String): Unit
}

object GraphicObject {
  @scala.inline
  def apply(
    Graphic: XGraphic,
    UniqueID: String,
    acquire: () => Unit,
    create: () => Unit,
    createWithId: String => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): GraphicObject = {
    val __obj = js.Dynamic.literal(Graphic = Graphic.asInstanceOf[js.Any], UniqueID = UniqueID.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), create = js.Any.fromFunction0(create), createWithId = js.Any.fromFunction1(createWithId), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[GraphicObject]
  }
}

