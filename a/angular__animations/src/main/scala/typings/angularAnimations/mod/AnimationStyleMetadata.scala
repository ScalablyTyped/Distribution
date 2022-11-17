package typings.angularAnimations.mod

import org.scalablytyped.runtime.StringDictionary
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
  var styles: "*" | (StringDictionary[String | Double]) | (js.Array[(StringDictionary[String | Double]) | "*"])
}
object AnimationStyleMetadata {
  
  inline def apply(
    styles: "*" | (StringDictionary[String | Double]) | (js.Array[(StringDictionary[String | Double]) | "*"]),
    `type`: AnimationMetadataType
  ): AnimationStyleMetadata = {
    val __obj = js.Dynamic.literal(styles = styles.asInstanceOf[js.Any], offset = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationStyleMetadata]
  }
  
  extension [Self <: AnimationStyleMetadata](x: Self) {
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetNull: Self = StObject.set(x, "offset", null)
    
    inline def setStyles(
      value: "*" | (StringDictionary[String | Double]) | (js.Array[(StringDictionary[String | Double]) | "*"])
    ): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesVarargs(value: ((StringDictionary[String | Double]) | "*")*): Self = StObject.set(x, "styles", js.Array(value*))
  }
}
