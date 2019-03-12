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

object Graphic {
  @scala.inline
  def apply(
    Alpha: scala.Boolean,
    Animated: scala.Boolean,
    BitsPerPixel: scala.Double,
    GraphicType: scala.Double,
    MimeType: java.lang.String,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    Size100thMM: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size,
    SizePixel: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size,
    Transparent: scala.Boolean,
    Type: scala.Double,
    acquire: () => scala.Unit,
    addPropertyChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener) => scala.Unit,
    addVetoableChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener) => scala.Unit,
    getPropertySetInfo: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    getPropertyValue: java.lang.String => js.Any,
    getType: () => scala.Double,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removePropertyChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener) => scala.Unit,
    removeVetoableChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener) => scala.Unit,
    setPropertyValue: (java.lang.String, js.Any) => scala.Unit
  ): Graphic = {
    val __obj = js.Dynamic.literal(Alpha = Alpha, Animated = Animated, BitsPerPixel = BitsPerPixel, GraphicType = GraphicType, MimeType = MimeType, PropertySetInfo = PropertySetInfo, Size100thMM = Size100thMM, SizePixel = SizePixel, Transparent = Transparent, Type = Type, acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getType = js.Any.fromFunction0(getType), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
  
    __obj.asInstanceOf[Graphic]
  }
}

