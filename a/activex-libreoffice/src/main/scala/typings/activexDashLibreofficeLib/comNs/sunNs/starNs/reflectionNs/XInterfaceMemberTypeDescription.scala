package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.reflectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Base interface for reflected interface members.
  * @see XInterfaceAttributeTypeDescription
  * @see XInterfaceMethodTypeDescription
  */
trait XInterfaceMemberTypeDescription extends XTypeDescription {
  /**
    * Returns name of member
    * @returns member name
    */
  val MemberName: java.lang.String
  /**
    * Returns the position the member including all inherited members of base interfaces.
    * @returns position of member
    */
  val Position: scala.Double
  /**
    * Returns name of member
    * @returns member name
    */
  def getMemberName(): java.lang.String
  /**
    * Returns the position the member including all inherited members of base interfaces.
    * @returns position of member
    */
  def getPosition(): scala.Double
}

