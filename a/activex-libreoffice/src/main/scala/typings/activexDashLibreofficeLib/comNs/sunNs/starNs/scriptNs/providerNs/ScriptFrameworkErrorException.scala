package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.providerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is a checked exception that represents an error encountered by the Scripting Framework whilst executing a script */
trait ScriptFrameworkErrorException
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Exception {
  /** error type {@link com.sun.star.script.provider.ScriptFrameworkErrorType} */
  var errorType: scala.Double
  /** Scripting language of script that generated exception */
  var language: java.lang.String
  /** Name of script where error occurred */
  var scriptName: java.lang.String
}

