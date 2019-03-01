package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** extends {@link XStorable} . */
trait XStorable2 extends XStorable {
  /**
    * stores the data to the URL from which it was loaded.
    *
    * Only objects which know their locations can be stored.
    *
    * This is an extension of the {@link XStorable.store()} . This method allows to specify some additional parameters for storing process.
    * @param lArguments optional parameters for saving, can take values from subset of {@link com.sun.star.document.MediaDescriptor}
    * @see XStorable.store
    * @throws com::sun::star::lang::IllegalArgumentException the optional parameters contain unacceptable for save entry
    * @throws com::sun::star::io::IOException if an IO error occurred during save operation
    */
  def storeSelf(
    lArguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  ): scala.Unit
}

object XStorable2 {
  @scala.inline
  def apply(
    Location: java.lang.String,
    acquire: js.Function0[scala.Unit],
    getLocation: js.Function0[java.lang.String],
    hasLocation: js.Function0[scala.Boolean],
    isReadonly: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    store: js.Function0[scala.Unit],
    storeAsURL: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      scala.Unit
    ],
    storeSelf: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      scala.Unit
    ],
    storeToURL: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      scala.Unit
    ]
  ): XStorable2 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Location")(Location)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getLocation")(getLocation)
    __obj.updateDynamic("hasLocation")(hasLocation)
    __obj.updateDynamic("isReadonly")(isReadonly)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("store")(store)
    __obj.updateDynamic("storeAsURL")(storeAsURL)
    __obj.updateDynamic("storeSelf")(storeSelf)
    __obj.updateDynamic("storeToURL")(storeToURL)
    __obj.asInstanceOf[XStorable2]
  }
}

