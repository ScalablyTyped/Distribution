package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdMeasurementUnits extends js.Object

@JSGlobal("Word.WdMeasurementUnits")
@js.native
object WdMeasurementUnits extends js.Object {
  @js.native
  sealed trait wdCentimeters
    extends activexDashWordLib.WordNs.WdMeasurementUnits
  
  @js.native
  sealed trait wdInches
    extends activexDashWordLib.WordNs.WdMeasurementUnits
  
  @js.native
  sealed trait wdMillimeters
    extends activexDashWordLib.WordNs.WdMeasurementUnits
  
  @js.native
  sealed trait wdPicas
    extends activexDashWordLib.WordNs.WdMeasurementUnits
  
  @js.native
  sealed trait wdPoints
    extends activexDashWordLib.WordNs.WdMeasurementUnits
  
  /* 1 */ val wdCentimeters: wdCentimeters with scala.Double = js.native
  /* 0 */ val wdInches: wdInches with scala.Double = js.native
  /* 2 */ val wdMillimeters: wdMillimeters with scala.Double = js.native
  /* 4 */ val wdPicas: wdPicas with scala.Double = js.native
  /* 3 */ val wdPoints: wdPoints with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdMeasurementUnits with scala.Double] = js.native
}

