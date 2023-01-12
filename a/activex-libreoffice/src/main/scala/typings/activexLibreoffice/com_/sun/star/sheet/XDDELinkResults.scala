package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to the DDE link results.
  * @see com.sun.star.sheet.DDELink
  * @since OOo 3.0
  */
trait XDDELinkResults
  extends StObject
     with XInterface {
  
  /**
    * returns the DDE link results.
    * @returns the DDE link results. The outer sequence contains the value rows. The inner sequences contain the result values for one row.
    */
  val Results: SafeArray[SafeArray[Any]]
  
  /**
    * returns the DDE link results.
    * @returns the DDE link results. The outer sequence contains the value rows. The inner sequences contain the result values for one row.
    */
  def getResults(): SafeArray[SafeArray[Any]]
  
  /**
    * sets the DDE link results.
    * @param aResults the DDE link results. The outer sequence contains the value rows. The inner sequences contain the result values for one row. If the oute
    */
  def setResults(aResults: SeqEquiv[SeqEquiv[Any]]): Unit
}
object XDDELinkResults {
  
  inline def apply(
    Results: SafeArray[SafeArray[Any]],
    acquire: () => Unit,
    getResults: () => SafeArray[SafeArray[Any]],
    queryInterface: `type` => Any,
    release: () => Unit,
    setResults: SeqEquiv[SeqEquiv[Any]] => Unit
  ): XDDELinkResults = {
    val __obj = js.Dynamic.literal(Results = Results.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getResults = js.Any.fromFunction0(getResults), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setResults = js.Any.fromFunction1(setResults))
    __obj.asInstanceOf[XDDELinkResults]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XDDELinkResults] (val x: Self) extends AnyVal {
    
    inline def setGetResults(value: () => SafeArray[SafeArray[Any]]): Self = StObject.set(x, "getResults", js.Any.fromFunction0(value))
    
    inline def setResults(value: SafeArray[SafeArray[Any]]): Self = StObject.set(x, "Results", value.asInstanceOf[js.Any])
    
    inline def setSetResults(value: SeqEquiv[SeqEquiv[Any]] => Unit): Self = StObject.set(x, "setResults", js.Any.fromFunction1(value))
  }
}
