package typings.activexExcel.anon

import typings.activexExcel.Excel.PivotTable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  val Target: PivotTable
}
object `0` {
  
  inline def apply(Target: PivotTable): `0` = {
    val __obj = js.Dynamic.literal(Target = Target.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
  
  extension [Self <: `0`](x: Self) {
    
    inline def setTarget(value: PivotTable): Self = StObject.set(x, "Target", value.asInstanceOf[js.Any])
  }
}
