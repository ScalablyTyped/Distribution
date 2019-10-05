package typings.activexDashPowerpoint.PowerPoint

import typings.activexDashOffice.Office.GlowFormat
import typings.activexDashOffice.Office.MsoAutoShapeType
import typings.activexDashOffice.Office.MsoBackgroundStyleIndex
import typings.activexDashOffice.Office.MsoBlackWhiteMode
import typings.activexDashOffice.Office.MsoFlipCmd
import typings.activexDashOffice.Office.MsoScaleFrom
import typings.activexDashOffice.Office.MsoShapeStyleIndex
import typings.activexDashOffice.Office.MsoShapeType
import typings.activexDashOffice.Office.MsoTriState
import typings.activexDashOffice.Office.MsoZOrderCmd
import typings.activexDashOffice.Office.ReflectionFormat
import typings.activexDashOffice.Office.SmartArtLayout
import typings.activexDashOffice.Office.SoftEdgeFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.Shape")
@js.native
class Shape protected () extends js.Object {
  val ActionSettings: typings.activexDashPowerpoint.PowerPoint.ActionSettings = js.native
  val Adjustments: typings.activexDashPowerpoint.PowerPoint.Adjustments = js.native
  var AlternativeText: String = js.native
  val AnimationSettings: typings.activexDashPowerpoint.PowerPoint.AnimationSettings = js.native
  val Application: js.Any = js.native
  var AutoShapeType: MsoAutoShapeType = js.native
  var BackgroundStyle: MsoBackgroundStyleIndex = js.native
  var BlackWhiteMode: MsoBlackWhiteMode = js.native
  val Callout: CalloutFormat = js.native
  val CanvasItems: CanvasShapes = js.native
  val Chart: typings.activexDashPowerpoint.PowerPoint.Chart = js.native
  val Child: MsoTriState = js.native
  val ConnectionSiteCount: Double = js.native
  val Connector: MsoTriState = js.native
  val ConnectorFormat: typings.activexDashPowerpoint.PowerPoint.ConnectorFormat = js.native
  val Creator: Double = js.native
  val CustomerData: typings.activexDashPowerpoint.PowerPoint.CustomerData = js.native
  val Diagram: typings.activexDashPowerpoint.PowerPoint.Diagram = js.native
  val DiagramNode: typings.activexDashPowerpoint.PowerPoint.DiagramNode = js.native
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
  val LinkFormat: typings.activexDashPowerpoint.PowerPoint.LinkFormat = js.native
  var LockAspectRatio: MsoTriState = js.native
  val MediaFormat: typings.activexDashPowerpoint.PowerPoint.MediaFormat = js.native
  val MediaType: PpMediaType = js.native
  var Name: String = js.native
  val Nodes: ShapeNodes = js.native
  val OLEFormat: typings.activexDashPowerpoint.PowerPoint.OLEFormat = js.native
  val Parent: js.Any = js.native
  val ParentGroup: Shape = js.native
  val PictureFormat: typings.activexDashPowerpoint.PowerPoint.PictureFormat = js.native
  val PlaceholderFormat: typings.activexDashPowerpoint.PowerPoint.PlaceholderFormat = js.native
  var `PowerPoint.Shape_typekey`: Shape = js.native
  val RTF: String = js.native
  val Reflection: ReflectionFormat = js.native
  var Rotation: Double = js.native
  val Script: typings.activexDashOffice.Office.Script = js.native
  val Shadow: ShadowFormat = js.native
  var ShapeStyle: MsoShapeStyleIndex = js.native
  val SmartArt: typings.activexDashOffice.Office.SmartArt = js.native
  val SoftEdge: SoftEdgeFormat = js.native
  val SoundFormat: typings.activexDashPowerpoint.PowerPoint.SoundFormat = js.native
  val Table: typings.activexDashPowerpoint.PowerPoint.Table = js.native
  val Tags: typings.activexDashPowerpoint.PowerPoint.Tags = js.native
  val TextEffect: TextEffectFormat = js.native
  val TextFrame: typings.activexDashPowerpoint.PowerPoint.TextFrame = js.native
  val TextFrame2: typings.activexDashPowerpoint.PowerPoint.TextFrame2 = js.native
  val ThreeD: ThreeDFormat = js.native
  var Title: String = js.native
  var Top: Double = js.native
  val Type: MsoShapeType = js.native
  val VerticalFlip: MsoTriState = js.native
  val Vertices: js.Any = js.native
  var Visible: MsoTriState = js.native
  var Width: Double = js.native
  val ZOrderPosition: Double = js.native
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
  def IncrementLeft(Increment: Double): Unit = js.native
  def IncrementRotation(Increment: Double): Unit = js.native
  def IncrementTop(Increment: Double): Unit = js.native
  def PickUp(): Unit = js.native
  def PickupAnimation(): Unit = js.native
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

