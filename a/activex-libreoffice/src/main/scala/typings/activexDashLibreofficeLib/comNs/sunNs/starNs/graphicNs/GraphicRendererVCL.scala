package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.graphicNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Service that describes the necessary interfaces and properties to render a graphic container of {@link XGraphic} type
  *
  * To render a {@link XGraphic} container, just create an instance of this service, set the appropriate properties and use the {@link XGraphicRenderer}
  * interface to initiate the rendering process itself
  */
trait GraphicRendererVCL
  extends XGraphicRenderer
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet {
  /** Specifies the destination rectangle, into which the graphic content is to be rendered onto the device */
  var DestinationRect: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle
  /**
    * Holds the device onto which the {@link XGraphic} container should be rendered
    *
    * In case of using VCL Devices, this property should hold a {@link com.sun.star.awt.XDevice} interface
    */
  var Device: js.Any
  /** Additional properties for rendering, unspecified at the moment */
  var RenderData: js.Any
}

