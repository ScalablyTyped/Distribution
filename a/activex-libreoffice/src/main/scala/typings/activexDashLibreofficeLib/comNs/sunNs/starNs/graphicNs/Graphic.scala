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
    getType: js.Function0[scala.Double],
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
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit]
  ): Graphic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Alpha")(Alpha)
    __obj.updateDynamic("Animated")(Animated)
    __obj.updateDynamic("BitsPerPixel")(BitsPerPixel)
    __obj.updateDynamic("GraphicType")(GraphicType)
    __obj.updateDynamic("MimeType")(MimeType)
    __obj.updateDynamic("PropertySetInfo")(PropertySetInfo)
    __obj.updateDynamic("Size100thMM")(Size100thMM)
    __obj.updateDynamic("SizePixel")(SizePixel)
    __obj.updateDynamic("Transparent")(Transparent)
    __obj.updateDynamic("Type")(Type)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addPropertyChangeListener")(addPropertyChangeListener)
    __obj.updateDynamic("addVetoableChangeListener")(addVetoableChangeListener)
    __obj.updateDynamic("getPropertySetInfo")(getPropertySetInfo)
    __obj.updateDynamic("getPropertyValue")(getPropertyValue)
    __obj.updateDynamic("getType")(getType)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removePropertyChangeListener")(removePropertyChangeListener)
    __obj.updateDynamic("removeVetoableChangeListener")(removeVetoableChangeListener)
    __obj.updateDynamic("setPropertyValue")(setPropertyValue)
    __obj.asInstanceOf[Graphic]
  }
}

