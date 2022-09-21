package typings.antvG2plot.anon

import typings.antvG2plot.metaMod.Meta
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@antv/g2plot.@antv/g2plot/lib/types.Options, 'meta'> */
trait PickOptionsmeta extends StObject {
  
  var meta: js.UndefOr[Record[String, Meta]] = js.undefined
}
object PickOptionsmeta {
  
  inline def apply(): PickOptionsmeta = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickOptionsmeta]
  }
  
  extension [Self <: PickOptionsmeta](x: Self) {
    
    inline def setMeta(value: Record[String, Meta]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
  }
}
