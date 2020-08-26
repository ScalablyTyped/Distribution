package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.com_.sun.star.lang.Locale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A name that is valid for a specified locale.
  * @see com.sun.star.sheet.XCompatibilityNames
  */
@js.native
trait LocalizedName extends js.Object {
  /** The locale for which this name is valid. */
  var Locale: typings.activexLibreoffice.com_.sun.star.lang.Locale = js.native
  /** The name itself. */
  var Name: String = js.native
}

object LocalizedName {
  @scala.inline
  def apply(Locale: Locale, Name: String): LocalizedName = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalizedName]
  }
  @scala.inline
  implicit class LocalizedNameOps[Self <: LocalizedName] (val x: Self) extends AnyVal {
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
    def setLocale(value: Locale): Self = this.set("Locale", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
  }
  
}

