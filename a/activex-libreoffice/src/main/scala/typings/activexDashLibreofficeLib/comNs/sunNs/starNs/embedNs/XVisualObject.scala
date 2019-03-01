package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** represents common visualization functionality for embedded objects. */
trait XVisualObject
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * retrieves map mode the object communicates in.
    * @param nAspect the aspect the map mode is requested for. Can take values from {@link Aspects} constant set.
    * @returns the map mode the object communicates in, it can take values from {@link EmbedMapUnits} constant
    * @throws com::sun::star::embed::WrongStateException the object is in wrong state
    * @throws com::sun::star::uno::Exception in case of problems
    */
  def getMapUnit(nAspect: scala.Double): scala.Double
  /**
    * retrieves visual representation of the object in preferable format.
    *
    * If the object persistence entry contains cached visual representation then it can be retrieved by using this method even in loaded state.
    * @param nAspect the aspect the representation is requested for. Can take values from {@link Aspects} constant set.
    * @returns the visual representation of the object in the default format and the format
    * @throws com::sun::star::lang::IllegalArgumentException one of arguments is illegal
    * @throws com::sun::star::embed::WrongStateException the object is in wrong state
    * @throws com::sun::star::uno::Exception in case of problems
    */
  def getPreferredVisualRepresentation(nAspect: scala.Double): VisualRepresentation
  /**
    * gets the size of object's visual area.
    *
    * The size must be provided in logical units according to map mode the object communicates in.
    * @param nAspect the aspect specifying the form of object representation. Can take values from {@link Aspects} constant set.
    * @returns the size of visual area
    * @throws com::sun::star::lang::IllegalArgumentException one of arguments is illegal
    * @throws com::sun::star::embed::WrongStateException the object is in wrong state
    */
  def getVisualAreaSize(nAspect: scala.Double): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size
  /**
    * sets the size of object's visual area.
    *
    * The size must be provided in logical units according to map mode the object communicates in.
    *
    * If an object is inplace- or ui-active the method must not initiate repainting itself.
    * @param nAspect the aspect specifying the form of object representation. Can take values from {@link Aspects} constant set.
    * @param aSize the new size of the visual area
    * @throws com::sun::star::lang::IllegalArgumentException one of arguments is illegal
    * @throws com::sun::star::embed::WrongStateException the object is in wrong state
    * @throws com::sun::star::uno::Exception the object failed to resize
    */
  def setVisualAreaSize(nAspect: scala.Double, aSize: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size): scala.Unit
}

object XVisualObject {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    getMapUnit: js.Function1[scala.Double, scala.Double],
    getPreferredVisualRepresentation: js.Function1[scala.Double, VisualRepresentation],
    getVisualAreaSize: js.Function1[scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setVisualAreaSize: js.Function2[scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size, scala.Unit]
  ): XVisualObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getMapUnit")(getMapUnit)
    __obj.updateDynamic("getPreferredVisualRepresentation")(getPreferredVisualRepresentation)
    __obj.updateDynamic("getVisualAreaSize")(getVisualAreaSize)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("setVisualAreaSize")(setVisualAreaSize)
    __obj.asInstanceOf[XVisualObject]
  }
}

