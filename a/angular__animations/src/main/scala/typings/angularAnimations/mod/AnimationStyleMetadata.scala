package typings.angularAnimations.mod

import org.scalablytyped.runtime.StringDictionary
import typings.angularAnimations.angularAnimationsStrings.Asterisk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimationStyleMetadata extends AnimationMetadata {
  
  /**
    * A percentage of the total animate time at which the style is to be applied.
    */
  var offset: Double | Null = js.native
  
  /**
    * A set of CSS style properties.
    */
  var styles: Asterisk | (StringDictionary[String | Double]) | (js.Array[(StringDictionary[String | Double]) | Asterisk]) = js.native
}
object AnimationStyleMetadata {
  
  @scala.inline
  def apply(
    styles: Asterisk | (StringDictionary[String | Double]) | (js.Array[(StringDictionary[String | Double]) | Asterisk]),
    `type`: AnimationMetadataType
  ): AnimationStyleMetadata = {
    val __obj = js.Dynamic.literal(styles = styles.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationStyleMetadata]
  }
  
  @scala.inline
  implicit class AnimationStyleMetadataOps[Self <: AnimationStyleMetadata] (val x: Self) extends AnyVal {
    
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
    def setStylesVarargs(value: ((StringDictionary[String | Double]) | Asterisk)*): Self = this.set("styles", js.Array(value :_*))
    
    @scala.inline
    def setStyles(
      value: Asterisk | (StringDictionary[String | Double]) | (js.Array[(StringDictionary[String | Double]) | Asterisk])
    ): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetNull: Self = this.set("offset", null)
  }
}
