package typings.arcgisJsApi.esri.CIM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CIMLineCallout extends CIMCalloutBase {
  
  /**
    * The gap (in points) between the point symbol and the beginning of the leader line.
    */
  var gap: js.UndefOr[Double] = js.native
  
  /**
    * The line symbol to draw leaders with.
    */
  var leaderLineSymbol: js.UndefOr[CIMLineSymbol] = js.native
  
  /**
    * The style of line to generate when a Point leader is drawn defined by an enumeration value. Line leaders will always be drawn with their own geometry.
    */
  var lineStyle: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LeaderLineStyle * / any */ String
  ] = js.native
}
object CIMLineCallout {
  
  @scala.inline
  def apply(`type`: String): CIMLineCallout = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMLineCallout]
  }
  
  @scala.inline
  implicit class CIMLineCalloutOps[Self <: CIMLineCallout] (val x: Self) extends AnyVal {
    
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
    def setGap(value: Double): Self = this.set("gap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGap: Self = this.set("gap", js.undefined)
    
    @scala.inline
    def setLeaderLineSymbol(value: CIMLineSymbol): Self = this.set("leaderLineSymbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeaderLineSymbol: Self = this.set("leaderLineSymbol", js.undefined)
    
    @scala.inline
    def setLineStyle(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LeaderLineStyle * / any */ String
    ): Self = this.set("lineStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineStyle: Self = this.set("lineStyle", js.undefined)
  }
}
