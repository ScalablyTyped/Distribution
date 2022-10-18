package typings.antd.anon

import org.scalablytyped.runtime.StringDictionary
import typings.antd.libProgressProgressMod.ProgressGradient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined antd.antd/lib/progress/progress.StringGradients & {  direction :string | undefined} */
trait StringGradientsdirections
  extends StObject
     with /* percentage */ StringDictionary[String]
     with ProgressGradient {
  
  var direction: js.UndefOr[String] = js.undefined
}
object StringGradientsdirections {
  
  inline def apply(): StringGradientsdirections = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StringGradientsdirections]
  }
  
  extension [Self <: StringGradientsdirections](x: Self) {
    
    inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
  }
}
