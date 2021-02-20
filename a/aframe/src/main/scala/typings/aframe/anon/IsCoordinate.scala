package typings.aframe.anon

import typings.aframe.mod.Coordinate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsCoordinate extends StObject {
  
  def isCoordinate(value: String): Boolean = js.native
  
  def parse(value: String): Coordinate = js.native
  
  def stringify(coord: Coordinate): String = js.native
}
object IsCoordinate {
  
  @scala.inline
  def apply(isCoordinate: String => Boolean, parse: String => Coordinate, stringify: Coordinate => String): IsCoordinate = {
    val __obj = js.Dynamic.literal(isCoordinate = js.Any.fromFunction1(isCoordinate), parse = js.Any.fromFunction1(parse), stringify = js.Any.fromFunction1(stringify))
    __obj.asInstanceOf[IsCoordinate]
  }
  
  @scala.inline
  implicit class IsCoordinateMutableBuilder[Self <: IsCoordinate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsCoordinate(value: String => Boolean): Self = StObject.set(x, "isCoordinate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParse(value: String => Coordinate): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStringify(value: Coordinate => String): Self = StObject.set(x, "stringify", js.Any.fromFunction1(value))
  }
}
