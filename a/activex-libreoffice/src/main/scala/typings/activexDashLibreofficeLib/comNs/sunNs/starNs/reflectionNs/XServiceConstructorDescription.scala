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

