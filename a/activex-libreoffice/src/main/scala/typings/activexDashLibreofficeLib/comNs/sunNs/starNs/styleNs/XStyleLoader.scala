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

