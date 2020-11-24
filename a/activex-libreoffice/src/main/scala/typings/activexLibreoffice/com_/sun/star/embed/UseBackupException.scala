package typings.activexLibreoffice.com_.sun.star.embed

import typings.activexLibreoffice.com_.sun.star.uno.Exception
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This exception can be thrown in case a storage commit is failed.
  *
  * If a commit process of a storage fails on last transfer and the original content may be corrupted the storage should throw this exception to notify
  * the user that a backup usage is required to restore the original content.
  *
  * The storage itself must disconnect from the medium it is based on to allow restoring. Although the storage will still contain all the data internally,
  * and can be used as a temporary storage usually used.
  */
@js.native
trait UseBackupException extends Exception {
  
  /** The URL of the temporary file the storage is based on now. */
  var TemporaryFileURL: String = js.native
}
object UseBackupException {
  
  @scala.inline
  def apply(Context: XInterface, Message: String, TemporaryFileURL: String): UseBackupException = {
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], TemporaryFileURL = TemporaryFileURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseBackupException]
  }
  
  @scala.inline
  implicit class UseBackupExceptionOps[Self <: UseBackupException] (val x: Self) extends AnyVal {
    
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
    def setTemporaryFileURL(value: String): Self = this.set("TemporaryFileURL", value.asInstanceOf[js.Any])
  }
}
