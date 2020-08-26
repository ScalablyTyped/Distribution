package typings.appleMapkitJs.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options that you may provide when creating a directions object.
  */
@js.native
trait DirectionsConstructorOptions extends js.Object {
  /**
    * A language ID that determines the language for route information.
    */
  var language: js.UndefOr[String] = js.native
}

object DirectionsConstructorOptions {
  @scala.inline
  def apply(): DirectionsConstructorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectionsConstructorOptions]
  }
  @scala.inline
  implicit class DirectionsConstructorOptionsOps[Self <: DirectionsConstructorOptions] (val x: Self) extends AnyVal {
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
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
  }
  
}

