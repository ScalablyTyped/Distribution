package typings.alloy

import org.scalablytyped.runtime.StringDictionary
import typings.backbone.mod.Model
import typings.backbone.mod.ModelSetOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SingletonModels
  extends /* key */ StringDictionary[js.Any] {
  /**
    * Creates a singleton instance of a Model based on the given model, or
    * returns an existing instance if one has already been created.
    *
    * @param name The name of the base model for the model.
    */
  def instance(name: String): Model[_, ModelSetOptions]
}

object SingletonModels {
  @scala.inline
  def apply(
    instance: String => Model[_, ModelSetOptions],
    StringDictionary: /* name */ StringDictionary[js.Any] = null
  ): SingletonModels = {
    val __obj = js.Dynamic.literal(instance = js.Any.fromFunction1(instance))
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[SingletonModels]
  }
}

