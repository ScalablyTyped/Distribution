package typings.activexLibreoffice.com_.sun.star.lang

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Factory interface to produce instances of an implementation of a service specification.
  *
  * This interface is deprecated. Please use {@link XSingleComponentFactory} .
  * @deprecated Deprecated
  * @see XInitialization
  */
@js.native
trait XSingleServiceFactory extends XInterface {
  /**
    * Creates an instance of a service implementation.
    * @returns service instance
    */
  def createInstance(): XInterface = js.native
  /**
    * Creates an instance of a service implementation initialized with some arguments.
    * @param aArguments arguments passed to implementation
    * @returns service instance
    */
  def createInstanceWithArguments(aArguments: SeqEquiv[_]): XInterface = js.native
}

object XSingleServiceFactory {
  @scala.inline
  def apply(
    acquire: () => Unit,
    createInstance: () => XInterface,
    createInstanceWithArguments: SeqEquiv[_] => XInterface,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XSingleServiceFactory = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createInstance = js.Any.fromFunction0(createInstance), createInstanceWithArguments = js.Any.fromFunction1(createInstanceWithArguments), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XSingleServiceFactory]
  }
  @scala.inline
  implicit class XSingleServiceFactoryOps[Self <: XSingleServiceFactory] (val x: Self) extends AnyVal {
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
    def setCreateInstance(value: () => XInterface): Self = this.set("createInstance", js.Any.fromFunction0(value))
    @scala.inline
    def setCreateInstanceWithArguments(value: SeqEquiv[_] => XInterface): Self = this.set("createInstanceWithArguments", js.Any.fromFunction1(value))
  }
  
}

