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
@js.native
trait GraphicObject extends XGraphicObject {
  /** Creates an {@link GraphicObject} */
  def create(): Unit = js.native
  /**
    * Creates an {@link GraphicObject} with `uniqueId`
    * @param uniqueId If another {@link XGraphicObject} with `uniqueId` exists, this {@link GraphicObject} is populated with the other {@link GraphicObject} '
    */
  def createWithId(uniqueId: String): Unit = js.native
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
  @scala.inline
  implicit class GraphicObjectOps[Self <: GraphicObject] (val x: Self) extends AnyVal {
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
    def setCreate(value: () => Unit): Self = this.set("create", js.Any.fromFunction0(value))
    @scala.inline
    def setCreateWithId(value: String => Unit): Self = this.set("createWithId", js.Any.fromFunction1(value))
  }
  
}

