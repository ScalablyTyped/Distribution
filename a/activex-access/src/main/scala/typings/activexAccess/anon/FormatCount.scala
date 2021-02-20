package typings.activexAccess.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormatCount extends StObject {
  
  var Cancel: Double = js.native
  
  var FormatCount: Double = js.native
}
object FormatCount {
  
  @scala.inline
  def apply(Cancel: Double, FormatCount: Double): FormatCount = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], FormatCount = FormatCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatCount]
  }
  
  @scala.inline
  implicit class FormatCountMutableBuilder[Self <: FormatCount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: Double): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatCount(value: Double): Self = StObject.set(x, "FormatCount", value.asInstanceOf[js.Any])
  }
}
