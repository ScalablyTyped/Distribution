package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** enables the object to import styles from documents. */
trait XStyleLoader
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** @returns a sequence of the supported properties as declared in {@link XStyleLoader.loadStylesFromURL()} with their current values. */
  val StyleLoaderOptions: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  /** @returns a sequence of the supported properties as declared in {@link XStyleLoader.loadStylesFromURL()} with their current values. */
  def getStyleLoaderOptions(): activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  /**
    * loads styles from a document at the given URL.
    *
    * If **OverwriteStyles** is `TRUE` , then all styles will be loaded. Otherwise, only styles which are not already defined in this document are loaded.
    * @param URL The directory and the filename from document with the styles
    * @param aOptions Specifies which of the {@link Style} families the method should load. The `sequence<PropertyValue>` has the following, optional items: b
    */
  def loadStylesFromURL(
    URL: java.lang.String,
    aOptions: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  ): scala.Unit
}

object XStyleLoader {
  @scala.inline
  def apply(
    StyleLoaderOptions: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    acquire: js.Function0[scala.Unit],
    getStyleLoaderOptions: js.Function0[
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
    ],
    loadStylesFromURL: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      scala.Unit
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XStyleLoader = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("StyleLoaderOptions")(StyleLoaderOptions)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getStyleLoaderOptions")(getStyleLoaderOptions)
    __obj.updateDynamic("loadStylesFromURL")(loadStylesFromURL)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XStyleLoader]
  }
}

