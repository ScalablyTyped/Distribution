package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * extends {@link XStyleLoader} interface to import styles from an already opened component.
  * @see com.sun.star.style.XStyleLoader
  * @since LibreOffice 4.4
  */
trait XStyleLoader2 extends XStyleLoader {
  /**
    * loads styles from a given document
    * @param aSourceComponent a valid XComponent reference to source document
    * @param aOptions Specifies which of the {@link Style} families the method should load. The `sequence<PropertyValue>` has the following, optional items: b
    */
  def loadStylesFromDocument(
    aSourceComponent: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent,
    aOptions: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  ): scala.Unit
}

object XStyleLoader2 {
  @scala.inline
  def apply(
    StyleLoaderOptions: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    acquire: js.Function0[scala.Unit],
    getStyleLoaderOptions: js.Function0[
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
    ],
    loadStylesFromDocument: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      scala.Unit
    ],
    loadStylesFromURL: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      scala.Unit
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XStyleLoader2 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("StyleLoaderOptions")(StyleLoaderOptions)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getStyleLoaderOptions")(getStyleLoaderOptions)
    __obj.updateDynamic("loadStylesFromDocument")(loadStylesFromDocument)
    __obj.updateDynamic("loadStylesFromURL")(loadStylesFromURL)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XStyleLoader2]
  }
}

