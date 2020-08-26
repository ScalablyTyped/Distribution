package typings.activexLibreoffice.com_.sun.star.deployment

import typings.activexLibreoffice.com_.sun.star.uno.Exception
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * indicates that {@link XPackageRegistry.bindPackage()} was previously called with a different value for the `removed` parameter and that the {@link
  * XPackage} object created by that call still exist.
  * @since OOo 3.3
  */
@js.native
trait InvalidRemovedParameterException extends Exception {
  /**
    * the {@link XPackage} that was already bound to the provided `url` parameter during {@link XPackageRegistry.bindPackage()} .
    *
    * Must not be `NULL` .
    */
  var Extension: XPackage = js.native
  /**
    * the value of the `removed` parameter which was used in {@link XPackageRegistry.bindPackage()} to create the currently existing {@link XPackage}
    * object.
    */
  var PreviousValue: Boolean = js.native
}

object InvalidRemovedParameterException {
  @scala.inline
  def apply(Context: XInterface, Extension: XPackage, Message: String, PreviousValue: Boolean): InvalidRemovedParameterException = {
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], Extension = Extension.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], PreviousValue = PreviousValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidRemovedParameterException]
  }
  @scala.inline
  implicit class InvalidRemovedParameterExceptionOps[Self <: InvalidRemovedParameterException] (val x: Self) extends AnyVal {
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
    def setExtension(value: XPackage): Self = this.set("Extension", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreviousValue(value: Boolean): Self = this.set("PreviousValue", value.asInstanceOf[js.Any])
  }
  
}

