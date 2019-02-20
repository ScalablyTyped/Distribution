package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is an object which can be anchored in a text, like instances of {@link TextFrame} or {@link TextField} .
  *
  * If the concrete {@link TextContent} has a textual representation which fades into the surrounding text, then {@link XTextField} is used.
  *
  * If the concrete {@link TextContent} has a "floating" object, like a graphic, {@link com.sun.star.drawing.XShape} is used.
  * @see TextField
  * @see TextTable
  * @see TextFrame
  * @see TextSection
  * @see TextGraphicObject
  * @see TextEmbeddedObject
  */
trait TextContent extends XTextContent {
  /** specifies how the text content is attached to its surrounding {@link Text} . */
  var AnchorType: TextContentAnchorType
  /**
    * contains the anchor type of the text content.
    * @see com.sun.star.text.TextContentAnchorType
    */
  var AnchorTypes: activexDashInteropLib.SafeArray[TextContentAnchorType]
  /** specifies if the text content is a shape and how the text is wrapped around the shape. */
  var TextWrap: WrapTextMode
}

