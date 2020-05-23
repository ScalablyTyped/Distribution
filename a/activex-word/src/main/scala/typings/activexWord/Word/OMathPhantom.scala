package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OMathPhantom extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Creator: Double
  val E: OMath
  val Parent: js.Any
  var Show: Boolean
  var Smash: Boolean
  var Transp: Boolean
  @JSName("Word.OMathPhantom_typekey")
  var WordDotOMathPhantom_typekey: OMathPhantom
  var ZeroAsc: Boolean
  var ZeroDesc: Boolean
  var ZeroWid: Boolean
}

object OMathPhantom {
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    E: OMath,
    Parent: js.Any,
    Show: Boolean,
    Smash: Boolean,
    Transp: Boolean,
    WordDotOMathPhantom_typekey: OMathPhantom,
    ZeroAsc: Boolean,
    ZeroDesc: Boolean,
    ZeroWid: Boolean
  ): OMathPhantom = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], E = E.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Show = Show.asInstanceOf[js.Any], Smash = Smash.asInstanceOf[js.Any], Transp = Transp.asInstanceOf[js.Any], ZeroAsc = ZeroAsc.asInstanceOf[js.Any], ZeroDesc = ZeroDesc.asInstanceOf[js.Any], ZeroWid = ZeroWid.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.OMathPhantom_typekey")(WordDotOMathPhantom_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMathPhantom]
  }
}

