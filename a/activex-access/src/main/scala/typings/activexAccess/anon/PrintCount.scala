package typings.activexAccess.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrintCount extends StObject {
  
  var Cancel: Double = js.native
  
  var PrintCount: Double = js.native
}
object PrintCount {
  
  @scala.inline
  def apply(Cancel: Double, PrintCount: Double): PrintCount = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], PrintCount = PrintCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintCount]
  }
  
  @scala.inline
  implicit class PrintCountMutableBuilder[Self <: PrintCount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: Double): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrintCount(value: Double): Self = StObject.set(x, "PrintCount", value.asInstanceOf[js.Any])
  }
}
