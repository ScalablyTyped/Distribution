package typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyValue
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XComponent
import typings.std.SafeArray
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
  def loadStylesFromDocument(aSourceComponent: XComponent, aOptions: SeqEquiv[PropertyValue]): Unit
}

object XStyleLoader2 {
  @scala.inline
  def apply(
    StyleLoaderOptions: SafeArray[PropertyValue],
    acquire: () => Unit,
    getStyleLoaderOptions: () => SafeArray[PropertyValue],
    loadStylesFromDocument: (XComponent, SeqEquiv[PropertyValue]) => Unit,
    loadStylesFromURL: (String, SeqEquiv[PropertyValue]) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XStyleLoader2 = {
    val __obj = js.Dynamic.literal(StyleLoaderOptions = StyleLoaderOptions, acquire = js.Any.fromFunction0(acquire), getStyleLoaderOptions = js.Any.fromFunction0(getStyleLoaderOptions), loadStylesFromDocument = js.Any.fromFunction2(loadStylesFromDocument), loadStylesFromURL = js.Any.fromFunction2(loadStylesFromURL), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XStyleLoader2]
  }
}

