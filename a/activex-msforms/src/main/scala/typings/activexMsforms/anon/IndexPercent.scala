package typings.activexMsforms.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndexPercent extends js.Object {
  
  val Index: Double = js.native
  
  var Percent: Double = js.native
}
object IndexPercent {
  
  @scala.inline
  def apply(Index: Double, Percent: Double): IndexPercent = {
    val __obj = js.Dynamic.literal(Index = Index.asInstanceOf[js.Any], Percent = Percent.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexPercent]
  }
  
  @scala.inline
  implicit class IndexPercentOps[Self <: IndexPercent] (val x: Self) extends AnyVal {
    
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
    def setIndex(value: Double): Self = this.set("Index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercent(value: Double): Self = this.set("Percent", value.asInstanceOf[js.Any])
  }
}
