package typings.activexAccess.Access

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Printer extends StObject {
  
  @JSName("Access.Printer_typekey")
  var AccessDotPrinter_typekey: Printer = js.native
  
  var BottomMargin: Double = js.native
  
  var ColorMode: AcPrintColor = js.native
  
  var ColumnSpacing: Double = js.native
  
  var Copies: Double = js.native
  
  var DataOnly: Boolean = js.native
  
  var DefaultSize: Boolean = js.native
  
  val DeviceName: String = js.native
  
  val DriverName: String = js.native
  
  var Duplex: AcPrintDuplex = js.native
  
  def IsMemberSafe(dispid: Double): Boolean = js.native
  
  var ItemLayout: AcPrintItemLayout = js.native
  
  var ItemSizeHeight: Double = js.native
  
  var ItemSizeWidth: Double = js.native
  
  var ItemsAcross: Double = js.native
  
  var LeftMargin: Double = js.native
  
  var Orientation: AcPrintOrientation = js.native
  
  var PaperBin: AcPrintPaperBin = js.native
  
  var PaperSize: AcPrintPaperSize = js.native
  
  val Port: String = js.native
  
  var PrintQuality: AcPrintObjQuality = js.native
  
  var RightMargin: Double = js.native
  
  var RowSpacing: Double = js.native
  
  var TopMargin: Double = js.native
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
  
  @scala.inline
  implicit class PrinterMutableBuilder[Self <: Printer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessDotPrinter_typekey(value: Printer): Self = StObject.set(x, "Access.Printer_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomMargin(value: Double): Self = StObject.set(x, "BottomMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorMode(value: AcPrintColor): Self = StObject.set(x, "ColorMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnSpacing(value: Double): Self = StObject.set(x, "ColumnSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopies(value: Double): Self = StObject.set(x, "Copies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataOnly(value: Boolean): Self = StObject.set(x, "DataOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultSize(value: Boolean): Self = StObject.set(x, "DefaultSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceName(value: String): Self = StObject.set(x, "DeviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDriverName(value: String): Self = StObject.set(x, "DriverName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuplex(value: AcPrintDuplex): Self = StObject.set(x, "Duplex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMemberSafe(value: Double => Boolean): Self = StObject.set(x, "IsMemberSafe", js.Any.fromFunction1(value))
    
    @scala.inline
    def setItemLayout(value: AcPrintItemLayout): Self = StObject.set(x, "ItemLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemSizeHeight(value: Double): Self = StObject.set(x, "ItemSizeHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemSizeWidth(value: Double): Self = StObject.set(x, "ItemSizeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsAcross(value: Double): Self = StObject.set(x, "ItemsAcross", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftMargin(value: Double): Self = StObject.set(x, "LeftMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientation(value: AcPrintOrientation): Self = StObject.set(x, "Orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaperBin(value: AcPrintPaperBin): Self = StObject.set(x, "PaperBin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaperSize(value: AcPrintPaperSize): Self = StObject.set(x, "PaperSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPort(value: String): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrintQuality(value: AcPrintObjQuality): Self = StObject.set(x, "PrintQuality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightMargin(value: Double): Self = StObject.set(x, "RightMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowSpacing(value: Double): Self = StObject.set(x, "RowSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopMargin(value: Double): Self = StObject.set(x, "TopMargin", value.asInstanceOf[js.Any])
  }
}
