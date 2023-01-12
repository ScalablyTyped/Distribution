package typings.atvlegacycontentkit

import typings.atvlegacycontentkit.atvlegacycontentkitStrings.`truncate-head`
import typings.atvlegacycontentkit.atvlegacycontentkitStrings.`truncate-middle`
import typings.atvlegacycontentkit.atvlegacycontentkitStrings.`truncate-tail`
import typings.atvlegacycontentkit.atvlegacycontentkitStrings.`word-wrap`
import typings.atvlegacycontentkit.atvlegacycontentkitStrings.center
import typings.atvlegacycontentkit.atvlegacycontentkitStrings.clip
import typings.atvlegacycontentkit.atvlegacycontentkitStrings.heavy
import typings.atvlegacycontentkit.atvlegacycontentkitStrings.justify
import typings.atvlegacycontentkit.atvlegacycontentkitStrings.left
import typings.atvlegacycontentkit.atvlegacycontentkitStrings.light
import typings.atvlegacycontentkit.atvlegacycontentkitStrings.normal
import typings.atvlegacycontentkit.atvlegacycontentkitStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line:strict-export-declare-modifiers
trait AttributeContainer extends StObject {
  
  /**
    * The alignment of the text.
    */
  var alignment: js.UndefOr[left | right | center | justify] = js.undefined
  
  /**
    * The way the text should break.
    */
  var breakMode: js.UndefOr[clip | `word-wrap` | `truncate-head` | `truncate-tail` | `truncate-middle`] = js.undefined
  
  /**
    * The colour of the text.
    */
  var color: ATVColor
  
  /**
    * The size of the text.
    */
  var pointSize: js.UndefOr[Double] = js.undefined
  
  /**
    * The weight of the text.
    */
  var weight: js.UndefOr[normal | light | heavy] = js.undefined
}
object AttributeContainer {
  
  inline def apply(color: ATVColor): AttributeContainer = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeContainer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttributeContainer] (val x: Self) extends AnyVal {
    
    inline def setAlignment(value: left | right | center | justify): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
    
    inline def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
    
    inline def setBreakMode(value: clip | `word-wrap` | `truncate-head` | `truncate-tail` | `truncate-middle`): Self = StObject.set(x, "breakMode", value.asInstanceOf[js.Any])
    
    inline def setBreakModeUndefined: Self = StObject.set(x, "breakMode", js.undefined)
    
    inline def setColor(value: ATVColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setPointSize(value: Double): Self = StObject.set(x, "pointSize", value.asInstanceOf[js.Any])
    
    inline def setPointSizeUndefined: Self = StObject.set(x, "pointSize", js.undefined)
    
    inline def setWeight(value: normal | light | heavy): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
