package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchScope extends js.Object {
  val Application: js.Any = js.native
  val Creator: Double = js.native
  @JSName("Office.SearchScope_typekey")
  var OfficeDotSearchScope_typekey: SearchScope = js.native
  val ScopeFolder: typings.activexOffice.Office.ScopeFolder = js.native
  val Type: MsoSearchIn = js.native
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
  @scala.inline
  implicit class SearchScopeOps[Self <: SearchScope] (val x: Self) extends AnyVal {
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
    def setApplication(value: js.Any): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setOfficeDotSearchScope_typekey(value: SearchScope): Self = this.set("Office.SearchScope_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setScopeFolder(value: ScopeFolder): Self = this.set("ScopeFolder", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: MsoSearchIn): Self = this.set("Type", value.asInstanceOf[js.Any])
  }
  
}

