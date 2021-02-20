package typings.asana.mod.resources

import org.scalablytyped.runtime.Shortcut
import typings.asana.anon.Gid
import typings.asana.mod.Dispatcher
import typings.asana.mod.resources.Events.Type
import typings.asana.mod.resources.Users.ShortType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An _event_ is an object representing a change to a resource that was observed
  * by an event subscription.
  *
  * In general, requesting events on a resource is faster and subject to higher
  * rate limits than requesting the resource itself. Additionally, change events
  * bubble up - listening to events on a project would include when stories are
  * added to tasks in the project, even on subtasks.
  *
  * Establish an initial sync token by making a request with no sync token.
  * The response will be a `412` error - the same as if the sync token had
  * expired.
  *
  * Subsequent requests should always provide the sync token from the immediately
  * preceding call.
  *
  * Sync tokens may not be valid if you attempt to go 'backward' in the history
  * by requesting previous tokens, though re-requesting the current sync token
  * is generally safe, and will always return the same results.
  *
  * When you receive a `412 Precondition Failed` error, it means that the
  * sync token is either invalid or expired. If you are attempting to keep a set
  * of data in sync, this signals you may need to re-crawl the data.
  *
  * Sync tokens always expire after 24 hours, but may expire sooner, depending on
  * load on the service.
  * @class
  * @param {Dispatcher} dispatcher The API dispatcher
  */
