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

object XSolverDescription {
  @scala.inline
  def apply(
    ComponentDescription: java.lang.String,
    StatusDescription: java.lang.String,
    acquire: js.Function0[scala.Unit],
    getPropertyDescription: js.Function1[java.lang.String, java.lang.String],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XSolverDescription = {
    val __obj = js.Dynamic.literal(ComponentDescription = ComponentDescription, StatusDescription = StatusDescription, acquire = acquire, getPropertyDescription = getPropertyDescription, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XSolverDescription]
  }
}

