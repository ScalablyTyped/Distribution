package typings.activexDashPowerpoint.PowerPointNs

import typings.activexDashOffice.OfficeNs.GlowFormat
import typings.activexDashOffice.OfficeNs.MsoAlignCmd
import typings.activexDashOffice.OfficeNs.MsoAutoShapeType
import typings.activexDashOffice.OfficeNs.MsoBackgroundStyleIndex
import typings.activexDashOffice.OfficeNs.MsoBlackWhiteMode
import typings.activexDashOffice.OfficeNs.MsoDistributeCmd
import typings.activexDashOffice.OfficeNs.MsoFlipCmd
import typings.activexDashOffice.OfficeNs.MsoScaleFrom
import typings.activexDashOffice.OfficeNs.MsoShapeStyleIndex
import typings.activexDashOffice.OfficeNs.MsoShapeType
import typings.activexDashOffice.OfficeNs.MsoTriState
import typings.activexDashOffice.OfficeNs.MsoZOrderCmd
import typings.activexDashOffice.OfficeNs.ReflectionFormat
import typings.activexDashOffice.OfficeNs.SmartArtLayout
import typings.activexDashOffice.OfficeNs.SoftEdgeFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.ShapeRange")
@js.native
class ShapeRange protected () extends js.Object {
  val ActionSettings: typings.activexDashPowerpoint.PowerPointNs.ActionSettings = js.native
  val Adjustments: typings.activexDashPowerpoint.PowerPointNs.Adjustments = js.native
  var AlternativeText: String = js.native
  val AnimationSettings: typings.activexDashPowerpoint.PowerPointNs.AnimationSettings = js.native
  val Application: js.Any = js.native
  var AutoShapeType: MsoAutoShapeType = js.native
  var BackgroundStyle: MsoBackgroundStyleIndex = js.native
  var BlackWhiteMode: MsoBlackWhiteMode = js.native
  val Callout: CalloutFormat = js.native
  val CanvasItems: CanvasShapes = js.native
  val Chart: typings.activexDashPowerpoint.PowerPointNs.Chart = js.native
  val Child: MsoTriState = js.native
  val ConnectionSiteCount: Double = js.native
  val Connector: MsoTriState = js.native
  val ConnectorFormat: typings.activexDashPowerpoint.PowerPointNs.ConnectorFormat = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val CustomerData: typings.activexDashPowerpoint.PowerPointNs.CustomerData = js.native
  val Diagram: typings.activexDashPowerpoint.PowerPointNs.Diagram = js.native
  val DiagramNode: typings.activexDashPowerpoint.PowerPointNs.DiagramNode = js.native
  val Fill: FillFormat = js.native
  val Glow: GlowFormat = js.native
  val GroupItems: GroupShapes = js.native
  val HasChart: MsoTriState = js.native
  val HasDiagram: MsoTriState = js.native
  val HasDiagramNode: MsoTriState = js.native
  val HasSmartArt: MsoTriState = js.native
  val HasTable: MsoTriState = js.native
  val HasTextFrame: MsoTriState = js.native
  var Height: Double = js.native
  val HorizontalFlip: MsoTriState = js.native
  val Id: Double = js.native
  var Left: Double = js.native
  val Line: LineFormat = js.native
  val LinkFormat: typings.activexDashPowerpoint.PowerPointNs.LinkFormat = js.native
  var LockAspectRatio: MsoTriState = js.native
  val MediaFormat: typings.activexDashPowerpoint.PowerPointNs.MediaFormat = js.native
  val MediaType: PpMediaType = js.native
  var Name: String = js.native
  val Nodes: ShapeNodes = js.native
  val OLEFormat: typings.activexDashPowerpoint.PowerPointNs.OLEFormat = js.native
  val Parent: js.Any = js.native
  val ParentGroup: Shape = js.native
  val PictureFormat: typings.activexDashPowerpoint.PowerPointNs.PictureFormat = js.native
  val PlaceholderFormat: typings.activexDashPowerpoint.PowerPointNs.PlaceholderFormat = js.native
  var `PowerPoint.ShapeRange_typekey`: ShapeRange = js.native
  val RTF: String = js.native
  val Reflection: ReflectionFormat = js.native
  var Rotation: Double = js.native
  val Script: typings.activexDashOffice.OfficeNs.Script = js.native
  val Shadow: ShadowFormat = js.native
  var ShapeStyle: MsoShapeStyleIndex = js.native
  val SmartArt: typings.activexDashOffice.OfficeNs.SmartArt = js.native
  val SoftEdge: SoftEdgeFormat = js.native
  val SoundFormat: typings.activexDashPowerpoint.PowerPointNs.SoundFormat = js.native
  val Table: typings.activexDashPowerpoint.PowerPointNs.Table = js.native
  val Tags: typings.activexDashPowerpoint.PowerPointNs.Tags = js.native
  val TextEffect: TextEffectFormat = js.native
  val TextFrame: typings.activexDashPowerpoint.PowerPointNs.TextFrame = js.native
  val TextFrame2: typings.activexDashPowerpoint.PowerPointNs.TextFrame2 = js.native
  val ThreeD: ThreeDFormat = js.native
  var Title: String = js.native
  var Top: Double = js.native
  val Type: MsoShapeType = js.native
  val VerticalFlip: MsoTriState = js.native
  val Vertices: js.Any = js.native
  var Visible: MsoTriState = js.native
  var Width: Double = js.native
  val ZOrderPosition: Double = js.native
  def Align(AlignCmd: MsoAlignCmd, RelativeTo: MsoTriState): Unit = js.native
  def Apply(): Unit = js.native
  def ApplyAnimation(): Unit = js.native
  def CanvasCropBottom(Increment: Double): Unit = js.native
  def CanvasCropLeft(Increment: Double): Unit = js.native
  def CanvasCropRight(Increment: Double): Unit = js.native
  def CanvasCropTop(Increment: Double): Unit = js.native
  def ConvertTextToSmartArt(Layout: SmartArtLayout): Unit = js.native
  def Copy(): Unit = js.native
  def Cut(): Unit = js.native
  def Delete(): Unit = js.native
  def Distribute(DistributeCmd: MsoDistributeCmd, RelativeTo: MsoTriState): Unit = js.native
  def Duplicate(): ShapeRange = js.native
  /**
    * @param number [ScaleWidth=0]
    * @param number [ScaleHeight=0]
    * @param PowerPoint.PpExportMode [ExportMode=1]
    */
  def Export(PathName: String, Filter: PpShapeFormat): Unit = js.native
  def Export(PathName: String, Filter: PpShapeFormat, ScaleWidth: Double): Unit = js.native
  def Export(PathName: String, Filter: PpShapeFormat, ScaleWidth: Double, ScaleHeight: Double): Unit = js.native
  def Export(
    PathName: String,
    Filter: PpShapeFormat,
    ScaleWidth: Double,
    ScaleHeight: Double,
    ExportMode: PpExportMode
  ): Unit = js.native
  def Flip(FlipCmd: MsoFlipCmd): Unit = js.native
  def Group(): Shape = js.native
  def IncrementLeft(Increment: Double): Unit = js.native
  def IncrementRotation(Increment: Double): Unit = js.native
  def IncrementTop(Increment: Double): Unit = js.native
  def Item(Index: js.Any): Shape = js.native
  def PickUp(): Unit = js.native
  def PickupAnimation(): Unit = js.native
  def Regroup(): Shape = js.native
  def RerouteConnections(): Unit = js.native
  /** @param Office.MsoScaleFrom [fScale=0] */
  def ScaleHeight(Factor: Double, RelativeToOriginalSize: MsoTriState): Unit = js.native
  def ScaleHeight(Factor: Double, RelativeToOriginalSize: MsoTriState, fScale: MsoScaleFrom): Unit = js.native
  /** @param Office.MsoScaleFrom [fScale=0] */
  def ScaleWidth(Factor: Double, RelativeToOriginalSize: MsoTriState): Unit = js.native
  def ScaleWidth(Factor: Double, RelativeToOriginalSize: MsoTriState, fScale: MsoScaleFrom): Unit = js.native
  /** @param Office.MsoTriState [Replace=-1] */
  def Select(): Unit = js.native
  def Select(Replace: MsoTriState): Unit = js.native
  def SetShapesDefaultProperties(): Unit = js.native
  def Ungroup(): ShapeRange = js.native
  def UpgradeMedia(): Unit = js.native
  def ZOrder(ZOrderCmd: MsoZOrderCmd): Unit = js.native
}

