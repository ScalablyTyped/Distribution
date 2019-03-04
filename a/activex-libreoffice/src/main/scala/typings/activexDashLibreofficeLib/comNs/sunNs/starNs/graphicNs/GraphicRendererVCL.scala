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

object GraphicRendererVCL {
  @scala.inline
  def apply(
    DestinationRect: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle,
    Device: js.Any,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    RenderData: js.Any,
    acquire: js.Function0[scala.Unit],
    addPropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    addVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removePropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    removeVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    render: js.Function1[XGraphic, scala.Unit],
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit]
  ): GraphicRendererVCL = {
    val __obj = js.Dynamic.literal(DestinationRect = DestinationRect, Device = Device, PropertySetInfo = PropertySetInfo, RenderData = RenderData, acquire = acquire, addPropertyChangeListener = addPropertyChangeListener, addVetoableChangeListener = addVetoableChangeListener, getPropertySetInfo = getPropertySetInfo, getPropertyValue = getPropertyValue, queryInterface = queryInterface, release = release, removePropertyChangeListener = removePropertyChangeListener, removeVetoableChangeListener = removeVetoableChangeListener, render = render, setPropertyValue = setPropertyValue)
  
    __obj.asInstanceOf[GraphicRendererVCL]
  }
}

