package typings.aliApp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Date extends StObject {
  
  var date: String
}
object Date {
  
  @scala.inline
  def apply(date: String): Date = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
    __obj.asInstanceOf[Date]
  }
  
  @scala.inline
  implicit class DateMutableBuilder[Self <: Date] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
  }
}
