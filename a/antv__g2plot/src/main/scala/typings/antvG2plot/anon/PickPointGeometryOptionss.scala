package typings.antvG2plot.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@antv/g2plot.@antv/g2plot/lib/adaptor/geometries.PointGeometryOptions, 'state'> */
trait PickPointGeometryOptionss extends StObject {
  
  var state: js.UndefOr[typings.antvG2plot.libTypesStateMod.State] = js.undefined
}
object PickPointGeometryOptionss {
  
  inline def apply(): PickPointGeometryOptionss = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickPointGeometryOptionss]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickPointGeometryOptionss] (val x: Self) extends AnyVal {
    
    inline def setState(value: typings.antvG2plot.libTypesStateMod.State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
