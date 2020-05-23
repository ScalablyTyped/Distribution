package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ruler extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application
  val Levels: RulerLevels
  val Parent: js.Any
  @JSName("PowerPoint.Ruler_typekey")
  var PowerPointDotRuler_typekey: Ruler
  val TabStops: typings.activexPowerpoint.PowerPoint.TabStops
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
}

