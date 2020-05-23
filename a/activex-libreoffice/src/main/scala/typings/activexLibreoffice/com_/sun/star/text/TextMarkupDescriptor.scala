package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.com_.sun.star.container.XStringKeyMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A descriptor for a single text markup.
  * @since OOo 3.0.1
  */
trait TextMarkupDescriptor extends js.Object {
  var aIdentifier: String
  var nLength: Double
  var nOffset: Double
  var nType: Double
  var xMarkupInfoContainer: XStringKeyMap
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
}

