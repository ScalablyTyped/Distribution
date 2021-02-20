package typings.activexAccess.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FieldListIndex extends StObject {
  
  val FieldListIndex: Double = js.native
}
object FieldListIndex {
  
  @scala.inline
  def apply(FieldListIndex: Double): FieldListIndex = {
    val __obj = js.Dynamic.literal(FieldListIndex = FieldListIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldListIndex]
  }
  
  @scala.inline
  implicit class FieldListIndexMutableBuilder[Self <: FieldListIndex] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFieldListIndex(value: Double): Self = StObject.set(x, "FieldListIndex", value.asInstanceOf[js.Any])
  }
}
