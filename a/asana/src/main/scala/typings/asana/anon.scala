package typings.asana

import typings.asana.mod.resources.NextPage
import typings.asana.mod.resources.Resource
import typings.asana.mod.resources.VersionInfo
import typings.bluebird.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait ApiKey extends StObject {
    
    var apiKey: String = js.native
  }
  object ApiKey {
    
    @scala.inline
    def apply(apiKey: String): ApiKey = {
      val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApiKey]
    }
    
    @scala.inline
    implicit class ApiKeyMutableBuilder[Self <: ApiKey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AsanaBaseUrl extends StObject {
    
    var _cachedVersionInfo: VersionInfo = js.native
    
    var asanaBaseUrl: String = js.native
    
    var authenticator: ApiKey = js.native
    
    var requestTimeout: Double = js.native
    
    var retryOnRateLimit: Boolean = js.native
  }
  object AsanaBaseUrl {
    
    @scala.inline
    def apply(
      _cachedVersionInfo: VersionInfo,
      asanaBaseUrl: String,
      authenticator: ApiKey,
      requestTimeout: Double,
      retryOnRateLimit: Boolean
    ): AsanaBaseUrl = {
      val __obj = js.Dynamic.literal(_cachedVersionInfo = _cachedVersionInfo.asInstanceOf[js.Any], asanaBaseUrl = asanaBaseUrl.asInstanceOf[js.Any], authenticator = authenticator.asInstanceOf[js.Any], requestTimeout = requestTimeout.asInstanceOf[js.Any], retryOnRateLimit = retryOnRateLimit.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsanaBaseUrl]
    }
    
    @scala.inline
    implicit class AsanaBaseUrlMutableBuilder[Self <: AsanaBaseUrl] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsanaBaseUrl(value: String): Self = StObject.set(x, "asanaBaseUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthenticator(value: ApiKey): Self = StObject.set(x, "authenticator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestTimeout(value: Double): Self = StObject.set(x, "requestTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetryOnRateLimit(value: Boolean): Self = StObject.set(x, "retryOnRateLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_cachedVersionInfo(value: VersionInfo): Self = StObject.set(x, "_cachedVersionInfo", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Authorization extends StObject {
    
    var Authorization: String = js.native
  }
  object Authorization {
    
    @scala.inline
    def apply(Authorization: String): Authorization = {
      val __obj = js.Dynamic.literal(Authorization = Authorization.asInstanceOf[js.Any])
      __obj.asInstanceOf[Authorization]
    }
    
    @scala.inline
    implicit class AuthorizationMutableBuilder[Self <: Authorization] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthorization(value: String): Self = StObject.set(x, "Authorization", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined asana.asana.resources.Projects.CreateParams & {  workspace :string | number} */
  @js.native
  trait CreateParamsworkspacestri extends StObject {
    
    var color: js.UndefOr[String] = js.native
    
    var due_date: js.UndefOr[String] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var notes: js.UndefOr[String] = js.native
    
    var public: js.UndefOr[Boolean] = js.native
    
    var team: js.UndefOr[String | Double] = js.native
    
    var workspace: String | Double = js.native
  }
  object CreateParamsworkspacestri {
    
    @scala.inline
    def apply(workspace: String | Double): CreateParamsworkspacestri = {
      val __obj = js.Dynamic.literal(workspace = workspace.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateParamsworkspacestri]
    }
    
    @scala.inline
    implicit class CreateParamsworkspacestriMutableBuilder[Self <: CreateParamsworkspacestri] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setDue_date(value: String): Self = StObject.set(x, "due_date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDue_dateUndefined: Self = StObject.set(x, "due_date", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
      
      @scala.inline
      def setPublic(value: Boolean): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicUndefined: Self = StObject.set(x, "public", js.undefined)
      
      @scala.inline
      def setTeam(value: String | Double): Self = StObject.set(x, "team", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTeamUndefined: Self = StObject.set(x, "team", js.undefined)
      
      @scala.inline
      def setWorkspace(value: String | Double): Self = StObject.set(x, "workspace", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined asana.asana.resources.Tasks.CreateParams & {  workspace :string} */
  @js.native
  trait CreateParamsworkspacestriCompleted extends StObject {
    
    var completed: js.UndefOr[Boolean] = js.native
    
    var custom_fields: js.UndefOr[js.Object] = js.native
    
    var hearted: js.UndefOr[Boolean] = js.native
    
    var name: String = js.native
    
    var notes: js.UndefOr[String] = js.native
    
    var workspace: String = js.native
  }
  object CreateParamsworkspacestriCompleted {
    
    @scala.inline
    def apply(name: String, workspace: String): CreateParamsworkspacestriCompleted = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], workspace = workspace.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateParamsworkspacestriCompleted]
    }
    
    @scala.inline
    implicit class CreateParamsworkspacestriCompletedMutableBuilder[Self <: CreateParamsworkspacestriCompleted] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompleted(value: Boolean): Self = StObject.set(x, "completed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompletedUndefined: Self = StObject.set(x, "completed", js.undefined)
      
      @scala.inline
      def setCustom_fields(value: js.Object): Self = StObject.set(x, "custom_fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustom_fieldsUndefined: Self = StObject.set(x, "custom_fields", js.undefined)
      
      @scala.inline
      def setHearted(value: Boolean): Self = StObject.set(x, "hearted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeartedUndefined: Self = StObject.set(x, "hearted", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
      
      @scala.inline
      def setWorkspace(value: String): Self = StObject.set(x, "workspace", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Data[T /* <: Resource */] extends StObject {
    
    var data: js.Array[T] = js.native
    
    var next_page: js.UndefOr[NextPage] = js.native
  }
  object Data {
    
    @scala.inline
    def apply[T /* <: Resource */](data: js.Array[T]): Data[T] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data[T]]
    }
    
    @scala.inline
    implicit class DataMutableBuilder[Self <: Data[_], T /* <: Resource */] (val x: Self with Data[T]) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Array[T]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataVarargs(value: T*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setNext_page(value: NextPage): Self = StObject.set(x, "next_page", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNext_pageUndefined: Self = StObject.set(x, "next_page", js.undefined)
    }
  }
  
  @js.native
  trait Gid extends StObject {
    
    var gid: String = js.native
    
    var name: String = js.native
  }
  object Gid {
    
    @scala.inline
    def apply(gid: String, name: String): Gid = {
      val __obj = js.Dynamic.literal(gid = gid.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Gid]
    }
    
    @scala.inline
    implicit class GidMutableBuilder[Self <: Gid] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGid(value: String): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Name extends StObject {
    
    var name: js.UndefOr[String] = js.native
  }
  object Name {
    
    @scala.inline
    def apply(): Name = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit class NameMutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  @js.native
  trait Password extends StObject {
    
    var password: String = js.native
    
    var username: String = js.native
  }
  object Password {
    
    @scala.inline
    def apply(password: String, username: String): Password = {
      val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[Password]
    }
    
    @scala.inline
    implicit class PasswordMutableBuilder[Self <: Password] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined asana.asana.resources.Tags.Type & {  workspace :string} */
  @js.native
  trait Typeworkspacestring extends StObject {
    
    var color: String = js.native
    
    var created_at: String = js.native
    
    /**
      * Dispatches a DELETE request to the API. The expected response is an
      * empty resource.
      * @param  {String}     path    The path of the API
      * @param  {Object}     [dispatchOptions] Options for handling the request and
      *     response. See `Dispatcher.dispatch`.
      * @return {Promise}            The response for the request
      * @param path
      * @param dispatchOptions?
      * @return
      */
    def dispatchDelete(path: String): ^[_] = js.native
    def dispatchDelete(path: String, dispatchOptions: js.Any): ^[_] = js.native
    
    /**
      * Dispatches a GET request to the API, where the expected result is a
      * single resource.
      * @param  {String}     path    The path of the API
      * @param  {Object}     [query] The query params
      * @param  {Object}     [dispatchOptions] Options for handling the request and
      *     response. See `Dispatcher.dispatch`.
      * @return {Promise}            The response for the request
      * @param path
      * @param query?
      * @param dispatchOptions?
      * @return
      */
    def dispatchGet(path: String): ^[_] = js.native
    def dispatchGet(path: String, query: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): ^[_] = js.native
    def dispatchGet(path: String, query: js.Any): ^[_] = js.native
    def dispatchGet(path: String, query: js.Any, dispatchOptions: js.Any): ^[_] = js.native
    
    /**
      * Dispatches a GET request to the API, where the expected result is a
      * collection.
      * @param  {String}     path    The path of the API
      * @param  {Object}     [query] The query params
      * @param  {Object}     [dispatchOptions] Options for handling the request and
      *     response. See `Dispatcher.dispatch`.
      * @return {Promise}            The response for the request
      * @param path
      * @param query?
      * @param dispatchOptions?
      * @return
      */
    def dispatchGetCollection(path: String): ^[_] = js.native
    def dispatchGetCollection(path: String, query: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): ^[_] = js.native
    def dispatchGetCollection(path: String, query: js.Any): ^[_] = js.native
    def dispatchGetCollection(path: String, query: js.Any, dispatchOptions: js.Any): ^[_] = js.native
    
    /**
      * Dispatches a POST request to the API, where the expected response is a
      * single resource.
      * @param  {String}     path    The path of the API
      * @param  {Object}     [query] The query params
      * @param  {Object}     [dispatchOptions] Options for handling the request and
      *     response. See `Dispatcher.dispatch`.
      * @return {Promise}            The response for the request
      * @param path
      * @param query?
      * @param dispatchOptions?
      * @return
      */
    def dispatchPost(path: String): ^[_] = js.native
    def dispatchPost(path: String, query: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): ^[_] = js.native
    def dispatchPost(path: String, query: js.Any): ^[_] = js.native
    def dispatchPost(path: String, query: js.Any, dispatchOptions: js.Any): ^[_] = js.native
    
    /**
      * Dispatches a POST request to the API, where the expected response is a
      * single resource.
      * @param  {String}     path    The path of the API
      * @param  {Object}     [query] The query params
      * @param  {Object}     [dispatchOptions] Options for handling the request and
      *     response. See `Dispatcher.dispatch`.
      * @return {Promise}            The response for the request
      * @param path
      * @param query?
      * @param dispatchOptions?
      * @return
      */
    def dispatchPut(path: String): ^[_] = js.native
    def dispatchPut(path: String, query: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): ^[_] = js.native
    def dispatchPut(path: String, query: js.Any): ^[_] = js.native
    def dispatchPut(path: String, query: js.Any, dispatchOptions: js.Any): ^[_] = js.native
    
    var followers: js.Array[Resource] = js.native
    
    var gid: String = js.native
    
    var id: Double = js.native
    
    var name: String = js.native
    
    var notes: String = js.native
    
    var workspace: Resource with String = js.native
  }
}
