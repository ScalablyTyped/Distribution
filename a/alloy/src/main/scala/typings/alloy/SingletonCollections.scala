package typings.alloy

import org.scalablytyped.runtime.StringDictionary
import typings.backbone.mod.Collection
import typings.backbone.mod.Model
import typings.backbone.mod.ModelSetOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SingletonCollections
  extends /* key */ StringDictionary[js.Any] {
  /**
    * Creates a singleton instance of a Collection based on the given model, or
    * returns an existing instance if one has already been created.
    *
    * @param name The name of the base model for the collection.
    */
  def instance(name: String): Collection[Model[_, ModelSetOptions]]
}

object SingletonCollections {
  @scala.inline
  def apply(
    instance: String => Collection[Model[_, ModelSetOptions]],
    StringDictionary: /* name */ StringDictionary[js.Any] = null
  ): SingletonCollections = {
    val __obj = js.Dynamic.literal(instance = js.Any.fromFunction1(instance))
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[SingletonCollections]
  }
}

