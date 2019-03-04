package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides a method of changing names for converting an approximate name to an existing name.
  *
  * One field of application is the conversion of case-insensitive names to the existing names.
  *
  * Example: A basic interpreter ignores the case of the names. So it must query the {@link XExactName} interface and then call the method.
  * @see com.sun.star.beans.XPropertySet
  * @see com.sun.star.beans.XIntrospectionAccess
  * @see com.sun.star.container.XNameAccess
  */
trait XExactName
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** @returns the exact name for a given aprroximate name.  For example "getExactName" could be returned for "GETEXACTNAME" when "GETEXACTNAME" was used by a c */
  def getExactName(aApproximateName: java.lang.String): java.lang.String
}

object XExactName {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    getExactName: js.Function1[java.lang.String, java.lang.String],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XExactName = {
    val __obj = js.Dynamic.literal(acquire = acquire, getExactName = getExactName, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XExactName]
  }
}

