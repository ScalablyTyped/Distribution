package typings.antd.anon

import typings.antd.libConfigProviderSizeContextMod.SizeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompactDirection extends StObject {
  
  var compactDirection: js.UndefOr["horizontal" | "vertical"] = js.undefined
  
  var compactItemClassnames: String
  
  var compactSize: SizeType
}
object CompactDirection {
  
  inline def apply(compactItemClassnames: String): CompactDirection = {
    val __obj = js.Dynamic.literal(compactItemClassnames = compactItemClassnames.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompactDirection]
  }
  
  extension [Self <: CompactDirection](x: Self) {
    
    inline def setCompactDirection(value: "horizontal" | "vertical"): Self = StObject.set(x, "compactDirection", value.asInstanceOf[js.Any])
    
    inline def setCompactDirectionUndefined: Self = StObject.set(x, "compactDirection", js.undefined)
    
    inline def setCompactItemClassnames(value: String): Self = StObject.set(x, "compactItemClassnames", value.asInstanceOf[js.Any])
    
    inline def setCompactSize(value: SizeType): Self = StObject.set(x, "compactSize", value.asInstanceOf[js.Any])
    
    inline def setCompactSizeUndefined: Self = StObject.set(x, "compactSize", js.undefined)
  }
}
