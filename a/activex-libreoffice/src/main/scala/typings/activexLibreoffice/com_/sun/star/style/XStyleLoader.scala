package typings.activexLibreoffice.com_.sun.star.style

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** enables the object to import styles from documents. */
@js.native
trait XStyleLoader extends XInterface {
  
  /** @returns a sequence of the supported properties as declared in {@link XStyleLoader.loadStylesFromURL()} with their current values. */
  val StyleLoaderOptions: SafeArray[PropertyValue] = js.native
  
  /** @returns a sequence of the supported properties as declared in {@link XStyleLoader.loadStylesFromURL()} with their current values. */
  def getStyleLoaderOptions(): SafeArray[PropertyValue] = js.native
  
  /**
    * loads styles from a document at the given URL.
    *
    * If **OverwriteStyles** is `TRUE` , then all styles will be loaded. Otherwise, only styles which are not already defined in this document are loaded.
    * @param URL The directory and the filename from document with the styles
    * @param aOptions Specifies which of the {@link Style} families the method should load. The `sequence<PropertyValue>` has the following, optional items: b
    */
  def loadStylesFromURL(URL: String, aOptions: SeqEquiv[PropertyValue]): Unit = js.native
}
object XStyleLoader {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class XStyleLoaderOps[Self <: XStyleLoader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setStyleLoaderOptions(value: SafeArray[PropertyValue]): Self = this.set("StyleLoaderOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetStyleLoaderOptions(value: () => SafeArray[PropertyValue]): Self = this.set("getStyleLoaderOptions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLoadStylesFromURL(value: (String, SeqEquiv[PropertyValue]) => Unit): Self = this.set("loadStylesFromURL", js.Any.fromFunction2(value))
  }
}
