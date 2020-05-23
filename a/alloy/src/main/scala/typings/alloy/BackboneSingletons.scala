package typings.alloy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackboneSingletons extends js.Object {
  /**
    * An object for storing globally accessible Alloy collections. Singleton
    * collections created via markup will be stored on this object.
    *
    * ```xml
    * <Collection src="myModel"/>
    * ```
    *
    * The above markup would effectively generate the following code:
    *
    * ```js
    * Alloy.Collections.myModel = Alloy.createCollection('MyModel');
    * ```
    *
    * Alloy.Collections.myModel would then be accessible in any controller in your app.v
    */
  var Collections: SingletonCollections
  /**
    * An object for storing globally accessible Alloy models.
    *
    * Singleton models created via markup will be stored on this object.
    *
    * ```xml
    * <Model src="myModel"/>
    * ```
    *
    * The above markup would effectively generate the following code:
    *
    * ```js
    * Alloy.Models.myModel = Alloy.createModel('MyModel');
    * ```
    *
    * `Alloy.Models.myModel` would then be accessible in any controller in your app.
    */
  var Models: SingletonModels
}

object BackboneSingletons {
  @scala.inline
  def apply(Collections: SingletonCollections, Models: SingletonModels): BackboneSingletons = {
    val __obj = js.Dynamic.literal(Collections = Collections.asInstanceOf[js.Any], Models = Models.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackboneSingletons]
  }
}

