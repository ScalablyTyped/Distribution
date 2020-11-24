package typings.activexLibreoffice.com_.sun.star.java_

import typings.activexLibreoffice.com_.sun.star.uno.Exception
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** indicates that an operation involving Java (probably executing Java code) failed due to a wrong Java version. */
@js.native
trait WrongJavaVersionException extends Exception {
  
  /** contains the Java version that has been detected, or is left empty if this is unknown. */
  var DetectedVersion: String = js.native
  
  /** contains the highest Java version for which the operation would succeed, or is left empty if this is unknown. */
  var HighestSupportedVersion: String = js.native
  
  /** contains the lowest Java version for which the operation would succeed, or is left empty if this is unknown. */
  var LowestSupportedVersion: String = js.native
}
object WrongJavaVersionException {
  
  @scala.inline
  def apply(
    Context: XInterface,
    DetectedVersion: String,
    HighestSupportedVersion: String,
    LowestSupportedVersion: String,
    Message: String
  ): WrongJavaVersionException = {
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], DetectedVersion = DetectedVersion.asInstanceOf[js.Any], HighestSupportedVersion = HighestSupportedVersion.asInstanceOf[js.Any], LowestSupportedVersion = LowestSupportedVersion.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrongJavaVersionException]
  }
  
  @scala.inline
  implicit class WrongJavaVersionExceptionOps[Self <: WrongJavaVersionException] (val x: Self) extends AnyVal {
    
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
    def setDetectedVersion(value: String): Self = this.set("DetectedVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighestSupportedVersion(value: String): Self = this.set("HighestSupportedVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowestSupportedVersion(value: String): Self = this.set("LowestSupportedVersion", value.asInstanceOf[js.Any])
  }
}
