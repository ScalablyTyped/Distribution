package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.com_.sun.star.uno.Exception
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This exception is used to indicate that there are properties missing.
  *
  * For example, to create a new resource, usually one ore more property values must be set prior to executing the command "insert", which makes the new
  * resource persistent.
  * @author Kai Sommerfeld
  * @see Content
  * @version 1.0
  */
@js.native
trait MissingPropertiesException extends Exception {
  
  /** contains the names of the missing properties. */
  var Properties: SafeArray[String] = js.native
}
object MissingPropertiesException {
  
  @scala.inline
  def apply(Context: XInterface, Message: String, Properties: SafeArray[String]): MissingPropertiesException = {
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], Properties = Properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[MissingPropertiesException]
  }
  
  @scala.inline
  implicit class MissingPropertiesExceptionOps[Self <: MissingPropertiesException] (val x: Self) extends AnyVal {
    
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
    def setProperties(value: SafeArray[String]): Self = this.set("Properties", value.asInstanceOf[js.Any])
  }
}
