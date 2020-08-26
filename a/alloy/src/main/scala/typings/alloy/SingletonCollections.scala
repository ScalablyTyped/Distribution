package typings.alloy

import org.scalablytyped.runtime.StringDictionary
import typings.backbone.mod.Collection
import typings.backbone.mod.Model
import typings.backbone.mod.ModelSetOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SingletonCollections
  extends /* key */ StringDictionary[js.Any] {
  /**
    * Creates a singleton instance of a Collection based on the given model, or
    * returns an existing instance if one has already been created.
    *
    * @param name The name of the base model for the collection.
    */
  def instance(name: String): Collection[Model[_, ModelSetOptions]] = js.native
}

object SingletonCollections {
  @scala.inline
  def apply(instance: String => Collection[Model[_, ModelSetOptions]]): SingletonCollections = {
    val __obj = js.Dynamic.literal(instance = js.Any.fromFunction1(instance))
    __obj.asInstanceOf[SingletonCollections]
  }
  @scala.inline
  implicit class SingletonCollectionsOps[Self <: SingletonCollections] (val x: Self) extends AnyVal {
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
    def setInstance(value: String => Collection[Model[_, ModelSetOptions]]): Self = this.set("instance", js.Any.fromFunction1(value))
  }
  
}

