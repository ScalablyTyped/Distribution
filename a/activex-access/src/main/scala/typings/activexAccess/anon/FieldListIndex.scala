package typings.activexAccess.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldListIndex extends StObject {
  
  val FieldListIndex: Double
}
object FieldListIndex {
  
  inline def apply(FieldListIndex: Double): FieldListIndex = {
    val __obj = js.Dynamic.literal(FieldListIndex = FieldListIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldListIndex]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FieldListIndex] (val x: Self) extends AnyVal {
    
    inline def setFieldListIndex(value: Double): Self = StObject.set(x, "FieldListIndex", value.asInstanceOf[js.Any])
  }
}
