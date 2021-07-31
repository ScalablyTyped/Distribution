package typings.activexLibreoffice.com_.sun.star.style

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This interface provides access to an XPropertySet of defaults. This can either be the parent of an XPropertySet or the global property defaults for a
  * document.
  */
trait XDefaultsSupplier
  extends StObject
     with XInterface {
  
  /** This method returns an XPropertySet of defaults. */
  val Defaults: XPropertySet
  
  /** This method returns an XPropertySet of defaults. */
  def getDefaults(): XPropertySet
}
object XDefaultsSupplier {
  
  @scala.inline
  def apply(
    Defaults: XPropertySet,
    acquire: () => Unit,
    getDefaults: () => XPropertySet,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XDefaultsSupplier = {
    val __obj = js.Dynamic.literal(Defaults = Defaults.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getDefaults = js.Any.fromFunction0(getDefaults), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XDefaultsSupplier]
  }
  
  @scala.inline
  implicit class XDefaultsSupplierMutableBuilder[Self <: XDefaultsSupplier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaults(value: XPropertySet): Self = StObject.set(x, "Defaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetDefaults(value: () => XPropertySet): Self = StObject.set(x, "getDefaults", js.Any.fromFunction0(value))
  }
}
