package typings.antvComponent.typesMod

import typings.antvGBase.typesMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Region extends StObject {
  
  /**
    * 结束点
    * @type {Point}
    */
  var end: Point
  
  /**
    * 起始点
    * @type {Point}
    */
  var start: Point
}
object Region {
  
  @scala.inline
  def apply(end: Point, start: Point): Region = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Region]
  }
  
  @scala.inline
  implicit class RegionMutableBuilder[Self <: Region] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: Point): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Point): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
