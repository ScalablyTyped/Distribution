package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This interface enables the object to handle numbering rules.
  * @see com.sun.star.text.NumberingRules
  */
trait XNumberingRulesSupplier
  extends StObject
     with XInterface {
  
  /** @returns the collection of "NumberingRules" currently contained in the object. */
  val NumberingRules: XIndexAccess
  
  /** @returns the collection of "NumberingRules" currently contained in the object. */
  def getNumberingRules(): XIndexAccess
}
object XNumberingRulesSupplier {
  
  inline def apply(
    NumberingRules: XIndexAccess,
    acquire: () => Unit,
    getNumberingRules: () => XIndexAccess,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XNumberingRulesSupplier = {
    val __obj = js.Dynamic.literal(NumberingRules = NumberingRules.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getNumberingRules = js.Any.fromFunction0(getNumberingRules), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XNumberingRulesSupplier]
  }
  
  extension [Self <: XNumberingRulesSupplier](x: Self) {
    
    inline def setGetNumberingRules(value: () => XIndexAccess): Self = StObject.set(x, "getNumberingRules", js.Any.fromFunction0(value))
    
    inline def setNumberingRules(value: XIndexAccess): Self = StObject.set(x, "NumberingRules", value.asInstanceOf[js.Any])
  }
}
