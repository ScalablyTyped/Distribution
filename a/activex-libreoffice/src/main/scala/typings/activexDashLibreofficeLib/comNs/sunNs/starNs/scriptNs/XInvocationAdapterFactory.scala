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
    acquire: js.Function0[scala.Unit],
    createAdapter: js.Function2[
      XInvocation, 
      activexDashLibreofficeLib.`type`, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XInvocationAdapterFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("createAdapter")(createAdapter)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XInvocationAdapterFactory]
  }
}

