package typings.angularCore.anon

import typings.angularCore.angularCoreStrings.any
import typings.angularCore.angularCoreStrings.platform
import typings.angularCore.angularCoreStrings.root
import typings.angularCore.mod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Factory[T] extends js.Object {
  
  def factory(): T = js.native
  
  var providedIn: js.UndefOr[Type[_] | root | platform | any | Null] = js.native
  
  var token: js.Any = js.native
}
object Factory {
  
  @scala.inline
  def apply[T](factory: () => T, token: js.Any): Factory[T] = {
    val __obj = js.Dynamic.literal(factory = js.Any.fromFunction0(factory), token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[Factory[T]]
  }
  
  @scala.inline
  implicit class FactoryOps[Self <: Factory[_], T] (val x: Self with Factory[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFactory(value: () => T): Self = this.set("factory", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToken(value: js.Any): Self = this.set("token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvidedIn(value: Type[_] | root | platform | any): Self = this.set("providedIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProvidedIn: Self = this.set("providedIn", js.undefined)
    
    @scala.inline
    def setProvidedInNull: Self = this.set("providedIn", null)
  }
}
