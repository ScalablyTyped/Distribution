package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** is a {@link TextRange} which is explicitly marked as an index entry for a {@link ContentIndex} . */
trait ContentIndexMark
  extends StObject
     with BaseIndexMark {
  
  /** contains the level into which the index mark will be inserted into the content index. */
  var Level: Double
}
object ContentIndexMark {
  
  inline def apply(
    AlternativeText: String,
    Anchor: XTextRange,
    AnchorType: TextContentAnchorType,
    AnchorTypes: SafeArray[TextContentAnchorType],
    Level: Double,
    TextWrap: WrapTextMode,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    attach: XTextRange => Unit,
    dispose: () => Unit,
    getAnchor: () => XTextRange,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit
  ): ContentIndexMark = {
    val __obj = js.Dynamic.literal(AlternativeText = AlternativeText.asInstanceOf[js.Any], Anchor = Anchor.asInstanceOf[js.Any], AnchorType = AnchorType.asInstanceOf[js.Any], AnchorTypes = AnchorTypes.asInstanceOf[js.Any], Level = Level.asInstanceOf[js.Any], TextWrap = TextWrap.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), attach = js.Any.fromFunction1(attach), dispose = js.Any.fromFunction0(dispose), getAnchor = js.Any.fromFunction0(getAnchor), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener))
    __obj.asInstanceOf[ContentIndexMark]
  }
  
  extension [Self <: ContentIndexMark](x: Self) {
    
    inline def setLevel(value: Double): Self = StObject.set(x, "Level", value.asInstanceOf[js.Any])
  }
}