@js.native
trait Events
  extends typings.asana.mod.resources.Resource {
  
  /**
    * Dispatches a GET request to /events of the API to get a set of recent
    * changes to a resource.
    * @param  {String|Number} resourceId  The id of the resource to get events for
    * @param  {String} [syncToken] Token from a previous sync, if any
    * @return {Promise}            The result of the API call:
    *     {String} sync     The new sync token to use for the next request
    *     {Object[]} [data] The changes on the resource since the last sync,
    *                       may not exist if sync token is new.
    */
  def get(resourceId: String): typings.bluebird.mod.^[Type] = js.native
  def get(resourceId: String, syncToken: js.UndefOr[scala.Nothing], params: Params): typings.bluebird.mod.^[Type] = js.native
  def get(resourceId: String, syncToken: String): typings.bluebird.mod.^[Type] = js.native
  def get(resourceId: String, syncToken: String, params: Params): typings.bluebird.mod.^[Type] = js.native
  def get(resourceId: Double): typings.bluebird.mod.^[Type] = js.native
  def get(resourceId: Double, syncToken: js.UndefOr[scala.Nothing], params: Params): typings.bluebird.mod.^[Type] = js.native
  def get(resourceId: Double, syncToken: String): typings.bluebird.mod.^[Type] = js.native
  def get(resourceId: Double, syncToken: String, params: Params): typings.bluebird.mod.^[Type] = js.native
}
object Events extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("asana", "resources.Events")
  @js.native
  class ^ protected () extends Events {
    /**
      * @param dispatcher
      * @return
      */
    def this(dispatcher: Dispatcher) = this()
  }
  
  @JSImport("asana", "resources.Events")
  @js.native
  val ^ : EventsStatic = js.native
  
  @js.native
  trait EventDataEntity extends StObject {
    
    var action: String = js.native
    
    var created_at: String = js.native
    
    var parent: EventTask | EventProject | EventSection | Null = js.native
    
    var resource: EventTask | EventProject | EventSection | EventStory = js.native
    
    var `type`: String = js.native
    
    var user: ShortType | Null = js.native
  }
  object EventDataEntity {
    
    @scala.inline
    def apply(
      action: String,
      created_at: String,
      resource: EventTask | EventProject | EventSection | EventStory,
      `type`: String
    ): EventDataEntity = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventDataEntity]
    }
    
    @scala.inline
    implicit class EventDataEntityMutableBuilder[Self <: EventDataEntity] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParent(value: EventTask | EventProject | EventSection): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentNull: Self = StObject.set(x, "parent", null)
      
      @scala.inline
      def setResource(value: EventTask | EventProject | EventSection | EventStory): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser(value: ShortType): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserNull: Self = StObject.set(x, "user", null)
    }
  }
  
  @js.native
  trait EventError extends StObject {
    
    var message: String = js.native
  }
  object EventError {
    
    @scala.inline
    def apply(message: String): EventError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventError]
    }
    
    @scala.inline
    implicit class EventErrorMutableBuilder[Self <: EventError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined asana.asana.resources.Events.EventResource & std.Partial<asana.asana.resources.Tasks.Type> */
  @js.native
  trait EventProject extends StObject {
    
    var assignee: js.UndefOr[Assignee | Null] = js.native
    
    var assignee_status: js.UndefOr[String] = js.native
    
    var completed: js.UndefOr[Boolean] = js.native
    
    var completed_at: js.UndefOr[String | Null] = js.native
    
    var created_at: js.UndefOr[String] = js.native
    
    var custom_fields: js.UndefOr[js.Array[CustomField]] = js.native
    
    var dispatchDelete: js.UndefOr[
        js.Function2[
          /* path */ String, 
          /* dispatchOptions */ js.UndefOr[js.Any], 
          typings.bluebird.mod.^[_]
        ]
      ] = js.native
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
    def dispatchDelete(path: String): typings.bluebird.mod.^[_] = js.native
    def dispatchDelete(path: String, dispatchOptions: js.Any): typings.bluebird.mod.^[_] = js.native
    
    var dispatchGet: js.UndefOr[
        js.Function3[
          /* path */ String, 
          /* query */ js.UndefOr[js.Any], 
          /* dispatchOptions */ js.UndefOr[js.Any], 
          typings.bluebird.mod.^[_]
        ]
      ] = js.native
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
    def dispatchGet(path: String): typings.bluebird.mod.^[_] = js.native
    def dispatchGet(path: String, query: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typings.bluebird.mod.^[_] = js.native
    def dispatchGet(path: String, query: js.Any): typings.bluebird.mod.^[_] = js.native
    def dispatchGet(path: String, query: js.Any, dispatchOptions: js.Any): typings.bluebird.mod.^[_] = js.native
    
    var dispatchGetCollection: js.UndefOr[
        js.Function3[
          /* path */ String, 
          /* query */ js.UndefOr[js.Any], 
          /* dispatchOptions */ js.UndefOr[js.Any], 
          typings.bluebird.mod.^[_]
        ]
      ] = js.native
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
    def dispatchGetCollection(path: String): typings.bluebird.mod.^[_] = js.native
    def dispatchGetCollection(path: String, query: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typings.bluebird.mod.^[_] = js.native
    def dispatchGetCollection(path: String, query: js.Any): typings.bluebird.mod.^[_] = js.native
    def dispatchGetCollection(path: String, query: js.Any, dispatchOptions: js.Any): typings.bluebird.mod.^[_] = js.native
    
    var dispatchPost: js.UndefOr[
        js.Function3[
          /* path */ String, 
          /* query */ js.UndefOr[js.Any], 
          /* dispatchOptions */ js.UndefOr[js.Any], 
          typings.bluebird.mod.^[_]
        ]
      ] = js.native
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
    def dispatchPost(path: String): typings.bluebird.mod.^[_] = js.native
    def dispatchPost(path: String, query: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typings.bluebird.mod.^[_] = js.native
    def dispatchPost(path: String, query: js.Any): typings.bluebird.mod.^[_] = js.native
    def dispatchPost(path: String, query: js.Any, dispatchOptions: js.Any): typings.bluebird.mod.^[_] = js.native
    
    var dispatchPut: js.UndefOr[
        js.Function3[
          /* path */ String, 
          /* query */ js.UndefOr[js.Any], 
          /* dispatchOptions */ js.UndefOr[js.Any], 
          typings.bluebird.mod.^[_]
        ]
      ] = js.native
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
    def dispatchPut(path: String): typings.bluebird.mod.^[_] = js.native
    def dispatchPut(path: String, query: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typings.bluebird.mod.^[_] = js.native
    def dispatchPut(path: String, query: js.Any): typings.bluebird.mod.^[_] = js.native
    def dispatchPut(path: String, query: js.Any, dispatchOptions: js.Any): typings.bluebird.mod.^[_] = js.native
    
    var due_at: js.UndefOr[String] = js.native
    
    var due_on: js.UndefOr[String] = js.native
    
    var followers: js.UndefOr[js.Array[typings.asana.mod.resources.Resource]] = js.native
    
    var gid: String with js.UndefOr[String] = js.native
    
    var hearted: js.UndefOr[Boolean] = js.native
    
    var id: Double with js.UndefOr[Double] = js.native
    
    var memberships: js.UndefOr[js.Array[Membership]] = js.native
    
    var modified_at: js.UndefOr[String] = js.native
    
    var name: String with js.UndefOr[String] = js.native
    
    var notes: js.UndefOr[String] = js.native
    
    var num_hearts: js.UndefOr[Double] = js.native
    
    var parent: js.UndefOr[typings.asana.mod.resources.Resource] = js.native
    
    var projects: js.UndefOr[js.Array[typings.asana.mod.resources.Resource]] = js.native
    
    var resource_subtype: String = js.native
    
    var resource_type: String = js.native
    
    var tags: js.UndefOr[js.Array[typings.asana.mod.resources.Resource]] = js.native
    
    var workspace: js.UndefOr[typings.asana.mod.resources.Resource] = js.native
  }
  
  @js.native
  trait EventResource
    extends typings.asana.mod.resources.Resource {
    
    var resource_subtype: String = js.native
    
    var resource_type: String = js.native
  }
  
  /* Inlined asana.asana.resources.Events.EventSectionResource & std.Partial<asana.asana.resources.Sections.Type> */
  @js.native
  trait EventSection extends StObject {
    
    var created_at: js.UndefOr[String] = js.native
    
    var dispatchDelete: js.UndefOr[
        js.Function2[
          /* path */ String, 
          /* dispatchOptions */ js.UndefOr[js.Any], 
          typings.bluebird.mod.^[_]
        ]
      ] = js.native
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
    def dispatchDelete(path: String): typings.bluebird.mod.^[_] = js.native
    def dispatchDelete(path: String, dispatchOptions: js.Any): typings.bluebird.mod.^[_] = js.native
    
    var dispatchGet: js.UndefOr[
        js.Function3[
          /* path */ String, 
          /* query */ js.UndefOr[js.Any], 
          /* dispatchOptions */ js.UndefOr[js.Any], 
          typings.bluebird.mod.^[_]
        ]
      ] = js.native
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
    def dispatchGet(path: String): typings.bluebird.mod.^[_] = js.native
    def dispatchGet(path: String, query: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typings.bluebird.mod.^[_] = js.native
    def dispatchGet(path: String, query: js.Any): typings.bluebird.mod.^[_] = js.native
    def dispatchGet(path: String, query: js.Any, dispatchOptions: js.Any): typings.bluebird.mod.^[_] = js.native
    
    var dispatchGetCollection: js.UndefOr[
        js.Function3[
          /* path */ String, 
          /* query */ js.UndefOr[js.Any], 
          /* dispatchOptions */ js.UndefOr[js.Any], 
          typings.bluebird.mod.^[_]
        ]
      ] = js.native
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
    def dispatchGetCollection(path: String): typings.bluebird.mod.^[_] = js.native
    def dispatchGetCollection(path: String, query: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typings.bluebird.mod.^[_] = js.native
    def dispatchGetCollection(path: String, query: js.Any): typings.bluebird.mod.^[_] = js.native
    def dispatchGetCollection(path: String, query: js.Any, dispatchOptions: js.Any): typings.bluebird.mod.^[_] = js.native
    
    var dispatchPost: js.UndefOr[
        js.Function3[
          /* path */ String, 
          /* query */ js.UndefOr[js.Any], 
          /* dispatchOptions */ js.UndefOr[js.Any], 
          typings.bluebird.mod.^[_]
        ]
      ] = js.native
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
    def dispatchPost(path: String): typings.bluebird.mod.^[_] = js.native
    def dispatchPost(path: String, query: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typings.bluebird.mod.^[_] = js.native
    def dispatchPost(path: String, query: js.Any): typings.bluebird.mod.^[_] = js.native
    def dispatchPost(path: String, query: js.Any, dispatchOptions: js.Any): typings.bluebird.mod.^[_] = js.native
    
    var dispatchPut: js.UndefOr[
        js.Function3[
          /* path */ String, 
          /* query */ js.UndefOr[js.Any], 
          /* dispatchOptions */ js.UndefOr[js.Any], 
          typings.bluebird.mod.^[_]
        ]
      ] = js.native
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
    def dispatchPut(path: String): typings.bluebird.mod.^[_] = js.native
    def dispatchPut(path: String, query: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typings.bluebird.mod.^[_] = js.native
    def dispatchPut(path: String, query: js.Any): typings.bluebird.mod.^[_] = js.native
    def dispatchPut(path: String, query: js.Any, dispatchOptions: js.Any): typings.bluebird.mod.^[_] = js.native
    
    var gid: String with js.UndefOr[String] = js.native
    
    var id: Double with js.UndefOr[Double] = js.native
    
    var name: String with js.UndefOr[String] = js.native
    
    var project: Gid = js.native
    
    var resource_subtype: String = js.native
    
    var resource_type: String = js.native
  }
  
  @js.native
  trait EventSectionResource extends EventResource {
    
    var project: Gid = js.native
  }
  
  /* Inlined asana.asana.resources.Events.EventResource & std.Partial<asana.asana.resources.Stories.Type> */
  @js.native
  trait EventStory extends StObject {
    
    var created_at: js.UndefOr[String] = js.native
    
    var created_by: js.UndefOr[typings.asana.mod.resources.Resource] = js.native
    
    var dispatchDelete: js.UndefOr[
        js.Function2[
          /* path */ String, 
          /* dispatchOptions */ js.UndefOr[js.Any], 
          typings.bluebird.mod.^[_]
        ]
      ] = js.native
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
    def dispatchDelete(path: String): typings.bluebird.mod.^[_] = js.native
    def dispatchDelete(path: String, dispatchOptions: js.Any): typings.bluebird.mod.^[_] = js.native
    
    var dispatchGet: js.UndefOr[
        js.Function3[
          /* path */ String, 
          /* query */ js.UndefOr[js.Any], 
          /* dispatchOptions */ js.UndefOr[js.Any], 
          typings.bluebird.mod.^[_]
        ]
      ] = js.native
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
    def dispatchGet(path: String): typings.bluebird.mod.^[_] = js.native
    def dispatchGet(path: String, query: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typings.bluebird.mod.^[_] = js.native
    def dispatchGet(path: String, query: js.Any): typings.bluebird.mod.^[_] = js.native
    def dispatchGet(path: String, query: js.Any, dispatchOptions: js.Any): typings.bluebird.mod.^[_] = js.native
    
    var dispatchGetCollection: js.UndefOr[
        js.Function3[
          /* path */ String, 
          /* query */ js.UndefOr[js.Any], 
          /* dispatchOptions */ js.UndefOr[js.Any], 
          typings.bluebird.mod.^[_]
        ]
      ] = js.native
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
    def dispatchGetCollection(path: String): typings.bluebird.mod.^[_] = js.native
    def dispatchGetCollection(path: String, query: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typings.bluebird.mod.^[_] = js.native
    def dispatchGetCollection(path: String, query: js.Any): typings.bluebird.mod.^[_] = js.native
    def dispatchGetCollection(path: String, query: js.Any, dispatchOptions: js.Any): typings.bluebird.mod.^[_] = js.native
    
    var dispatchPost: js.UndefOr[
        js.Function3[
          /* path */ String, 
          /* query */ js.UndefOr[js.Any], 
          /* dispatchOptions */ js.UndefOr[js.Any], 
          typings.bluebird.mod.^[_]
        ]
      ] = js.native
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
    def dispatchPost(path: String): typings.bluebird.mod.^[_] = js.native
    def dispatchPost(path: String, query: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typings.bluebird.mod.^[_] = js.native
    def dispatchPost(path: String, query: js.Any): typings.bluebird.mod.^[_] = js.native
    def dispatchPost(path: String, query: js.Any, dispatchOptions: js.Any): typings.bluebird.mod.^[_] = js.native
    
    var dispatchPut: js.UndefOr[
        js.Function3[
          /* path */ String, 
          /* query */ js.UndefOr[js.Any], 
          /* dispatchOptions */ js.UndefOr[js.Any], 
          typings.bluebird.mod.^[_]
        ]
      ] = js.native
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
    def dispatchPut(path: String): typings.bluebird.mod.^[_] = js.native
    def dispatchPut(path: String, query: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typings.bluebird.mod.^[_] = js.native
    def dispatchPut(path: String, query: js.Any): typings.bluebird.mod.^[_] = js.native
    def dispatchPut(path: String, query: js.Any, dispatchOptions: js.Any): typings.bluebird.mod.^[_] = js.native
    
    var gid: String with js.UndefOr[String] = js.native
    
    var hearts: js.UndefOr[js.Array[typings.asana.mod.resources.Stories.Type]] = js.native
    
    var html_text: js.UndefOr[String] = js.native
    
    var id: Double with js.UndefOr[Double] = js.native
    
    var name: String with js.UndefOr[String] = js.native
    
    var resource_subtype: String = js.native
    
    var resource_type: String = js.native
    
    var source: js.UndefOr[String] = js.native
    
    var target: js.UndefOr[typings.asana.mod.resources.Resource] = js.native
    
    var text: js.UndefOr[String] = js.native
    
    var `type`: js.UndefOr[String] = js.native
  }
  
  /* Inlined asana.asana.resources.Events.EventResource & std.Partial<asana.asana.resources.Tasks.Type> */
  @js.native
  trait EventTask extends StObject {
    
    var assignee: js.UndefOr[Assignee | Null] = js.native
    
    var assignee_status: js.UndefOr[String] = js.native
    
    var completed: js.UndefOr[Boolean] = js.native
    
    var completed_at: js.UndefOr[String | Null] = js.native
    
    var created_at: js.UndefOr[String] = js.native
    
    var custom_fields: js.UndefOr[js.Array[CustomField]] = js.native
    
    var dispatchDelete: js.UndefOr[
        js.Function2[
          /* path */ String, 
          /* dispatchOptions */ js.UndefOr[js.Any], 
          typings.bluebird.mod.^[_]
        ]
      ] = js.native
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
    def dispatchDelete(path: String): typings.bluebird.mod.^[_] = js.native
    def dispatchDelete(path: String, dispatchOptions: js.Any): typings.bluebird.mod.^[_] = js.native
    
    var dispatchGet: js.UndefOr[
        js.Function3[
          /* path */ String, 
          /* query */ js.UndefOr[js.Any], 
          /* dispatchOptions */ js.UndefOr[js.Any], 
          typings.bluebird.mod.^[_]
        ]
      ] = js.native
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
    def dispatchGet(path: String): typings.bluebird.mod.^[_] = js.native
    def dispatchGet(path: String, query: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typings.bluebird.mod.^[_] = js.native
    def dispatchGet(path: String, query: js.Any): typings.bluebird.mod.^[_] = js.native
    def dispatchGet(path: String, query: js.Any, dispatchOptions: js.Any): typings.bluebird.mod.^[_] = js.native
    
    var dispatchGetCollection: js.UndefOr[
        js.Function3[
          /* path */ String, 
          /* query */ js.UndefOr[js.Any], 
          /* dispatchOptions */ js.UndefOr[js.Any], 
          typings.bluebird.mod.^[_]
        ]
      ] = js.native
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
    def dispatchGetCollection(path: String): typings.bluebird.mod.^[_] = js.native
    def dispatchGetCollection(path: String, query: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typings.bluebird.mod.^[_] = js.native
    def dispatchGetCollection(path: String, query: js.Any): typings.bluebird.mod.^[_] = js.native
    def dispatchGetCollection(path: String, query: js.Any, dispatchOptions: js.Any): typings.bluebird.mod.^[_] = js.native
    
    var dispatchPost: js.UndefOr[
        js.Function3[
          /* path */ String, 
          /* query */ js.UndefOr[js.Any], 
          /* dispatchOptions */ js.UndefOr[js.Any], 
          typings.bluebird.mod.^[_]
        ]
      ] = js.native
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
    def dispatchPost(path: String): typings.bluebird.mod.^[_] = js.native
    def dispatchPost(path: String, query: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typings.bluebird.mod.^[_] = js.native
    def dispatchPost(path: String, query: js.Any): typings.bluebird.mod.^[_] = js.native
    def dispatchPost(path: String, query: js.Any, dispatchOptions: js.Any): typings.bluebird.mod.^[_] = js.native
    
    var dispatchPut: js.UndefOr[
        js.Function3[
          /* path */ String, 
          /* query */ js.UndefOr[js.Any], 
          /* dispatchOptions */ js.UndefOr[js.Any], 
          typings.bluebird.mod.^[_]
        ]
      ] = js.native
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
    def dispatchPut(path: String): typings.bluebird.mod.^[_] = js.native
    def dispatchPut(path: String, query: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typings.bluebird.mod.^[_] = js.native
    def dispatchPut(path: String, query: js.Any): typings.bluebird.mod.^[_] = js.native
    def dispatchPut(path: String, query: js.Any, dispatchOptions: js.Any): typings.bluebird.mod.^[_] = js.native
    
    var due_at: js.UndefOr[String] = js.native
    
    var due_on: js.UndefOr[String] = js.native
    
    var followers: js.UndefOr[js.Array[typings.asana.mod.resources.Resource]] = js.native
    
    var gid: String with js.UndefOr[String] = js.native
    
    var hearted: js.UndefOr[Boolean] = js.native
    
    var id: Double with js.UndefOr[Double] = js.native
    
    var memberships: js.UndefOr[js.Array[Membership]] = js.native
    
    var modified_at: js.UndefOr[String] = js.native
    
    var name: String with js.UndefOr[String] = js.native
    
    var notes: js.UndefOr[String] = js.native
    
    var num_hearts: js.UndefOr[Double] = js.native
    
    var parent: js.UndefOr[typings.asana.mod.resources.Resource] = js.native
    
    var projects: js.UndefOr[js.Array[typings.asana.mod.resources.Resource]] = js.native
    
    var resource_subtype: String = js.native
    
    var resource_type: String = js.native
    
    var tags: js.UndefOr[js.Array[typings.asana.mod.resources.Resource]] = js.native
    
    var workspace: js.UndefOr[typings.asana.mod.resources.Resource] = js.native
  }
  
  @js.native
  trait Type extends StObject {
    
    var data: js.UndefOr[js.Array[EventDataEntity]] = js.native
    
    var errors: js.UndefOr[js.Array[EventError]] = js.native
    
    var sync: String = js.native
  }
  object Type {
    
    @scala.inline
    def apply(sync: String): Type = {
      val __obj = js.Dynamic.literal(sync = sync.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type]
    }
    
    @scala.inline
    implicit class TypeMutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Array[EventDataEntity]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setDataVarargs(value: EventDataEntity*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setErrors(value: js.Array[EventError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
      
      @scala.inline
      def setErrorsVarargs(value: EventError*): Self = StObject.set(x, "errors", js.Array(value :_*))
      
      @scala.inline
      def setSync(value: String): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = EventsStatic
  
  /* This means you don't have to write `^`, but can instead just say `Events.foo` */
  override def _to: EventsStatic = ^
}
