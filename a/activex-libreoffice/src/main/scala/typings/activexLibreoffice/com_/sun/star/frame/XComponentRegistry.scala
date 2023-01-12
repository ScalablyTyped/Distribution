package typings.activexLibreoffice.com_.sun.star.frame

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.Uik
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @deprecated Deprecated */
trait XComponentRegistry
  extends StObject
     with XInterface {
  
  /** @deprecated Deprecated */
  def createObject(URL: String, Uik: Uik): XInterface
}
object XComponentRegistry {
  
  inline def apply(
    acquire: () => Unit,
    createObject: (String, Uik) => XInterface,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XComponentRegistry = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createObject = js.Any.fromFunction2(createObject), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XComponentRegistry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XComponentRegistry] (val x: Self) extends AnyVal {
    
    inline def setCreateObject(value: (String, Uik) => XInterface): Self = StObject.set(x, "createObject", js.Any.fromFunction2(value))
  }
}
