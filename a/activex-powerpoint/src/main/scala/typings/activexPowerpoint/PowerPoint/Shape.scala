package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.GlowFormat
import typings.activexOffice.Office.MsoAutoShapeType
import typings.activexOffice.Office.MsoBackgroundStyleIndex
import typings.activexOffice.Office.MsoBlackWhiteMode
import typings.activexOffice.Office.MsoFlipCmd
import typings.activexOffice.Office.MsoScaleFrom
import typings.activexOffice.Office.MsoShapeStyleIndex
import typings.activexOffice.Office.MsoShapeType
import typings.activexOffice.Office.MsoTriState
import typings.activexOffice.Office.MsoZOrderCmd
import typings.activexOffice.Office.ReflectionFormat
import typings.activexOffice.Office.SmartArtLayout
import typings.activexOffice.Office.SoftEdgeFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Shape extends StObject {
  
  val ActionSettings: typings.activexPowerpoint.PowerPoint.ActionSettings = js.native
  
  val Adjustments: typings.activexPowerpoint.PowerPoint.Adjustments = js.native
  
  var AlternativeText: String = js.native
  
  val AnimationSettings: typings.activexPowerpoint.PowerPoint.AnimationSettings = js.native
  
  val Application: Any = js.native
  
  def Apply(): Unit = js.native
  
  def ApplyAnimation(): Unit = js.native
  
  var AutoShapeType: MsoAutoShapeType = js.native
  
  var BackgroundStyle: MsoBackgroundStyleIndex = js.native
  
  var BlackWhiteMode: MsoBlackWhiteMode = js.native
  
  val Callout: CalloutFormat = js.native
  
  def CanvasCropBottom(Increment: Double): Unit = js.native
  
  def CanvasCropLeft(Increment: Double): Unit = js.native
  
  def CanvasCropRight(Increment: Double): Unit = js.native
  
  def CanvasCropTop(Increment: Double): Unit = js.native
  
  val CanvasItems: CanvasShapes = js.native
  
  val Chart: typings.activexPowerpoint.PowerPoint.Chart = js.native
  
  val Child: MsoTriState = js.native
  
  val ConnectionSiteCount: Double = js.native
  
  val Connector: MsoTriState = js.native
  
  val ConnectorFormat: typings.activexPowerpoint.PowerPoint.ConnectorFormat = js.native
  
  def ConvertTextToSmartArt(Layout: SmartArtLayout): Unit = js.native
  
  def Copy(): Unit = js.native
  
  val Creator: Double = js.native
  
  val CustomerData: typings.activexPowerpoint.PowerPoint.CustomerData = js.native
  
  def Cut(): Unit = js.native
  
  def Delete(): Unit = js.native
  
  val Diagram: typings.activexPowerpoint.PowerPoint.Diagram = js.native
  
  val DiagramNode: typings.activexPowerpoint.PowerPoint.DiagramNode = js.native
  
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
  def Export(
    PathName: String,
    Filter: PpShapeFormat,
    ScaleWidth: Double,
    ScaleHeight: Unit,
    ExportMode: PpExportMode
  ): Unit = js.native
  def Export(PathName: String, Filter: PpShapeFormat, ScaleWidth: Unit, ScaleHeight: Double): Unit = js.native
  def Export(
    PathName: String,
    Filter: PpShapeFormat,
    ScaleWidth: Unit,
    ScaleHeight: Double,
    ExportMode: PpExportMode
  ): Unit = js.native
  def Export(
    PathName: String,
    Filter: PpShapeFormat,
    ScaleWidth: Unit,
    ScaleHeight: Unit,
    ExportMode: PpExportMode
  ): Unit = js.native
  
  val Fill: FillFormat = js.native
  
  def Flip(FlipCmd: MsoFlipCmd): Unit = js.native
  
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
  
  def IncrementLeft(Increment: Double): Unit = js.native
  
  def IncrementRotation(Increment: Double): Unit = js.native
  
  def IncrementTop(Increment: Double): Unit = js.native
  
  var Left: Double = js.native
  
  val Line: LineFormat = js.native
  
  val LinkFormat: typings.activexPowerpoint.PowerPoint.LinkFormat = js.native
  
  var LockAspectRatio: MsoTriState = js.native
  
  val MediaFormat: typings.activexPowerpoint.PowerPoint.MediaFormat = js.native
  
  val MediaType: PpMediaType = js.native
  
  var Name: String = js.native
  
  val Nodes: ShapeNodes = js.native
  
  val OLEFormat: typings.activexPowerpoint.PowerPoint.OLEFormat = js.native
  
  val Parent: Any = js.native
  
  val ParentGroup: Shape = js.native
  
  def PickUp(): Unit = js.native
  
  def PickupAnimation(): Unit = js.native
  
  val PictureFormat: typings.activexPowerpoint.PowerPoint.PictureFormat = js.native
  
  val PlaceholderFormat: typings.activexPowerpoint.PowerPoint.PlaceholderFormat = js.native
  
  /* private */ @JSName("PowerPoint.Shape_typekey")
  var PowerPointDotShape_typekey: Shape = js.native
  
  val RTF: String = js.native
  
  val Reflection: ReflectionFormat = js.native
  
  def RerouteConnections(): Unit = js.native
  
  var Rotation: Double = js.native
  
  /** @param Office.MsoScaleFrom [fScale=0] */
  def ScaleHeight(Factor: Double, RelativeToOriginalSize: MsoTriState): Unit = js.native
  def ScaleHeight(Factor: Double, RelativeToOriginalSize: MsoTriState, fScale: MsoScaleFrom): Unit = js.native
  
  /** @param Office.MsoScaleFrom [fScale=0] */
  def ScaleWidth(Factor: Double, RelativeToOriginalSize: MsoTriState): Unit = js.native
  def ScaleWidth(Factor: Double, RelativeToOriginalSize: MsoTriState, fScale: MsoScaleFrom): Unit = js.native
  
  val Script: typings.activexOffice.Office.Script = js.native
  
  /** @param Office.MsoTriState [Replace=-1] */
  def Select(): Unit = js.native
  def Select(Replace: MsoTriState): Unit = js.native
  
  def SetShapesDefaultProperties(): Unit = js.native
  
  val Shadow: ShadowFormat = js.native
  
  var ShapeStyle: MsoShapeStyleIndex = js.native
  
  val SmartArt: typings.activexOffice.Office.SmartArt = js.native
  
  val SoftEdge: SoftEdgeFormat = js.native
  
  val SoundFormat: typings.activexPowerpoint.PowerPoint.SoundFormat = js.native
  
  val Table: typings.activexPowerpoint.PowerPoint.Table = js.native
  
  val Tags: typings.activexPowerpoint.PowerPoint.Tags = js.native
  
  val TextEffect: TextEffectFormat = js.native
  
  val TextFrame: typings.activexPowerpoint.PowerPoint.TextFrame = js.native
  
  val TextFrame2: typings.activexPowerpoint.PowerPoint.TextFrame2 = js.native
  
  val ThreeD: ThreeDFormat = js.native
  
  var Title: String = js.native
  
  var Top: Double = js.native
  
  val Type: MsoShapeType = js.native
  
  def Ungroup(): ShapeRange = js.native
  
  def UpgradeMedia(): Unit = js.native
  
  val VerticalFlip: MsoTriState = js.native
  
  val Vertices: Any = js.native
  
  var Visible: MsoTriState = js.native
  
  var Width: Double = js.native
  
  def ZOrder(ZOrderCmd: MsoZOrderCmd): Unit = js.native
  
  val ZOrderPosition: Double = js.native
}
