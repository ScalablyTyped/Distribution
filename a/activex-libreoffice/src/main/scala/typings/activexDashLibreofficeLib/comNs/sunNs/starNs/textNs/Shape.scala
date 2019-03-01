package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies the service of shapes in a text document */
trait Shape
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.Shape {
  /**
    * contains the text frame the current frame is anchored to.
    *
    * The value is valid only if the AnchorType is TextContentAnchorType::AT_FRAME.
    */
  var AnchorFrame: XTextFrame
  /**
    * contains the number of the page where the objects are anchored.
    *
    * The value is valid only if the AnchorType is TextContentAnchorType::AT_PAGE.
    */
  var AnchorPageNo: scala.Double
  /** specifies how the text content is attached to its surrounding {@link Text} . */
  var AnchorType: TextContentAnchorType
  /** contains the bottom margin of the object. */
  var BottomMargin: scala.Double
  /** the text flows only around the contour of the object. */
  var ContourOutside: scala.Boolean
  /**
    * determines the end position of the shape in horizontal left-to-right layout
    *
    * This property is needed for the export of the OASIS Open Office file format to the OpenOffice.org file format. It provides the end position property
    * of the included service {@link com.sun.star.drawing.Shape} converted to the horizontal left-to-right layout.
    * @since OOo 2.0
    */
  var EndPositionInHoriL2R: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point
  /**
    * determines the horizontal orientation of the object.
    * @see BaseFrame.HoriOrientation
    */
  var HoriOrient: scala.Double
  /**
    * contains the horizontal position of the object (1/100 mm).
    *
    * It is only valid if "HoriOrient" is HoriOrientation_NONE.
    */
  var HoriOrientPosition: scala.Double
  /**
    * determines the environment of the object to which the orientation is related.
    * @see BaseFrame.RelOrientation
    */
  var HoriOrientRelation: scala.Double
  /** contains the left margin of the object. */
  var LeftMargin: scala.Double
  /** determines if the object is opaque or transparent for text. */
  var Opaque: scala.Boolean
  /**
    * determines layout direction the position attributes of the shape is given
    *
    * Valid values are given by {@link PositionLayoutDir}
    * @since OOo 2.0
    */
  var PositionLayoutDir: scala.Double
  /** contains the right margin of the object. */
  var RightMargin: scala.Double
  /**
    * determines the start position of the shape in horizontal left-to-right layout
    *
    * This property is needed for the export of the OASIS Open Office file format to the OpenOffice.org file format. It provides the start position property
    * of the included service {@link com.sun.star.drawing.Shape} converted to the horizontal left-to-right layout.
    * @since OOo 2.0
    */
  var StartPositionInHoriL2R: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point
  /**
    * determines the type of the surrounding text.
    * @deprecated Deprecated
    */
  var Surround: WrapTextMode
  /** determines if the text of the paragraph in which the object is anchored, wraps around the object. */
  var SurroundAnchorOnly: scala.Boolean
  /** determines if the text wraps around the contour of the object. */
  var SurroundContour: scala.Boolean
  /**
    * contains a text range where the shape should be anchored to.
    *
    * There are two different ways to get newly created shapes into the text document. One of them is to use the insertTextContent() method of the {@link
    * com.sun.star.text.XSimpleText} . The other is to call the add() method of the {@link com.sun.star.drawing.XShapes} interface. To be able to determine
    * an anchor position for shape that are anchored at a certain text position the property {@link TextRange} is used.
    *
    * This property is used when the shape gets inserted/added and becomes invalid after that.
    */
  var TextRange: XTextRange
  /** contains the top margin of the object. */
  var TopMargin: scala.Double
  /**
    * determines the transformation of the shape in horizontal left-to-right layout
    *
    * This property is needed for the export of the OASIS Open Office file format to the OpenOffice.org file format. It provides the transformation property
    * of the included service {@link com.sun.star.drawing.Shape} converted to the horizontal left-to-right layout.
    * @since OOo 2.0
    */
  var TransformationInHoriL2R: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.HomogenMatrix3
  /**
    * determines the vertical orientation of the object.
    * @see BaseFrame.VertOrientation
    */
  var VertOrient: scala.Double
  /**
    * contains the vertical position of the object (1/100 mm).
    *
    * It is only valid if {@link TextEmbeddedObject.VertOrient} is {@link VertOrientation.NONE} .
    */
  var VertOrientPosition: scala.Double
  /**
    * determines the environment of the object to which the orientation is related.
    * @see BaseFrame.RelOrientation
    */
  var VertOrientRelation: scala.Double
  /**
    * determines the influence of the text wrap on the positioning of the shape
    *
    * The value of this property is only evaluated for the positioning of the shape, if the text document setting ConsiderTextWrapOnObjPos is `TRUE` . Valid
    * values are given by {@link WrapInfluenceOnPosition}
    * @since OOo 2.0
    */
  var WrapInfluenceOnPosition: scala.Double
}

