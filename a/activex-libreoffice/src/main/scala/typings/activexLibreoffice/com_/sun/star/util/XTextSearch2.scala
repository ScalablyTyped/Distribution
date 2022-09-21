package typings.activexLibreoffice.com_.sun.star.util

import typings.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** enables an object to search in its content. */
trait XTextSearch2
  extends StObject
     with XTextSearch {
  
  /** set the options for the forward or backward search. */
  def setOptions2(options: SearchOptions2): Unit
}
object XTextSearch2 {
  
  inline def apply(
    acquire: () => Unit,
    queryInterface: `type` => Any,
    release: () => Unit,
    searchBackward: (String, Double, Double) => SearchResult,
    searchForward: (String, Double, Double) => SearchResult,
    setOptions: SearchOptions => Unit,
    setOptions2: SearchOptions2 => Unit
  ): XTextSearch2 = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), searchBackward = js.Any.fromFunction3(searchBackward), searchForward = js.Any.fromFunction3(searchForward), setOptions = js.Any.fromFunction1(setOptions), setOptions2 = js.Any.fromFunction1(setOptions2))
    __obj.asInstanceOf[XTextSearch2]
  }
  
  extension [Self <: XTextSearch2](x: Self) {
    
    inline def setSetOptions2(value: SearchOptions2 => Unit): Self = StObject.set(x, "setOptions2", js.Any.fromFunction1(value))
  }
}
