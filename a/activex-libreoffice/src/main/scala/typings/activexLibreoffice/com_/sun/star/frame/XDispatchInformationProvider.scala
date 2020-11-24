package typings.activexLibreoffice.com_.sun.star.frame

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides information about supported commands
  *
  * This interface can be used to retrieve additional information about supported commands. This interface is normally used by configuration
  * implementations to retrieve all supported commands. A dispatch information provider is normally supported by a {@link Frame} service.
  * @see Frame
  * @since OOo 2.0
  */
@js.native
trait XDispatchInformationProvider extends XInterface {
  
  /**
    * returns all supported command groups.
    * @returns a sequence of supported command groups.
    * @see CommandGroup
    */
  val SupportedCommandGroups: SafeArray[Double] = js.native
  
  /**
    * returns additional information about supported commands of a given command group.
    * @param CommandGroup specifies a command group.
    * @returns name and group name of every command supported. A group ID which is not supported returns an empty com::sun::star::uno::Sequence.
    */
  def getConfigurableDispatchInformation(CommandGroup: Double): SafeArray[DispatchInformation] = js.native
  
  /**
    * returns all supported command groups.
    * @returns a sequence of supported command groups.
    * @see CommandGroup
    */
  def getSupportedCommandGroups(): SafeArray[Double] = js.native
}
object XDispatchInformationProvider {
  
  @scala.inline
  def apply(
    SupportedCommandGroups: SafeArray[Double],
    acquire: () => Unit,
    getConfigurableDispatchInformation: Double => SafeArray[DispatchInformation],
    getSupportedCommandGroups: () => SafeArray[Double],
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XDispatchInformationProvider = {
    val __obj = js.Dynamic.literal(SupportedCommandGroups = SupportedCommandGroups.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getConfigurableDispatchInformation = js.Any.fromFunction1(getConfigurableDispatchInformation), getSupportedCommandGroups = js.Any.fromFunction0(getSupportedCommandGroups), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XDispatchInformationProvider]
  }
  
  @scala.inline
  implicit class XDispatchInformationProviderOps[Self <: XDispatchInformationProvider] (val x: Self) extends AnyVal {
    
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
    def setSupportedCommandGroups(value: SafeArray[Double]): Self = this.set("SupportedCommandGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetConfigurableDispatchInformation(value: Double => SafeArray[DispatchInformation]): Self = this.set("getConfigurableDispatchInformation", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetSupportedCommandGroups(value: () => SafeArray[Double]): Self = this.set("getSupportedCommandGroups", js.Any.fromFunction0(value))
  }
}
