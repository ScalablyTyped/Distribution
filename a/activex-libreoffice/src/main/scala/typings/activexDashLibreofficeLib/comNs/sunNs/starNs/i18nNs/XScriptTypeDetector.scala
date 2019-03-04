package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * contains the help routines for layouting complex text
  *
  * Assumption - StartPos is inclusive and EndPos is exclusive.
  *
  * The **nScriptDirection** parameters are of type {@link ScriptDirection}
  * @since OOo 1.1.2
  */
trait XScriptTypeDetector
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** @returns the position where the specified CTL Script Type starts. */
  def beginOfCTLScriptType(aText: java.lang.String, nPos: scala.Double): scala.Double
  /** @returns the position where the specified Script Direction starts. */
  def beginOfScriptDirection(aText: java.lang.String, nPos: scala.Double, nScriptDirection: scala.Double): scala.Double
  /** @returns the position where the specified CTL Script Type ends. */
  def endOfCTLScriptType(aText: java.lang.String, nPos: scala.Double): scala.Double
  /** @returns the position where the specified Script Direction ends. */
  def endOfScriptDirection(aText: java.lang.String, nPos: scala.Double, nScriptDirection: scala.Double): scala.Double
  /** @returns the CTL script type of the current position. ;  One of {@link CTLScriptType} constants. */
  def getCTLScriptType(aText: java.lang.String, nPos: scala.Double): scala.Double
  /** @returns the Script Direction of the current position. */
  def getScriptDirection(aText: java.lang.String, nPos: scala.Double, nDefaultScriptDirection: scala.Double): scala.Double
}

object XScriptTypeDetector {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    beginOfCTLScriptType: js.Function2[java.lang.String, scala.Double, scala.Double],
    beginOfScriptDirection: js.Function3[java.lang.String, scala.Double, scala.Double, scala.Double],
    endOfCTLScriptType: js.Function2[java.lang.String, scala.Double, scala.Double],
    endOfScriptDirection: js.Function3[java.lang.String, scala.Double, scala.Double, scala.Double],
    getCTLScriptType: js.Function2[java.lang.String, scala.Double, scala.Double],
    getScriptDirection: js.Function3[java.lang.String, scala.Double, scala.Double, scala.Double],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XScriptTypeDetector = {
    val __obj = js.Dynamic.literal(acquire = acquire, beginOfCTLScriptType = beginOfCTLScriptType, beginOfScriptDirection = beginOfScriptDirection, endOfCTLScriptType = endOfCTLScriptType, endOfScriptDirection = endOfScriptDirection, getCTLScriptType = getCTLScriptType, getScriptDirection = getScriptDirection, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XScriptTypeDetector]
  }
}

