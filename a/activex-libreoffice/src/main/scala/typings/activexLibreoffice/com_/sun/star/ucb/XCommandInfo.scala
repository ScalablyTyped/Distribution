package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to information on a set of commands.
  * @author Kai Sommerfeld
  * @version 1.0
  */
@js.native
trait XCommandInfo extends XInterface {
  
  /**
    * obtains information for all supported commands.
    * @returns a sequence with information for all supported commands.
    */
  val Commands: SafeArray[CommandInfo] = js.native
  
  /**
    * returns information for a specific command.
    * @param Handle specifies the handle of the requested command.
    * @returns the information for the requested command.
    * @throws UnsupportedCommandException if the command is not supported.
    */
  def getCommandInfoByHandle(Handle: Double): CommandInfo = js.native
  
  /**
    * returns information for a specific command.
    * @param Name specifies the name of the requested command.
    * @returns the information for the requested command.
    * @throws UnsupportedCommandException if the command is not supported.
    */
  def getCommandInfoByName(Name: String): CommandInfo = js.native
  
  /**
    * obtains information for all supported commands.
    * @returns a sequence with information for all supported commands.
    */
  def getCommands(): SafeArray[CommandInfo] = js.native
  
  /**
    * checks whether a specific command is supported.
    * @param Handle specifies the handle of the requested command.
    * @returns `TRUE` if a command with the specified handle is supported; otherwise `FALSE` is returned.
    */
  def hasCommandByHandle(Handle: Double): Boolean = js.native
  
  /**
    * checks whether a command specific is supported.
    * @param Name specifies the name of the requested command.
    * @returns `TRUE` if a command with the specified name is supported; otherwise `FALSE` is returned.
    */
  def hasCommandByName(Name: String): Boolean = js.native
}
object XCommandInfo {
  
  @scala.inline
  def apply(
    Commands: SafeArray[CommandInfo],
    acquire: () => Unit,
    getCommandInfoByHandle: Double => CommandInfo,
    getCommandInfoByName: String => CommandInfo,
    getCommands: () => SafeArray[CommandInfo],
    hasCommandByHandle: Double => Boolean,
    hasCommandByName: String => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XCommandInfo = {
    val __obj = js.Dynamic.literal(Commands = Commands.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getCommandInfoByHandle = js.Any.fromFunction1(getCommandInfoByHandle), getCommandInfoByName = js.Any.fromFunction1(getCommandInfoByName), getCommands = js.Any.fromFunction0(getCommands), hasCommandByHandle = js.Any.fromFunction1(hasCommandByHandle), hasCommandByName = js.Any.fromFunction1(hasCommandByName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XCommandInfo]
  }
  
  @scala.inline
  implicit class XCommandInfoMutableBuilder[Self <: XCommandInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommands(value: SafeArray[CommandInfo]): Self = StObject.set(x, "Commands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetCommandInfoByHandle(value: Double => CommandInfo): Self = StObject.set(x, "getCommandInfoByHandle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetCommandInfoByName(value: String => CommandInfo): Self = StObject.set(x, "getCommandInfoByName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetCommands(value: () => SafeArray[CommandInfo]): Self = StObject.set(x, "getCommands", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasCommandByHandle(value: Double => Boolean): Self = StObject.set(x, "hasCommandByHandle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHasCommandByName(value: String => Boolean): Self = StObject.set(x, "hasCommandByName", js.Any.fromFunction1(value))
  }
}
