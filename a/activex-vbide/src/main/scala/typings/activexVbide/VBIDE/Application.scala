package typings.activexVbide.VBIDE

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Application extends js.Object {
  @JSName("VBIDE.Application_typekey")
  var VBIDEDotApplication_typekey: Application
  val Version: String
}

object Application {
  @scala.inline
  def apply(VBIDEDotApplication_typekey: Application, Version: String): Application = {
    val __obj = js.Dynamic.literal(Version = Version.asInstanceOf[js.Any])
    __obj.updateDynamic("VBIDE.Application_typekey")(VBIDEDotApplication_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Application]
  }
}

