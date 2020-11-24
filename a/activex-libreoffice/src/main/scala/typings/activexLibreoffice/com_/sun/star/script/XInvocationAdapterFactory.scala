package typings.activexLibreoffice.com_.sun.star.script

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface to create adapter objects giving a type to be supported and a an invocation interface incoming calls are delegated to.
  *
  * This interface is deprecated. Use {@link XInvocationAdapterFactory2} .
  * @deprecated Deprecated
  */
@js.native
trait XInvocationAdapterFactory extends XInterface {
  
  /**
    * Creates an adapter interface of given type for calling the given {@link XInvocation} interface.
    * @param Invocation invocation interface being called on incoming adapter calls
    * @param aType supported type of adapter
    * @returns adapter interface; this interface can be queried for XInterface and given type
    */
  def createAdapter(Invocation: XInvocation, aType: `type`): XInterface = js.native
}
object XInvocationAdapterFactory {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    createAdapter: (XInvocation, `type`) => XInterface,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XInvocationAdapterFactory = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createAdapter = js.Any.fromFunction2(createAdapter), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XInvocationAdapterFactory]
  }
  
  @scala.inline
  implicit class XInvocationAdapterFactoryOps[Self <: XInvocationAdapterFactory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreateAdapter(value: (XInvocation, `type`) => XInterface): Self = this.set("createAdapter", js.Any.fromFunction2(value))
  }
}
