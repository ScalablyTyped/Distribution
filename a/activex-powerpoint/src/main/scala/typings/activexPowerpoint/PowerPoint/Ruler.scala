package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ruler extends js.Object {
  
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  
  val Levels: RulerLevels = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("PowerPoint.Ruler_typekey")
  var PowerPointDotRuler_typekey: Ruler = js.native
  
  val TabStops: typings.activexPowerpoint.PowerPoint.TabStops = js.native
}
object Ruler {
  
  @scala.inline
  def apply(
    Application: Application,
    Levels: RulerLevels,
    Parent: js.Any,
    PowerPointDotRuler_typekey: Ruler,
    TabStops: TabStops
  ): Ruler = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Levels = Levels.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], TabStops = TabStops.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.Ruler_typekey")(PowerPointDotRuler_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ruler]
  }
  
  @scala.inline
  implicit class RulerOps[Self <: Ruler] (val x: Self) extends AnyVal {
    
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
    def setLevels(value: RulerLevels): Self = this.set("Levels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotRuler_typekey(value: Ruler): Self = this.set("PowerPoint.Ruler_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabStops(value: TabStops): Self = this.set("TabStops", value.asInstanceOf[js.Any])
  }
}
