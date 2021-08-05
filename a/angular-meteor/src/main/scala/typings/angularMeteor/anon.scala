package typings.angularMeteor

import typings.angularMeteor.mod.meteor.IScope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Bind extends StObject {
    
    /**
      * @param scope - The scope the document will be bound to.
      * @param model - The name of the scope's model variable that the document will be bound to.
      */
    def bind(scope: IScope, model: String): Unit
  }
  object Bind {
    
    inline def apply(bind: (IScope, String) => Unit): Bind = {
      val __obj = js.Dynamic.literal(bind = js.Any.fromFunction2(bind))
      __obj.asInstanceOf[Bind]
    }
    
    extension [Self <: Bind](x: Self) {
      
      inline def setBind(value: (IScope, String) => Unit): Self = StObject.set(x, "bind", js.Any.fromFunction2(value))
    }
  }
  
  trait Email extends StObject {
    
    var email: String
  }
  object Email {
    
    inline def apply(email: String): Email = {
      val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any])
      __obj.asInstanceOf[Email]
    }
    
    extension [Self <: Email](x: Self) {
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    }
  }
  
  trait Height extends StObject {
    
    var height: js.UndefOr[Double] = js.undefined
    
    var quality: js.UndefOr[Double] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object Height {
    
    inline def apply(): Height = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Height]
    }
    
    extension [Self <: Height](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait Id extends StObject {
    
    var id: String
  }
  object Id {
    
    inline def apply(id: String): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    extension [Self <: Id](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  trait Password extends StObject {
    
    var email: js.UndefOr[String] = js.undefined
    
    var password: String
    
    var profile: js.UndefOr[js.Object] = js.undefined
    
    var username: js.UndefOr[String] = js.undefined
  }
  object Password {
    
    inline def apply(password: String): Password = {
      val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any])
      __obj.asInstanceOf[Password]
    }
    
    extension [Self <: Password](x: Self) {
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setProfile(value: js.Object): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
      
      inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    }
  }
  
  trait Username extends StObject {
    
    var username: String
  }
  object Username {
    
    inline def apply(username: String): Username = {
      val __obj = js.Dynamic.literal(username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[Username]
    }
    
    extension [Self <: Username](x: Self) {
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
}
