package typings.antvScale

import typings.antvScale.libTypesMod.CreateTransform
import typings.antvScale.libTypesMod.Interpolator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsInterpolatizeMod {
  
  @JSImport("@antv/scale/lib/utils/interpolatize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def interpolatize(
    rangeOf: js.Function1[/* interpolator */ Interpolator, js.Array[Double]],
    normalizeDomain: CreateTransform
  ): js.Function1[/* Scale */ Any, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolatize")(rangeOf.asInstanceOf[js.Any], normalizeDomain.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* Scale */ Any, Unit]]
}
