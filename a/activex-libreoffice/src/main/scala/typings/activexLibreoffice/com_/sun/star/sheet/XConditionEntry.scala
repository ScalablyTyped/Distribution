package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Abstract base interface for any conditional format
  *
  * Is extended by any conditional format entry, e.g. color scale, data bar, icon set, date formats, condition formats
  */
trait XConditionEntry
  extends StObject
     with XInterface {
  
  val Type: Double
  
  def getType(): Double
}
object XConditionEntry {
  
  inline def apply(
    Type: Double,
    acquire: () => Unit,
    getType: () => Double,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XConditionEntry = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getType = js.Any.fromFunction0(getType), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XConditionEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XConditionEntry] (val x: Self) extends AnyVal {
    
    inline def setGetType(value: () => Double): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
    
    inline def setType(value: Double): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
