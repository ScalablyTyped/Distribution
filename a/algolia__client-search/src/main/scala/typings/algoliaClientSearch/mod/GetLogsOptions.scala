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
  
  @scala.inline
  def apply(length: Double, offset: Double): GetLogsOptions = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLogsOptions]
  }
  
  @scala.inline
  implicit class GetLogsOptionsMutableBuilder[Self <: GetLogsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
  }
}
