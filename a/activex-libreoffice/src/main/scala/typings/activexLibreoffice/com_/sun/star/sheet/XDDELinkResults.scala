package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to the DDE link results.
  * @see com.sun.star.sheet.DDELink
  * @since OOo 3.0
  */
@js.native
trait XDDELinkResults extends XInterface {
  
  /**
    * returns the DDE link results.
    * @returns the DDE link results. The outer sequence contains the value rows. The inner sequences contain the result values for one row.
    */
  val Results: SafeArray[SafeArray[_]] = js.native
  
  /**
    * returns the DDE link results.
    * @returns the DDE link results. The outer sequence contains the value rows. The inner sequences contain the result values for one row.
    */
  def getResults(): SafeArray[SafeArray[_]] = js.native
  
  /**
    * sets the DDE link results.
    * @param aResults the DDE link results. The outer sequence contains the value rows. The inner sequences contain the result values for one row. If the oute
    */
  def setResults(aResults: SeqEquiv[SeqEquiv[_]]): Unit = js.native
}
object XDDELinkResults {
  
  @scala.inline
  def apply(
    Results: SafeArray[SafeArray[_]],
    acquire: () => Unit,
    getResults: () => SafeArray[SafeArray[_]],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setResults: SeqEquiv[SeqEquiv[_]] => Unit
  ): XDDELinkResults = {
    val __obj = js.Dynamic.literal(Results = Results.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getResults = js.Any.fromFunction0(getResults), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setResults = js.Any.fromFunction1(setResults))
    __obj.asInstanceOf[XDDELinkResults]
  }
  
  @scala.inline
  implicit class XDDELinkResultsMutableBuilder[Self <: XDDELinkResults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetResults(value: () => SafeArray[SafeArray[_]]): Self = StObject.set(x, "getResults", js.Any.fromFunction0(value))
    
    @scala.inline
    def setResults(value: SafeArray[SafeArray[_]]): Self = StObject.set(x, "Results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetResults(value: SeqEquiv[SeqEquiv[_]] => Unit): Self = StObject.set(x, "setResults", js.Any.fromFunction1(value))
  }
}
