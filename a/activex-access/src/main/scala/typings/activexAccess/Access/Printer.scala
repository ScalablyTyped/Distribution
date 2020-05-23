package typings.activexAccess.Access

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Printer extends js.Object {
  @JSName("Access.Printer_typekey")
  var AccessDotPrinter_typekey: Printer
  var BottomMargin: Double
  var ColorMode: AcPrintColor
  var ColumnSpacing: Double
  var Copies: Double
  var DataOnly: Boolean
  var DefaultSize: Boolean
  val DeviceName: String
  val DriverName: String
  var Duplex: AcPrintDuplex
  var ItemLayout: AcPrintItemLayout
  var ItemSizeHeight: Double
  var ItemSizeWidth: Double
  var ItemsAcross: Double
  var LeftMargin: Double
  var Orientation: AcPrintOrientation
  var PaperBin: AcPrintPaperBin
  var PaperSize: AcPrintPaperSize
  val Port: String
  var PrintQuality: AcPrintObjQuality
  var RightMargin: Double
  var RowSpacing: Double
  var TopMargin: Double
  def IsMemberSafe(dispid: Double): Boolean
}

object Printer {
  @scala.inline
  def apply(
    AccessDotPrinter_typekey: Printer,
    BottomMargin: Double,
    ColorMode: AcPrintColor,
    ColumnSpacing: Double,
    Copies: Double,
    DataOnly: Boolean,
    DefaultSize: Boolean,
    DeviceName: String,
    DriverName: String,
    Duplex: AcPrintDuplex,
    IsMemberSafe: Double => Boolean,
    ItemLayout: AcPrintItemLayout,
    ItemSizeHeight: Double,
    ItemSizeWidth: Double,
    ItemsAcross: Double,
    LeftMargin: Double,
    Orientation: AcPrintOrientation,
    PaperBin: AcPrintPaperBin,
    PaperSize: AcPrintPaperSize,
    Port: String,
    PrintQuality: AcPrintObjQuality,
    RightMargin: Double,
    RowSpacing: Double,
    TopMargin: Double
  ): Printer = {
    val __obj = js.Dynamic.literal(BottomMargin = BottomMargin.asInstanceOf[js.Any], ColorMode = ColorMode.asInstanceOf[js.Any], ColumnSpacing = ColumnSpacing.asInstanceOf[js.Any], Copies = Copies.asInstanceOf[js.Any], DataOnly = DataOnly.asInstanceOf[js.Any], DefaultSize = DefaultSize.asInstanceOf[js.Any], DeviceName = DeviceName.asInstanceOf[js.Any], DriverName = DriverName.asInstanceOf[js.Any], Duplex = Duplex.asInstanceOf[js.Any], IsMemberSafe = js.Any.fromFunction1(IsMemberSafe), ItemLayout = ItemLayout.asInstanceOf[js.Any], ItemSizeHeight = ItemSizeHeight.asInstanceOf[js.Any], ItemSizeWidth = ItemSizeWidth.asInstanceOf[js.Any], ItemsAcross = ItemsAcross.asInstanceOf[js.Any], LeftMargin = LeftMargin.asInstanceOf[js.Any], Orientation = Orientation.asInstanceOf[js.Any], PaperBin = PaperBin.asInstanceOf[js.Any], PaperSize = PaperSize.asInstanceOf[js.Any], Port = Port.asInstanceOf[js.Any], PrintQuality = PrintQuality.asInstanceOf[js.Any], RightMargin = RightMargin.asInstanceOf[js.Any], RowSpacing = RowSpacing.asInstanceOf[js.Any], TopMargin = TopMargin.asInstanceOf[js.Any])
    __obj.updateDynamic("Access.Printer_typekey")(AccessDotPrinter_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Printer]
  }
}

