package typings.akamaiEdgeworkers.EW

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadsBody extends StObject {
  
  /**
    * A promise that reads the body to completion and resolves to an Object that is the result
    * of parsing the body as JSON.
    */
  def json(): js.Promise[Any]
  
  /**
    * A promise that reads the body to completion and resolves to a string containing the full
    * body decoded as UTF-8, using the replacement character on encoding errors.
    */
  def text(): js.Promise[String]
}
object ReadsBody {
  
  inline def apply(json: () => js.Promise[Any], text: () => js.Promise[String]): ReadsBody = {
    val __obj = js.Dynamic.literal(json = js.Any.fromFunction0(json), text = js.Any.fromFunction0(text))
    __obj.asInstanceOf[ReadsBody]
  }
  
  extension [Self <: ReadsBody](x: Self) {
    
    inline def setJson(value: () => js.Promise[Any]): Self = StObject.set(x, "json", js.Any.fromFunction0(value))
    
    inline def setText(value: () => js.Promise[String]): Self = StObject.set(x, "text", js.Any.fromFunction0(value))
  }
}
