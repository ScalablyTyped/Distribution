package typings.atom.anon

import typings.atom.atomStrings.backward
import typings.atom.atomStrings.closest
import typings.atom.atomStrings.forward
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `26` extends StObject {
  
  var clipDirection: backward | forward | closest
}
object `26` {
  
  @scala.inline
  def apply(clipDirection: backward | forward | closest): `26` = {
    val __obj = js.Dynamic.literal(clipDirection = clipDirection.asInstanceOf[js.Any])
    __obj.asInstanceOf[`26`]
  }
  
  @scala.inline
  implicit class `26MutableBuilder`[Self <: `26`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClipDirection(value: backward | forward | closest): Self = StObject.set(x, "clipDirection", value.asInstanceOf[js.Any])
  }
}
