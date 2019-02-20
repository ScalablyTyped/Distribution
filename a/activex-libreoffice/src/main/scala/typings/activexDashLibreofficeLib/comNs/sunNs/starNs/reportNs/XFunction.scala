package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.reportNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a format condition for a control. */
trait XFunction
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XChild {
  /** specifies if sub reports should be traversed as well. */
  var DeepTraversing: scala.Boolean
  /** defines the formula of this function */
  var Formula: java.lang.String
  /** defines the formula for the initial value */
  var InitialFormula: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.Optional[java.lang.String]
  /** defines the name of the function */
  var Name: java.lang.String
  /** specifies if the function should be evaluated before the report element will be executed. */
  var PreEvaluated: scala.Boolean
}

