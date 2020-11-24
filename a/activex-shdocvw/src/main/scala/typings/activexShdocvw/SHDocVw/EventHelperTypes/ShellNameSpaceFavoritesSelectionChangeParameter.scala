package typings.activexShdocvw.SHDocVw.EventHelperTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShellNameSpaceFavoritesSelectionChangeParameter extends js.Object {
  
  val cItems: Double = js.native
  
  val cVisits: Double = js.native
  
  val fAvailableOffline: Double = js.native
  
  val hItem: Double = js.native
  
  val strDate: String = js.native
  
  val strName: String = js.native
  
  val strUrl: String = js.native
}
object ShellNameSpaceFavoritesSelectionChangeParameter {
  
  @scala.inline
  def apply(
    cItems: Double,
    cVisits: Double,
    fAvailableOffline: Double,
    hItem: Double,
    strDate: String,
    strName: String,
    strUrl: String
  ): ShellNameSpaceFavoritesSelectionChangeParameter = {
    val __obj = js.Dynamic.literal(cItems = cItems.asInstanceOf[js.Any], cVisits = cVisits.asInstanceOf[js.Any], fAvailableOffline = fAvailableOffline.asInstanceOf[js.Any], hItem = hItem.asInstanceOf[js.Any], strDate = strDate.asInstanceOf[js.Any], strName = strName.asInstanceOf[js.Any], strUrl = strUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShellNameSpaceFavoritesSelectionChangeParameter]
  }
  
  @scala.inline
  implicit class ShellNameSpaceFavoritesSelectionChangeParameterOps[Self <: ShellNameSpaceFavoritesSelectionChangeParameter] (val x: Self) extends AnyVal {
    
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
    def setCItems(value: Double): Self = this.set("cItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCVisits(value: Double): Self = this.set("cVisits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFAvailableOffline(value: Double): Self = this.set("fAvailableOffline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHItem(value: Double): Self = this.set("hItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrDate(value: String): Self = this.set("strDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrName(value: String): Self = this.set("strName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrUrl(value: String): Self = this.set("strUrl", value.asInstanceOf[js.Any])
  }
}
