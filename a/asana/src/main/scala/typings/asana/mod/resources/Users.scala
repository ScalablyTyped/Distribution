package typings.asana.mod.resources

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.asana.mod.Dispatcher
import typings.asana.mod.resources.Users.FindAllParams
import typings.asana.mod.resources.Users.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  extends typings.asana.mod.resources.Resource {
  
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
  def findAll(params: FindAllParams): typings.bluebird.mod.^[SimpleResourceList] = js.native
  def findAll(params: FindAllParams, dispatchOptions: js.Any): typings.bluebird.mod.^[SimpleResourceList] = js.native
  
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
  def findById(user: String): typings.bluebird.mod.^[Type] = js.native
  def findById(user: String, params: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typings.bluebird.mod.^[Type] = js.native
  def findById(user: String, params: Params): typings.bluebird.mod.^[Type] = js.native
  def findById(user: String, params: Params, dispatchOptions: js.Any): typings.bluebird.mod.^[Type] = js.native
  def findById(user: Double): typings.bluebird.mod.^[Type] = js.native
  def findById(user: Double, params: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typings.bluebird.mod.^[Type] = js.native
  def findById(user: Double, params: Params): typings.bluebird.mod.^[Type] = js.native
  def findById(user: Double, params: Params, dispatchOptions: js.Any): typings.bluebird.mod.^[Type] = js.native
  
  def findByWorkspace(workspace: String): typings.bluebird.mod.^[ResourceList[Type]] = js.native
  def findByWorkspace(workspace: String, params: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typings.bluebird.mod.^[ResourceList[Type]] = js.native
  def findByWorkspace(workspace: String, params: Params): typings.bluebird.mod.^[ResourceList[Type]] = js.native
  def findByWorkspace(workspace: String, params: Params, dispatchOptions: js.Any): typings.bluebird.mod.^[ResourceList[Type]] = js.native
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
  def findByWorkspace(workspace: Double): typings.bluebird.mod.^[ResourceList[Type]] = js.native
  def findByWorkspace(workspace: Double, params: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typings.bluebird.mod.^[ResourceList[Type]] = js.native
  def findByWorkspace(workspace: Double, params: Params): typings.bluebird.mod.^[ResourceList[Type]] = js.native
  def findByWorkspace(workspace: Double, params: Params, dispatchOptions: js.Any): typings.bluebird.mod.^[ResourceList[Type]] = js.native
  
  /**
    * * Returns the full user record for the currently authenticated user.
    *   * @param {Object} [params] Parameters for the request
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The requested resource
    * @param params?
    * @param dispatchOptions?
    * @return
    */
  def me(): typings.bluebird.mod.^[Type] = js.native
  def me(params: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typings.bluebird.mod.^[Type] = js.native
  def me(params: Params): typings.bluebird.mod.^[Type] = js.native
  def me(params: Params, dispatchOptions: js.Any): typings.bluebird.mod.^[Type] = js.native
}
object Users extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("asana", "resources.Users")
  @js.native
  class ^ protected () extends Users {
    /**
      * @param dispatcher
      */
    def this(dispatcher: Dispatcher) = this()
  }
  
  @JSImport("asana", "resources.Users")
  @js.native
  val ^ : UsersStatic = js.native
  
  @js.native
  trait FindAllParams extends PaginationParams {
    
    var workspace: String | Double = js.native
  }
  object FindAllParams {
    
    @scala.inline
    def apply(workspace: String | Double): FindAllParams = {
      val __obj = js.Dynamic.literal(workspace = workspace.asInstanceOf[js.Any])
      __obj.asInstanceOf[FindAllParams]
    }
    
    @scala.inline
    implicit class FindAllParamsMutableBuilder[Self <: FindAllParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setWorkspace(value: String | Double): Self = StObject.set(x, "workspace", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ShortType
    extends typings.asana.mod.resources.Resource {
    
    var email: String = js.native
    
    var photo: StringDictionary[String] = js.native
  }
  
  @js.native
  trait Type extends ShortType {
    
    var workspaces: js.Array[typings.asana.mod.resources.Resource] = js.native
  }
  
  type _To = UsersStatic
  
  /* This means you don't have to write `^`, but can instead just say `Users.foo` */
  override def _to: UsersStatic = ^
}
