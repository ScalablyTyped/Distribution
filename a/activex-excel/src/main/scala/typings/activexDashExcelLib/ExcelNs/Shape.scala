package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.Shape")
@js.native
class Shape protected () extends js.Object {
  @JSName("Adjustments")
  val Adjustments_Original: Adjustments = js.native
  var AlternativeText: java.lang.String = js.native
  val Application: Application = js.native
  var AutoShapeType: activexDashOfficeLib.OfficeNs.MsoAutoShapeType = js.native
  var BackgroundStyle: activexDashOfficeLib.OfficeNs.MsoBackgroundStyleIndex = js.native
  var BlackWhiteMode: activexDashOfficeLib.OfficeNs.MsoBlackWhiteMode = js.native
  @JSName("BottomRightCell")
  val BottomRightCell_Original: Range = js.native
  val Callout: CalloutFormat = js.native
  @JSName("CanvasItems")
  val CanvasItems_Original: activexDashOfficeLib.OfficeNs.CanvasShapes = js.native
  val Chart: Chart = js.native
  val Child: activexDashOfficeLib.OfficeNs.MsoTriState = js.native
  val ConnectionSiteCount: scala.Double = js.native
  val Connector: activexDashOfficeLib.OfficeNs.MsoTriState = js.native
  val ConnectorFormat: ConnectorFormat = js.native
  val ControlFormat: ControlFormat = js.native
  val Creator: XlCreator = js.native
  val Diagram: Diagram = js.native
  val DiagramNode: DiagramNode = js.native
  val DrawingObject: js.Any = js.native
  var `Excel.Shape_typekey`: Shape = js.native
  val Fill: FillFormat = js.native
  val FormControlType: XlFormControl = js.native
  val Glow: activexDashOfficeLib.OfficeNs.GlowFormat = js.native
  @JSName("GroupItems")
  val GroupItems_Original: GroupShapes = js.native
  val HasChart: activexDashOfficeLib.OfficeNs.MsoTriState = js.native
  val HasDiagram: activexDashOfficeLib.OfficeNs.MsoTriState = js.native
  val HasDiagramNode: activexDashOfficeLib.OfficeNs.MsoTriState = js.native
  val HasSmartArt: activexDashOfficeLib.OfficeNs.MsoTriState = js.native
  var Height: scala.Double = js.native
  val HorizontalFlip: activexDashOfficeLib.OfficeNs.MsoTriState = js.native
  val Hyperlink: Hyperlink = js.native
  val ID: scala.Double = js.native
  var Left: scala.Double = js.native
  val Line: LineFormat = js.native
  val LinkFormat: LinkFormat = js.native
  var LockAspectRatio: activexDashOfficeLib.OfficeNs.MsoTriState = js.native
  var Locked: scala.Boolean = js.native
  var Name: java.lang.String = js.native
  @JSName("Nodes")
  val Nodes_Original: ShapeNodes = js.native
  val OLEFormat: OLEFormat = js.native
  var OnAction: java.lang.String = js.native
  val Parent: js.Any = js.native
  val ParentGroup: Shape = js.native
  val PictureFormat: PictureFormat = js.native
  var Placement: XlPlacement = js.native
  val Reflection: activexDashOfficeLib.OfficeNs.ReflectionFormat = js.native
  var Rotation: scala.Double = js.native
  val Script: activexDashOfficeLib.OfficeNs.Script = js.native
  val Shadow: ShadowFormat = js.native
  var ShapeStyle: activexDashOfficeLib.OfficeNs.MsoShapeStyleIndex = js.native
  val SmartArt: activexDashOfficeLib.OfficeNs.SmartArt = js.native
  val SoftEdge: activexDashOfficeLib.OfficeNs.SoftEdgeFormat = js.native
  val TextEffect: TextEffectFormat = js.native
  val TextFrame: TextFrame = js.native
  val TextFrame2: TextFrame2 = js.native
  val ThreeD: ThreeDFormat = js.native
  var Title: java.lang.String = js.native
  var Top: scala.Double = js.native
  @JSName("TopLeftCell")
  val TopLeftCell_Original: Range = js.native
  val Type: activexDashOfficeLib.OfficeNs.MsoShapeType = js.native
  val VerticalFlip: activexDashOfficeLib.OfficeNs.MsoTriState = js.native
  val Vertices: activexDashInteropLib.SafeArray[scala.Double] = js.native
  var Visible: activexDashOfficeLib.OfficeNs.MsoTriState = js.native
  var Width: scala.Double = js.native
  val ZOrderPosition: scala.Double = js.native
  def Adjustments(Index: scala.Double): scala.Double = js.native
  def Apply(): scala.Unit = js.native
  def BottomRightCell(Address: java.lang.String): Range = js.native
  def BottomRightCell(RowIndex: scala.Double): Range = js.native
  def BottomRightCell(RowIndex: scala.Double, ColumnIndex: scala.Double): Range = js.native
  def CanvasCropBottom(Increment: scala.Double): scala.Unit = js.native
  def CanvasCropLeft(Increment: scala.Double): scala.Unit = js.native
  def CanvasCropRight(Increment: scala.Double): scala.Unit = js.native
  def CanvasCropTop(Increment: scala.Double): scala.Unit = js.native
  def CanvasItems(Index: java.lang.String): activexDashOfficeLib.OfficeNs.Shape = js.native
  def CanvasItems(Index: scala.Double): activexDashOfficeLib.OfficeNs.Shape = js.native
  def Copy(): scala.Unit = js.native
  def CopyPicture(): scala.Unit = js.native
  def CopyPicture(Appearance: XlPictureAppearance): scala.Unit = js.native
  def CopyPicture(Appearance: XlPictureAppearance, Format: XlCopyPictureFormat): scala.Unit = js.native
  def Cut(): scala.Unit = js.native
  def Delete(): scala.Unit = js.native
  def Duplicate(): Shape = js.native
  def Flip(FlipCmd: activexDashOfficeLib.OfficeNs.MsoFlipCmd): scala.Unit = js.native
  def GroupItems(Index: java.lang.String): Shape = js.native
  def GroupItems(Index: scala.Double): Shape = js.native
  def IncrementLeft(Increment: scala.Double): scala.Unit = js.native
  def IncrementRotation(Increment: scala.Double): scala.Unit = js.native
  def IncrementTop(Increment: scala.Double): scala.Unit = js.native
  def Nodes(Index: java.lang.String): ShapeNode = js.native
  def Nodes(Index: scala.Double): ShapeNode = js.native
  def PickUp(): scala.Unit = js.native
  def RerouteConnections(): scala.Unit = js.native
  def ScaleHeight(Factor: scala.Double, RelativeToOriginalSize: activexDashOfficeLib.OfficeNs.MsoTriState): scala.Unit = js.native
  def ScaleHeight(
    Factor: scala.Double,
    RelativeToOriginalSize: activexDashOfficeLib.OfficeNs.MsoTriState,
    Scale: activexDashOfficeLib.OfficeNs.MsoScaleFrom
  ): scala.Unit = js.native
  def ScaleWidth(Factor: scala.Double, RelativeToOriginalSize: activexDashOfficeLib.OfficeNs.MsoTriState): scala.Unit = js.native
  def ScaleWidth(
    Factor: scala.Double,
    RelativeToOriginalSize: activexDashOfficeLib.OfficeNs.MsoTriState,
    Scale: activexDashOfficeLib.OfficeNs.MsoScaleFrom
  ): scala.Unit = js.native
  def Select(): scala.Unit = js.native
  def Select(Replace: scala.Boolean): scala.Unit = js.native
  def SetShapesDefaultProperties(): scala.Unit = js.native
  def TopLeftCell(Address: java.lang.String): Range = js.native
  def TopLeftCell(RowIndex: scala.Double): Range = js.native
  def TopLeftCell(RowIndex: scala.Double, ColumnIndex: scala.Double): Range = js.native
  def Ungroup(): ShapeRange = js.native
  def ZOrder(ZOrderCmd: activexDashOfficeLib.OfficeNs.MsoZOrderCmd): scala.Unit = js.native
}

