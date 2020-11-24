package typings.activexLibreoffice.com_.sun.star.system

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies an interface for executing a system command. */
@js.native
trait XSystemShellExecute extends XInterface {
  
  /**
    * Executes an arbitrary system command.
    * @param aCommand Specifies the command to execute. This may be an executable file or a document which is registered with an application on a specific pla
    * @param aParameter Specifies a list of space separated parameters. The method does not validate the given parameters, but only passes it as a parameter t
    * @param nFlags Specifies different flags to control the execution of this method, for example, avoid showing system error messages, in case of failures, etc.
    * @see com.sun.star.system.SystemShellExecuteFlags
    * @throws com::sun::star::lang::IllegalArgumentException when the specified flags are wrong or exclude each other; also thrown, with an ArgumentPosition of
    * @throws com::sun::star::system::SystemShellExecuteException in the case of errors when trying to executed the specified command.
    */
  def execute(aCommand: String, aParameter: String, nFlags: Double): Unit = js.native
}
object XSystemShellExecute {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    execute: (String, String, Double) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XSystemShellExecute = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), execute = js.Any.fromFunction3(execute), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XSystemShellExecute]
  }
  
  @scala.inline
  implicit class XSystemShellExecuteOps[Self <: XSystemShellExecute] (val x: Self) extends AnyVal {
    
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
    def setExecute(value: (String, String, Double) => Unit): Self = this.set("execute", js.Any.fromFunction3(value))
  }
}
