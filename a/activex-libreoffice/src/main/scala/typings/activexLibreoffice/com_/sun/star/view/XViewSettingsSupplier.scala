package typings.activexLibreoffice.com_.sun.star.view

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides access to the view settings of the object. */
trait XViewSettingsSupplier
  extends StObject
     with XInterface {
  
  /** @returns an interface to the {@link ViewSettings} .  Subclasses might be returned instead, offering more settings. */
  val ViewSettings: XPropertySet
  
  /** @returns an interface to the {@link ViewSettings} .  Subclasses might be returned instead, offering more settings. */
  def getViewSettings(): XPropertySet
}
object XViewSettingsSupplier {
  
  inline def apply(
    ViewSettings: XPropertySet,
    acquire: () => Unit,
    getViewSettings: () => XPropertySet,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XViewSettingsSupplier = {
    val __obj = js.Dynamic.literal(ViewSettings = ViewSettings.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getViewSettings = js.Any.fromFunction0(getViewSettings), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XViewSettingsSupplier]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XViewSettingsSupplier] (val x: Self) extends AnyVal {
    
    inline def setGetViewSettings(value: () => XPropertySet): Self = StObject.set(x, "getViewSettings", js.Any.fromFunction0(value))
    
    inline def setViewSettings(value: XPropertySet): Self = StObject.set(x, "ViewSettings", value.asInstanceOf[js.Any])
  }
}
