package typings.antd.anon

import typings.antd.antdStrings.butt
import typings.antd.antdStrings.circle
import typings.antd.antdStrings.dashboard
import typings.antd.antdStrings.default
import typings.antd.antdStrings.line
import typings.antd.antdStrings.round
import typings.antd.antdStrings.small
import typings.antd.antdStrings.square
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GapDegree extends StObject {
  
  var gapDegree: Unit
  
  var percent: Double
  
  var showInfo: Boolean
  
  var size: js.UndefOr[small | default] = js.undefined
  
  var strokeLinecap: js.UndefOr[round | butt | square] = js.undefined
  
  var trailColor: Null
  
  var `type`: js.UndefOr[circle | line | dashboard] = js.undefined
}
object GapDegree {
  
  @scala.inline
  def apply(gapDegree: Unit, percent: Double, showInfo: Boolean, trailColor: Null): GapDegree = {
    val __obj = js.Dynamic.literal(gapDegree = gapDegree.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any], showInfo = showInfo.asInstanceOf[js.Any], trailColor = trailColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[GapDegree]
  }
  
  @scala.inline
  implicit class GapDegreeMutableBuilder[Self <: GapDegree] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGapDegree(value: Unit): Self = StObject.set(x, "gapDegree", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowInfo(value: Boolean): Self = StObject.set(x, "showInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: small | default): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setStrokeLinecap(value: round | butt | square): Self = StObject.set(x, "strokeLinecap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeLinecapUndefined: Self = StObject.set(x, "strokeLinecap", js.undefined)
    
    @scala.inline
    def setTrailColor(value: Null): Self = StObject.set(x, "trailColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: circle | line | dashboard): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
