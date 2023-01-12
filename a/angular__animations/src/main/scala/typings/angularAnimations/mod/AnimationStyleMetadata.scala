package typings.angularAnimations.mod

import org.scalablytyped.runtime.StringDictionary
import typings.angularAnimations.angularAnimationsStrings.Asterisk
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationStyleMetadata
  extends StObject
     with AnimationMetadata {
  
  /**
    * A percentage of the total animate time at which the style is to be applied.
    */
  var offset: Double | Null
  
  /**
    * A set of CSS style properties.
    */
  var styles: Asterisk | (StringDictionary[String | Double]) | (js.Array[(StringDictionary[String | Double]) | Asterisk])
}
object AnimationStyleMetadata {
  
  inline def apply(
    styles: Asterisk | (StringDictionary[String | Double]) | (js.Array[(StringDictionary[String | Double]) | Asterisk]),
    `type`: AnimationMetadataType
  ): AnimationStyleMetadata = {
    val __obj = js.Dynamic.literal(styles = styles.asInstanceOf[js.Any], offset = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationStyleMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnimationStyleMetadata] (val x: Self) extends AnyVal {
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetNull: Self = StObject.set(x, "offset", null)
    
    inline def setStyles(
      value: Asterisk | (StringDictionary[String | Double]) | (js.Array[(StringDictionary[String | Double]) | Asterisk])
    ): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesVarargs(value: ((StringDictionary[String | Double]) | Asterisk)*): Self = StObject.set(x, "styles", js.Array(value*))
  }
}
