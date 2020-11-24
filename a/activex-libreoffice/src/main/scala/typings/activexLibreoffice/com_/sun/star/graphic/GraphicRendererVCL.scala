package typings.activexLibreoffice.com_.sun.star.graphic

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.Rectangle
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Service that describes the necessary interfaces and properties to render a graphic container of {@link XGraphic} type
  *
  * To render a {@link XGraphic} container, just create an instance of this service, set the appropriate properties and use the {@link XGraphicRenderer}
  * interface to initiate the rendering process itself
  */
@js.native
trait GraphicRendererVCL
  extends XGraphicRenderer
     with XPropertySet {
  
  /** Specifies the destination rectangle, into which the graphic content is to be rendered onto the device */
  var DestinationRect: Rectangle = js.native
  
  /**
    * Holds the device onto which the {@link XGraphic} container should be rendered
    *
    * In case of using VCL Devices, this property should hold a {@link com.sun.star.awt.XDevice} interface
    */
  var Device: js.Any = js.native
  
  /** Additional properties for rendering, unspecified at the moment */
  var RenderData: js.Any = js.native
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
    val __obj = js.Dynamic.literal(DestinationRect = DestinationRect.asInstanceOf[js.Any], Device = Device.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], RenderData = RenderData.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), render = js.Any.fromFunction1(render), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[GraphicRendererVCL]
  }
  
  @scala.inline
  implicit class GraphicRendererVCLOps[Self <: GraphicRendererVCL] (val x: Self) extends AnyVal {
    
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
    def setDestinationRect(value: Rectangle): Self = this.set("DestinationRect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevice(value: js.Any): Self = this.set("Device", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderData(value: js.Any): Self = this.set("RenderData", value.asInstanceOf[js.Any])
  }
}
