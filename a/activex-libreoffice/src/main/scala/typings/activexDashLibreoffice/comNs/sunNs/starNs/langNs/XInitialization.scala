package typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * initializes an object directly after its creation.
  *
  * This interface works together with factories. If you want to initialize the object after creation, you should support this interface and you may
  * support other interfaces which offer type-safe initialization methods.
  *
  * Instead of calling {@link XSingleComponentFactory.createInstanceWithContext()} and later {@link initialize()} , you should call {@link
  * XSingleComponentFactory.createInstanceWithArgumentsAndContext()} to pass the arguments to the instance. The reason is, that a component may want to
  * return the same instance for the same set of parameters, and it can do so by implementing the factory itself.
  */
trait XInitialization extends XInterface {
  /**
    * initializes the object.
    *
    * It should be called directly after the object is created.
    */
  def initialize(aArguments: SeqEquiv[_]): Unit
}

object XInitialization {
  @scala.inline
  def apply(
    acquire: () => Unit,
    initialize: SeqEquiv[_] => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XInitialization = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), initialize = js.Any.fromFunction1(initialize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XInitialization]
  }
}

