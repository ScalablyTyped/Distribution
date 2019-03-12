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
    acquire: () => scala.Unit,
    beginOfCTLScriptType: (java.lang.String, scala.Double) => scala.Double,
    beginOfScriptDirection: (java.lang.String, scala.Double, scala.Double) => scala.Double,
    endOfCTLScriptType: (java.lang.String, scala.Double) => scala.Double,
    endOfScriptDirection: (java.lang.String, scala.Double, scala.Double) => scala.Double,
    getCTLScriptType: (java.lang.String, scala.Double) => scala.Double,
    getScriptDirection: (java.lang.String, scala.Double, scala.Double) => scala.Double,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XScriptTypeDetector = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), beginOfCTLScriptType = js.Any.fromFunction2(beginOfCTLScriptType), beginOfScriptDirection = js.Any.fromFunction3(beginOfScriptDirection), endOfCTLScriptType = js.Any.fromFunction2(endOfCTLScriptType), endOfScriptDirection = js.Any.fromFunction3(endOfScriptDirection), getCTLScriptType = js.Any.fromFunction2(getCTLScriptType), getScriptDirection = js.Any.fromFunction3(getScriptDirection), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XScriptTypeDetector]
  }
}

