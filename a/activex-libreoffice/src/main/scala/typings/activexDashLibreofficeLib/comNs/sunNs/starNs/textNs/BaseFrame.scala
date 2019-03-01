package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies the base service of text frames, graphic objects, and embedded objects */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape because var conflicts: Size. Inlined getPosition, getSize, Position, setPosition, setSize */ trait BaseFrame
  extends TextContent
     with BaseFrameProperties
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNamed {
  /** contains the name of the frame style that is applied to this object. */
  var FrameStyleName: java.lang.String
  /**
    * gets the current position of this object.
    * @returns the position of the top left edge in 100/th mm
    */
  var Position: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point
  /**
    * gets the current position of this object.
    * @returns the position of the top left edge in 100/th mm
    */
  def getPosition(): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point
  /**
    * gets the size of this object.
    * @returns the size in 100/th mm
    */
  def getSize(): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size
  /**
    * sets the current position of this object
    * @param aPosition the position of the top left edge in 100/th mm
    */
  def setPosition(aPosition: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point): scala.Unit
  /**
    * sets the size of this object.
    * @param aSize the size in 100/th mm
    */
  def setSize(aSize: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size): scala.Unit
}

object BaseFrame {
  @scala.inline
  def apply(
    Anchor: XTextRange,
    AnchorFrame: XTextFrame,
    AnchorPageNo: scala.Double,
    AnchorType: TextContentAnchorType,
    AnchorTypes: activexDashInteropLib.SafeArray[TextContentAnchorType],
    BackColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    BackGraphicFilter: java.lang.String,
    BackGraphicLocation: activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.GraphicLocation,
    BackGraphicURL: java.lang.String,
    BackTransparent: scala.Boolean,
    BorderDistance: scala.Double,
    BottomBorder: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine,
    BottomBorderDistance: scala.Double,
    BottomMargin: scala.Double,
    ContentProtected: scala.Boolean,
    Description: java.lang.String,
    FillGradient: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Gradient,
    FillGradientName: java.lang.String,
    FillStyle: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.FillStyle,
    FrameInteropGrabBag: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    FrameStyleName: java.lang.String,
    Height: scala.Double,
    HoriOrient: scala.Double,
    HoriOrientPosition: scala.Double,
    HoriOrientRelation: scala.Double,
    HyperLinkName: java.lang.String,
    HyperLinkTarget: java.lang.String,
    HyperLinkURL: java.lang.String,
    IsSyncHeightToWidth: scala.Boolean,
    IsSyncWidthToHeight: scala.Boolean,
    LayoutSize: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size,
    LeftBorder: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine,
    LeftBorderDistance: scala.Double,
    LeftMargin: scala.Double,
    Name: java.lang.String,
    Opaque: scala.Boolean,
    PageToggle: scala.Boolean,
    Position: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point,
    PositionProtected: scala.Boolean,
    Print: scala.Boolean,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    RelativeHeight: scala.Double,
    RelativeHeightRelation: scala.Double,
    RelativeWidth: scala.Double,
    RelativeWidthRelation: scala.Double,
    RightBorder: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine,
    RightBorderDistance: scala.Double,
    RightMargin: scala.Double,
    ServerMap: scala.Boolean,
    ShadowFormat: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.ShadowFormat,
    ShadowTransparence: scala.Double,
    ShapeType: java.lang.String,
    Size: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size,
    SizeProtected: scala.Boolean,
    Surround: WrapTextMode,
    SurroundAnchorOnly: scala.Boolean,
    TextWrap: WrapTextMode,
    Title: java.lang.String,
    TopBorder: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine,
    TopBorderDistance: scala.Double,
    TopMargin: scala.Double,
    UserDefinedAttributes: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer,
    VertOrient: scala.Double,
    VertOrientPosition: scala.Double,
    VertOrientRelation: scala.Double,
    Width: scala.Double,
    WrapInfluenceOnPosition: scala.Double,
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    addPropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    addVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    attach: js.Function1[XTextRange, scala.Unit],
    dispose: js.Function0[scala.Unit],
    getAnchor: js.Function0[XTextRange],
    getName: js.Function0[java.lang.String],
    getPosition: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    getShapeType: js.Function0[java.lang.String],
    getSize: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    removePropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    removeVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    setName: js.Function1[java.lang.String, scala.Unit],
    setPosition: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point, scala.Unit],
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit],
    setSize: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size, scala.Unit]
  ): BaseFrame = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Anchor")(Anchor)
    __obj.updateDynamic("AnchorFrame")(AnchorFrame)
    __obj.updateDynamic("AnchorPageNo")(AnchorPageNo)
    __obj.updateDynamic("AnchorType")(AnchorType)
    __obj.updateDynamic("AnchorTypes")(AnchorTypes)
    __obj.updateDynamic("BackColor")(BackColor)
    __obj.updateDynamic("BackGraphicFilter")(BackGraphicFilter)
    __obj.updateDynamic("BackGraphicLocation")(BackGraphicLocation)
    __obj.updateDynamic("BackGraphicURL")(BackGraphicURL)
    __obj.updateDynamic("BackTransparent")(BackTransparent)
    __obj.updateDynamic("BorderDistance")(BorderDistance)
    __obj.updateDynamic("BottomBorder")(BottomBorder)
    __obj.updateDynamic("BottomBorderDistance")(BottomBorderDistance)
    __obj.updateDynamic("BottomMargin")(BottomMargin)
    __obj.updateDynamic("ContentProtected")(ContentProtected)
    __obj.updateDynamic("Description")(Description)
    __obj.updateDynamic("FillGradient")(FillGradient)
    __obj.updateDynamic("FillGradientName")(FillGradientName)
    __obj.updateDynamic("FillStyle")(FillStyle)
    __obj.updateDynamic("FrameInteropGrabBag")(FrameInteropGrabBag)
    __obj.updateDynamic("FrameStyleName")(FrameStyleName)
    __obj.updateDynamic("Height")(Height)
    __obj.updateDynamic("HoriOrient")(HoriOrient)
    __obj.updateDynamic("HoriOrientPosition")(HoriOrientPosition)
    __obj.updateDynamic("HoriOrientRelation")(HoriOrientRelation)
    __obj.updateDynamic("HyperLinkName")(HyperLinkName)
    __obj.updateDynamic("HyperLinkTarget")(HyperLinkTarget)
    __obj.updateDynamic("HyperLinkURL")(HyperLinkURL)
    __obj.updateDynamic("IsSyncHeightToWidth")(IsSyncHeightToWidth)
    __obj.updateDynamic("IsSyncWidthToHeight")(IsSyncWidthToHeight)
    __obj.updateDynamic("LayoutSize")(LayoutSize)
    __obj.updateDynamic("LeftBorder")(LeftBorder)
    __obj.updateDynamic("LeftBorderDistance")(LeftBorderDistance)
    __obj.updateDynamic("LeftMargin")(LeftMargin)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("Opaque")(Opaque)
    __obj.updateDynamic("PageToggle")(PageToggle)
    __obj.updateDynamic("Position")(Position)
    __obj.updateDynamic("PositionProtected")(PositionProtected)
    __obj.updateDynamic("Print")(Print)
    __obj.updateDynamic("PropertySetInfo")(PropertySetInfo)
    __obj.updateDynamic("RelativeHeight")(RelativeHeight)
    __obj.updateDynamic("RelativeHeightRelation")(RelativeHeightRelation)
    __obj.updateDynamic("RelativeWidth")(RelativeWidth)
    __obj.updateDynamic("RelativeWidthRelation")(RelativeWidthRelation)
    __obj.updateDynamic("RightBorder")(RightBorder)
    __obj.updateDynamic("RightBorderDistance")(RightBorderDistance)
    __obj.updateDynamic("RightMargin")(RightMargin)
    __obj.updateDynamic("ServerMap")(ServerMap)
    __obj.updateDynamic("ShadowFormat")(ShadowFormat)
    __obj.updateDynamic("ShadowTransparence")(ShadowTransparence)
    __obj.updateDynamic("ShapeType")(ShapeType)
    __obj.updateDynamic("Size")(Size)
    __obj.updateDynamic("SizeProtected")(SizeProtected)
    __obj.updateDynamic("Surround")(Surround)
    __obj.updateDynamic("SurroundAnchorOnly")(SurroundAnchorOnly)
    __obj.updateDynamic("TextWrap")(TextWrap)
    __obj.updateDynamic("Title")(Title)
    __obj.updateDynamic("TopBorder")(TopBorder)
    __obj.updateDynamic("TopBorderDistance")(TopBorderDistance)
    __obj.updateDynamic("TopMargin")(TopMargin)
    __obj.updateDynamic("UserDefinedAttributes")(UserDefinedAttributes)
    __obj.updateDynamic("VertOrient")(VertOrient)
    __obj.updateDynamic("VertOrientPosition")(VertOrientPosition)
    __obj.updateDynamic("VertOrientRelation")(VertOrientRelation)
    __obj.updateDynamic("Width")(Width)
    __obj.updateDynamic("WrapInfluenceOnPosition")(WrapInfluenceOnPosition)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("addPropertyChangeListener")(addPropertyChangeListener)
    __obj.updateDynamic("addVetoableChangeListener")(addVetoableChangeListener)
    __obj.updateDynamic("attach")(attach)
    __obj.updateDynamic("dispose")(dispose)
    __obj.updateDynamic("getAnchor")(getAnchor)
    __obj.updateDynamic("getName")(getName)
    __obj.updateDynamic("getPosition")(getPosition)
    __obj.updateDynamic("getPropertySetInfo")(getPropertySetInfo)
    __obj.updateDynamic("getPropertyValue")(getPropertyValue)
    __obj.updateDynamic("getShapeType")(getShapeType)
    __obj.updateDynamic("getSize")(getSize)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.updateDynamic("removePropertyChangeListener")(removePropertyChangeListener)
    __obj.updateDynamic("removeVetoableChangeListener")(removeVetoableChangeListener)
    __obj.updateDynamic("setName")(setName)
    __obj.updateDynamic("setPosition")(setPosition)
    __obj.updateDynamic("setPropertyValue")(setPropertyValue)
    __obj.updateDynamic("setSize")(setSize)
    __obj.asInstanceOf[BaseFrame]
  }
}

