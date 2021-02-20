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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GapDegree extends StObject {
  
  var gapDegree: js.UndefOr[scala.Nothing] = js.native
  
  var percent: Double = js.native
  
  var showInfo: Boolean = js.native
  
  var size: js.UndefOr[small | default] = js.native
  
  var strokeLinecap: js.UndefOr[round | butt | square] = js.native
  
  var trailColor: Null = js.native
  
  var `type`: js.UndefOr[circle | line | dashboard] = js.native
}
object GapDegree {
  
  @scala.inline
  def apply(percent: Double, showInfo: Boolean, trailColor: Null): GapDegree = {
    val __obj = js.Dynamic.literal(percent = percent.asInstanceOf[js.Any], showInfo = showInfo.asInstanceOf[js.Any], trailColor = trailColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[GapDegree]
  }
  
  @scala.inline
  implicit class GapDegreeMutableBuilder[Self <: GapDegree] (val x: Self) extends AnyVal {
    
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
