package typings.activexLibreoffice.com_.sun.star.ui

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This interface enables an object to get interceptors registered that change context menus or prevent them from being executed. */
trait XContextMenuInterception
  extends StObject
     with XInterface {
  
  /** registers an {@link XContextMenuInterceptor} , which will become the first interceptor in the chain of registered interceptors. */
  def registerContextMenuInterceptor(Interceptor: XContextMenuInterceptor): Unit
  
  /**
    * removes an {@link XContextMenuInterceptor} which was previously registered using {@link XContextMenuInterception.registerContextMenuInterceptor()} .
    *
    * The order of removals is arbitrary. It is not necessary to remove the last registered interceptor first.
    */
  def releaseContextMenuInterceptor(Interceptor: XContextMenuInterceptor): Unit
}
object XContextMenuInterception {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    registerContextMenuInterceptor: XContextMenuInterceptor => Unit,
    release: () => Unit,
    releaseContextMenuInterceptor: XContextMenuInterceptor => Unit
  ): XContextMenuInterception = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), registerContextMenuInterceptor = js.Any.fromFunction1(registerContextMenuInterceptor), release = js.Any.fromFunction0(release), releaseContextMenuInterceptor = js.Any.fromFunction1(releaseContextMenuInterceptor))
    __obj.asInstanceOf[XContextMenuInterception]
  }
  
  @scala.inline
  implicit class XContextMenuInterceptionMutableBuilder[Self <: XContextMenuInterception] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRegisterContextMenuInterceptor(value: XContextMenuInterceptor => Unit): Self = StObject.set(x, "registerContextMenuInterceptor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReleaseContextMenuInterceptor(value: XContextMenuInterceptor => Unit): Self = StObject.set(x, "releaseContextMenuInterceptor", js.Any.fromFunction1(value))
  }
}
