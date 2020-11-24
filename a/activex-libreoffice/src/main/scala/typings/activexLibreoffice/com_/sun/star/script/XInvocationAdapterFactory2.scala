package typings.activexLibreoffice.com_.sun.star.script

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Interface to create adapter objects giving types to be supported and a an invocation interface incoming calls are delegated to. */
@js.native
trait XInvocationAdapterFactory2 extends XInterface {
  
  /**
    * Creates an adapter interface of given types for calling the given {@link XInvocation} interface.
    * @param Invocation invocation interface being called on incoming adapter calls
    * @param aTypes supported types of adapter
    * @returns adapter interface; this interface can be queried for XInterface and given types
    */
  def createAdapter(Invocation: XInvocation, aTypes: SeqEquiv[`type`]): XInterface = js.native
}
object XInvocationAdapterFactory2 {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    createAdapter: (XInvocation, SeqEquiv[`type`]) => XInterface,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XInvocationAdapterFactory2 = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createAdapter = js.Any.fromFunction2(createAdapter), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XInvocationAdapterFactory2]
  }
  
  @scala.inline
  implicit class XInvocationAdapterFactory2Ops[Self <: XInvocationAdapterFactory2] (val x: Self) extends AnyVal {
    
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
    def setCreateAdapter(value: (XInvocation, SeqEquiv[`type`]) => XInterface): Self = this.set("createAdapter", js.Any.fromFunction2(value))
  }
}
