package typings.atlaskitTokens.anon

import typings.atlaskitTokens.distTypesTypesMod.RawToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Transparent extends StObject {
  
  var transparent: RawToken
}
object Transparent {
  
  inline def apply(transparent: RawToken): Transparent = {
    val __obj = js.Dynamic.literal(transparent = transparent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transparent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Transparent] (val x: Self) extends AnyVal {
    
    inline def setTransparent(value: RawToken): Self = StObject.set(x, "transparent", value.asInstanceOf[js.Any])
  }
}
