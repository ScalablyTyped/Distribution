package typings.akamaiEdgeworkers.EW

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadsHeaders extends StObject {
  
  /**
    * Provides header values by header name
    */
  def getHeader(name: String): js.Array[String] | Null
}
object ReadsHeaders {
  
  inline def apply(getHeader: String => js.Array[String] | Null): ReadsHeaders = {
    val __obj = js.Dynamic.literal(getHeader = js.Any.fromFunction1(getHeader))
    __obj.asInstanceOf[ReadsHeaders]
  }
  
  extension [Self <: ReadsHeaders](x: Self) {
    
    inline def setGetHeader(value: String => js.Array[String] | Null): Self = StObject.set(x, "getHeader", js.Any.fromFunction1(value))
  }
}
