package typings.activexLibreoffice.com_.sun.star.frame

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * can be used to overrule identification of office modules.
  *
  * Normally an office module will be identified by its service name in combination with a set of configuration data. But sometimes whole existing office
  * modules will be used as black box components to implement a different office module on top of it. Patching a service name is not possible. So this
  * optional interface can be used to overwrite identification of a module.
  * @see XModuleManager
  * @since OOo 2.3
  */
trait XModule
  extends StObject
     with XInterface {
  
  /** @returns the module identifier. */
  var Identifier: String
  
  /** @returns the module identifier. */
  def getIdentifier(): String
  
  /** @param Identifier a new "name" for this module. */
  def setIdentifier(Identifier: String): Unit
}
object XModule {
  
  inline def apply(
    Identifier: String,
    acquire: () => Unit,
    getIdentifier: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setIdentifier: String => Unit
  ): XModule = {
    val __obj = js.Dynamic.literal(Identifier = Identifier.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getIdentifier = js.Any.fromFunction0(getIdentifier), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setIdentifier = js.Any.fromFunction1(setIdentifier))
    __obj.asInstanceOf[XModule]
  }
  
  extension [Self <: XModule](x: Self) {
    
    inline def setGetIdentifier(value: () => String): Self = StObject.set(x, "getIdentifier", js.Any.fromFunction0(value))
    
    inline def setIdentifier(value: String): Self = StObject.set(x, "Identifier", value.asInstanceOf[js.Any])
    
    inline def setSetIdentifier(value: String => Unit): Self = StObject.set(x, "setIdentifier", js.Any.fromFunction1(value))
  }
}
