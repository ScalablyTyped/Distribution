package typings.ariClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Only extends StObject {
  
  var only: js.UndefOr[String | js.Array[String]] = js.undefined
}
object Only {
  
  @scala.inline
  def apply(): Only = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Only]
  }
  
  @scala.inline
  implicit class OnlyMutableBuilder[Self <: Only] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnly(value: String | js.Array[String]): Self = StObject.set(x, "only", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnlyUndefined: Self = StObject.set(x, "only", js.undefined)
    
    @scala.inline
    def setOnlyVarargs(value: String*): Self = StObject.set(x, "only", js.Array(value :_*))
  }
}
