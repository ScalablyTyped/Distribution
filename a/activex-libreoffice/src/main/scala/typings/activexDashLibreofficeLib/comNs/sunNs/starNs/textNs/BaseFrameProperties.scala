package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies the properties that are provided by all text frames, graphic objects, embedded objects and frame styles. */
trait BaseFrameProperties
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.UserDefinedAttributesSupplier {
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
  /** contains the color of the background of the object. */
  var BackColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  /** contains the name of the file filter for the background graphic. */
  var BackGraphicFilter: java.lang.String
  /** determines the position of the background graphic. */
  var BackGraphicLocation: activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.GraphicLocation
  /** contains the URL for the background graphic. */
  var BackGraphicURL: java.lang.String
  /** If TRUE, the "BackColor" is ignored. */
  var BackTransparent: scala.Boolean
  /** contains the distance from the border to the object. */
  var BorderDistance: scala.Double
  /**
    * contains the bottom border of the object.
    * @see BaseFrame.com.sun.star.table.BorderLine
    */
  var BottomBorder: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine
  /** contains the distance from the bottom border to the object. */
  var BottomBorderDistance: scala.Double
  /** contains the bottom margin of the object. */
  var BottomMargin: scala.Double
  /** determines if the content is protected. */
  var ContentProtected: scala.Boolean
  /**
    * contains description for the object
    *
    * The long description text can be entered to describe a object in more detail to users with screen reader software. The description is visible as an
    * alternative tag for accessibility tools.
    * @since OOo 3.2
    */
  var Description: java.lang.String
  /**
    * If the property {@link FillStyle} is set to FillStyle::GRADIENT, this describes the gradient used.
    * @since LibreOffice 4.1
    */
  var FillGradient: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Gradient
  /**
    * If the property {@link FillStyle} is set to FillStyle::GRADIENT, this is the name of the gradient used.
    * @since LibreOffice 4.1
    */
  var FillGradientName: java.lang.String
  /**
    * This enumeration selects the style the area will be filled with.
    *
    * Currently only set for gradients.
    * @since LibreOffice 4.1
    */
  var FillStyle: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.FillStyle
  /**
    * Grab bag of frame properties, used as a string-any map for interim interop purposes.
    * @since LibreOffice 4.2  This property is intentionally not handled by the ODF filter. Any member that should be handled there should be first moved out
    */
  var FrameInteropGrabBag: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  /**
    * contains the height of the object (1/100 mm).
    *
    * It is only valid if {@link TextEmbeddedObject.RelativeHeight} is zero.
    */
  var Height: scala.Double
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
  /** contains the name of the hyperlink that is set at the object. */
  var HyperLinkName: java.lang.String
  /** contains the name of the target for a hyperlink that is set at the object. */
  var HyperLinkTarget: java.lang.String
  /** contains the URL of a hyperlink that is set at the object. */
  var HyperLinkURL: java.lang.String
  /** determines whether the height follows the width. */
  var IsSyncHeightToWidth: scala.Boolean
  /** determines whether the width follows the height. */
  var IsSyncWidthToHeight: scala.Boolean
  /**
    * returns the actual size of the object.
    *
    * Since to obtain the correct actual size of the object not only the layouting for the frame needs to be finished but the whole document needs to be
    * formatted as well. Thus if that was not done previously it may take some while to retrieve this value.
    * @since OOo 2.0.4
    */
  var LayoutSize: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size
  /**
    * contains the left border of the object.
    * @see BaseFrame.com.sun.star.table.BorderLine
    */
  var LeftBorder: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine
  /** contains the distance from the left border to the object. */
  var LeftBorderDistance: scala.Double
  /** contains the left margin of the object. */
  var LeftMargin: scala.Double
  /** determines if the object is opaque or transparent for text. */
  var Opaque: scala.Boolean
  /** determines if the object is mirrored on even pages. */
  var PageToggle: scala.Boolean
  /** determines if the position is protected. */
  var PositionProtected: scala.Boolean
  /** determines if the object is included in printing. */
  var Print: scala.Boolean
  /**
    * contains the relative height of the object.
    *
    * It is only valid if it is greater than zero.
    */
  var RelativeHeight: scala.Double
  /**
    * contains the relation of the relative height of the object.
    *
    * It is only valid if RelativeHeight is greater than zero.
    * @see com.sun.star.text.RelOrientation
    * @since LibreOffice 4.3
    */
  var RelativeHeightRelation: scala.Double
  /**
    * contains the relative width of the object.
    *
    * It is only valid if it is greater than zero.
    */
  var RelativeWidth: scala.Double
  /**
    * contains the relation of the relative width of the object.
    *
    * It is only valid if RelativeWidth is greater than zero.
    * @see com.sun.star.text.RelOrientation
    * @since LibreOffice 4.3
    */
  var RelativeWidthRelation: scala.Double
  /**
    * contains the right border of the object.
    * @see BaseFrame.com.sun.star.table.BorderLine
    */
  var RightBorder: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine
  /** contains the distance from the right border to the object. */
  var RightBorderDistance: scala.Double
  /** contains the right margin of the object. */
  var RightMargin: scala.Double
  /** determines if the object gets an image map from a server. */
  var ServerMap: scala.Boolean
  /** contains the type of the shadow of the object. */
  var ShadowFormat: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.ShadowFormat
  /**
    * This defines the degree of transparence of the shadow in percent.
    *
    * This is the same as setting the Color member of the {@link ShadowFormat} property to an ARGB color.
    * @since LibreOffice 4.2
    */
  var ShadowTransparence: scala.Double
  /**
    * contains the size of the object.
    * @see BaseFrame.Height
    * @see BaseFrame.Width
    */
  var Size: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size
  /** determines if the size is protected. */
  var SizeProtected: scala.Boolean
  /**
    * determines the type of the surrounding text.
    * @deprecated Deprecated
    */
  var Surround: WrapTextMode
  /** determines if the text of the paragraph in which the object is anchored, wraps around the object. */
  var SurroundAnchorOnly: scala.Boolean
  /**
    * contains short title for the object
    *
    * This short title is visible as an alternative tag in HTML format. Accessibility tools can read this text.
    * @since OOo 3.2
    */
  var Title: java.lang.String
  /**
    * contains the top border of the object.
    * @see BaseFrame.com.sun.star.table.BorderLine
    */
  var TopBorder: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine
  /** contains the distance from the top border to the object. */
  var TopBorderDistance: scala.Double
  /** contains the top margin of the object. */
  var TopMargin: scala.Double
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
    * contains the width of the object (1/100 mm).
    *
    * It is only valid if {@link TextEmbeddedObject.RelativeWidth} is zero.
    */
  var Width: scala.Double
  /**
    * determines the influence of the text wrap on the positioning of the shape
    *
    * The value of this property is only evaluated for the positioning of the shape, if the text document setting ConsiderTextWrapOnObjPos is `TRUE` . Valid
    * values are given by {@link WrapInfluenceOnPosition}
    * @since OOo 2.0
    */
  var WrapInfluenceOnPosition: scala.Double
}

