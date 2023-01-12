package typings.asana.mod.resources

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.asana.mod.Dispatcher
import typings.asana.mod.resources.Users.FindAllParams
import typings.asana.mod.resources.Users.Type
import typings.bluebird.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A _user_ object represents an account in Asana that can be given access to
  * various workspaces, projects, and tasks.
  *
  * Like other objects in the system, users are referred to by numerical IDs.
  * However, the special string identifier `me` can be used anywhere
  * a user ID is accepted, to refer to the current authenticated user.
  * @class
  * @param {Dispatcher} dispatcher The API dispatcher
  */
@js.native
trait Users
  extends StObject
     with TopLevelResource {
  
  /**
    * * Returns the user records for all users in all workspaces and organizations
    * * accessible to the authenticated user. Accepts an optional workspace ID
    * * parameter.
    *   * @param {Object} [params] Parameters for the request
    *   * @param {Number} [params.workspace] The workspace or organization to filter users on.
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The response from the API
    * @param params
    * @param dispatchOptions?
    * @return
    */
  def findAll(params: FindAllParams): ^[SimpleResourceList] = js.native
  def findAll(params: FindAllParams, dispatchOptions: Any): ^[SimpleResourceList] = js.native
  
  /**
    * * Returns the full user record for the single user with the provided ID.
    *   * @param {String|Number} user An identifier for the user. Can be one of an email address,
    *   * the globally unique identifier for the user, or the keyword `me`
    *   * to indicate the current user making the request.
    *   * @param {Object} [params] Parameters for the request
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The requested resource
    * @param user
    * @param params?
    * @param dispatchOptions?
    * @return
    */
  def findById(user: String): ^[Type] = js.native
  def findById(user: String, params: Unit, dispatchOptions: Any): ^[Type] = js.native
  def findById(user: String, params: Params): ^[Type] = js.native
  def findById(user: String, params: Params, dispatchOptions: Any): ^[Type] = js.native
  def findById(user: Double): ^[Type] = js.native
  def findById(user: Double, params: Unit, dispatchOptions: Any): ^[Type] = js.native
  def findById(user: Double, params: Params): ^[Type] = js.native
  def findById(user: Double, params: Params, dispatchOptions: Any): ^[Type] = js.native
  
  def findByWorkspace(workspace: String): ^[ResourceList[Type]] = js.native
  def findByWorkspace(workspace: String, params: Unit, dispatchOptions: Any): ^[ResourceList[Type]] = js.native
  def findByWorkspace(workspace: String, params: Params): ^[ResourceList[Type]] = js.native
  def findByWorkspace(workspace: String, params: Params, dispatchOptions: Any): ^[ResourceList[Type]] = js.native
  /**
    * * Returns the user records for all users in the specified workspace or
    * * organization.
    *   * @param {String|Number} workspace The workspace in which to get users.
    *   * @param {Object} [params] Parameters for the request
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The response from the API
    * @param workspace
    * @param params?
    * @param dispatchOptions?
    * @return
    */
  def findByWorkspace(workspace: Double): ^[ResourceList[Type]] = js.native
  def findByWorkspace(workspace: Double, params: Unit, dispatchOptions: Any): ^[ResourceList[Type]] = js.native
  def findByWorkspace(workspace: Double, params: Params): ^[ResourceList[Type]] = js.native
  def findByWorkspace(workspace: Double, params: Params, dispatchOptions: Any): ^[ResourceList[Type]] = js.native
  
  /**
    * * Returns the full user record for the currently authenticated user.
    *   * @param {Object} [params] Parameters for the request
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The requested resource
    * @param params?
    * @param dispatchOptions?
    * @return
    */
  def me(): ^[Type] = js.native
  def me(params: Unit, dispatchOptions: Any): ^[Type] = js.native
  def me(params: Params): ^[Type] = js.native
  def me(params: Params, dispatchOptions: Any): ^[Type] = js.native
}
object Users extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("asana", "resources.Users")
  @js.native
  open class ^ protected ()
    extends StObject
       with Users {
    /**
      * @param dispatcher
      */
    def this(dispatcher: Dispatcher) = this()
  }
  
  @JSImport("asana", "resources.Users")
  @js.native
  val ^ : UsersStatic = js.native
  
  trait FindAllParams
    extends StObject
       with PaginationParams {
    
    var workspace: String | Double
  }
  object FindAllParams {
    
    inline def apply(workspace: String | Double): FindAllParams = {
      val __obj = js.Dynamic.literal(workspace = workspace.asInstanceOf[js.Any])
      __obj.asInstanceOf[FindAllParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FindAllParams] (val x: Self) extends AnyVal {
      
      inline def setWorkspace(value: String | Double): Self = StObject.set(x, "workspace", value.asInstanceOf[js.Any])
    }
  }
  
  trait ShortType
    extends StObject
       with Resource {
    
    var email: String
    
    var photo: StringDictionary[String]
  }
  object ShortType {
    
    inline def apply(email: String, gid: String, name: String, photo: StringDictionary[String], resource_type: String): ShortType = {
      val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], gid = gid.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], photo = photo.asInstanceOf[js.Any], resource_type = resource_type.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShortType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ShortType] (val x: Self) extends AnyVal {
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setPhoto(value: StringDictionary[String]): Self = StObject.set(x, "photo", value.asInstanceOf[js.Any])
    }
  }
  
  trait Type
    extends StObject
       with ShortType {
    
    var workspaces: js.Array[Resource]
  }
  object Type {
    
    inline def apply(
      email: String,
      gid: String,
      name: String,
      photo: StringDictionary[String],
      resource_type: String,
      workspaces: js.Array[Resource]
    ): Type = {
      val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], gid = gid.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], photo = photo.asInstanceOf[js.Any], resource_type = resource_type.asInstanceOf[js.Any], workspaces = workspaces.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
      
      inline def setWorkspaces(value: js.Array[Resource]): Self = StObject.set(x, "workspaces", value.asInstanceOf[js.Any])
      
      inline def setWorkspacesVarargs(value: Resource*): Self = StObject.set(x, "workspaces", js.Array(value*))
    }
  }
  
  type _To = UsersStatic
  
  /* This means you don't have to write `^`, but can instead just say `Users.foo` */
  override def _to: UsersStatic = ^
}
