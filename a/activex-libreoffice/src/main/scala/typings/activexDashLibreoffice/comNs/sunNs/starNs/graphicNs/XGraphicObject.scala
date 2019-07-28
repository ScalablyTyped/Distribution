package typings.activexDashLibreoffice.comNs.sunNs.starNs.graphicNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * `XGraphicObject` objects represent in-memory image and graphic objects.
  *
  * Such objects are accessible using {@link GraphicObject} scheme URLs like vnd.sun.star.GraphicObject:10000000000001940000012FB99807BD The numeric
  * portion of the url is formed from {@link UniqueID} . As long as at least one instance of `XGraphicObject` with a particular UniqueID exists, the
  * associated image/graphic is available.
  * @see XGraphicObject
  * @see GraphicProvider
  * @see MediaProperties
  */
trait XGraphicObject extends XInterface {
  /** is the associated image/graphic for this object. */
  var Graphic: XGraphic
  /** is the id that can be used to form the `vnd.sun.star.GraphicObject` url to address this object. */
  var UniqueID: String
}

object XGraphicObject {
  @scala.inline
  def apply(
    Graphic: XGraphic,
    UniqueID: String,
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XGraphicObject = {
    val __obj = js.Dynamic.literal(Graphic = Graphic, UniqueID = UniqueID, acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XGraphicObject]
  }
}

