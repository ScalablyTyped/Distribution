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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies the properties that are provided by all text frames, graphic objects, embedded objects and frame styles. */
@js.native
trait BaseFrameProperties extends UserDefinedAttributesSupplier {
  /**
    * contains the text frame the current frame is anchored to.
    *
    * The value is valid only if the AnchorType is TextContentAnchorType::AT_FRAME.
    */
  var AnchorFrame: XTextFrame = js.native
  /**
    * contains the number of the page where the objects are anchored.
    *
    * The value is valid only if the AnchorType is TextContentAnchorType::AT_PAGE.
    */
  var AnchorPageNo: Double = js.native
  /** contains the color of the background of the object. */
  var BackColor: Color = js.native
  /** contains the name of the file filter for the background graphic. */
  var BackGraphicFilter: String = js.native
  /** determines the position of the background graphic. */
  var BackGraphicLocation: GraphicLocation = js.native
  /** contains the URL for the background graphic. */
  var BackGraphicURL: String = js.native
  /** If TRUE, the "BackColor" is ignored. */
  var BackTransparent: Boolean = js.native
  /** contains the distance from the border to the object. */
  var BorderDistance: Double = js.native
  /**
    * contains the bottom border of the object.
    * @see BaseFrame.com.sun.star.table.BorderLine
    */
  var BottomBorder: BorderLine = js.native
  /** contains the distance from the bottom border to the object. */
  var BottomBorderDistance: Double = js.native
  /** contains the bottom margin of the object. */
  var BottomMargin: Double = js.native
  /** determines if the content is protected. */
  var ContentProtected: Boolean = js.native
  /**
    * contains description for the object
    *
    * The long description text can be entered to describe a object in more detail to users with screen reader software. The description is visible as an
    * alternative tag for accessibility tools.
    * @since OOo 3.2
    */
  var Description: String = js.native
  /**
    * If the property {@link FillStyle} is set to FillStyle::GRADIENT, this describes the gradient used.
    * @since LibreOffice 4.1
    */
  var FillGradient: Gradient = js.native
  /**
    * If the property {@link FillStyle} is set to FillStyle::GRADIENT, this is the name of the gradient used.
    * @since LibreOffice 4.1
    */
  var FillGradientName: String = js.native
  /**
    * This enumeration selects the style the area will be filled with.
    *
    * Currently only set for gradients.
    * @since LibreOffice 4.1
    */
  var FillStyle: typings.activexLibreoffice.com_.sun.star.drawing.FillStyle = js.native
  /**
    * Grab bag of frame properties, used as a string-any map for interim interop purposes.
    * @since LibreOffice 4.2  This property is intentionally not handled by the ODF filter. Any member that should be handled there should be first moved out
    */
  var FrameInteropGrabBag: SafeArray[PropertyValue] = js.native
  /**
    * contains the height of the object (1/100 mm).
    *
    * It is only valid if {@link TextEmbeddedObject.RelativeHeight} is zero.
    */
  var Height: Double = js.native
  /**
    * determines the horizontal orientation of the object.
    * @see BaseFrame.HoriOrientation
    */
  var HoriOrient: Double = js.native
  /**
    * contains the horizontal position of the object (1/100 mm).
    *
    * It is only valid if "HoriOrient" is HoriOrientation_NONE.
    */
  var HoriOrientPosition: Double = js.native
  /**
    * determines the environment of the object to which the orientation is related.
    * @see BaseFrame.RelOrientation
    */
  var HoriOrientRelation: Double = js.native
  /** contains the name of the hyperlink that is set at the object. */
  var HyperLinkName: String = js.native
  /** contains the name of the target for a hyperlink that is set at the object. */
  var HyperLinkTarget: String = js.native
  /** contains the URL of a hyperlink that is set at the object. */
  var HyperLinkURL: String = js.native
  /** determines whether the height follows the width. */
  var IsSyncHeightToWidth: Boolean = js.native
  /** determines whether the width follows the height. */
  var IsSyncWidthToHeight: Boolean = js.native
  /**
    * returns the actual size of the object.
    *
    * Since to obtain the correct actual size of the object not only the layouting for the frame needs to be finished but the whole document needs to be
    * formatted as well. Thus if that was not done previously it may take some while to retrieve this value.
    * @since OOo 2.0.4
    */
  var LayoutSize: Size = js.native
  /**
    * contains the left border of the object.
    * @see BaseFrame.com.sun.star.table.BorderLine
    */
  var LeftBorder: BorderLine = js.native
  /** contains the distance from the left border to the object. */
  var LeftBorderDistance: Double = js.native
  /** contains the left margin of the object. */
  var LeftMargin: Double = js.native
  /** determines if the object is opaque or transparent for text. */
  var Opaque: Boolean = js.native
  /** determines if the object is mirrored on even pages. */
  var PageToggle: Boolean = js.native
  /** determines if the position is protected. */
  var PositionProtected: Boolean = js.native
  /** determines if the object is included in printing. */
  var Print: Boolean = js.native
  /**
    * contains the relative height of the object.
    *
    * It is only valid if it is greater than zero.
    */
  var RelativeHeight: Double = js.native
  /**
    * contains the relation of the relative height of the object.
    *
    * It is only valid if RelativeHeight is greater than zero.
    * @see com.sun.star.text.RelOrientation
    * @since LibreOffice 4.3
    */
  var RelativeHeightRelation: Double = js.native
  /**
    * contains the relative width of the object.
    *
    * It is only valid if it is greater than zero.
    */
  var RelativeWidth: Double = js.native
  /**
    * contains the relation of the relative width of the object.
    *
    * It is only valid if RelativeWidth is greater than zero.
    * @see com.sun.star.text.RelOrientation
    * @since LibreOffice 4.3
    */
  var RelativeWidthRelation: Double = js.native
  /**
    * contains the right border of the object.
    * @see BaseFrame.com.sun.star.table.BorderLine
    */
  var RightBorder: BorderLine = js.native
  /** contains the distance from the right border to the object. */
  var RightBorderDistance: Double = js.native
  /** contains the right margin of the object. */
  var RightMargin: Double = js.native
  /** determines if the object gets an image map from a server. */
  var ServerMap: Boolean = js.native
  /** contains the type of the shadow of the object. */
  var ShadowFormat: typings.activexLibreoffice.com_.sun.star.table.ShadowFormat = js.native
  /**
    * This defines the degree of transparence of the shadow in percent.
    *
    * This is the same as setting the Color member of the {@link ShadowFormat} property to an ARGB color.
    * @since LibreOffice 4.2
    */
  var ShadowTransparence: Double = js.native
  /**
    * contains the size of the object.
    * @see BaseFrame.Height
    * @see BaseFrame.Width
    */
  var Size: typings.activexLibreoffice.com_.sun.star.awt.Size = js.native
  /** determines if the size is protected. */
  var SizeProtected: Boolean = js.native
  /**
    * determines the type of the surrounding text.
    * @deprecated Deprecated
    */
  var Surround: WrapTextMode = js.native
  /** determines if the text of the paragraph in which the object is anchored, wraps around the object. */
  var SurroundAnchorOnly: Boolean = js.native
  /**
    * contains short title for the object
    *
    * This short title is visible as an alternative tag in HTML format. Accessibility tools can read this text.
    * @since OOo 3.2
    */
  var Title: String = js.native
  /**
    * contains the top border of the object.
    * @see BaseFrame.com.sun.star.table.BorderLine
    */
  var TopBorder: BorderLine = js.native
  /** contains the distance from the top border to the object. */
  var TopBorderDistance: Double = js.native
  /** contains the top margin of the object. */
  var TopMargin: Double = js.native
  /**
    * determines the vertical orientation of the object.
    * @see BaseFrame.VertOrientation
    */
  var VertOrient: Double = js.native
  /**
    * contains the vertical position of the object (1/100 mm).
    *
    * It is only valid if {@link TextEmbeddedObject.VertOrient} is {@link VertOrientation.NONE} .
    */
  var VertOrientPosition: Double = js.native
  /**
    * determines the environment of the object to which the orientation is related.
    * @see BaseFrame.RelOrientation
    */
  var VertOrientRelation: Double = js.native
  /**
    * contains the width of the object (1/100 mm).
    *
    * It is only valid if {@link TextEmbeddedObject.RelativeWidth} is zero.
    */
  var Width: Double = js.native
  /**
    * determines the influence of the text wrap on the positioning of the shape
    *
    * The value of this property is only evaluated for the positioning of the shape, if the text document setting ConsiderTextWrapOnObjPos is `TRUE` . Valid
    * values are given by {@link WrapInfluenceOnPosition}
    * @since OOo 2.0
    */
  var WrapInfluenceOnPosition: Double = js.native
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
  implicit class BaseFramePropertiesOps[Self <: BaseFrameProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAnchorFrame(value: XTextFrame): Self = this.set("AnchorFrame", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnchorPageNo(value: Double): Self = this.set("AnchorPageNo", value.asInstanceOf[js.Any])
    @scala.inline
    def setBackColor(value: Color): Self = this.set("BackColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setBackGraphicFilter(value: String): Self = this.set("BackGraphicFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def setBackGraphicLocation(value: GraphicLocation): Self = this.set("BackGraphicLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def setBackGraphicURL(value: String): Self = this.set("BackGraphicURL", value.asInstanceOf[js.Any])
    @scala.inline
    def setBackTransparent(value: Boolean): Self = this.set("BackTransparent", value.asInstanceOf[js.Any])
    @scala.inline
    def setBorderDistance(value: Double): Self = this.set("BorderDistance", value.asInstanceOf[js.Any])
    @scala.inline
    def setBottomBorder(value: BorderLine): Self = this.set("BottomBorder", value.asInstanceOf[js.Any])
    @scala.inline
    def setBottomBorderDistance(value: Double): Self = this.set("BottomBorderDistance", value.asInstanceOf[js.Any])
    @scala.inline
    def setBottomMargin(value: Double): Self = this.set("BottomMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def setContentProtected(value: Boolean): Self = this.set("ContentProtected", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def setFillGradient(value: Gradient): Self = this.set("FillGradient", value.asInstanceOf[js.Any])
    @scala.inline
    def setFillGradientName(value: String): Self = this.set("FillGradientName", value.asInstanceOf[js.Any])
    @scala.inline
    def setFillStyle(value: FillStyle): Self = this.set("FillStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrameInteropGrabBag(value: SafeArray[PropertyValue]): Self = this.set("FrameInteropGrabBag", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("Height", value.asInstanceOf[js.Any])
    @scala.inline
    def setHoriOrient(value: Double): Self = this.set("HoriOrient", value.asInstanceOf[js.Any])
    @scala.inline
    def setHoriOrientPosition(value: Double): Self = this.set("HoriOrientPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def setHoriOrientRelation(value: Double): Self = this.set("HoriOrientRelation", value.asInstanceOf[js.Any])
    @scala.inline
    def setHyperLinkName(value: String): Self = this.set("HyperLinkName", value.asInstanceOf[js.Any])
    @scala.inline
    def setHyperLinkTarget(value: String): Self = this.set("HyperLinkTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def setHyperLinkURL(value: String): Self = this.set("HyperLinkURL", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsSyncHeightToWidth(value: Boolean): Self = this.set("IsSyncHeightToWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsSyncWidthToHeight(value: Boolean): Self = this.set("IsSyncWidthToHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setLayoutSize(value: Size): Self = this.set("LayoutSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setLeftBorder(value: BorderLine): Self = this.set("LeftBorder", value.asInstanceOf[js.Any])
    @scala.inline
    def setLeftBorderDistance(value: Double): Self = this.set("LeftBorderDistance", value.asInstanceOf[js.Any])
    @scala.inline
    def setLeftMargin(value: Double): Self = this.set("LeftMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpaque(value: Boolean): Self = this.set("Opaque", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageToggle(value: Boolean): Self = this.set("PageToggle", value.asInstanceOf[js.Any])
    @scala.inline
    def setPositionProtected(value: Boolean): Self = this.set("PositionProtected", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrint(value: Boolean): Self = this.set("Print", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelativeHeight(value: Double): Self = this.set("RelativeHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelativeHeightRelation(value: Double): Self = this.set("RelativeHeightRelation", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelativeWidth(value: Double): Self = this.set("RelativeWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelativeWidthRelation(value: Double): Self = this.set("RelativeWidthRelation", value.asInstanceOf[js.Any])
    @scala.inline
    def setRightBorder(value: BorderLine): Self = this.set("RightBorder", value.asInstanceOf[js.Any])
    @scala.inline
    def setRightBorderDistance(value: Double): Self = this.set("RightBorderDistance", value.asInstanceOf[js.Any])
    @scala.inline
    def setRightMargin(value: Double): Self = this.set("RightMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def setServerMap(value: Boolean): Self = this.set("ServerMap", value.asInstanceOf[js.Any])
    @scala.inline
    def setShadowFormat(value: ShadowFormat): Self = this.set("ShadowFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def setShadowTransparence(value: Double): Self = this.set("ShadowTransparence", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Size): Self = this.set("Size", value.asInstanceOf[js.Any])
    @scala.inline
    def setSizeProtected(value: Boolean): Self = this.set("SizeProtected", value.asInstanceOf[js.Any])
    @scala.inline
    def setSurround(value: WrapTextMode): Self = this.set("Surround", value.asInstanceOf[js.Any])
    @scala.inline
    def setSurroundAnchorOnly(value: Boolean): Self = this.set("SurroundAnchorOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("Title", value.asInstanceOf[js.Any])
    @scala.inline
    def setTopBorder(value: BorderLine): Self = this.set("TopBorder", value.asInstanceOf[js.Any])
    @scala.inline
    def setTopBorderDistance(value: Double): Self = this.set("TopBorderDistance", value.asInstanceOf[js.Any])
    @scala.inline
    def setTopMargin(value: Double): Self = this.set("TopMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def setVertOrient(value: Double): Self = this.set("VertOrient", value.asInstanceOf[js.Any])
    @scala.inline
    def setVertOrientPosition(value: Double): Self = this.set("VertOrientPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def setVertOrientRelation(value: Double): Self = this.set("VertOrientRelation", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("Width", value.asInstanceOf[js.Any])
    @scala.inline
    def setWrapInfluenceOnPosition(value: Double): Self = this.set("WrapInfluenceOnPosition", value.asInstanceOf[js.Any])
  }
  
}

