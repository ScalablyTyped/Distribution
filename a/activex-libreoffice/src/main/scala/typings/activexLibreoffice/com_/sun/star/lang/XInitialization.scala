package typings.activexLibreoffice.com_.sun.star.lang

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
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
@js.native
trait XInitialization extends XInterface {
  /**
    * initializes the object.
    *
    * It should be called directly after the object is created.
    */
  def initialize(aArguments: SeqEquiv[_]): Unit = js.native
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
  @scala.inline
  implicit class XInitializationOps[Self <: XInitialization] (val x: Self) extends AnyVal {
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
    def setInitialize(value: SeqEquiv[_] => Unit): Self = this.set("initialize", js.Any.fromFunction1(value))
  }
  
}

