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

