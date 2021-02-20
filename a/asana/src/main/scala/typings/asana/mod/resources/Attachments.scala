package typings.asana.mod.resources

import org.scalablytyped.runtime.Shortcut
import typings.asana.mod.Dispatcher
import typings.asana.mod.resources.Attachments.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An _attachment_ object represents any file attached to a task in Asana,
  * whether it's an uploaded file or one associated via a third-party service
  * such as Dropbox or Google Drive.
  * @class
  * @param {Dispatcher} dispatcher The API dispatcher
  */
@js.native
trait Attachments
  extends typings.asana.mod.resources.Resource {
  
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
  def findById(attachment: String): typings.bluebird.mod.^[Type] = js.native
  def findById(attachment: String, params: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typings.bluebird.mod.^[Type] = js.native
  def findById(attachment: String, params: Params): typings.bluebird.mod.^[Type] = js.native
  def findById(attachment: String, params: Params, dispatchOptions: js.Any): typings.bluebird.mod.^[Type] = js.native
  def findById(attachment: Double): typings.bluebird.mod.^[Type] = js.native
  def findById(attachment: Double, params: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typings.bluebird.mod.^[Type] = js.native
  def findById(attachment: Double, params: Params): typings.bluebird.mod.^[Type] = js.native
  def findById(attachment: Double, params: Params, dispatchOptions: js.Any): typings.bluebird.mod.^[Type] = js.native
  
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
  def findByTask(task: String): typings.bluebird.mod.^[ResourceList[Type]] = js.native
  def findByTask(task: String, params: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typings.bluebird.mod.^[ResourceList[Type]] = js.native
  def findByTask(task: String, params: PaginationParams): typings.bluebird.mod.^[ResourceList[Type]] = js.native
  def findByTask(task: String, params: PaginationParams, dispatchOptions: js.Any): typings.bluebird.mod.^[ResourceList[Type]] = js.native
  def findByTask(task: Double): typings.bluebird.mod.^[ResourceList[Type]] = js.native
  def findByTask(task: Double, params: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typings.bluebird.mod.^[ResourceList[Type]] = js.native
  def findByTask(task: Double, params: PaginationParams): typings.bluebird.mod.^[ResourceList[Type]] = js.native
  def findByTask(task: Double, params: PaginationParams, dispatchOptions: js.Any): typings.bluebird.mod.^[ResourceList[Type]] = js.native
}
object Attachments extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("asana", "resources.Attachments")
  @js.native
  class ^ protected () extends Attachments {
    /**
      * @param dispatcher
      */
    def this(dispatcher: Dispatcher) = this()
  }
  
  @JSImport("asana", "resources.Attachments")
  @js.native
  val ^ : AttachmentsStatic = js.native
  
  @js.native
  trait Type
    extends typings.asana.mod.resources.Resource {
    
    val created_at: String = js.native
    
    val download_url: String = js.native
    
    val host: String = js.native
    
    val parent: typings.asana.mod.resources.Resource = js.native
    
    val view_url: String = js.native
  }
  
  type _To = AttachmentsStatic
  
  /* This means you don't have to write `^`, but can instead just say `Attachments.foo` */
  override def _to: AttachmentsStatic = ^
}
