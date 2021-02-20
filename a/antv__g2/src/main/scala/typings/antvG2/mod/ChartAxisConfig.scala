package typings.antvG2.mod

import typings.antvG2.antvG2Strings.bottom
import typings.antvG2.antvG2Strings.left
import typings.antvG2.antvG2Strings.right
import typings.antvG2.antvG2Strings.top
import typings.antvG2.mod.Styles.tickLine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/g2", "ChartAxisConfig")
@js.native
class ChartAxisConfig () extends StObject {
  
  var grid: js.UndefOr[AxisGrid | Null] = js.native
  
  var label: js.UndefOr[AxisLabel] = js.native
  
  var line: js.UndefOr[typings.antvG2.mod.Styles.line] = js.native
  
  var position: js.UndefOr[top | bottom | left | right] = js.native
  
  var subTickCount: js.UndefOr[Double] = js.native
  
  var subTickLine: js.UndefOr[tickLine | Null] = js.native
  
  var tickLine: js.UndefOr[typings.antvG2.mod.Styles.tickLine | Null] = js.native
  
  var title: js.UndefOr[AxisTitle] = js.native
}
