package typings.activexLibreoffice.com_.sun.star.script

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface to create adapter objects giving a type to be supported and a an invocation interface incoming calls are delegated to.
  *
  * This interface is deprecated. Use {@link XInvocationAdapterFactory2} .
  * @deprecated Deprecated
  */
trait XInvocationAdapterFactory
  extends StObject
     with XInterface {
  
  /**
    * Creates an adapter interface of given type for calling the given {@link XInvocation} interface.
    * @param Invocation invocation interface being called on incoming adapter calls
    * @param aType supported type of adapter
    * @returns adapter interface; this interface can be queried for XInterface and given type
    */
  def createAdapter(Invocation: XInvocation, aType: `type`): XInterface
}
object XInvocationAdapterFactory {
  
  inline def apply(
    acquire: () => Unit,
    createAdapter: (XInvocation, `type`) => XInterface,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XInvocationAdapterFactory = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createAdapter = js.Any.fromFunction2(createAdapter), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XInvocationAdapterFactory]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XInvocationAdapterFactory] (val x: Self) extends AnyVal {
    
    inline def setCreateAdapter(value: (XInvocation, `type`) => XInterface): Self = StObject.set(x, "createAdapter", js.Any.fromFunction2(value))
  }
}
