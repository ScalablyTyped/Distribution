package typings.alloy

import org.scalablytyped.runtime.StringDictionary
import typings.backbone.mod.Collection
import typings.backbone.mod.Model
import typings.backbone.mod.ModelSetOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SingletonCollections
  extends /* key */ StringDictionary[js.Any] {
  
  /**
    * Creates a singleton instance of a Collection based on the given model, or
    * returns an existing instance if one has already been created.
    *
    * @param name The name of the base model for the collection.
    */
  def instance(name: String): Collection[Model[_, ModelSetOptions, js.Object]] = js.native
}
object SingletonCollections {
  
  @scala.inline
  def apply(instance: String => Collection[Model[_, ModelSetOptions, js.Object]]): SingletonCollections = {
    val __obj = js.Dynamic.literal(instance = js.Any.fromFunction1(instance))
    __obj.asInstanceOf[SingletonCollections]
  }
  
  @scala.inline
  implicit class SingletonCollectionsMutableBuilder[Self <: SingletonCollections] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstance(value: String => Collection[Model[_, ModelSetOptions, js.Object]]): Self = StObject.set(x, "instance", js.Any.fromFunction1(value))
  }
}
