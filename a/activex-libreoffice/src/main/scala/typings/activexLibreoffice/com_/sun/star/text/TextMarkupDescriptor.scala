package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.com_.sun.star.container.XStringKeyMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A descriptor for a single text markup.
  * @since OOo 3.0.1
  */
@js.native
trait TextMarkupDescriptor extends js.Object {
  var aIdentifier: String = js.native
  var nLength: Double = js.native
  var nOffset: Double = js.native
  var nType: Double = js.native
  var xMarkupInfoContainer: XStringKeyMap = js.native
}

object TextMarkupDescriptor {
  @scala.inline
  def apply(
    aIdentifier: String,
    nLength: Double,
    nOffset: Double,
    nType: Double,
    xMarkupInfoContainer: XStringKeyMap
  ): TextMarkupDescriptor = {
    val __obj = js.Dynamic.literal(aIdentifier = aIdentifier.asInstanceOf[js.Any], nLength = nLength.asInstanceOf[js.Any], nOffset = nOffset.asInstanceOf[js.Any], nType = nType.asInstanceOf[js.Any], xMarkupInfoContainer = xMarkupInfoContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextMarkupDescriptor]
  }
  @scala.inline
  implicit class TextMarkupDescriptorOps[Self <: TextMarkupDescriptor] (val x: Self) extends AnyVal {
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
    def setAIdentifier(value: String): Self = this.set("aIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def setNLength(value: Double): Self = this.set("nLength", value.asInstanceOf[js.Any])
    @scala.inline
    def setNOffset(value: Double): Self = this.set("nOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def setNType(value: Double): Self = this.set("nType", value.asInstanceOf[js.Any])
    @scala.inline
    def setXMarkupInfoContainer(value: XStringKeyMap): Self = this.set("xMarkupInfoContainer", value.asInstanceOf[js.Any])
  }
  
}

