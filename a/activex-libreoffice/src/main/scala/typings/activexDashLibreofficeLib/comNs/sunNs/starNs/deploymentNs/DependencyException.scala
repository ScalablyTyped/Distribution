package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.deploymentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes unsatisfied dependencies a deployment unit has on its target environment.
  *
  * This exception is intended to be used with an {@link com.sun.star.task.XInteractionHandler} .
  * @since OOo 2.0.4
  */
trait DependencyException
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Exception {
  /**
    * a sequence of dependencies represented by XML elements.
    *
    * The exact nature of those XML elements is deliberately left open, so that new kinds of dependencies can be defined in the future. OOo   2.0.4 does not
    * define any kinds of dependencies. Each such XML element should have an attribute whose global name consists of the namespace name
    * `http://openoffice.org/extensions/description/2006` and the local part `name` and whose value is a human-readable (English) description of the
    * dependency. If an instance of OOo does not know more about a specific kind of dependency, it should display the value of that attribute to the user.
    *
    * The sequence must not be empty, and none of the elements may be `NULL` .
    */
  var UnsatisfiedDependencies: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.XElement]
}

object DependencyException {
  @scala.inline
  def apply(
    Context: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    Message: java.lang.String,
    UnsatisfiedDependencies: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.XElement]
  ): DependencyException = {
    val __obj = js.Dynamic.literal(Context = Context, Message = Message, UnsatisfiedDependencies = UnsatisfiedDependencies)
  
    __obj.asInstanceOf[DependencyException]
  }
}

