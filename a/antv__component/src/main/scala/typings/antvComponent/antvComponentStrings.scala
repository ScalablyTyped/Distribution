package typings.antvComponent

import typings.antvComponent.libTypesMod.LocationType
import typings.antvComponent.libTypesMod.TooltipPosition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object antvComponentStrings {
  
  @js.native
  sealed trait Region
    extends StObject
       with LocationType
  inline def Region: Region = "Region".asInstanceOf[Region]
  
  @js.native
  sealed trait auto
    extends StObject
       with TooltipPosition
  inline def auto: auto = "auto".asInstanceOf[auto]
  
  @js.native
  sealed trait bottom
    extends StObject
       with TooltipPosition
  inline def bottom: bottom = "bottom".asInstanceOf[bottom]
  
  @js.native
  sealed trait circle
    extends StObject
       with LocationType
  inline def circle: circle = "circle".asInstanceOf[circle]
  
  @js.native
  sealed trait container extends StObject
  inline def container: container = "container".asInstanceOf[container]
  
  @js.native
  sealed trait downward extends StObject
  inline def downward: downward = "downward".asInstanceOf[downward]
  
  @js.native
  sealed trait head extends StObject
  inline def head: head = "head".asInstanceOf[head]
  
  @js.native
  sealed trait left
    extends StObject
       with TooltipPosition
  inline def left: left = "left".asInstanceOf[left]
  
  @js.native
  sealed trait middle extends StObject
  inline def middle: middle = "middle".asInstanceOf[middle]
  
  @js.native
  sealed trait none
    extends StObject
       with LocationType
  inline def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait point
    extends StObject
       with LocationType
  inline def point: point = "point".asInstanceOf[point]
  
  @js.native
  sealed trait points
    extends StObject
       with LocationType
  inline def points: points = "points".asInstanceOf[points]
  
  @js.native
  sealed trait right
    extends StObject
       with TooltipPosition
  inline def right: right = "right".asInstanceOf[right]
  
  @js.native
  sealed trait tail extends StObject
  inline def tail: tail = "tail".asInstanceOf[tail]
  
  @js.native
  sealed trait top
    extends StObject
       with TooltipPosition
  inline def top: top = "top".asInstanceOf[top]
  
  @js.native
  sealed trait upward extends StObject
  inline def upward: upward = "upward".asInstanceOf[upward]
}
