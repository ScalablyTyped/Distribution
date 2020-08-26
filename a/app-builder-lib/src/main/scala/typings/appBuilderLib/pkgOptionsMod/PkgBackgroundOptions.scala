package typings.appBuilderLib.pkgOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PkgBackgroundOptions extends js.Object {
  /**
    * Alignment of the background image.
    * Options are: center, left, right, top, bottom, topleft, topright, bottomleft, bottomright
    * @default center
    */
  var alignment: js.UndefOr[BackgroundAlignment | Null] = js.native
  /**
    * Path to the image to use as an installer background.
    */
  var file: js.UndefOr[String] = js.native
  /**
    * Scaling of the background image.
    * Options are: tofit, none, proportional
    * @default tofit
    */
  var scaling: js.UndefOr[BackgroundScaling | Null] = js.native
}

object PkgBackgroundOptions {
  @scala.inline
  def apply(): PkgBackgroundOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PkgBackgroundOptions]
  }
  @scala.inline
  implicit class PkgBackgroundOptionsOps[Self <: PkgBackgroundOptions] (val x: Self) extends AnyVal {
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
    def setAlignment(value: BackgroundAlignment): Self = this.set("alignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignment: Self = this.set("alignment", js.undefined)
    @scala.inline
    def setAlignmentNull: Self = this.set("alignment", null)
    @scala.inline
    def setFile(value: String): Self = this.set("file", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFile: Self = this.set("file", js.undefined)
    @scala.inline
    def setScaling(value: BackgroundScaling): Self = this.set("scaling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScaling: Self = this.set("scaling", js.undefined)
    @scala.inline
    def setScalingNull: Self = this.set("scaling", null)
  }
  
}

