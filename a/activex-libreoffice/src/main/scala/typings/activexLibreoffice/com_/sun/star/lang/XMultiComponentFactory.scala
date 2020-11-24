package typings.activexLibreoffice.com_.sun.star.lang

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XComponentContext
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Factory interface for creating component instances giving a context from which to retrieve deployment values.
  * @see XInitialization
  */
@js.native
trait XMultiComponentFactory extends XInterface {
  
  /**
    * Gets the names of all supported services.
    * @returns sequence of all service names
    */
  val AvailableServiceNames: SafeArray[String] = js.native
  
  /**
    * Creates an instance of a component which supports the services specified by the factory, and initializes the new instance with the given arguments and
    * context.
    * @param ServiceSpecifier service name
    * @param Arguments arguments
    * @param Context context the component instance gets its deployment values from
    * @returns component instance
    */
  def createInstanceWithArgumentsAndContext(ServiceSpecifier: String, Arguments: SeqEquiv[_], Context: XComponentContext): XInterface = js.native
  
  /**
    * Creates an instance of a component which supports the services specified by the factory.
    * @param aServiceSpecifier service name
    * @param Context context the component instance gets its deployment values from
    * @returns component instance
    */
  def createInstanceWithContext(aServiceSpecifier: String, Context: XComponentContext): XInterface = js.native
  
  /**
    * Gets the names of all supported services.
    * @returns sequence of all service names
    */
  def getAvailableServiceNames(): SafeArray[String] = js.native
}
object XMultiComponentFactory {
  
  @scala.inline
  def apply(
    AvailableServiceNames: SafeArray[String],
    acquire: () => Unit,
    createInstanceWithArgumentsAndContext: (String, SeqEquiv[_], XComponentContext) => XInterface,
    createInstanceWithContext: (String, XComponentContext) => XInterface,
    getAvailableServiceNames: () => SafeArray[String],
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XMultiComponentFactory = {
    val __obj = js.Dynamic.literal(AvailableServiceNames = AvailableServiceNames.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), createInstanceWithArgumentsAndContext = js.Any.fromFunction3(createInstanceWithArgumentsAndContext), createInstanceWithContext = js.Any.fromFunction2(createInstanceWithContext), getAvailableServiceNames = js.Any.fromFunction0(getAvailableServiceNames), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XMultiComponentFactory]
  }
  
  @scala.inline
  implicit class XMultiComponentFactoryOps[Self <: XMultiComponentFactory] (val x: Self) extends AnyVal {
    
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
    def setAvailableServiceNames(value: SafeArray[String]): Self = this.set("AvailableServiceNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateInstanceWithArgumentsAndContext(value: (String, SeqEquiv[_], XComponentContext) => XInterface): Self = this.set("createInstanceWithArgumentsAndContext", js.Any.fromFunction3(value))
    
    @scala.inline
    def setCreateInstanceWithContext(value: (String, XComponentContext) => XInterface): Self = this.set("createInstanceWithContext", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetAvailableServiceNames(value: () => SafeArray[String]): Self = this.set("getAvailableServiceNames", js.Any.fromFunction0(value))
  }
}
