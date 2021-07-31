package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.com_.sun.star.awt.Gradient
import typings.activexLibreoffice.com_.sun.star.awt.Size
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.container.XNameContainer
import typings.activexLibreoffice.com_.sun.star.drawing.FillStyle
import typings.activexLibreoffice.com_.sun.star.style.GraphicLocation
import typings.activexLibreoffice.com_.sun.star.table.BorderLine
import typings.activexLibreoffice.com_.sun.star.table.ShadowFormat
import typings.activexLibreoffice.com_.sun.star.util.Color
import typings.activexLibreoffice.com_.sun.star.xml.UserDefinedAttributesSupplier
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies the properties that are provided by all text frames, graphic objects, embedded objects and frame styles. */
trait BaseFrameProperties
  extends StObject
     with UserDefinedAttributesSupplier {
  
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
  var FillStyle: typings.activexLibreoffice.com_.sun.star.drawing.FillStyle
  
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
  var ShadowFormat: typings.activexLibreoffice.com_.sun.star.table.ShadowFormat
  
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
  var Size: typings.activexLibreoffice.com_.sun.star.awt.Size
  
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
    val __obj = js.Dynamic.literal(AnchorFrame = AnchorFrame.asInstanceOf[js.Any], AnchorPageNo = AnchorPageNo.asInstanceOf[js.Any], BackColor = BackColor.asInstanceOf[js.Any], BackGraphicFilter = BackGraphicFilter.asInstanceOf[js.Any], BackGraphicLocation = BackGraphicLocation.asInstanceOf[js.Any], BackGraphicURL = BackGraphicURL.asInstanceOf[js.Any], BackTransparent = BackTransparent.asInstanceOf[js.Any], BorderDistance = BorderDistance.asInstanceOf[js.Any], BottomBorder = BottomBorder.asInstanceOf[js.Any], BottomBorderDistance = BottomBorderDistance.asInstanceOf[js.Any], BottomMargin = BottomMargin.asInstanceOf[js.Any], ContentProtected = ContentProtected.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], FillGradient = FillGradient.asInstanceOf[js.Any], FillGradientName = FillGradientName.asInstanceOf[js.Any], FillStyle = FillStyle.asInstanceOf[js.Any], FrameInteropGrabBag = FrameInteropGrabBag.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], HoriOrient = HoriOrient.asInstanceOf[js.Any], HoriOrientPosition = HoriOrientPosition.asInstanceOf[js.Any], HoriOrientRelation = HoriOrientRelation.asInstanceOf[js.Any], HyperLinkName = HyperLinkName.asInstanceOf[js.Any], HyperLinkTarget = HyperLinkTarget.asInstanceOf[js.Any], HyperLinkURL = HyperLinkURL.asInstanceOf[js.Any], IsSyncHeightToWidth = IsSyncHeightToWidth.asInstanceOf[js.Any], IsSyncWidthToHeight = IsSyncWidthToHeight.asInstanceOf[js.Any], LayoutSize = LayoutSize.asInstanceOf[js.Any], LeftBorder = LeftBorder.asInstanceOf[js.Any], LeftBorderDistance = LeftBorderDistance.asInstanceOf[js.Any], LeftMargin = LeftMargin.asInstanceOf[js.Any], Opaque = Opaque.asInstanceOf[js.Any], PageToggle = PageToggle.asInstanceOf[js.Any], PositionProtected = PositionProtected.asInstanceOf[js.Any], Print = Print.asInstanceOf[js.Any], RelativeHeight = RelativeHeight.asInstanceOf[js.Any], RelativeHeightRelation = RelativeHeightRelation.asInstanceOf[js.Any], RelativeWidth = RelativeWidth.asInstanceOf[js.Any], RelativeWidthRelation = RelativeWidthRelation.asInstanceOf[js.Any], RightBorder = RightBorder.asInstanceOf[js.Any], RightBorderDistance = RightBorderDistance.asInstanceOf[js.Any], RightMargin = RightMargin.asInstanceOf[js.Any], ServerMap = ServerMap.asInstanceOf[js.Any], ShadowFormat = ShadowFormat.asInstanceOf[js.Any], ShadowTransparence = ShadowTransparence.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], SizeProtected = SizeProtected.asInstanceOf[js.Any], Surround = Surround.asInstanceOf[js.Any], SurroundAnchorOnly = SurroundAnchorOnly.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any], TopBorder = TopBorder.asInstanceOf[js.Any], TopBorderDistance = TopBorderDistance.asInstanceOf[js.Any], TopMargin = TopMargin.asInstanceOf[js.Any], UserDefinedAttributes = UserDefinedAttributes.asInstanceOf[js.Any], VertOrient = VertOrient.asInstanceOf[js.Any], VertOrientPosition = VertOrientPosition.asInstanceOf[js.Any], VertOrientRelation = VertOrientRelation.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any], WrapInfluenceOnPosition = WrapInfluenceOnPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseFrameProperties]
  }
  
  @scala.inline
  implicit class BaseFramePropertiesMutableBuilder[Self <: BaseFrameProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnchorFrame(value: XTextFrame): Self = StObject.set(x, "AnchorFrame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorPageNo(value: Double): Self = StObject.set(x, "AnchorPageNo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackColor(value: Color): Self = StObject.set(x, "BackColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackGraphicFilter(value: String): Self = StObject.set(x, "BackGraphicFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackGraphicLocation(value: GraphicLocation): Self = StObject.set(x, "BackGraphicLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackGraphicURL(value: String): Self = StObject.set(x, "BackGraphicURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackTransparent(value: Boolean): Self = StObject.set(x, "BackTransparent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderDistance(value: Double): Self = StObject.set(x, "BorderDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomBorder(value: BorderLine): Self = StObject.set(x, "BottomBorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomBorderDistance(value: Double): Self = StObject.set(x, "BottomBorderDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomMargin(value: Double): Self = StObject.set(x, "BottomMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentProtected(value: Boolean): Self = StObject.set(x, "ContentProtected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillGradient(value: Gradient): Self = StObject.set(x, "FillGradient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillGradientName(value: String): Self = StObject.set(x, "FillGradientName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillStyle(value: FillStyle): Self = StObject.set(x, "FillStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameInteropGrabBag(value: SafeArray[PropertyValue]): Self = StObject.set(x, "FrameInteropGrabBag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "Height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoriOrient(value: Double): Self = StObject.set(x, "HoriOrient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoriOrientPosition(value: Double): Self = StObject.set(x, "HoriOrientPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoriOrientRelation(value: Double): Self = StObject.set(x, "HoriOrientRelation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHyperLinkName(value: String): Self = StObject.set(x, "HyperLinkName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHyperLinkTarget(value: String): Self = StObject.set(x, "HyperLinkTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHyperLinkURL(value: String): Self = StObject.set(x, "HyperLinkURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSyncHeightToWidth(value: Boolean): Self = StObject.set(x, "IsSyncHeightToWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSyncWidthToHeight(value: Boolean): Self = StObject.set(x, "IsSyncWidthToHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutSize(value: Size): Self = StObject.set(x, "LayoutSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftBorder(value: BorderLine): Self = StObject.set(x, "LeftBorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftBorderDistance(value: Double): Self = StObject.set(x, "LeftBorderDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftMargin(value: Double): Self = StObject.set(x, "LeftMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpaque(value: Boolean): Self = StObject.set(x, "Opaque", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageToggle(value: Boolean): Self = StObject.set(x, "PageToggle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionProtected(value: Boolean): Self = StObject.set(x, "PositionProtected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrint(value: Boolean): Self = StObject.set(x, "Print", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelativeHeight(value: Double): Self = StObject.set(x, "RelativeHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelativeHeightRelation(value: Double): Self = StObject.set(x, "RelativeHeightRelation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelativeWidth(value: Double): Self = StObject.set(x, "RelativeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelativeWidthRelation(value: Double): Self = StObject.set(x, "RelativeWidthRelation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightBorder(value: BorderLine): Self = StObject.set(x, "RightBorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightBorderDistance(value: Double): Self = StObject.set(x, "RightBorderDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightMargin(value: Double): Self = StObject.set(x, "RightMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerMap(value: Boolean): Self = StObject.set(x, "ServerMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowFormat(value: ShadowFormat): Self = StObject.set(x, "ShadowFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowTransparence(value: Double): Self = StObject.set(x, "ShadowTransparence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Size): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeProtected(value: Boolean): Self = StObject.set(x, "SizeProtected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSurround(value: WrapTextMode): Self = StObject.set(x, "Surround", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSurroundAnchorOnly(value: Boolean): Self = StObject.set(x, "SurroundAnchorOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopBorder(value: BorderLine): Self = StObject.set(x, "TopBorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopBorderDistance(value: Double): Self = StObject.set(x, "TopBorderDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopMargin(value: Double): Self = StObject.set(x, "TopMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertOrient(value: Double): Self = StObject.set(x, "VertOrient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertOrientPosition(value: Double): Self = StObject.set(x, "VertOrientPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertOrientRelation(value: Double): Self = StObject.set(x, "VertOrientRelation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapInfluenceOnPosition(value: Double): Self = StObject.set(x, "WrapInfluenceOnPosition", value.asInstanceOf[js.Any])
  }
}
