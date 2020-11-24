package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.com_.sun.star.task.InteractionClassification
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An input/output error while processing a file.
  *
  * This exception is deprecated. Use {@link InteractiveAugmentedIOException} instead.
  * @deprecated Deprecated
  */
@js.native
trait InteractiveFileIOException extends InteractiveIOException {
  
  /** The file url where the i/o error occurred */
  var FileName: String = js.native
}
object InteractiveFileIOException {
  
  @scala.inline
  def apply(
    Classification: InteractionClassification,
    Code: IOErrorCode,
    Context: XInterface,
    FileName: String,
    Message: String
  ): InteractiveFileIOException = {
    val __obj = js.Dynamic.literal(Classification = Classification.asInstanceOf[js.Any], Code = Code.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], FileName = FileName.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractiveFileIOException]
  }
  
  @scala.inline
  implicit class InteractiveFileIOExceptionOps[Self <: InteractiveFileIOException] (val x: Self) extends AnyVal {
    
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
    def setFileName(value: String): Self = this.set("FileName", value.asInstanceOf[js.Any])
  }
}
