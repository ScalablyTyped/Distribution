package typings.activexLibreoffice.com_.sun.star.style

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** enables the object to import styles from documents. */
trait XStyleLoader
  extends StObject
     with XInterface {
  
  /** @returns a sequence of the supported properties as declared in {@link XStyleLoader.loadStylesFromURL()} with their current values. */
  val StyleLoaderOptions: SafeArray[PropertyValue]
  
  /** @returns a sequence of the supported properties as declared in {@link XStyleLoader.loadStylesFromURL()} with their current values. */
  def getStyleLoaderOptions(): SafeArray[PropertyValue]
  
  /**
    * loads styles from a document at the given URL.
    *
    * If **OverwriteStyles** is `TRUE` , then all styles will be loaded. Otherwise, only styles which are not already defined in this document are loaded.
    * @param URL The directory and the filename from document with the styles
    * @param aOptions Specifies which of the {@link Style} families the method should load. The `sequence<PropertyValue>` has the following, optional items: b
    */
  def loadStylesFromURL(URL: String, aOptions: SeqEquiv[PropertyValue]): Unit
}
object XStyleLoader {
  
  inline def apply(
    StyleLoaderOptions: SafeArray[PropertyValue],
    acquire: () => Unit,
    getStyleLoaderOptions: () => SafeArray[PropertyValue],
    loadStylesFromURL: (String, SeqEquiv[PropertyValue]) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XStyleLoader = {
    val __obj = js.Dynamic.literal(StyleLoaderOptions = StyleLoaderOptions.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getStyleLoaderOptions = js.Any.fromFunction0(getStyleLoaderOptions), loadStylesFromURL = js.Any.fromFunction2(loadStylesFromURL), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XStyleLoader]
  }
  
  extension [Self <: XStyleLoader](x: Self) {
    
    inline def setGetStyleLoaderOptions(value: () => SafeArray[PropertyValue]): Self = StObject.set(x, "getStyleLoaderOptions", js.Any.fromFunction0(value))
    
    inline def setLoadStylesFromURL(value: (String, SeqEquiv[PropertyValue]) => Unit): Self = StObject.set(x, "loadStylesFromURL", js.Any.fromFunction2(value))
    
    inline def setStyleLoaderOptions(value: SafeArray[PropertyValue]): Self = StObject.set(x, "StyleLoaderOptions", value.asInstanceOf[js.Any])
  }
}
