package typings.antvG2plot.anon

import typings.antvG2plot.libTypesAnnotationMod.Annotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@antv/g2plot.@antv/g2plot/lib/types.Options, 'annotations'> */
trait PickOptionsannotations extends StObject {
  
  var annotations: js.UndefOr[js.Array[Annotation]] = js.undefined
}
object PickOptionsannotations {
  
  inline def apply(): PickOptionsannotations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickOptionsannotations]
  }
  
  extension [Self <: PickOptionsannotations](x: Self) {
    
    inline def setAnnotations(value: js.Array[Annotation]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
    
    inline def setAnnotationsVarargs(value: Annotation*): Self = StObject.set(x, "annotations", js.Array(value*))
  }
}
