package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1` extends StObject {
  
  var `[default]`: Default
}
object `1` {
  
  inline def apply(`[default]`: Default): `1` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("[default]")(`[default]`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`]
  }
  
  extension [Self <: `1`](x: Self) {
    
    inline def `set[default]`(value: Default): Self = StObject.set(x, "[default]", value.asInstanceOf[js.Any])
  }
}
