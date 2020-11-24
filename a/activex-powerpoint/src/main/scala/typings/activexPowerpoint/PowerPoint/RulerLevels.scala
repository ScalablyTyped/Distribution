package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RulerLevels extends js.Object {
  
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  
  val Count: Double = js.native
  
  def Item(Index: Double): RulerLevel = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("PowerPoint.RulerLevels_typekey")
  var PowerPointDotRulerLevels_typekey: RulerLevels = js.native
}
object RulerLevels {
  
  @scala.inline
  def apply(
    Application: Application,
    Count: Double,
    Item: Double => RulerLevel,
    Parent: js.Any,
    PowerPointDotRulerLevels_typekey: RulerLevels
  ): RulerLevels = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.RulerLevels_typekey")(PowerPointDotRulerLevels_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[RulerLevels]
  }
  
  @scala.inline
  implicit class RulerLevelsOps[Self <: RulerLevels] (val x: Self) extends AnyVal {
    
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
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = this.set("Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: Double => RulerLevel): Self = this.set("Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotRulerLevels_typekey(value: RulerLevels): Self = this.set("PowerPoint.RulerLevels_typekey", value.asInstanceOf[js.Any])
  }
}
