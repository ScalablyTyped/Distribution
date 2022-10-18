package typings.atom.anon

import typings.atom.atomStrings.backward
import typings.atom.atomStrings.closest
import typings.atom.atomStrings.forward
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  var clipDirection: backward | forward | closest
}
object `0` {
  
  inline def apply(clipDirection: backward | forward | closest): `0` = {
    val __obj = js.Dynamic.literal(clipDirection = clipDirection.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
  
  extension [Self <: `0`](x: Self) {
    
    inline def setClipDirection(value: backward | forward | closest): Self = StObject.set(x, "clipDirection", value.asInstanceOf[js.Any])
  }
}
