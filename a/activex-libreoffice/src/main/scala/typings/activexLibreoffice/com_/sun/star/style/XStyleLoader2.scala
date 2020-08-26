package typings.activexLibreoffice.com_.sun.star.style

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.lang.XComponent
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * extends {@link XStyleLoader} interface to import styles from an already opened component.
  * @see com.sun.star.style.XStyleLoader
  * @since LibreOffice 4.4
  */
@js.native
trait XStyleLoader2 extends XStyleLoader {
  /**
    * loads styles from a given document
    * @param aSourceComponent a valid XComponent reference to source document
    * @param aOptions Specifies which of the {@link Style} families the method should load. The `sequence<PropertyValue>` has the following, optional items: b
    */
  def loadStylesFromDocument(aSourceComponent: XComponent, aOptions: SeqEquiv[PropertyValue]): Unit = js.native
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
    val __obj = js.Dynamic.literal(StyleLoaderOptions = StyleLoaderOptions.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getStyleLoaderOptions = js.Any.fromFunction0(getStyleLoaderOptions), loadStylesFromDocument = js.Any.fromFunction2(loadStylesFromDocument), loadStylesFromURL = js.Any.fromFunction2(loadStylesFromURL), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XStyleLoader2]
  }
  @scala.inline
  implicit class XStyleLoader2Ops[Self <: XStyleLoader2] (val x: Self) extends AnyVal {
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
    def setLoadStylesFromDocument(value: (XComponent, SeqEquiv[PropertyValue]) => Unit): Self = this.set("loadStylesFromDocument", js.Any.fromFunction2(value))
  }
  
}

