package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShapeRange extends js.Object {
  @JSName("Adjustments")
  val Adjustments_Original: Adjustments = js.native
  var AlternativeText: java.lang.String = js.native
  val Application: js.Any = js.native
  var AutoShapeType: MsoAutoShapeType = js.native
  var BackgroundStyle: MsoBackgroundStyleIndex = js.native
  var BlackWhiteMode: MsoBlackWhiteMode = js.native
  val Callout: CalloutFormat = js.native
  @JSName("CanvasItems")
  val CanvasItems_Original: CanvasShapes = js.native
  val Chart: IMsoChart = js.native
  val Child: MsoTriState = js.native
  val ConnectionSiteCount: scala.Double = js.native
  val Connector: MsoTriState = js.native
  val ConnectorFormat: activexDashOfficeLib.OfficeNs.ConnectorFormat = js.native
  val Count: scala.Double = js.native
  val Creator: scala.Double = js.native
  val Diagram: IMsoDiagram = js.native
  val DiagramNode: activexDashOfficeLib.OfficeNs.DiagramNode = js.native
  val Fill: FillFormat = js.native
  val Glow: GlowFormat = js.native
  @JSName("GroupItems")
  val GroupItems_Original: GroupShapes = js.native
  val HasChart: MsoTriState = js.native
  val HasDiagram: MsoTriState = js.native
  val HasDiagramNode: MsoTriState = js.native
  var Height: scala.Double = js.native
  val HorizontalFlip: MsoTriState = js.native
  val Id: scala.Double = js.native
  var Left: scala.Double = js.native
  val Line: LineFormat = js.native
  var LockAspectRatio: MsoTriState = js.native
  var Name: java.lang.String = js.native
  @JSName("Nodes")
  val Nodes_Original: ShapeNodes = js.native
  val Parent: js.Any = js.native
  val ParentGroup: Shape = js.native
  val PictureFormat: activexDashOfficeLib.OfficeNs.PictureFormat = js.native
  val RTF: java.lang.String = js.native
  val Reflection: ReflectionFormat = js.native
  var Rotation: scala.Double = js.native
  val Script: activexDashOfficeLib.OfficeNs.Script = js.native
  val Shadow: ShadowFormat = js.native
  var ShapeStyle: MsoShapeStyleIndex = js.native
  val SoftEdge: SoftEdgeFormat = js.native
  val TextEffect: TextEffectFormat = js.native
  val TextFrame: activexDashOfficeLib.OfficeNs.TextFrame = js.native
  val TextFrame2: activexDashOfficeLib.OfficeNs.TextFrame2 = js.native
  val ThreeD: ThreeDFormat = js.native
  var Title: java.lang.String = js.native
  var Top: scala.Double = js.native
  val Type: MsoShapeType = js.native
  val VerticalFlip: MsoTriState = js.native
  val Vertices: js.Any = js.native
  var Visible: MsoTriState = js.native
  var Width: scala.Double = js.native
  val ZOrderPosition: scala.Double = js.native
  def apply(Index: js.Any): Shape = js.native
  def Adjustments(Index: scala.Double): scala.Double = js.native
  def Align(AlignCmd: MsoAlignCmd, RelativeTo: MsoTriState): scala.Unit = js.native
  def Apply(): scala.Unit = js.native
  def CanvasCropBottom(Increment: scala.Double): scala.Unit = js.native
  def CanvasCropLeft(Increment: scala.Double): scala.Unit = js.native
  def CanvasCropRight(Increment: scala.Double): scala.Unit = js.native
  def CanvasCropTop(Increment: scala.Double): scala.Unit = js.native
  def CanvasItems(Index: java.lang.String): Shape = js.native
  def CanvasItems(Index: scala.Double): Shape = js.native
  def Copy(): scala.Unit = js.native
  def Cut(): scala.Unit = js.native
  def Delete(): scala.Unit = js.native
  def Distribute(DistributeCmd: MsoDistributeCmd, RelativeTo: MsoTriState): scala.Unit = js.native
  def Duplicate(): ShapeRange = js.native
  def Flip(FlipCmd: MsoFlipCmd): scala.Unit = js.native
  def Group(): Shape = js.native
  def GroupItems(Index: js.Any): Shape = js.native
  def IncrementLeft(Increment: scala.Double): scala.Unit = js.native
  def IncrementRotation(Increment: scala.Double): scala.Unit = js.native
  def IncrementTop(Increment: scala.Double): scala.Unit = js.native
  def Item(Index: js.Any): Shape = js.native
  /** @param PrimaryShape [PrimaryShape=0] */
  def MergeShapes(MergeCmd: MsoMergeCmd): scala.Unit = js.native
  def MergeShapes(MergeCmd: MsoMergeCmd, PrimaryShape: Shape): scala.Unit = js.native
  def Nodes(Index: js.Any): ShapeNode = js.native
  def PickUp(): scala.Unit = js.native
  def Regroup(): Shape = js.native
  def RerouteConnections(): scala.Unit = js.native
  /** @param fScale [fScale=0] */
  def ScaleHeight(Factor: scala.Double, RelativeToOriginalSize: MsoTriState): scala.Unit = js.native
  def ScaleHeight(Factor: scala.Double, RelativeToOriginalSize: MsoTriState, fScale: MsoScaleFrom): scala.Unit = js.native
  /** @param fScale [fScale=0] */
  def ScaleWidth(Factor: scala.Double, RelativeToOriginalSize: MsoTriState): scala.Unit = js.native
  def ScaleWidth(Factor: scala.Double, RelativeToOriginalSize: MsoTriState, fScale: MsoScaleFrom): scala.Unit = js.native
  def Select(): scala.Unit = js.native
  def Select(Replace: js.Any): scala.Unit = js.native
  def SetShapesDefaultProperties(): scala.Unit = js.native
  def Ungroup(): ShapeRange = js.native
  def ZOrder(ZOrderCmd: MsoZOrderCmd): scala.Unit = js.native
}

