package typings.activexLibreoffice.com_.sun.star.view

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides access to the view settings of the object. */
@js.native
trait XViewSettingsSupplier extends XInterface {
  
  /** @returns an interface to the {@link ViewSettings} .  Subclasses might be returned instead, offering more settings. */
  val ViewSettings: XPropertySet = js.native
  
  /** @returns an interface to the {@link ViewSettings} .  Subclasses might be returned instead, offering more settings. */
  def getViewSettings(): XPropertySet = js.native
}
object XViewSettingsSupplier {
  
  @scala.inline
  def apply(
    ViewSettings: XPropertySet,
    acquire: () => Unit,
    getViewSettings: () => XPropertySet,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XViewSettingsSupplier = {
    val __obj = js.Dynamic.literal(ViewSettings = ViewSettings.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getViewSettings = js.Any.fromFunction0(getViewSettings), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XViewSettingsSupplier]
  }
  
  @scala.inline
  implicit class XViewSettingsSupplierMutableBuilder[Self <: XViewSettingsSupplier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetViewSettings(value: () => XPropertySet): Self = StObject.set(x, "getViewSettings", js.Any.fromFunction0(value))
    
    @scala.inline
    def setViewSettings(value: XPropertySet): Self = StObject.set(x, "ViewSettings", value.asInstanceOf[js.Any])
  }
}
