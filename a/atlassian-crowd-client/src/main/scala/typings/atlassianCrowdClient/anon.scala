package typings.atlassianCrowdClient

import typings.atlassianCrowdClient.userMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Active extends StObject {
    
    var active: js.UndefOr[Boolean] = js.native
    
    var attributes: js.Any = js.native
    
    var description: js.UndefOr[String] = js.native
    
    var name: String = js.native
  }
  object Active {
    
    @scala.inline
    def apply(attributes: js.Any, name: String): Active = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Active]
    }
    
    @scala.inline
    implicit class ActiveMutableBuilder[Self <: Active] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setAttributes(value: js.Any): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Add extends StObject {
    
    def add(groupname: String, childname: String): js.Promise[Unit] = js.native
    
    def get(groupname: String, childname: String): js.Promise[String] = js.native
    def get(groupname: String, childname: String, nested: Boolean): js.Promise[String] = js.native
    
    def list(groupname: String): js.Promise[js.Array[String]] = js.native
    def list(
      groupname: String,
      nested: js.UndefOr[scala.Nothing],
      startIndex: js.UndefOr[scala.Nothing],
      maxResults: Double
    ): js.Promise[js.Array[String]] = js.native
    def list(groupname: String, nested: js.UndefOr[scala.Nothing], startIndex: Double): js.Promise[js.Array[String]] = js.native
    def list(groupname: String, nested: js.UndefOr[scala.Nothing], startIndex: Double, maxResults: Double): js.Promise[js.Array[String]] = js.native
    def list(groupname: String, nested: Boolean): js.Promise[js.Array[String]] = js.native
    def list(groupname: String, nested: Boolean, startIndex: js.UndefOr[scala.Nothing], maxResults: Double): js.Promise[js.Array[String]] = js.native
    def list(groupname: String, nested: Boolean, startIndex: Double): js.Promise[js.Array[String]] = js.native
    def list(groupname: String, nested: Boolean, startIndex: Double, maxResults: Double): js.Promise[js.Array[String]] = js.native
    
    def remove(groupname: String, childname: String): js.Promise[Unit] = js.native
  }
  
  @js.native
  trait AddGet extends StObject {
    
    def add(groupname: String, parentname: String): js.Promise[Unit] = js.native
    
    def get(groupname: String, parentname: String): js.Promise[String] = js.native
    def get(groupname: String, parentname: String, nested: Boolean): js.Promise[String] = js.native
    
    def list(groupname: String): js.Promise[js.Array[String]] = js.native
    def list(
      groupname: String,
      nested: js.UndefOr[scala.Nothing],
      startIndex: js.UndefOr[scala.Nothing],
      maxResults: Double
    ): js.Promise[js.Array[String]] = js.native
    def list(groupname: String, nested: js.UndefOr[scala.Nothing], startIndex: Double): js.Promise[js.Array[String]] = js.native
    def list(groupname: String, nested: js.UndefOr[scala.Nothing], startIndex: Double, maxResults: Double): js.Promise[js.Array[String]] = js.native
    def list(groupname: String, nested: Boolean): js.Promise[js.Array[String]] = js.native
    def list(groupname: String, nested: Boolean, startIndex: js.UndefOr[scala.Nothing], maxResults: Double): js.Promise[js.Array[String]] = js.native
    def list(groupname: String, nested: Boolean, startIndex: Double): js.Promise[js.Array[String]] = js.native
    def list(groupname: String, nested: Boolean, startIndex: Double, maxResults: Double): js.Promise[js.Array[String]] = js.native
  }
  
  @js.native
  trait Attributes extends StObject {
    
    var attributes: List = js.native
    
    def create(user: ^): js.Promise[^] = js.native
    
    def get(username: String): js.Promise[^] = js.native
    def get(username: String, withAttributes: Boolean): js.Promise[^] = js.native
    
    var groups: Add = js.native
    
    def remove(username: String): js.Promise[Unit] = js.native
    
    def rename(oldname: String, newname: String): js.Promise[Unit] = js.native
    
    def update(username: String, user: ^): js.Promise[^] = js.native
  }
  
  @js.native
  trait Authenticate extends StObject {
    
    def authenticate(username: String, password: String): js.Promise[^] = js.native
  }
  object Authenticate {
    
    @scala.inline
    def apply(authenticate: (String, String) => js.Promise[^]): Authenticate = {
      val __obj = js.Dynamic.literal(authenticate = js.Any.fromFunction2(authenticate))
      __obj.asInstanceOf[Authenticate]
    }
    
    @scala.inline
    implicit class AuthenticateMutableBuilder[Self <: Authenticate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthenticate(value: (String, String) => js.Promise[^]): Self = StObject.set(x, "authenticate", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait Children extends StObject {
    
    var attributes: Remove = js.native
    
    var children: Add = js.native
    
    def create(group: typings.atlassianCrowdClient.groupMod.^): js.Promise[typings.atlassianCrowdClient.groupMod.^] = js.native
    
    def get(groupname: String): js.Promise[typings.atlassianCrowdClient.groupMod.^] = js.native
    def get(groupname: String, withAttributes: Boolean): js.Promise[typings.atlassianCrowdClient.groupMod.^] = js.native
    
    def membership(): js.Promise[String] = js.native
    
    var parents: AddGet = js.native
    
    def remove(groupname: String): js.Promise[Unit] = js.native
    
    def update(groupname: String, group: typings.atlassianCrowdClient.groupMod.^): js.Promise[typings.atlassianCrowdClient.groupMod.^] = js.native
    
    var users: Get = js.native
  }
  
  @js.native
  trait Cookie extends StObject {
    
    def cookie(): js.Promise[_] = js.native
  }
  object Cookie {
    
    @scala.inline
    def apply(cookie: () => js.Promise[_]): Cookie = {
      val __obj = js.Dynamic.literal(cookie = js.Any.fromFunction0(cookie))
      __obj.asInstanceOf[Cookie]
    }
    
    @scala.inline
    implicit class CookieMutableBuilder[Self <: Cookie] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCookie(value: () => js.Promise[_]): Self = StObject.set(x, "cookie", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait Create extends StObject {
    
    def create(username: String, password: String): js.Promise[typings.atlassianCrowdClient.sessionMod.^] = js.native
    def create(username: String, password: String, validationFactors: js.UndefOr[scala.Nothing], duration: Double): js.Promise[typings.atlassianCrowdClient.sessionMod.^] = js.native
    def create(
      username: String,
      password: String,
      validationFactors: typings.atlassianCrowdClient.validationFactorsMod.^
    ): js.Promise[typings.atlassianCrowdClient.sessionMod.^] = js.native
    def create(
      username: String,
      password: String,
      validationFactors: typings.atlassianCrowdClient.validationFactorsMod.^,
      duration: Double
    ): js.Promise[typings.atlassianCrowdClient.sessionMod.^] = js.native
    
    def createUnvalidated(username: String): js.Promise[typings.atlassianCrowdClient.sessionMod.^] = js.native
    def createUnvalidated(username: String, validationFactors: js.UndefOr[scala.Nothing], duration: Double): js.Promise[typings.atlassianCrowdClient.sessionMod.^] = js.native
    def createUnvalidated(username: String, validationFactors: typings.atlassianCrowdClient.validationFactorsMod.^): js.Promise[typings.atlassianCrowdClient.sessionMod.^] = js.native
    def createUnvalidated(
      username: String,
      validationFactors: typings.atlassianCrowdClient.validationFactorsMod.^,
      duration: Double
    ): js.Promise[typings.atlassianCrowdClient.sessionMod.^] = js.native
    
    def getUser(token: String): js.Promise[^] = js.native
    
    def remove(token: String): js.Promise[Unit] = js.native
    
    def removeAll(username: String): js.Promise[Unit] = js.native
    def removeAll(username: String, exclude: String): js.Promise[Unit] = js.native
    
    def validate(token: String): js.Promise[typings.atlassianCrowdClient.sessionMod.^] = js.native
    def validate(token: String, validationFactors: typings.atlassianCrowdClient.validationFactorsMod.^): js.Promise[typings.atlassianCrowdClient.sessionMod.^] = js.native
  }
  
  @js.native
  trait Get extends StObject {
    
    def add(groupname: String, username: String): js.Promise[Unit] = js.native
    
    def get(groupname: String, username: String): js.Promise[String] = js.native
    def get(groupname: String, username: String, nested: Boolean): js.Promise[String] = js.native
    
    def list(groupname: String): js.Promise[js.Array[String | ^]] = js.native
    def list(
      groupname: String,
      nested: js.UndefOr[scala.Nothing],
      startIndex: js.UndefOr[scala.Nothing],
      maxResults: js.UndefOr[scala.Nothing],
      expand: Boolean
    ): js.Promise[js.Array[String | ^]] = js.native
    def list(
      groupname: String,
      nested: js.UndefOr[scala.Nothing],
      startIndex: js.UndefOr[scala.Nothing],
      maxResults: Double
    ): js.Promise[js.Array[String | ^]] = js.native
    def list(
      groupname: String,
      nested: js.UndefOr[scala.Nothing],
      startIndex: js.UndefOr[scala.Nothing],
      maxResults: Double,
      expand: Boolean
    ): js.Promise[js.Array[String | ^]] = js.native
    def list(groupname: String, nested: js.UndefOr[scala.Nothing], startIndex: Double): js.Promise[js.Array[String | ^]] = js.native
    def list(
      groupname: String,
      nested: js.UndefOr[scala.Nothing],
      startIndex: Double,
      maxResults: js.UndefOr[scala.Nothing],
      expand: Boolean
    ): js.Promise[js.Array[String | ^]] = js.native
    def list(groupname: String, nested: js.UndefOr[scala.Nothing], startIndex: Double, maxResults: Double): js.Promise[js.Array[String | ^]] = js.native
    def list(
      groupname: String,
      nested: js.UndefOr[scala.Nothing],
      startIndex: Double,
      maxResults: Double,
      expand: Boolean
    ): js.Promise[js.Array[String | ^]] = js.native
    def list(groupname: String, nested: Boolean): js.Promise[js.Array[String | ^]] = js.native
    def list(
      groupname: String,
      nested: Boolean,
      startIndex: js.UndefOr[scala.Nothing],
      maxResults: js.UndefOr[scala.Nothing],
      expand: Boolean
    ): js.Promise[js.Array[String | ^]] = js.native
    def list(groupname: String, nested: Boolean, startIndex: js.UndefOr[scala.Nothing], maxResults: Double): js.Promise[js.Array[String | ^]] = js.native
    def list(
      groupname: String,
      nested: Boolean,
      startIndex: js.UndefOr[scala.Nothing],
      maxResults: Double,
      expand: Boolean
    ): js.Promise[js.Array[String | ^]] = js.native
    def list(groupname: String, nested: Boolean, startIndex: Double): js.Promise[js.Array[String | ^]] = js.native
    def list(
      groupname: String,
      nested: Boolean,
      startIndex: Double,
      maxResults: js.UndefOr[scala.Nothing],
      expand: Boolean
    ): js.Promise[js.Array[String | ^]] = js.native
    def list(groupname: String, nested: Boolean, startIndex: Double, maxResults: Double): js.Promise[js.Array[String | ^]] = js.native
    def list(groupname: String, nested: Boolean, startIndex: Double, maxResults: Double, expand: Boolean): js.Promise[js.Array[String | ^]] = js.native
    
    def remove(groupname: String, username: String): js.Promise[Unit] = js.native
  }
  
  @js.native
  trait Group extends StObject {
    
    def group(restriction: String): js.Promise[js.Array[String | typings.atlassianCrowdClient.groupMod.^]] = js.native
    def group(
      restriction: String,
      expand: js.UndefOr[scala.Nothing],
      startIndex: js.UndefOr[scala.Nothing],
      maxResults: Double
    ): js.Promise[js.Array[String | typings.atlassianCrowdClient.groupMod.^]] = js.native
    def group(restriction: String, expand: js.UndefOr[scala.Nothing], startIndex: Double): js.Promise[js.Array[String | typings.atlassianCrowdClient.groupMod.^]] = js.native
    def group(restriction: String, expand: js.UndefOr[scala.Nothing], startIndex: Double, maxResults: Double): js.Promise[js.Array[String | typings.atlassianCrowdClient.groupMod.^]] = js.native
    def group(restriction: String, expand: Boolean): js.Promise[js.Array[String | typings.atlassianCrowdClient.groupMod.^]] = js.native
    def group(restriction: String, expand: Boolean, startIndex: js.UndefOr[scala.Nothing], maxResults: Double): js.Promise[js.Array[String | typings.atlassianCrowdClient.groupMod.^]] = js.native
    def group(restriction: String, expand: Boolean, startIndex: Double): js.Promise[js.Array[String | typings.atlassianCrowdClient.groupMod.^]] = js.native
    def group(restriction: String, expand: Boolean, startIndex: Double, maxResults: Double): js.Promise[js.Array[String | typings.atlassianCrowdClient.groupMod.^]] = js.native
    
    def user(restriction: String): js.Promise[js.Array[String | ^]] = js.native
    def user(
      restriction: String,
      expand: js.UndefOr[scala.Nothing],
      startIndex: js.UndefOr[scala.Nothing],
      maxResults: Double
    ): js.Promise[js.Array[String | ^]] = js.native
    def user(restriction: String, expand: js.UndefOr[scala.Nothing], startIndex: Double): js.Promise[js.Array[String | ^]] = js.native
    def user(restriction: String, expand: js.UndefOr[scala.Nothing], startIndex: Double, maxResults: Double): js.Promise[js.Array[String | ^]] = js.native
    def user(restriction: String, expand: Boolean): js.Promise[js.Array[String | ^]] = js.native
    def user(restriction: String, expand: Boolean, startIndex: js.UndefOr[scala.Nothing], maxResults: Double): js.Promise[js.Array[String | ^]] = js.native
    def user(restriction: String, expand: Boolean, startIndex: Double): js.Promise[js.Array[String | ^]] = js.native
    def user(restriction: String, expand: Boolean, startIndex: Double, maxResults: Double): js.Promise[js.Array[String | ^]] = js.native
  }
  
  @js.native
  trait List extends StObject {
    
    def list(username: String): js.Promise[typings.atlassianCrowdClient.attributesMod.^] = js.native
    
    var password: Reset = js.native
    
    def remove(username: String, attributename: String): js.Promise[Unit] = js.native
    
    def set(username: String, attributes: typings.atlassianCrowdClient.attributesMod.^): js.Promise[typings.atlassianCrowdClient.attributesMod.^] = js.native
    
    var username: Request = js.native
  }
  object List {
    
    @scala.inline
    def apply(
      list: String => js.Promise[typings.atlassianCrowdClient.attributesMod.^],
      password: Reset,
      remove: (String, String) => js.Promise[Unit],
      set: (String, typings.atlassianCrowdClient.attributesMod.^) => js.Promise[typings.atlassianCrowdClient.attributesMod.^],
      username: Request
    ): List = {
      val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list), password = password.asInstanceOf[js.Any], remove = js.Any.fromFunction2(remove), set = js.Any.fromFunction2(set), username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[List]
    }
    
    @scala.inline
    implicit class ListMutableBuilder[Self <: List] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setList(value: String => js.Promise[typings.atlassianCrowdClient.attributesMod.^]): Self = StObject.set(x, "list", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPassword(value: Reset): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemove(value: (String, String) => js.Promise[Unit]): Self = StObject.set(x, "remove", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSet(
        value: (String, typings.atlassianCrowdClient.attributesMod.^) => js.Promise[typings.atlassianCrowdClient.attributesMod.^]
      ): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
      
      @scala.inline
      def setUsername(value: Request): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Name extends StObject {
    
    var name: String = js.native
  }
  object Name {
    
    @scala.inline
    def apply(name: String): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit class NameMutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Password extends StObject {
    
    val name: String = js.native
    
    val password: String = js.native
  }
  object Password {
    
    @scala.inline
    def apply(name: String, password: String): Password = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any])
      __obj.asInstanceOf[Password]
    }
    
    @scala.inline
    implicit class PasswordMutableBuilder[Self <: Password] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Remove extends StObject {
    
    def list(groupname: String): js.Promise[typings.atlassianCrowdClient.attributesMod.^] = js.native
    
    def remove(groupname: String, attributename: String): js.Promise[Unit] = js.native
    
    def set(groupname: String, attributes: typings.atlassianCrowdClient.attributesMod.^): js.Promise[typings.atlassianCrowdClient.attributesMod.^] = js.native
  }
  object Remove {
    
    @scala.inline
    def apply(
      list: String => js.Promise[typings.atlassianCrowdClient.attributesMod.^],
      remove: (String, String) => js.Promise[Unit],
      set: (String, typings.atlassianCrowdClient.attributesMod.^) => js.Promise[typings.atlassianCrowdClient.attributesMod.^]
    ): Remove = {
      val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list), remove = js.Any.fromFunction2(remove), set = js.Any.fromFunction2(set))
      __obj.asInstanceOf[Remove]
    }
    
    @scala.inline
    implicit class RemoveMutableBuilder[Self <: Remove] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setList(value: String => js.Promise[typings.atlassianCrowdClient.attributesMod.^]): Self = StObject.set(x, "list", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemove(value: (String, String) => js.Promise[Unit]): Self = StObject.set(x, "remove", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSet(
        value: (String, typings.atlassianCrowdClient.attributesMod.^) => js.Promise[typings.atlassianCrowdClient.attributesMod.^]
      ): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait Request extends StObject {
    
    def request(email: String): js.Promise[Unit] = js.native
  }
  object Request {
    
    @scala.inline
    def apply(request: String => js.Promise[Unit]): Request = {
      val __obj = js.Dynamic.literal(request = js.Any.fromFunction1(request))
      __obj.asInstanceOf[Request]
    }
    
    @scala.inline
    implicit class RequestMutableBuilder[Self <: Request] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRequest(value: String => js.Promise[Unit]): Self = StObject.set(x, "request", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Reset extends StObject {
    
    def reset(username: String): js.Promise[Unit] = js.native
    
    def set(username: String, password: String): js.Promise[Unit] = js.native
  }
  object Reset {
    
    @scala.inline
    def apply(reset: String => js.Promise[Unit], set: (String, String) => js.Promise[Unit]): Reset = {
      val __obj = js.Dynamic.literal(reset = js.Any.fromFunction1(reset), set = js.Any.fromFunction2(set))
      __obj.asInstanceOf[Reset]
    }
    
    @scala.inline
    implicit class ResetMutableBuilder[Self <: Reset] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReset(value: String => js.Promise[Unit]): Self = StObject.set(x, "reset", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSet(value: (String, String) => js.Promise[Unit]): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait Value extends StObject {
    
    var value: String = js.native
  }
  object Value {
    
    @scala.inline
    def apply(value: String): Value = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value]
    }
    
    @scala.inline
    implicit class ValueMutableBuilder[Self <: Value] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
