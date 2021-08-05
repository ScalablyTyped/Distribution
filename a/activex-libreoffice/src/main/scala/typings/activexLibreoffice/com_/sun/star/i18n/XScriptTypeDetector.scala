package typings.activexLibreoffice.com_.sun.star.i18n

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * contains the help routines for layouting complex text
  *
  * Assumption - StartPos is inclusive and EndPos is exclusive.
  *
  * The **nScriptDirection** parameters are of type {@link ScriptDirection}
  * @since OOo 1.1.2
  */
trait XScriptTypeDetector
  extends StObject
     with XInterface {
  
  /** @returns the position where the specified CTL Script Type starts. */
  def beginOfCTLScriptType(aText: String, nPos: Double): Double
  
  /** @returns the position where the specified Script Direction starts. */
  def beginOfScriptDirection(aText: String, nPos: Double, nScriptDirection: Double): Double
  
  /** @returns the position where the specified CTL Script Type ends. */
  def endOfCTLScriptType(aText: String, nPos: Double): Double
  
  /** @returns the position where the specified Script Direction ends. */
  def endOfScriptDirection(aText: String, nPos: Double, nScriptDirection: Double): Double
  
  /** @returns the CTL script type of the current position. ;  One of {@link CTLScriptType} constants. */
  def getCTLScriptType(aText: String, nPos: Double): Double
  
  /** @returns the Script Direction of the current position. */
  def getScriptDirection(aText: String, nPos: Double, nDefaultScriptDirection: Double): Double
}
object XScriptTypeDetector {
  
  inline def apply(
    acquire: () => Unit,
    beginOfCTLScriptType: (String, Double) => Double,
    beginOfScriptDirection: (String, Double, Double) => Double,
    endOfCTLScriptType: (String, Double) => Double,
    endOfScriptDirection: (String, Double, Double) => Double,
    getCTLScriptType: (String, Double) => Double,
    getScriptDirection: (String, Double, Double) => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XScriptTypeDetector = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), beginOfCTLScriptType = js.Any.fromFunction2(beginOfCTLScriptType), beginOfScriptDirection = js.Any.fromFunction3(beginOfScriptDirection), endOfCTLScriptType = js.Any.fromFunction2(endOfCTLScriptType), endOfScriptDirection = js.Any.fromFunction3(endOfScriptDirection), getCTLScriptType = js.Any.fromFunction2(getCTLScriptType), getScriptDirection = js.Any.fromFunction3(getScriptDirection), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XScriptTypeDetector]
  }
  
  extension [Self <: XScriptTypeDetector](x: Self) {
    
    inline def setBeginOfCTLScriptType(value: (String, Double) => Double): Self = StObject.set(x, "beginOfCTLScriptType", js.Any.fromFunction2(value))
    
    inline def setBeginOfScriptDirection(value: (String, Double, Double) => Double): Self = StObject.set(x, "beginOfScriptDirection", js.Any.fromFunction3(value))
    
    inline def setEndOfCTLScriptType(value: (String, Double) => Double): Self = StObject.set(x, "endOfCTLScriptType", js.Any.fromFunction2(value))
    
    inline def setEndOfScriptDirection(value: (String, Double, Double) => Double): Self = StObject.set(x, "endOfScriptDirection", js.Any.fromFunction3(value))
    
    inline def setGetCTLScriptType(value: (String, Double) => Double): Self = StObject.set(x, "getCTLScriptType", js.Any.fromFunction2(value))
    
    inline def setGetScriptDirection(value: (String, Double, Double) => Double): Self = StObject.set(x, "getScriptDirection", js.Any.fromFunction3(value))
  }
}
