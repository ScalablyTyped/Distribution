package typings.alloy

import org.scalablytyped.runtime.StringDictionary
import typings.backbone.mod.Model
import typings.backbone.mod.ModelSetOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SingletonModels
  extends /* key */ StringDictionary[js.Any] {
  
  /**
    * Creates a singleton instance of a Model based on the given model, or
    * returns an existing instance if one has already been created.
    *
    * @param name The name of the base model for the model.
    */
  def instance(name: String): Model[_, ModelSetOptions, js.Object] = js.native
}
object SingletonModels {
  
  @scala.inline
  def apply(instance: String => Model[_, ModelSetOptions, js.Object]): SingletonModels = {
    val __obj = js.Dynamic.literal(instance = js.Any.fromFunction1(instance))
    __obj.asInstanceOf[SingletonModels]
  }
  
  @scala.inline
  implicit class SingletonModelsOps[Self <: SingletonModels] (val x: Self) extends AnyVal {
    
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
    def setInstance(value: String => Model[_, ModelSetOptions, js.Object]): Self = this.set("instance", js.Any.fromFunction1(value))
  }
}
