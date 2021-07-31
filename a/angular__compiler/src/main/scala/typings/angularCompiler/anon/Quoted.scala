package typings.angularCompiler.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Quoted extends StObject {
  
  var key: String
  
  var quoted: Boolean
}
object Quoted {
  
  @scala.inline
  def apply(key: String, quoted: Boolean): Quoted = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], quoted = quoted.asInstanceOf[js.Any])
    __obj.asInstanceOf[Quoted]
  }
  
  @scala.inline
  implicit class QuotedMutableBuilder[Self <: Quoted] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuoted(value: Boolean): Self = StObject.set(x, "quoted", value.asInstanceOf[js.Any])
  }
}
