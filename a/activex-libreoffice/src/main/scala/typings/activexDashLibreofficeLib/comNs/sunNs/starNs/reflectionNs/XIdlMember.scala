package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.reflectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Base interface for XIdlField2s and XIdlMethods. */
trait XIdlMember
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Returns the declaring type of this field, i.e. the type having the member declared (interface, enum, struct, exception).
    * @returns declaring type
    */
  val DeclaringClass: XIdlClass[_]
  /**
    * Returns the fully-qualified name of the member.
    * @returns fully-qualified name of the member
    */
  val Name: java.lang.String
  /**
    * Returns the declaring type of this field, i.e. the type having the member declared (interface, enum, struct, exception).
    * @returns declaring type
    */
  def getDeclaringClass(): XIdlClass[_]
  /**
    * Returns the fully-qualified name of the member.
    * @returns fully-qualified name of the member
    */
  def getName(): java.lang.String
}

