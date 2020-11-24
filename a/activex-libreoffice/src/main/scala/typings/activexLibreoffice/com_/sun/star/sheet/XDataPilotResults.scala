package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to a table of results of a data pilot source.
  *
  * These results are used to fill the data area of a data pilot table.
  * @see com.sun.star.sheet.DataPilotSource
  * @see com.sun.star.sheet.XDataPilotMemberResults
  */
@js.native
trait XDataPilotResults extends XInterface {
  
  /**
    * returns the result array.
    *
    * The outer sequence contains the value rows. The inner sequences contain the values for one row.
    */
  val Results: SafeArray[SafeArray[DataResult]] = js.native
  
  def getFilteredResults(aFilters: SeqEquiv[DataPilotFieldFilter]): SafeArray[Double] = js.native
  
  /**
    * returns the result array.
    *
    * The outer sequence contains the value rows. The inner sequences contain the values for one row.
    */
  def getResults(): SafeArray[SafeArray[DataResult]] = js.native
}
object XDataPilotResults {
  
  @scala.inline
  def apply(
    Results: SafeArray[SafeArray[DataResult]],
    acquire: () => Unit,
    getFilteredResults: SeqEquiv[DataPilotFieldFilter] => SafeArray[Double],
    getResults: () => SafeArray[SafeArray[DataResult]],
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XDataPilotResults = {
    val __obj = js.Dynamic.literal(Results = Results.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getFilteredResults = js.Any.fromFunction1(getFilteredResults), getResults = js.Any.fromFunction0(getResults), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XDataPilotResults]
  }
  
  @scala.inline
  implicit class XDataPilotResultsOps[Self <: XDataPilotResults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setResults(value: SafeArray[SafeArray[DataResult]]): Self = this.set("Results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetFilteredResults(value: SeqEquiv[DataPilotFieldFilter] => SafeArray[Double]): Self = this.set("getFilteredResults", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetResults(value: () => SafeArray[SafeArray[DataResult]]): Self = this.set("getResults", js.Any.fromFunction0(value))
  }
}
