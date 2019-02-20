package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.graphicNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This service acts as a container for graphics
  *
  * The main interface that has to be implemented for this service is the {@link XGraphic} interface, which itself exposes only a few methods. Beside
  * this, a {@link Graphic} service incorporates the {@link GraphicDescriptor} to give access to the attributes of the graphic.
  * @see XGraphic
  * @see XGraphicTransformer
  * @see GraphicDescriptor
  */
trait Graphic
  extends GraphicDescriptor
     with XGraphic

