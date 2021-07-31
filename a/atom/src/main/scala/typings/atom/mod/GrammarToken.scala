package typings.atom.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GrammarToken extends StObject {
  
  var scopes: js.Array[String]
  
  var value: String
}
object GrammarToken {
  
  @scala.inline
  def apply(scopes: js.Array[String], value: String): GrammarToken = {
    val __obj = js.Dynamic.literal(scopes = scopes.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[GrammarToken]
  }
  
  @scala.inline
  implicit class GrammarTokenMutableBuilder[Self <: GrammarToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScopes(value: js.Array[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopesVarargs(value: String*): Self = StObject.set(x, "scopes", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
