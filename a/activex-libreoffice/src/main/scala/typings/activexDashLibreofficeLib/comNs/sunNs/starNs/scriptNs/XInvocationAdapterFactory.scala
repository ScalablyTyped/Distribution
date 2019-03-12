package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface to create adapter objects giving a type to be supported and a an invocation interface incoming calls are delegated to.
  *
  * This interface is deprecated. Use {@link XInvocationAdapterFactory2} .
  * @deprecated Deprecated
  */
trait XInvocationAdapterFactory
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Creates an adapter interface of given type for calling the given {@link XInvocation} interface.
    * @param Invocation invocation interface being called on incoming adapter calls
    * @param aType supported type of adapter
    * @returns adapter interface; this interface can be queried for XInterface and given type
    */
  def createAdapter(Invocation: XInvocation, aType: activexDashLibreofficeLib.`type`): activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
}

object XInvocationAdapterFactory {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    createAdapter: (XInvocation, activexDashLibreofficeLib.`type`) => activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XInvocationAdapterFactory = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createAdapter = js.Any.fromFunction2(createAdapter), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XInvocationAdapterFactory]
  }
}

