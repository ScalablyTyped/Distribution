package typings.activexDashLibreoffice.comNs.sunNs.starNs.deploymentNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.Exception
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * indicates that {@link XPackageRegistry.bindPackage()} was previously called with a different value for the `removed` parameter and that the {@link
  * XPackage} object created by that call still exist.
  * @since OOo 3.3
  */
trait InvalidRemovedParameterException extends Exception {
  /**
    * the {@link XPackage} that was already bound to the provided `url` parameter during {@link XPackageRegistry.bindPackage()} .
    *
    * Must not be `NULL` .
    */
  var Extension: XPackage
  /**
    * the value of the `removed` parameter which was used in {@link XPackageRegistry.bindPackage()} to create the currently existing {@link XPackage}
    * object.
    */
  var PreviousValue: Boolean
}

object InvalidRemovedParameterException {
  @scala.inline
  def apply(Context: XInterface, Extension: XPackage, Message: String, PreviousValue: Boolean): InvalidRemovedParameterException = {
    val __obj = js.Dynamic.literal(Context = Context, Extension = Extension, Message = Message, PreviousValue = PreviousValue)
  
    __obj.asInstanceOf[InvalidRemovedParameterException]
  }
}

