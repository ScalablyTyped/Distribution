package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RoutingSlip extends StObject {
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  val Creator: XlCreator = js.native
  
  var Delivery: XlRoutingSlipDelivery = js.native
  
  /* private */ @JSName("Excel.RoutingSlip_typekey")
  var ExcelDotRoutingSlip_typekey: RoutingSlip = js.native
  
  var Message: js.Any = js.native
  
  val Parent: js.Any = js.native
  
  def Recipients(): js.Any = js.native
  def Recipients(Index: js.Any): js.Any = js.native
  
  def Reset(): js.Any = js.native
  
  var ReturnWhenDone: Boolean = js.native
  
  val Status: XlRoutingSlipStatus = js.native
  
  var Subject: js.Any = js.native
  
  var TrackStatus: Boolean = js.native
}
