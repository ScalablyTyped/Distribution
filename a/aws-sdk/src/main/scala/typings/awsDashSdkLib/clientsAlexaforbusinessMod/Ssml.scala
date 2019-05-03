package typings
package awsDashSdkLib.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ssml extends js.Object {
  /**
    * The locale of the SSML message. Currently, en-US is supported.
    */
  var Locale: awsDashSdkLib.clientsAlexaforbusinessMod.Locale
  /**
    * The value of the SSML message in the correct SSML format. The audio tag is not supported.
    */
  var Value: SsmlValue
}

object Ssml {
  @scala.inline
  def apply(Locale: Locale, Value: SsmlValue): Ssml = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], Value = Value)
  
    __obj.asInstanceOf[Ssml]
  }
}

