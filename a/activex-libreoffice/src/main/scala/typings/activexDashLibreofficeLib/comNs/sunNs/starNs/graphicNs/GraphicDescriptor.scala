package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.graphicNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This service describes all graphic properties that are available via the {@link com.sun.star.beans.XPropertySet} interface
  * @see XPropertySet
  */
trait GraphicDescriptor
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet {
  /**
    * Indicates that it is a pixel graphic with an alpha channel
    *
    * The status of this flag is not always clear if the graphic was not loaded at all, e.g. in case of just querying for the {@link GraphicDescriptor}
    */
  var Alpha: scala.Boolean
  /**
    * Indicates that it is a graphic that consists of several frames that can be played as an animation
    *
    * The status of this flag is not always clear if the graphic was not loaded at all, e.g. in case of just querying for the {@link GraphicDescriptor}
    */
  var Animated: scala.Boolean
  /**
    * The number of bits per pixel used for the pixel graphic
    *
    * This property is not available for vector graphics and may not be available for some kinds of pixel graphics
    */
  var BitsPerPixel: scala.Double
  /**
    * The type of the graphic
    * @see GraphicType
    */
  var GraphicType: scala.Double
  /**
    * The MimeType of the loaded graphic
    *
    * The mime can be the original mime type of the graphic source the graphic container was constructed from or it can be the internal mime type
    * image/x-vclgraphic, in which case the original mime type is not available anymore
    *
    * Currently, the following mime types are supported for loaded graphics:
    *
    * erimage/x-targaimage/x-photoshopimage/x-epsimage/x-dxfimage/x-metimage/x-pictimage/x-sgfimage/x-svmimage/x-wmfimage/x-sgvimage/x-emfimage/x-vclgraphic
    */
  var MimeType: java.lang.String
  /**
    * The Size of the graphic in 100th mm.
    *
    * This property may not be available in case of pixel graphics or if the logical size can not be determined correctly for some formats without loading
    * the whole graphic
    */
  var Size100thMM: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size
  /**
    * The Size of the graphic in pixel.
    *
    * This property may not be available in case of vector graphics or if the pixel size can not be determined correctly for some formats without loading
    * the whole graphic
    */
  var SizePixel: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size
  /**
    * Indicates that it is a transparent graphic
    *
    * This property is always `TRUE` for vector graphics. The status of this flag is not always clear if the graphic was not loaded at all, e.g. in case of
    * just querying for the {@link GraphicDescriptor} .
    */
  var Transparent: scala.Boolean
}

object GraphicDescriptor {
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
    acquire: () => scala.Unit,
    addPropertyChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener) => scala.Unit,
    addVetoableChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener) => scala.Unit,
    getPropertySetInfo: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    getPropertyValue: java.lang.String => js.Any,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removePropertyChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener) => scala.Unit,
    removeVetoableChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener) => scala.Unit,
    setPropertyValue: (java.lang.String, js.Any) => scala.Unit
  ): GraphicDescriptor = {
    val __obj = js.Dynamic.literal(Alpha = Alpha, Animated = Animated, BitsPerPixel = BitsPerPixel, GraphicType = GraphicType, MimeType = MimeType, PropertySetInfo = PropertySetInfo, Size100thMM = Size100thMM, SizePixel = SizePixel, Transparent = Transparent, acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
  
    __obj.asInstanceOf[GraphicDescriptor]
  }
}

