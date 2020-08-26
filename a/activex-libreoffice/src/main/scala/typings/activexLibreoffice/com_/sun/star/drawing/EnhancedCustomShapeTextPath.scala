package typings.activexLibreoffice.com_.sun.star.drawing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This service may be represented by a {@link com.sun.star.beans.PropertyValue} []. */
@js.native
trait EnhancedCustomShapeTextPath extends js.Object {
  /** This property specifies if the text is scaled using the shape path. */
  var ScaleX: Boolean = js.native
  /** This property specifies if a text path is used. The default is false. */
  var TextPath: Boolean = js.native
  /** This property specifies how the text is drawn. */
  var TextPathMode: EnhancedCustomShapeTextPathMode = js.native
}

object EnhancedCustomShapeTextPath {
  @scala.inline
  def apply(ScaleX: Boolean, TextPath: Boolean, TextPathMode: EnhancedCustomShapeTextPathMode): EnhancedCustomShapeTextPath = {
    val __obj = js.Dynamic.literal(ScaleX = ScaleX.asInstanceOf[js.Any], TextPath = TextPath.asInstanceOf[js.Any], TextPathMode = TextPathMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnhancedCustomShapeTextPath]
  }
  @scala.inline
  implicit class EnhancedCustomShapeTextPathOps[Self <: EnhancedCustomShapeTextPath] (val x: Self) extends AnyVal {
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
    def setScaleX(value: Boolean): Self = this.set("ScaleX", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextPath(value: Boolean): Self = this.set("TextPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextPathMode(value: EnhancedCustomShapeTextPathMode): Self = this.set("TextPathMode", value.asInstanceOf[js.Any])
  }
  
}

