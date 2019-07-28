package typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.Gradient
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.Size
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyValue
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XNameContainer
import typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.FillStyle
import typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs.GraphicLocation
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.BorderLine
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.ShadowFormat
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.Color
import typings.activexDashLibreoffice.comNs.sunNs.starNs.xmlNs.UserDefinedAttributesSupplier
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies the properties that are provided by all text frames, graphic objects, embedded objects and frame styles. */
trait BaseFrameProperties extends UserDefinedAttributesSupplier {
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
  var AnchorPageNo: Double
  /** contains the color of the background of the object. */
  var BackColor: Color
  /** contains the name of the file filter for the background graphic. */
  var BackGraphicFilter: String
  /** determines the position of the background graphic. */
  var BackGraphicLocation: GraphicLocation
  /** contains the URL for the background graphic. */
  var BackGraphicURL: String
  /** If TRUE, the "BackColor" is ignored. */
  var BackTransparent: Boolean
  /** contains the distance from the border to the object. */
  var BorderDistance: Double
  /**
    * contains the bottom border of the object.
    * @see BaseFrame.com.sun.star.table.BorderLine
    */
  var BottomBorder: BorderLine
  /** contains the distance from the bottom border to the object. */
  var BottomBorderDistance: Double
  /** contains the bottom margin of the object. */
  var BottomMargin: Double
  /** determines if the content is protected. */
  var ContentProtected: Boolean
  /**
    * contains description for the object
    *
    * The long description text can be entered to describe a object in more detail to users with screen reader software. The description is visible as an
    * alternative tag for accessibility tools.
    * @since OOo 3.2
    */
  var Description: String
  /**
    * If the property {@link FillStyle} is set to FillStyle::GRADIENT, this describes the gradient used.
    * @since LibreOffice 4.1
    */
  var FillGradient: Gradient
  /**
    * If the property {@link FillStyle} is set to FillStyle::GRADIENT, this is the name of the gradient used.
    * @since LibreOffice 4.1
    */
  var FillGradientName: String
  /**
    * This enumeration selects the style the area will be filled with.
    *
    * Currently only set for gradients.
    * @since LibreOffice 4.1
    */
  var FillStyle: typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.FillStyle
  /**
    * Grab bag of frame properties, used as a string-any map for interim interop purposes.
    * @since LibreOffice 4.2  This property is intentionally not handled by the ODF filter. Any member that should be handled there should be first moved out
    */
  var FrameInteropGrabBag: SafeArray[PropertyValue]
  /**
    * contains the height of the object (1/100 mm).
    *
    * It is only valid if {@link TextEmbeddedObject.RelativeHeight} is zero.
    */
  var Height: Double
  /**
    * determines the horizontal orientation of the object.
    * @see BaseFrame.HoriOrientation
    */
  var HoriOrient: Double
  /**
    * contains the horizontal position of the object (1/100 mm).
    *
    * It is only valid if "HoriOrient" is HoriOrientation_NONE.
    */
  var HoriOrientPosition: Double
  /**
    * determines the environment of the object to which the orientation is related.
    * @see BaseFrame.RelOrientation
    */
  var HoriOrientRelation: Double
  /** contains the name of the hyperlink that is set at the object. */
  var HyperLinkName: String
  /** contains the name of the target for a hyperlink that is set at the object. */
  var HyperLinkTarget: String
  /** contains the URL of a hyperlink that is set at the object. */
  var HyperLinkURL: String
  /** determines whether the height follows the width. */
  var IsSyncHeightToWidth: Boolean
  /** determines whether the width follows the height. */
  var IsSyncWidthToHeight: Boolean
  /**
    * returns the actual size of the object.
    *
    * Since to obtain the correct actual size of the object not only the layouting for the frame needs to be finished but the whole document needs to be
    * formatted as well. Thus if that was not done previously it may take some while to retrieve this value.
    * @since OOo 2.0.4
    */
  var LayoutSize: Size
  /**
    * contains the left border of the object.
    * @see BaseFrame.com.sun.star.table.BorderLine
    */
  var LeftBorder: BorderLine
  /** contains the distance from the left border to the object. */
  var LeftBorderDistance: Double
  /** contains the left margin of the object. */
  var LeftMargin: Double
  /** determines if the object is opaque or transparent for text. */
  var Opaque: Boolean
  /** determines if the object is mirrored on even pages. */
  var PageToggle: Boolean
  /** determines if the position is protected. */
  var PositionProtected: Boolean
  /** determines if the object is included in printing. */
  var Print: Boolean
  /**
    * contains the relative height of the object.
    *
    * It is only valid if it is greater than zero.
    */
  var RelativeHeight: Double
  /**
    * contains the relation of the relative height of the object.
    *
    * It is only valid if RelativeHeight is greater than zero.
    * @see com.sun.star.text.RelOrientation
    * @since LibreOffice 4.3
    */
  var RelativeHeightRelation: Double
  /**
    * contains the relative width of the object.
    *
    * It is only valid if it is greater than zero.
    */
  var RelativeWidth: Double
  /**
    * contains the relation of the relative width of the object.
    *
    * It is only valid if RelativeWidth is greater than zero.
    * @see com.sun.star.text.RelOrientation
    * @since LibreOffice 4.3
    */
  var RelativeWidthRelation: Double
  /**
    * contains the right border of the object.
    * @see BaseFrame.com.sun.star.table.BorderLine
    */
  var RightBorder: BorderLine
  /** contains the distance from the right border to the object. */
  var RightBorderDistance: Double
  /** contains the right margin of the object. */
  var RightMargin: Double
  /** determines if the object gets an image map from a server. */
  var ServerMap: Boolean
  /** contains the type of the shadow of the object. */
  var ShadowFormat: typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.ShadowFormat
  /**
    * This defines the degree of transparence of the shadow in percent.
    *
    * This is the same as setting the Color member of the {@link ShadowFormat} property to an ARGB color.
    * @since LibreOffice 4.2
    */
  var ShadowTransparence: Double
  /**
    * contains the size of the object.
    * @see BaseFrame.Height
    * @see BaseFrame.Width
    */
  var Size: typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.Size
  /** determines if the size is protected. */
  var SizeProtected: Boolean
  /**
    * determines the type of the surrounding text.
    * @deprecated Deprecated
    */
  var Surround: WrapTextMode
  /** determines if the text of the paragraph in which the object is anchored, wraps around the object. */
  var SurroundAnchorOnly: Boolean
  /**
    * contains short title for the object
    *
    * This short title is visible as an alternative tag in HTML format. Accessibility tools can read this text.
    * @since OOo 3.2
    */
  var Title: String
  /**
    * contains the top border of the object.
    * @see BaseFrame.com.sun.star.table.BorderLine
    */
  var TopBorder: BorderLine
  /** contains the distance from the top border to the object. */
  var TopBorderDistance: Double
  /** contains the top margin of the object. */
  var TopMargin: Double
  /**
    * determines the vertical orientation of the object.
    * @see BaseFrame.VertOrientation
    */
  var VertOrient: Double
  /**
    * contains the vertical position of the object (1/100 mm).
    *
    * It is only valid if {@link TextEmbeddedObject.VertOrient} is {@link VertOrientation.NONE} .
    */
  var VertOrientPosition: Double
  /**
    * determines the environment of the object to which the orientation is related.
    * @see BaseFrame.RelOrientation
    */
  var VertOrientRelation: Double
  /**
    * contains the width of the object (1/100 mm).
    *
    * It is only valid if {@link TextEmbeddedObject.RelativeWidth} is zero.
    */
  var Width: Double
  /**
    * determines the influence of the text wrap on the positioning of the shape
    *
    * The value of this property is only evaluated for the positioning of the shape, if the text document setting ConsiderTextWrapOnObjPos is `TRUE` . Valid
    * values are given by {@link WrapInfluenceOnPosition}
    * @since OOo 2.0
    */
  var WrapInfluenceOnPosition: Double
}

