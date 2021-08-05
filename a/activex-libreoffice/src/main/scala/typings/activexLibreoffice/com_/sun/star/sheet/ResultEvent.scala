package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * contains the new value of a volatile function result.
  * @see com.sun.star.sheet.XVolatileResult
  */
trait ResultEvent
  extends StObject
     with EventObject {
  
  /**
    * contains the value.
    *
    * This can be any of the possible return types described for the {@link AddIn} service, except {@link XVolatileResult} .
    */
  var Value: js.Any
}
object ResultEvent {
  
  inline def apply(Source: XInterface, Value: js.Any): ResultEvent = {
    val __obj = js.Dynamic.literal(Source = Source.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultEvent]
  }
  
  extension [Self <: ResultEvent](x: Self) {
    
    inline def setValue(value: js.Any): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
