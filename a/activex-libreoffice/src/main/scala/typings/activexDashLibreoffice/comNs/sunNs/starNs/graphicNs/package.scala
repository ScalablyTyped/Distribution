package typings.activexDashLibreoffice.comNs.sunNs.starNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object graphicNs {
  /**
    * Central service of the {@link Graphic} API that gives access to graphics of any kind
    *
    * This service allows to load graphics from and to store graphics to any location. The one and only interface that has to be implemented is the {@link
    * XGraphicProvider} interface, that exposes the necessary methods for loading and storing the graphic contents and descriptors
    * @see XGraphicProvider
    */
  type GraphicProvider = XGraphicProvider
  /**
    * Service that describes the necessary interfaces and properties to convert arbitrary graphic data to a {@link XGraphic} interface containing a pixel
    * graphic, that can be rendered the usual ways.
    */
  type GraphicRasterizer = XGraphicRasterizer
  /** Service that describes the necessary interfaces and properties for tooling involved with {@link XPrimitive2D} interfaces */
  type Primitive2DTools = XPrimitive2DRenderer
  /** @since LibreOffice 4.1 */
  type PrimitiveFactory2D = XPrimitiveFactory2D
  /**
    * Service that describes the necessary interfaces and properties to handle svg files. Parses a svg file to a sequence of B2DPrimitives for internal
    * usage
    */
  type SvgTools = XSvgParser
}
