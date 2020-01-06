package typings.awsDashSdk.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCelebrityInfoResponse extends js.Object {
  /**
    * The name of the celebrity.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * An array of URLs pointing to additional celebrity information. 
    */
  var Urls: js.UndefOr[typings.awsDashSdk.clientsRekognitionMod.Urls] = js.native
}

object GetCelebrityInfoResponse {
  @scala.inline
  def apply(Name: String = null, Urls: Urls = null): GetCelebrityInfoResponse = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Urls != null) __obj.updateDynamic("Urls")(Urls.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCelebrityInfoResponse]
  }
}

