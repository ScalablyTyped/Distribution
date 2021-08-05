package typings.activexExcel.anon

import typings.activexExcel.Excel.Hyperlink
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetHyperlink extends StObject {
  
  val Target: Hyperlink
}
object TargetHyperlink {
  
  inline def apply(Target: Hyperlink): TargetHyperlink = {
    val __obj = js.Dynamic.literal(Target = Target.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetHyperlink]
  }
  
  extension [Self <: TargetHyperlink](x: Self) {
    
    inline def setTarget(value: Hyperlink): Self = StObject.set(x, "Target", value.asInstanceOf[js.Any])
  }
}
