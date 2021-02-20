package typings.angularCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Character extends StObject {
  
  var character: Double = js.native
  
  var line: Double = js.native
}
object Character {
  
  @scala.inline
  def apply(character: Double, line: Double): Character = {
    val __obj = js.Dynamic.literal(character = character.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
    __obj.asInstanceOf[Character]
  }
  
  @scala.inline
  implicit class CharacterMutableBuilder[Self <: Character] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCharacter(value: Double): Self = StObject.set(x, "character", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
  }
}
