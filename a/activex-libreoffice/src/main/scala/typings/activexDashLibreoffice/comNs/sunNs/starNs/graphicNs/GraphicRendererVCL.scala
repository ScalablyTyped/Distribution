package typings.activexDashLibreoffice.comNs.sunNs.starNs.graphicNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.Rectangle
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XVetoableChangeListener
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
     with XPropertySet {
  /** Specifies the destination rectangle, into which the graphic content is to be rendered onto the device */
  var DestinationRect: Rectangle
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
    DestinationRect: Rectangle,
    Device: js.Any,
    PropertySetInfo: XPropertySetInfo,
    RenderData: js.Any,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    render: XGraphic => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): GraphicRendererVCL = {
    val __obj = js.Dynamic.literal(DestinationRect = DestinationRect, Device = Device, PropertySetInfo = PropertySetInfo, RenderData = RenderData, acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), render = js.Any.fromFunction1(render), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
  
    __obj.asInstanceOf[GraphicRendererVCL]
  }
}

