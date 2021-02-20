package typings.activexLibreoffice.com_.sun.star.util

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** enables an object to search in its content. */
@js.native
trait XTextSearch extends XInterface {
  
  /**
    * search backward in the searchStr, starts at startPos and ends by endpos. The endpos must be lower then the startpos, because the function searches
    * backward! The result is returned in the {@link SearchResult} .
    */
  def searchBackward(searchStr: String, startPos: Double, endPos: Double): SearchResult = js.native
  
  /** search forward in the searchStr, starts at startPos and ends by endpos. The result is returned in the {@link SearchResult} . */
  def searchForward(searchStr: String, startPos: Double, endPos: Double): SearchResult = js.native
  
  /** set the options for the forward or backward search. */
  def setOptions(options: SearchOptions): Unit = js.native
}
object XTextSearch {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    searchBackward: (String, Double, Double) => SearchResult,
    searchForward: (String, Double, Double) => SearchResult,
    setOptions: SearchOptions => Unit
  ): XTextSearch = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), searchBackward = js.Any.fromFunction3(searchBackward), searchForward = js.Any.fromFunction3(searchForward), setOptions = js.Any.fromFunction1(setOptions))
    __obj.asInstanceOf[XTextSearch]
  }
  
  @scala.inline
  implicit class XTextSearchMutableBuilder[Self <: XTextSearch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSearchBackward(value: (String, Double, Double) => SearchResult): Self = StObject.set(x, "searchBackward", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSearchForward(value: (String, Double, Double) => SearchResult): Self = StObject.set(x, "searchForward", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSetOptions(value: SearchOptions => Unit): Self = StObject.set(x, "setOptions", js.Any.fromFunction1(value))
  }
}
