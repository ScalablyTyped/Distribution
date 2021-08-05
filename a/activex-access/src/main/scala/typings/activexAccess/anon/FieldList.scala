package typings.activexAccess.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldList extends StObject {
  
  val FieldList: Double
}
object FieldList {
  
  inline def apply(FieldList: Double): FieldList = {
    val __obj = js.Dynamic.literal(FieldList = FieldList.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldList]
  }
  
  extension [Self <: FieldList](x: Self) {
    
    inline def setFieldList(value: Double): Self = StObject.set(x, "FieldList", value.asInstanceOf[js.Any])
  }
}
