package typings.awsDashSdk.clientsCodebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnvironmentLanguage extends js.Object {
  /**
    * The list of Docker images that are related by the specified programming language.
    */
  var images: js.UndefOr[EnvironmentImages] = js.native
  /**
    * The programming language for the Docker images.
    */
  var language: js.UndefOr[LanguageType] = js.native
}

object EnvironmentLanguage {
  @scala.inline
  def apply(images: EnvironmentImages = null, language: LanguageType = null): EnvironmentLanguage = {
    val __obj = js.Dynamic.literal()
    if (images != null) __obj.updateDynamic("images")(images.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvironmentLanguage]
  }
}

