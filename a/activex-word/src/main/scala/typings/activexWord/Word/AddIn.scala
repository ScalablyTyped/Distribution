package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddIn extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Autoload: Boolean
  val Compiled: Boolean
  val Creator: Double
  val Index: Double
  var Installed: Boolean
  val Name: String
  val Parent: js.Any
  val Path: String
  @JSName("Word.AddIn_typekey")
  var WordDotAddIn_typekey: AddIn
  def Delete(): Unit
}

object AddIn {
  @scala.inline
  def apply(
    Application: Application,
    Autoload: Boolean,
    Compiled: Boolean,
    Creator: Double,
    Delete: () => Unit,
    Index: Double,
    Installed: Boolean,
    Name: String,
    Parent: js.Any,
    Path: String,
    WordDotAddIn_typekey: AddIn
  ): AddIn = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Autoload = Autoload.asInstanceOf[js.Any], Compiled = Compiled.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Index = Index.asInstanceOf[js.Any], Installed = Installed.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Path = Path.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.AddIn_typekey")(WordDotAddIn_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddIn]
  }
}

