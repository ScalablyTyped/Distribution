package typings.antvComponent

import typings.antvGBase.typesMod.BBox
import typings.antvGBase.typesMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object alignMod {
  
  @JSImport("@antv/component/lib/util/align", "getAlignPoint")
  @js.native
  def getAlignPoint(x: Double, y: Double, offset: Double, width: Double, height: Double, position: String): Point = js.native
  @JSImport("@antv/component/lib/util/align", "getAlignPoint")
  @js.native
  def getAlignPoint(
    x: Double,
    y: Double,
    offset: Double,
    width: Double,
    height: Double,
    position: String,
    limitBox: BBox
  ): Point = js.native
  
  @JSImport("@antv/component/lib/util/align", "getOutSides")
  @js.native
  def getOutSides(x: Double, y: Double, width: Double, height: Double, limitBox: BBox): OutSides = js.native
  
  @JSImport("@antv/component/lib/util/align", "getPointByPosition")
  @js.native
  def getPointByPosition(x: Double, y: Double, offset: Double, width: Double, height: Double, position: String): Point = js.native
  
  @js.native
  trait OutSides extends StObject {
    
    var bottom: Boolean = js.native
    
    var left: Boolean = js.native
    
    var right: Boolean = js.native
    
    var top: Boolean = js.native
  }
  object OutSides {
    
    @scala.inline
    def apply(bottom: Boolean, left: Boolean, right: Boolean, top: Boolean): OutSides = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[OutSides]
    }
    
    @scala.inline
    implicit class OutSidesMutableBuilder[Self <: OutSides] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: Boolean): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft(value: Boolean): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRight(value: Boolean): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: Boolean): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
}
