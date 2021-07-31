package typings.activexLibreoffice.com_.sun.star.reflection

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XAggregation
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Factory interface to produce proxy objects.
  * @deprecated DeprecatedAggregation will no longer be supported as a high-level concept of UNO. You may still have the option to implement an UNO object consis
  */
trait XProxyFactory
  extends StObject
     with XInterface {
  
  /**
    * This method creates a new proxy object that acts on behalf of the given target object. ;  The proxy delegates calls to the given target object. In
    * addition, it is aggregatable, thus it is possible to intercept calls on the proxy's interfaces.
    * @param xTarget target object
    * @returns proxy object
    */
  def createProxy(xTarget: XInterface): XAggregation
}
object XProxyFactory {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    createProxy: XInterface => XAggregation,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XProxyFactory = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createProxy = js.Any.fromFunction1(createProxy), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XProxyFactory]
  }
  
  @scala.inline
  implicit class XProxyFactoryMutableBuilder[Self <: XProxyFactory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateProxy(value: XInterface => XAggregation): Self = StObject.set(x, "createProxy", js.Any.fromFunction1(value))
  }
}
