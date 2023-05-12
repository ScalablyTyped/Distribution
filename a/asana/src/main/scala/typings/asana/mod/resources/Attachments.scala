package typings.asana.mod.resources

import org.scalablytyped.runtime.Shortcut
import typings.asana.mod.Dispatcher
import typings.asana.mod.resources.Attachments.Type
import typings.bluebird.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An _attachment_ object represents any file attached to a task in Asana,
  * whether it's an uploaded file or one associated via a third-party service
  * such as Dropbox or Google Drive.
  * @param {Dispatcher} dispatcher The API dispatcher
  */
@js.native
trait Attachments
  extends StObject
     with TopLevelResource {
  
  /**
    * * Returns the full record for a single attachment.
    *   * @param {String|Number} attachment Globally unique identifier for the attachment.
    *   * @param {Object} [params] Parameters for the request
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The requested resource
    * @param attachment
    * @param params?
    * @param dispatchOptions?
    * @return
    */
  def findById(attachment: String): ^[Type] = js.native
  def findById(attachment: String, params: Unit, dispatchOptions: Any): ^[Type] = js.native
  def findById(attachment: String, params: Params): ^[Type] = js.native
  def findById(attachment: String, params: Params, dispatchOptions: Any): ^[Type] = js.native
  def findById(attachment: Double): ^[Type] = js.native
  def findById(attachment: Double, params: Unit, dispatchOptions: Any): ^[Type] = js.native
  def findById(attachment: Double, params: Params): ^[Type] = js.native
  def findById(attachment: Double, params: Params, dispatchOptions: Any): ^[Type] = js.native
  
  /**
    * * Returns the compact records for all attachments on the task.
    *   * @param {String|Number} task Globally unique identifier for the task.
    *   * @param {Object} [params] Parameters for the request
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The response from the API
    * @param task
    * @param params?
    * @param dispatchOptions?
    * @return
    */
  def findByTask(task: String): ^[ResourceList[Type]] = js.native
  def findByTask(task: String, params: Unit, dispatchOptions: Any): ^[ResourceList[Type]] = js.native
  def findByTask(task: String, params: PaginationParams): ^[ResourceList[Type]] = js.native
  def findByTask(task: String, params: PaginationParams, dispatchOptions: Any): ^[ResourceList[Type]] = js.native
  def findByTask(task: Double): ^[ResourceList[Type]] = js.native
  def findByTask(task: Double, params: Unit, dispatchOptions: Any): ^[ResourceList[Type]] = js.native
  def findByTask(task: Double, params: PaginationParams): ^[ResourceList[Type]] = js.native
  def findByTask(task: Double, params: PaginationParams, dispatchOptions: Any): ^[ResourceList[Type]] = js.native
}
object Attachments extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("asana", "resources.Attachments")
  @js.native
  open class ^ protected ()
    extends StObject
       with Attachments {
    /**
      * @param dispatcher
      */
    def this(dispatcher: Dispatcher) = this()
  }
  
  @JSImport("asana", "resources.Attachments")
  @js.native
  val ^ : AttachmentsStatic = js.native
  
  trait Type
    extends StObject
       with Resource {
    
    val created_at: String
    
    val download_url: String
    
    val host: String
    
    val id: Double
    
    val parent: Resource
    
    val view_url: String
  }
  object Type {
    
    inline def apply(
      created_at: String,
      download_url: String,
      gid: String,
      host: String,
      id: Double,
      name: String,
      parent: Resource,
      resource_type: String,
      view_url: String
    ): Type = {
      val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], download_url = download_url.asInstanceOf[js.Any], gid = gid.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], resource_type = resource_type.asInstanceOf[js.Any], view_url = view_url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
      
      inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
      
      inline def setDownload_url(value: String): Self = StObject.set(x, "download_url", value.asInstanceOf[js.Any])
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setParent(value: Resource): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setView_url(value: String): Self = StObject.set(x, "view_url", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = AttachmentsStatic
  
  /* This means you don't have to write `^`, but can instead just say `Attachments.foo` */
  override def _to: AttachmentsStatic = ^
}
