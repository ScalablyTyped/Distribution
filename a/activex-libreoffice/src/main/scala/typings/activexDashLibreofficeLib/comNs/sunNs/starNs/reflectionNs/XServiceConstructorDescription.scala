package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.reflectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Reflects a service constructor.
  * @since OOo 2.0
  */
trait XServiceConstructorDescription extends js.Object {
  /**
    * Returns the exceptions that can be raised by the constructor.
    * @returns the reflections of all the exceptions that are listed in the constructor's `raises` specification, in no particular order; all elements of the re
    */
  val Exceptions: activexDashInteropLib.SafeArray[XCompoundTypeDescription]
  /**
    * Returns the constructor's name.
    * @returns the constructor's name; for a default constructor, an empty `string` is returned
    */
  val Name: java.lang.String
  /**
    * Returns the constructor's parameters.
    * @returns the reflections of all the constructor's parameters, in their lexical order; for a default constructor, an empty sequence is returned
    */
  val Parameters: activexDashInteropLib.SafeArray[XParameter]
  /**
    * Returns the exceptions that can be raised by the constructor.
    * @returns the reflections of all the exceptions that are listed in the constructor's `raises` specification, in no particular order; all elements of the re
    */
  def getExceptions(): activexDashInteropLib.SafeArray[XCompoundTypeDescription]
  /**
    * Returns the constructor's name.
    * @returns the constructor's name; for a default constructor, an empty `string` is returned
    */
  def getName(): java.lang.String
  /**
    * Returns the constructor's parameters.
    * @returns the reflections of all the constructor's parameters, in their lexical order; for a default constructor, an empty sequence is returned
    */
  def getParameters(): activexDashInteropLib.SafeArray[XParameter]
  /**
    * Returns whether the constructor is a default constructor.
    * @returns `TRUE` if the constructor is a default constructor
    */
  def isDefaultConstructor(): scala.Boolean
}

object XServiceConstructorDescription {
  @scala.inline
  def apply(
    Exceptions: activexDashInteropLib.SafeArray[XCompoundTypeDescription],
    Name: java.lang.String,
    Parameters: activexDashInteropLib.SafeArray[XParameter],
    getExceptions: js.Function0[activexDashInteropLib.SafeArray[XCompoundTypeDescription]],
    getName: js.Function0[java.lang.String],
    getParameters: js.Function0[activexDashInteropLib.SafeArray[XParameter]],
    isDefaultConstructor: js.Function0[scala.Boolean]
  ): XServiceConstructorDescription = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Exceptions")(Exceptions)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("Parameters")(Parameters)
    __obj.updateDynamic("getExceptions")(getExceptions)
    __obj.updateDynamic("getName")(getName)
    __obj.updateDynamic("getParameters")(getParameters)
    __obj.updateDynamic("isDefaultConstructor")(isDefaultConstructor)
    __obj.asInstanceOf[XServiceConstructorDescription]
  }
}