object Shape {
  @scala.inline
  def apply(
    AnchorFrame: XTextFrame,
    AnchorPageNo: scala.Double,
    AnchorType: TextContentAnchorType,
    BottomMargin: scala.Double,
    ContourOutside: scala.Boolean,
    EndPositionInHoriL2R: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point,
    GluePoints: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexContainer,
    HoriOrient: scala.Double,
    HoriOrientPosition: scala.Double,
    HoriOrientRelation: scala.Double,
    Hyperlink: java.lang.String,
    InteropGrabBag: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    LayerID: scala.Double,
    LayerName: java.lang.String,
    LeftMargin: scala.Double,
    MoveProtect: scala.Boolean,
    Name: java.lang.String,
    NavigationOrder: scala.Double,
    Opaque: scala.Boolean,
    Position: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point,
    PositionLayoutDir: scala.Double,
    Printable: scala.Boolean,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    RelativeHeight: scala.Double,
    RelativeHeightRelation: scala.Double,
    RelativeWidth: scala.Double,
    RelativeWidthRelation: scala.Double,
    RightMargin: scala.Double,
    ShapeType: java.lang.String,
    ShapeUserDefinedAttributes: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer,
    Size: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size,
    SizeProtect: scala.Boolean,
    StartPositionInHoriL2R: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point,
    Style: activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.XStyle,
    Surround: WrapTextMode,
    SurroundAnchorOnly: scala.Boolean,
    SurroundContour: scala.Boolean,
    TextRange: XTextRange,
    TopMargin: scala.Double,
    Transformation: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.HomogenMatrix3,
    TransformationInHoriL2R: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.HomogenMatrix3,
    VertOrient: scala.Double,
    VertOrientPosition: scala.Double,
    VertOrientRelation: scala.Double,
    Visible: scala.Boolean,
    WrapInfluenceOnPosition: scala.Double,
    ZOrder: scala.Double,
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
    dispose: js.Function0[scala.Unit],
    getDirectPropertyValuesTolerant: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      activexDashInteropLib.SafeArray[
        activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.GetDirectPropertyTolerantResult
      ]
    ],
    getGluePoints: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexContainer],
    getPosition: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    getPropertyValuesTolerant: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.GetPropertyTolerantResult]
    ],
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
    setPosition: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point, scala.Unit],
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit],
    setPropertyValuesTolerant: js.Function2[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], 
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.SetPropertyTolerantFailed]
    ],
    setSize: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size, scala.Unit]
  ): Shape = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AnchorFrame")(AnchorFrame)
    __obj.updateDynamic("AnchorPageNo")(AnchorPageNo)
    __obj.updateDynamic("AnchorType")(AnchorType)
    __obj.updateDynamic("BottomMargin")(BottomMargin)
    __obj.updateDynamic("ContourOutside")(ContourOutside)
    __obj.updateDynamic("EndPositionInHoriL2R")(EndPositionInHoriL2R)
    __obj.updateDynamic("GluePoints")(GluePoints)
    __obj.updateDynamic("HoriOrient")(HoriOrient)
    __obj.updateDynamic("HoriOrientPosition")(HoriOrientPosition)
    __obj.updateDynamic("HoriOrientRelation")(HoriOrientRelation)
    __obj.updateDynamic("Hyperlink")(Hyperlink)
    __obj.updateDynamic("InteropGrabBag")(InteropGrabBag)
    __obj.updateDynamic("LayerID")(LayerID)
    __obj.updateDynamic("LayerName")(LayerName)
    __obj.updateDynamic("LeftMargin")(LeftMargin)
    __obj.updateDynamic("MoveProtect")(MoveProtect)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("NavigationOrder")(NavigationOrder)
    __obj.updateDynamic("Opaque")(Opaque)
    __obj.updateDynamic("Position")(Position)
    __obj.updateDynamic("PositionLayoutDir")(PositionLayoutDir)
    __obj.updateDynamic("Printable")(Printable)
    __obj.updateDynamic("PropertySetInfo")(PropertySetInfo)
    __obj.updateDynamic("RelativeHeight")(RelativeHeight)
    __obj.updateDynamic("RelativeHeightRelation")(RelativeHeightRelation)
    __obj.updateDynamic("RelativeWidth")(RelativeWidth)
    __obj.updateDynamic("RelativeWidthRelation")(RelativeWidthRelation)
    __obj.updateDynamic("RightMargin")(RightMargin)
    __obj.updateDynamic("ShapeType")(ShapeType)
    __obj.updateDynamic("ShapeUserDefinedAttributes")(ShapeUserDefinedAttributes)
    __obj.updateDynamic("Size")(Size)
    __obj.updateDynamic("SizeProtect")(SizeProtect)
    __obj.updateDynamic("StartPositionInHoriL2R")(StartPositionInHoriL2R)
    __obj.updateDynamic("Style")(Style)
    __obj.updateDynamic("Surround")(Surround)
    __obj.updateDynamic("SurroundAnchorOnly")(SurroundAnchorOnly)
    __obj.updateDynamic("SurroundContour")(SurroundContour)
    __obj.updateDynamic("TextRange")(TextRange)
    __obj.updateDynamic("TopMargin")(TopMargin)
    __obj.updateDynamic("Transformation")(Transformation)
    __obj.updateDynamic("TransformationInHoriL2R")(TransformationInHoriL2R)
    __obj.updateDynamic("VertOrient")(VertOrient)
    __obj.updateDynamic("VertOrientPosition")(VertOrientPosition)
    __obj.updateDynamic("VertOrientRelation")(VertOrientRelation)
    __obj.updateDynamic("Visible")(Visible)
    __obj.updateDynamic("WrapInfluenceOnPosition")(WrapInfluenceOnPosition)
    __obj.updateDynamic("ZOrder")(ZOrder)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("addPropertyChangeListener")(addPropertyChangeListener)
    __obj.updateDynamic("addVetoableChangeListener")(addVetoableChangeListener)
    __obj.updateDynamic("dispose")(dispose)
    __obj.updateDynamic("getDirectPropertyValuesTolerant")(getDirectPropertyValuesTolerant)
    __obj.updateDynamic("getGluePoints")(getGluePoints)
    __obj.updateDynamic("getPosition")(getPosition)
    __obj.updateDynamic("getPropertySetInfo")(getPropertySetInfo)
    __obj.updateDynamic("getPropertyValue")(getPropertyValue)
    __obj.updateDynamic("getPropertyValuesTolerant")(getPropertyValuesTolerant)
    __obj.updateDynamic("getShapeType")(getShapeType)
    __obj.updateDynamic("getSize")(getSize)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.updateDynamic("removePropertyChangeListener")(removePropertyChangeListener)
    __obj.updateDynamic("removeVetoableChangeListener")(removeVetoableChangeListener)
    __obj.updateDynamic("setPosition")(setPosition)
    __obj.updateDynamic("setPropertyValue")(setPropertyValue)
    __obj.updateDynamic("setPropertyValuesTolerant")(setPropertyValuesTolerant)
    __obj.updateDynamic("setSize")(setSize)
    __obj.asInstanceOf[Shape]
  }
}

