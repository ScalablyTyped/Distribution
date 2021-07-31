package typings.ariClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildInfo extends StObject {
  
  /**
    * Date and time when Asterisk was built.
    */
  var date: String
  
  /**
    * Kernel version Asterisk was built on.
    */
  var kernel: String
  
  /**
    * Machine architecture (x86_64, i686, ppc, etc.).
    */
  var machine: String
  
  /**
    * Compile time options, or empty string if default.
    */
  var options: String
  
  /**
    * OS Asterisk was built on.
    */
  var os: String
  
  /**
    * Username that build Asterisk.
    */
  var user: String
}
object BuildInfo {
  
  @scala.inline
  def apply(date: String, kernel: String, machine: String, options: String, os: String, user: String): BuildInfo = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], kernel = kernel.asInstanceOf[js.Any], machine = machine.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildInfo]
  }
  
  @scala.inline
  implicit class BuildInfoMutableBuilder[Self <: BuildInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKernel(value: String): Self = StObject.set(x, "kernel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMachine(value: String): Self = StObject.set(x, "machine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: String): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOs(value: String): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
