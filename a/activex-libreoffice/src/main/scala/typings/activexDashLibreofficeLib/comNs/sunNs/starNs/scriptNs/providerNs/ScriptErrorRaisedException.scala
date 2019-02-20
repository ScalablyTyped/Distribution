package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.providerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is a checked exception that represents an error encountered by a {@link LanguageScriptProvider} whilst executing a script */
trait ScriptErrorRaisedException
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Exception {
  /** Scripting language of script that generated exception */
  var language: java.lang.String
  /** line number where error occurred. */
  var lineNum: scala.Double
  /** Name of script where error occurred */
  var scriptName: java.lang.String
}

