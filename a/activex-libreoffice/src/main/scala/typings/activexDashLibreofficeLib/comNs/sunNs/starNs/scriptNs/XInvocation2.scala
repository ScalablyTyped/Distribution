package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Extension of {@link XInvocation} to provide additional information about the methods and properties that are accessible via {@link XInvocation} . */
trait XInvocation2 extends XInvocation {
  /**
    * returns information items for all methods and properties accessible via {@link XInvocation} .
    * @see com.sun.star.script.Invocation
    */
  val Info: activexDashInteropLib.SafeArray[InvocationInfo]
  /** returns the names of all methods and properties accessible via {@link XInvocation} . */
  val MemberNames: activexDashInteropLib.SafeArray[java.lang.String]
  /**
    * returns information items for all methods and properties accessible via {@link XInvocation} .
    * @see com.sun.star.script.Invocation
    */
  def getInfo(): activexDashInteropLib.SafeArray[InvocationInfo]
  /**
    * returns information item for the method or property defined by aName
    * @param aName specifies the name of the method or property
    * @param bExact specifies the name of the method or property
    * @see com.sun.star.script.Invocation
    * @throws IllegalArgumentException if aName is not the name of a supported method or property
    */
  def getInfoForName(aName: java.lang.String, bExact: scala.Boolean): InvocationInfo
  /** returns the names of all methods and properties accessible via {@link XInvocation} . */
  def getMemberNames(): activexDashInteropLib.SafeArray[java.lang.String]
}

