package typings.antvCoord

import typings.antvCoord.typeMod.Transform
import typings.antvCoord.typeMod.Vector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("@antv/coord/lib/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def adjustAngle(theta: Double, min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("adjustAngle")(theta.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def compose[T](fn: js.Function1[/* x */ T, T], rest: (js.Function1[/* x */ T, T])*): js.Function1[/* x */ T, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("compose")(List(fn.asInstanceOf[js.Any]).`++`(rest.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.Function1[/* x */ T, T]]
  inline def compose[T](fn: Unit, rest: (js.Function1[/* x */ T, T])*): js.Function1[/* x */ T, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("compose")(List(fn.asInstanceOf[js.Any]).`++`(rest.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.Function1[/* x */ T, T]]
  
  inline def extend(transform: Transform): js.Function1[/* vector */ Vector, js.Array[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(transform.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* vector */ Vector, js.Array[Any]]]
  
  inline def isMatrix(transformer: Any): /* is @antv/coord.@antv/coord/lib/type.Matrix3 */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMatrix")(transformer.asInstanceOf[js.Any]).asInstanceOf[/* is @antv/coord.@antv/coord/lib/type.Matrix3 */ Boolean]
}
