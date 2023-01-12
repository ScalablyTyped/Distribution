package typings.activexLibreoffice.com_.sun.star.reflection

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Deprecated interface. Do not use anymore.
  * @deprecated Deprecated
  */
trait XIdlClassProvider
  extends StObject
     with XInterface {
  
  val IdlClasses: SafeArray[XIdlClass[Any]]
  
  def getIdlClasses(): SafeArray[XIdlClass[Any]]
}
object XIdlClassProvider {
  
  inline def apply(
    IdlClasses: SafeArray[XIdlClass[Any]],
    acquire: () => Unit,
    getIdlClasses: () => SafeArray[XIdlClass[Any]],
    queryInterface: `type` => Any,
    release: () => Unit
  ): XIdlClassProvider = {
    val __obj = js.Dynamic.literal(IdlClasses = IdlClasses.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getIdlClasses = js.Any.fromFunction0(getIdlClasses), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XIdlClassProvider]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XIdlClassProvider] (val x: Self) extends AnyVal {
    
    inline def setGetIdlClasses(value: () => SafeArray[XIdlClass[Any]]): Self = StObject.set(x, "getIdlClasses", js.Any.fromFunction0(value))
    
    inline def setIdlClasses(value: SafeArray[XIdlClass[Any]]): Self = StObject.set(x, "IdlClasses", value.asInstanceOf[js.Any])
  }
}
