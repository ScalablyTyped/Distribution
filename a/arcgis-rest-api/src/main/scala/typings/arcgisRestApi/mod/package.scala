package typings.arcgisRestApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Color = js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]
  
  type ElipticArc = typings.arcgisRestApi.mod.Arc
  
  type Position = typings.arcgisRestApi.mod.Position2D | (js.Tuple3[scala.Double, scala.Double, scala.Double]) | (js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double])
  
  type Position2D = js.Tuple2[scala.Double, scala.Double]
}
