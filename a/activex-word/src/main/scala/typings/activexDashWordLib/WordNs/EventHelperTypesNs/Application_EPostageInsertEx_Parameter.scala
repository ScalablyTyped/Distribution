package typings
package activexDashWordLib.WordNs.EventHelperTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Application_EPostageInsertEx_Parameter extends js.Object {
  val Doc: activexDashWordLib.WordNs.Document
  val bstrPaperFeed: java.lang.String
  val bstrPrinterName: java.lang.String
  val cpDeliveryAddrEnd: scala.Double
  val cpDeliveryAddrStart: scala.Double
  val cpReturnAddrEnd: scala.Double
  val cpReturnAddrStart: scala.Double
  var fCancel: scala.Boolean
  val fPrint: scala.Boolean
  val xaWidth: scala.Double
  val yaHeight: scala.Double
}

object Application_EPostageInsertEx_Parameter {
  @scala.inline
  def apply(
    Doc: activexDashWordLib.WordNs.Document,
    bstrPaperFeed: java.lang.String,
    bstrPrinterName: java.lang.String,
    cpDeliveryAddrEnd: scala.Double,
    cpDeliveryAddrStart: scala.Double,
    cpReturnAddrEnd: scala.Double,
    cpReturnAddrStart: scala.Double,
    fCancel: scala.Boolean,
    fPrint: scala.Boolean,
    xaWidth: scala.Double,
    yaHeight: scala.Double
  ): Application_EPostageInsertEx_Parameter = {
    val __obj = js.Dynamic.literal(Doc = Doc, bstrPaperFeed = bstrPaperFeed, bstrPrinterName = bstrPrinterName, cpDeliveryAddrEnd = cpDeliveryAddrEnd, cpDeliveryAddrStart = cpDeliveryAddrStart, cpReturnAddrEnd = cpReturnAddrEnd, cpReturnAddrStart = cpReturnAddrStart, fCancel = fCancel, fPrint = fPrint, xaWidth = xaWidth, yaHeight = yaHeight)
  
    __obj.asInstanceOf[Application_EPostageInsertEx_Parameter]
  }
}

