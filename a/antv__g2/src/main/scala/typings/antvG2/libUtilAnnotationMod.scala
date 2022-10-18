package typings.antvG2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilAnnotationMod {
  
  @JSImport("@antv/g2/lib/util/annotation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getNormalizedValue(
    `val`: String,
    scale: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Scale */ Any
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getNormalizedValue")(`val`.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getNormalizedValue(
    `val`: Double,
    scale: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Scale */ Any
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getNormalizedValue")(`val`.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[Double]
}
