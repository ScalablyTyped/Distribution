package typings.alloy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackboneSingletons extends StObject {
  
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
  implicit class BackboneSingletonsMutableBuilder[Self <: BackboneSingletons] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollections(value: SingletonCollections): Self = StObject.set(x, "Collections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModels(value: SingletonModels): Self = StObject.set(x, "Models", value.asInstanceOf[js.Any])
  }
}
