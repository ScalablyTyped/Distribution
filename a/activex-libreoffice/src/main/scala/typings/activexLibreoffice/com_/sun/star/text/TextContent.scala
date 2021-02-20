package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
@js.native
trait TextContent extends XTextContent {
  
  /** specifies how the text content is attached to its surrounding {@link Text} . */
  var AnchorType: TextContentAnchorType = js.native
  
  /**
    * contains the anchor type of the text content.
    * @see com.sun.star.text.TextContentAnchorType
    */
  var AnchorTypes: SafeArray[TextContentAnchorType] = js.native
  
  /** specifies if the text content is a shape and how the text is wrapped around the shape. */
  var TextWrap: WrapTextMode = js.native
}
object TextContent {
  
  @scala.inline
  def apply(
    Anchor: XTextRange,
    AnchorType: TextContentAnchorType,
    AnchorTypes: SafeArray[TextContentAnchorType],
    TextWrap: WrapTextMode,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    attach: XTextRange => Unit,
    dispose: () => Unit,
    getAnchor: () => XTextRange,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit
  ): TextContent = {
    val __obj = js.Dynamic.literal(Anchor = Anchor.asInstanceOf[js.Any], AnchorType = AnchorType.asInstanceOf[js.Any], AnchorTypes = AnchorTypes.asInstanceOf[js.Any], TextWrap = TextWrap.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), attach = js.Any.fromFunction1(attach), dispose = js.Any.fromFunction0(dispose), getAnchor = js.Any.fromFunction0(getAnchor), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener))
    __obj.asInstanceOf[TextContent]
  }
  
  @scala.inline
  implicit class TextContentMutableBuilder[Self <: TextContent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnchorType(value: TextContentAnchorType): Self = StObject.set(x, "AnchorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorTypes(value: SafeArray[TextContentAnchorType]): Self = StObject.set(x, "AnchorTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextWrap(value: WrapTextMode): Self = StObject.set(x, "TextWrap", value.asInstanceOf[js.Any])
  }
}
