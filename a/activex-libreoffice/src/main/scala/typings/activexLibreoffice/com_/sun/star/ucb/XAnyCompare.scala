package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** compares two `any` s. */
trait XAnyCompare
  extends StObject
     with XInterface {
  
  /**
    * allows comparison of two `any` s.
    * @param Any1 is the first compare value
    * @param Any2 is the second compare value
    * @returns `-1` , if the first any is less than the second ( Any1 < Any2 )`0` , if the first any is equal to the second ( Any1 == Any2 )`+1` , if the first
    */
  def compare(Any1: js.Any, Any2: js.Any): Double
}
object XAnyCompare {
  
  inline def apply(
    acquire: () => Unit,
    compare: (js.Any, js.Any) => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XAnyCompare = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), compare = js.Any.fromFunction2(compare), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XAnyCompare]
  }
  
  extension [Self <: XAnyCompare](x: Self) {
    
    inline def setCompare(value: (js.Any, js.Any) => Double): Self = StObject.set(x, "compare", js.Any.fromFunction2(value))
  }
}
