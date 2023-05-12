package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FamilySans[BaseToken] extends StObject {
  
  var family: Sans[BaseToken]
}
object FamilySans {
  
  inline def apply[BaseToken](family: Sans[BaseToken]): FamilySans[BaseToken] = {
    val __obj = js.Dynamic.literal(family = family.asInstanceOf[js.Any])
    __obj.asInstanceOf[FamilySans[BaseToken]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FamilySans[?], BaseToken] (val x: Self & FamilySans[BaseToken]) extends AnyVal {
    
    inline def setFamily(value: Sans[BaseToken]): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
  }
}
