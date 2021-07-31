package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMLineCallout
  extends StObject
     with CIMCalloutBase {
  
  /**
    * The gap (in points) between the point symbol and the beginning of the leader line.
    */
  var gap: js.UndefOr[Double] = js.undefined
  
  /**
    * The line symbol to draw leaders with.
    */
  var leaderLineSymbol: js.UndefOr[CIMLineSymbol] = js.undefined
  
  /**
    * The style of line to generate when a Point leader is drawn defined by an enumeration value. Line leaders will always be drawn with their own geometry.
    */
  var lineStyle: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LeaderLineStyle * / any */ String
  ] = js.undefined
}
object CIMLineCallout {
  
  @scala.inline
  def apply(`type`: String): CIMLineCallout = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMLineCallout]
  }
  
  @scala.inline
  implicit class CIMLineCalloutMutableBuilder[Self <: CIMLineCallout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGap(value: Double): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGapUndefined: Self = StObject.set(x, "gap", js.undefined)
    
    @scala.inline
    def setLeaderLineSymbol(value: CIMLineSymbol): Self = StObject.set(x, "leaderLineSymbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeaderLineSymbolUndefined: Self = StObject.set(x, "leaderLineSymbol", js.undefined)
    
    @scala.inline
    def setLineStyle(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LeaderLineStyle * / any */ String
    ): Self = StObject.set(x, "lineStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineStyleUndefined: Self = StObject.set(x, "lineStyle", js.undefined)
  }
}
