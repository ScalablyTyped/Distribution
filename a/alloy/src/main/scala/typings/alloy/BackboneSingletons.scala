package typings.alloy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
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
  var Collections: SingletonCollections = js.native
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
  var Models: SingletonModels = js.native
}

object BackboneSingletons {
  @scala.inline
  def apply(Collections: SingletonCollections, Models: SingletonModels): BackboneSingletons = {
    val __obj = js.Dynamic.literal(Collections = Collections.asInstanceOf[js.Any], Models = Models.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackboneSingletons]
  }
  @scala.inline
  implicit class BackboneSingletonsOps[Self <: BackboneSingletons] (val x: Self) extends AnyVal {
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
    def setCollections(value: SingletonCollections): Self = this.set("Collections", value.asInstanceOf[js.Any])
    @scala.inline
    def setModels(value: SingletonModels): Self = this.set("Models", value.asInstanceOf[js.Any])
  }
  
}

