package typings.antDesignPro.anon

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Key extends StObject {
  
  var key: String
  
  var tab: ReactNode
}
object Key {
  
  @scala.inline
  def apply(key: String): Key = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key]
  }
  
  @scala.inline
  implicit class KeyMutableBuilder[Self <: Key] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTab(value: ReactNode): Self = StObject.set(x, "tab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabUndefined: Self = StObject.set(x, "tab", js.undefined)
  }
}
