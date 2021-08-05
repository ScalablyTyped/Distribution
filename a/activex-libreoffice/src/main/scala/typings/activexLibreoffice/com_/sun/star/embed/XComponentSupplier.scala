package typings.activexLibreoffice.com_.sun.star.embed

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.activexLibreoffice.com_.sun.star.util.XCloseable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides access to a component. */
trait XComponentSupplier
  extends StObject
     with XInterface {
  
  /**
    * allows to get access to a component.
    *
    * The component may not support {@link com.sun.star.lang.XComponent} interface.
    * @returns component representation
    */
  val Component: XCloseable
  
  /**
    * allows to get access to a component.
    *
    * The component may not support {@link com.sun.star.lang.XComponent} interface.
    * @returns component representation
    */
  def getComponent(): XCloseable
}
object XComponentSupplier {
  
  inline def apply(
    Component: XCloseable,
    acquire: () => Unit,
    getComponent: () => XCloseable,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XComponentSupplier = {
    val __obj = js.Dynamic.literal(Component = Component.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getComponent = js.Any.fromFunction0(getComponent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XComponentSupplier]
  }
  
  extension [Self <: XComponentSupplier](x: Self) {
    
    inline def setComponent(value: XCloseable): Self = StObject.set(x, "Component", value.asInstanceOf[js.Any])
    
    inline def setGetComponent(value: () => XCloseable): Self = StObject.set(x, "getComponent", js.Any.fromFunction0(value))
  }
}
