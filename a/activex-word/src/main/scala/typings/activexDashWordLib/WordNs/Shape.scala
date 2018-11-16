package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.Shape")
@js.native
class Shape protected () extends js.Object {
  val Adjustments: Adjustments = js.native
  var AlternativeText: java.lang.String = js.native
  val Anchor: Range = js.native
  val AnchorID: scala.Double = js.native
  val Application: Application = js.native
  var AutoShapeType: activexDashOfficeLib.OfficeNs.MsoAutoShapeType = js.native
  var BackgroundStyle: activexDashOfficeLib.OfficeNs.MsoBackgroundStyleIndex = js.native
  val Callout: CalloutFormat = js.native
  val CanvasItems: CanvasShapes = js.native
  val Chart: Chart = js.native
  val Child: activexDashOfficeLib.OfficeNs.MsoTriState = js.native
  val ConnectionSiteCount: scala.Double = js.native
  val Connector: activexDashOfficeLib.OfficeNs.MsoTriState = js.native
  val ConnectorFormat: ConnectorFormat = js.native
  val Creator: scala.Double = js.native
  val Diagram: activexDashOfficeLib.OfficeNs.IMsoDiagram = js.native
  val DiagramNode: DiagramNode = js.native
  val EditID: scala.Double = js.native
  val Fill: FillFormat = js.native
  val Glow: GlowFormat = js.native
  val GroupItems: GroupShapes = js.native
  val HasChart: activexDashOfficeLib.OfficeNs.MsoTriState = js.native
  val HasDiagram: activexDashOfficeLib.OfficeNs.MsoTriState = js.native
  val HasDiagramNode: activexDashOfficeLib.OfficeNs.MsoTriState = js.native
  val HasSmartArt: activexDashOfficeLib.OfficeNs.MsoTriState = js.native
  var Height: scala.Double = js.native
  var HeightRelative: scala.Double = js.native
  val HorizontalFlip: activexDashOfficeLib.OfficeNs.MsoTriState = js.native
  val Hyperlink: Hyperlink = js.native
  val ID: scala.Double = js.native
  var LayoutInCell: scala.Double = js.native
  var Left: scala.Double = js.native
  var LeftRelative: scala.Double = js.native
  val Line: LineFormat = js.native
  val LinkFormat: LinkFormat = js.native
  var LockAnchor: scala.Double = js.native
  var LockAspectRatio: activexDashOfficeLib.OfficeNs.MsoTriState = js.native
  var Name: java.lang.String = js.native
  val Nodes: ShapeNodes = js.native
  val OLEFormat: OLEFormat = js.native
  val Parent: js.Any = js.native
  val ParentGroup: Shape = js.native
  val PictureFormat: PictureFormat = js.native
  val RTF: java.lang.String = js.native
  val Reflection: ReflectionFormat = js.native
  var RelativeHorizontalPosition: WdRelativeHorizontalPosition = js.native
  var RelativeHorizontalSize: WdRelativeHorizontalSize = js.native
  var RelativeVerticalPosition: WdRelativeVerticalPosition = js.native
  var RelativeVerticalSize: WdRelativeVerticalSize = js.native
  var Rotation: scala.Double = js.native
  val Script: activexDashOfficeLib.OfficeNs.Script = js.native
  val Shadow: ShadowFormat = js.native
  var ShapeStyle: activexDashOfficeLib.OfficeNs.MsoShapeStyleIndex = js.native
  val SmartArt: activexDashOfficeLib.OfficeNs.SmartArt = js.native
  val SoftEdge: SoftEdgeFormat = js.native
  val TextEffect: TextEffectFormat = js.native
  val TextFrame: TextFrame = js.native
  val TextFrame2: activexDashOfficeLib.OfficeNs.TextFrame2 = js.native
  val ThreeD: ThreeDFormat = js.native
  var Title: java.lang.String = js.native
  var Top: scala.Double = js.native
  var TopRelative: scala.Double = js.native
  val Type: activexDashOfficeLib.OfficeNs.MsoShapeType = js.native
  val VerticalFlip: activexDashOfficeLib.OfficeNs.MsoTriState = js.native
  val Vertices: js.Any = js.native
  var Visible: activexDashOfficeLib.OfficeNs.MsoTriState = js.native
  var Width: scala.Double = js.native
  var WidthRelative: scala.Double = js.native
  var `Word.Shape_typekey`: Shape = js.native
  val WrapFormat: WrapFormat = js.native
  val ZOrderPosition: scala.Double = js.native
  def Activate(): scala.Unit = js.native
  def Apply(): scala.Unit = js.native
  def CanvasCropBottom(Increment: scala.Double): scala.Unit = js.native
  def CanvasCropLeft(Increment: scala.Double): scala.Unit = js.native
  def CanvasCropRight(Increment: scala.Double): scala.Unit = js.native
  def CanvasCropTop(Increment: scala.Double): scala.Unit = js.native
  def ConvertToFrame(): Frame = js.native
  def ConvertToInlineShape(): InlineShape = js.native
  def Delete(): scala.Unit = js.native
  def Duplicate(): Shape = js.native
  def Flip(FlipCmd: activexDashOfficeLib.OfficeNs.MsoFlipCmd): scala.Unit = js.native
  def IncrementLeft(Increment: scala.Double): scala.Unit = js.native
  def IncrementRotation(Increment: scala.Double): scala.Unit = js.native
  def IncrementTop(Increment: scala.Double): scala.Unit = js.native
  def PickUp(): scala.Unit = js.native
  def RerouteConnections(): scala.Unit = js.native
  /** @param Office.MsoScaleFrom [Scale=0] */
  def ScaleHeight(Factor: scala.Double, RelativeToOriginalSize: activexDashOfficeLib.OfficeNs.MsoTriState): scala.Unit = js.native
  /** @param Office.MsoScaleFrom [Scale=0] */
  def ScaleHeight(
    Factor: scala.Double,
    RelativeToOriginalSize: activexDashOfficeLib.OfficeNs.MsoTriState,
    Scale: activexDashOfficeLib.OfficeNs.MsoScaleFrom
  ): scala.Unit = js.native
  /** @param Office.MsoScaleFrom [Scale=0] */
  def ScaleWidth(Factor: scala.Double, RelativeToOriginalSize: activexDashOfficeLib.OfficeNs.MsoTriState): scala.Unit = js.native
  /** @param Office.MsoScaleFrom [Scale=0] */
  def ScaleWidth(
    Factor: scala.Double,
    RelativeToOriginalSize: activexDashOfficeLib.OfficeNs.MsoTriState,
    Scale: activexDashOfficeLib.OfficeNs.MsoScaleFrom
  ): scala.Unit = js.native
  def Select(): scala.Unit = js.native
  def Select(Replace: js.Any): scala.Unit = js.native
  def SetShapesDefaultProperties(): scala.Unit = js.native
  def Ungroup(): ShapeRange = js.native
  def ZOrder(ZOrderCmd: activexDashOfficeLib.OfficeNs.MsoZOrderCmd): scala.Unit = js.native
}

