package typings.activexDashLibreoffice.comNs.sunNs.starNs.graphicNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.Size
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XVetoableChangeListener
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

object Graphic {
  @scala.inline
  def apply(
    Alpha: Boolean,
    Animated: Boolean,
    BitsPerPixel: Double,
    GraphicType: Double,
    MimeType: String,
    PropertySetInfo: XPropertySetInfo,
    Size100thMM: Size,
    SizePixel: Size,
    Transparent: Boolean,
    Type: Double,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    getType: () => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): Graphic = {
    val __obj = js.Dynamic.literal(Alpha = Alpha, Animated = Animated, BitsPerPixel = BitsPerPixel, GraphicType = GraphicType, MimeType = MimeType, PropertySetInfo = PropertySetInfo, Size100thMM = Size100thMM, SizePixel = SizePixel, Transparent = Transparent, Type = Type, acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getType = js.Any.fromFunction0(getType), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
  
    __obj.asInstanceOf[Graphic]
  }
}

