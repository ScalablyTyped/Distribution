package typings.amapJsApiTransfer.AMap.Transfer

import typings.amapJsApiTransfer.amapJsApiTransferStrings.BUS
import typings.amapJsApiTransfer.amapJsApiTransferStrings.METRO_RAIL
import typings.amapJsApiTransfer.amapJsApiTransferStrings.RAILWAY
import typings.amapJsApiTransfer.amapJsApiTransferStrings.SUBWAY
import typings.amapJsApiTransfer.amapJsApiTransferStrings.TAXI
import typings.amapJsApiTransfer.amapJsApiTransferStrings.WALK
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.amapJsApiTransfer.AMap.Transfer.WalkSegment
  - typings.amapJsApiTransfer.AMap.Transfer.TaxiSegment
  - typings.amapJsApiTransfer.AMap.Transfer.TransitSegment
  - typings.amapJsApiTransfer.AMap.Transfer.RailwaySegment
*/
trait Segment extends js.Object

object Segment {
  @scala.inline
  def WalkSegment(distance: Double, instruction: String, time: Double, transit: WalkDetails, transit_mode: WALK): Segment = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], instruction = instruction.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], transit = transit.asInstanceOf[js.Any], transit_mode = transit_mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Segment]
  }
  @scala.inline
  def TaxiSegment(distance: Double, instruction: String, time: Double, transit: TaxiDetails, transit_mode: TAXI): Segment = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], instruction = instruction.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], transit = transit.asInstanceOf[js.Any], transit_mode = transit_mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Segment]
  }
  @scala.inline
  def TransitSegment(
    distance: Double,
    instruction: String,
    time: Double,
    transit: TransitDetails,
    transit_mode: SUBWAY | METRO_RAIL | BUS
  ): Segment = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], instruction = instruction.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], transit = transit.asInstanceOf[js.Any], transit_mode = transit_mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Segment]
  }
  @scala.inline
  def RailwaySegment(
    distance: Double,
    instruction: String,
    time: Double,
    transit: RailwayDetails,
    transit_mode: RAILWAY
  ): Segment = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], instruction = instruction.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], transit = transit.asInstanceOf[js.Any], transit_mode = transit_mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Segment]
  }
}

