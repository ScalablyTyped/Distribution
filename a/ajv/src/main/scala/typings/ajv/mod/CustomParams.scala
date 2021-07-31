package typings.ajv.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomParams
  extends StObject
     with ErrorParameters {
  
  var keyword: String
}
object CustomParams {
  
  @scala.inline
  def apply(keyword: String): CustomParams = {
    val __obj = js.Dynamic.literal(keyword = keyword.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomParams]
  }
  
  @scala.inline
  implicit class CustomParamsMutableBuilder[Self <: CustomParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeyword(value: String): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
  }
}
