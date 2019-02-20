package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.graphicNs

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
trait XGraphicObject
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** is the associated image/graphic for this object. */
  var Graphic: XGraphic
  /** is the id that can be used to form the `vnd.sun.star.GraphicObject` url to address this object. */
  var UniqueID: java.lang.String
}

