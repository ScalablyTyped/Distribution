package typings.activexDashLibreoffice.comNs.sunNs.starNs.frameNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyValue
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides an easy way to dispatch functions useful at UI level.
  * @see XDispatch
  * @since OOo 1.1.2
  */
trait XDispatchHelper extends XInterface {
  /**
    * executes the dispatch.
    *
    * Listeners are not supported here!
    * @param DispatchProvider points to the provider, which should be asked for valid dispatch objects
    * @param URL describes the feature which should be supported by internally used dispatch object
    * @param TargetFrameName specifies the frame which should be the target for this request
    * @param SearchFlags optional search parameter for finding the frame if no special **TargetFrameName** was used
    * @param Arguments optional arguments for this request They depend on the real implementation of the dispatch object.
    * @returns A possible result of the executed internal dispatch. The information behind this `any` depends on the dispatch!
    * @see XDispatch.dispatch()
    */
  def executeDispatch(
    DispatchProvider: XDispatchProvider,
    URL: String,
    TargetFrameName: String,
    SearchFlags: Double,
    Arguments: SeqEquiv[PropertyValue]
  ): js.Any
}

object XDispatchHelper {
  @scala.inline
  def apply(
    acquire: () => Unit,
    executeDispatch: (XDispatchProvider, String, String, Double, SeqEquiv[PropertyValue]) => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XDispatchHelper = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), executeDispatch = js.Any.fromFunction5(executeDispatch), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XDispatchHelper]
  }
}

