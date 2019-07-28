package typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XStringKeyMap
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
    val __obj = js.Dynamic.literal(aIdentifier = aIdentifier, nLength = nLength, nOffset = nOffset, nType = nType, xMarkupInfoContainer = xMarkupInfoContainer)
  
    __obj.asInstanceOf[TextMarkupDescriptor]
  }
}

