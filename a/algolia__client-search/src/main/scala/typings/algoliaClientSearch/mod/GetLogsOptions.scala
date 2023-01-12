package typings.algoliaClientSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLogsOptions extends StObject {
  
  /**
    * The length size.
    */
  val length: Double
  
  /**
    * The offset.
    */
  val offset: Double
}
object GetLogsOptions {
  
  inline def apply(length: Double, offset: Double): GetLogsOptions = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLogsOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetLogsOptions] (val x: Self) extends AnyVal {
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
  }
}