object BaseFrameProperties {
  @scala.inline
  def apply(
    AnchorFrame: XTextFrame,
    AnchorPageNo: Double,
    BackColor: Color,
    BackGraphicFilter: String,
    BackGraphicLocation: GraphicLocation,
    BackGraphicURL: String,
    BackTransparent: Boolean,
    BorderDistance: Double,
    BottomBorder: BorderLine,
    BottomBorderDistance: Double,
    BottomMargin: Double,
    ContentProtected: Boolean,
    Description: String,
    FillGradient: Gradient,
    FillGradientName: String,
    FillStyle: FillStyle,
    FrameInteropGrabBag: SafeArray[PropertyValue],
    Height: Double,
    HoriOrient: Double,
    HoriOrientPosition: Double,
    HoriOrientRelation: Double,
    HyperLinkName: String,
    HyperLinkTarget: String,
    HyperLinkURL: String,
    IsSyncHeightToWidth: Boolean,
    IsSyncWidthToHeight: Boolean,
    LayoutSize: Size,
    LeftBorder: BorderLine,
    LeftBorderDistance: Double,
    LeftMargin: Double,
    Opaque: Boolean,
    PageToggle: Boolean,
    PositionProtected: Boolean,
    Print: Boolean,
    RelativeHeight: Double,
    RelativeHeightRelation: Double,
    RelativeWidth: Double,
    RelativeWidthRelation: Double,
    RightBorder: BorderLine,
    RightBorderDistance: Double,
    RightMargin: Double,
    ServerMap: Boolean,
    ShadowFormat: ShadowFormat,
    ShadowTransparence: Double,
    Size: Size,
    SizeProtected: Boolean,
    Surround: WrapTextMode,
    SurroundAnchorOnly: Boolean,
    Title: String,
    TopBorder: BorderLine,
    TopBorderDistance: Double,
    TopMargin: Double,
    UserDefinedAttributes: XNameContainer,
    VertOrient: Double,
    VertOrientPosition: Double,
    VertOrientRelation: Double,
    Width: Double,
    WrapInfluenceOnPosition: Double
  ): BaseFrameProperties = {
    val __obj = js.Dynamic.literal(AnchorFrame = AnchorFrame, AnchorPageNo = AnchorPageNo, BackColor = BackColor, BackGraphicFilter = BackGraphicFilter, BackGraphicLocation = BackGraphicLocation, BackGraphicURL = BackGraphicURL, BackTransparent = BackTransparent, BorderDistance = BorderDistance, BottomBorder = BottomBorder, BottomBorderDistance = BottomBorderDistance, BottomMargin = BottomMargin, ContentProtected = ContentProtected, Description = Description, FillGradient = FillGradient, FillGradientName = FillGradientName, FillStyle = FillStyle, FrameInteropGrabBag = FrameInteropGrabBag, Height = Height, HoriOrient = HoriOrient, HoriOrientPosition = HoriOrientPosition, HoriOrientRelation = HoriOrientRelation, HyperLinkName = HyperLinkName, HyperLinkTarget = HyperLinkTarget, HyperLinkURL = HyperLinkURL, IsSyncHeightToWidth = IsSyncHeightToWidth, IsSyncWidthToHeight = IsSyncWidthToHeight, LayoutSize = LayoutSize, LeftBorder = LeftBorder, LeftBorderDistance = LeftBorderDistance, LeftMargin = LeftMargin, Opaque = Opaque, PageToggle = PageToggle, PositionProtected = PositionProtected, Print = Print, RelativeHeight = RelativeHeight, RelativeHeightRelation = RelativeHeightRelation, RelativeWidth = RelativeWidth, RelativeWidthRelation = RelativeWidthRelation, RightBorder = RightBorder, RightBorderDistance = RightBorderDistance, RightMargin = RightMargin, ServerMap = ServerMap, ShadowFormat = ShadowFormat, ShadowTransparence = ShadowTransparence, Size = Size, SizeProtected = SizeProtected, Surround = Surround, SurroundAnchorOnly = SurroundAnchorOnly, Title = Title, TopBorder = TopBorder, TopBorderDistance = TopBorderDistance, TopMargin = TopMargin, UserDefinedAttributes = UserDefinedAttributes, VertOrient = VertOrient, VertOrientPosition = VertOrientPosition, VertOrientRelation = VertOrientRelation, Width = Width, WrapInfluenceOnPosition = WrapInfluenceOnPosition)
  
    __obj.asInstanceOf[BaseFrameProperties]
  }
}

