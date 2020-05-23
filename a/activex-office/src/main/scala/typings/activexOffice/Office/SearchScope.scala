package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchScope extends js.Object {
  val Application: js.Any
  val Creator: Double
  @JSName("Office.SearchScope_typekey")
  var OfficeDotSearchScope_typekey: SearchScope
  val ScopeFolder: typings.activexOffice.Office.ScopeFolder
  val Type: MsoSearchIn
}

object SearchScope {
  @scala.inline
  def apply(
    Application: js.Any,
    Creator: Double,
    OfficeDotSearchScope_typekey: SearchScope,
    ScopeFolder: ScopeFolder,
    Type: MsoSearchIn
  ): SearchScope = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], ScopeFolder = ScopeFolder.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.SearchScope_typekey")(OfficeDotSearchScope_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchScope]
  }
}

