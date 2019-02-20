package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** gives access to user-visible strings for a solver. */
trait XSolverDescription
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** A user-visible name of the component. */
  var ComponentDescription: java.lang.String
  /** After calling solve, a message describing the status (explaining why no solution was found). */
  var StatusDescription: java.lang.String
  /** returns a short description for a property in the component's {@link com.sun.star.beans.XPropertySet} interface. */
  def getPropertyDescription(aPropertyName: java.lang.String): java.lang.String
}

