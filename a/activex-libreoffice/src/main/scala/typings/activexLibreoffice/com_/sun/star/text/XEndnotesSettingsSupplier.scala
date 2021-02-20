package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to access the {@link FootnoteSettings} within the context (e.g. document). */
@js.native
trait XEndnotesSettingsSupplier extends XInterface {
  
  /** @returns {@link EndnoteSettings} of the object. */
  val EndnotesSettings: XPropertySet = js.native
  
  /** @returns {@link EndnoteSettings} of the object. */
  def getEndnotesSettings(): XPropertySet = js.native
}
object XEndnotesSettingsSupplier {
  
  @scala.inline
  def apply(
    EndnotesSettings: XPropertySet,
    acquire: () => Unit,
    getEndnotesSettings: () => XPropertySet,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XEndnotesSettingsSupplier = {
    val __obj = js.Dynamic.literal(EndnotesSettings = EndnotesSettings.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getEndnotesSettings = js.Any.fromFunction0(getEndnotesSettings), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XEndnotesSettingsSupplier]
  }
  
  @scala.inline
  implicit class XEndnotesSettingsSupplierMutableBuilder[Self <: XEndnotesSettingsSupplier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndnotesSettings(value: XPropertySet): Self = StObject.set(x, "EndnotesSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetEndnotesSettings(value: () => XPropertySet): Self = StObject.set(x, "getEndnotesSettings", js.Any.fromFunction0(value))
  }
}
