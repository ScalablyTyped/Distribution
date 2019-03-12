package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.graphicNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface acts as the main interface to handle graphic content. It is used to load graphics, store graphics and to get information about unloaded
  * graphics
  */
trait XGraphicProvider
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Calling this method returns a {@link XGraphic} interface that holds the graphic content after loading the graphic
    * @param MediaProperties A sequence of property values to describe the location of the graphic from which the graphic is to be loaded
    * @returns The {@link XGraphic} interface
    * @see MediaProperties
    * @see XGraphic
    * @see com.sun.star.beans.PropertyValues
    */
  def queryGraphic(MediaProperties: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues): XGraphic
  /**
    * Calling this method returns a {@link com.sun.star.beans.XPropertySet} interface that gives access to the properties of the unloaded graphic
    *
    * In most cases, this method will be used to query the mime type of the graphic and, in the case of pixel graphics, the resulting size after loading
    * @param MediaProperties A sequence of property values to describe the location of the graphic, for which the attributes should be returned
    * @returns A {@link com.sun.star.beans.XPropertySet} interface to get access to the different graphic properties
    * @see MediaProperties
    * @see GraphicDescriptor
    * @see com.sun.star.beans.PropertyValues
    */
  def queryGraphicDescriptor(MediaProperties: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues): activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
  /**
    * Store the graphic content, represented through the {@link XGraphic} interface at the specified location
    * @param Graphic The graphic that should be stored
    * @param MediaProperties A sequence of property values to describe the destination location of the graphic
    * @see XGraphic
    * @see MediaProperties
    * @see com.sun.star.beans.PropertyValues
    */
  def storeGraphic(
    Graphic: XGraphic,
    MediaProperties: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues
  ): scala.Unit
}

object XGraphicProvider {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    queryGraphic: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues => XGraphic,
    queryGraphicDescriptor: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    storeGraphic: (XGraphic, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues) => scala.Unit
  ): XGraphicProvider = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryGraphic = js.Any.fromFunction1(queryGraphic), queryGraphicDescriptor = js.Any.fromFunction1(queryGraphicDescriptor), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), storeGraphic = js.Any.fromFunction2(storeGraphic))
  
    __obj.asInstanceOf[XGraphicProvider]
  }
}

