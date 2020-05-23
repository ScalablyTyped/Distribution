package typings.activexLibreoffice.com_.sun.star.lang

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XComponentContext
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Factory interface to create instances of an implementation of a service specification.
  * @see XInitialization
  */
trait XSingleComponentFactory extends XInterface {
  /**
    * Creates an instance of a component and initializes the new instance with the given arguments and context.
    * @param Arguments arguments passed to implementation
    * @param Context the instance gets its deployment values from this
    * @returns component instance
    */
  def createInstanceWithArgumentsAndContext(Arguments: SeqEquiv[_], Context: XComponentContext): XInterface
  /**
    * Creates an instance of a service implementation.
    * @param Context the instance gets its deployment values from this
    * @returns component instance
    */
  def createInstanceWithContext(Context: XComponentContext): XInterface
}

object XSingleComponentFactory {
  @scala.inline
  def apply(
    acquire: () => Unit,
    createInstanceWithArgumentsAndContext: (SeqEquiv[_], XComponentContext) => XInterface,
    createInstanceWithContext: XComponentContext => XInterface,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XSingleComponentFactory = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createInstanceWithArgumentsAndContext = js.Any.fromFunction2(createInstanceWithArgumentsAndContext), createInstanceWithContext = js.Any.fromFunction1(createInstanceWithContext), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XSingleComponentFactory]
  }
}

