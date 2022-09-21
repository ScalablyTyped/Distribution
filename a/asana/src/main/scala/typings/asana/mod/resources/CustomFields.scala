package typings.asana.mod.resources

import org.scalablytyped.runtime.Shortcut
import typings.asana.mod.Dispatcher
import typings.asana.mod.resources.CustomFields.Type
import typings.bluebird.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomFields
  extends StObject
     with TopLevelResource {
  
  // https://github.com/Asana/node-asana/blob/6bf00fb3257847744bf0ebe2dc0e95c445477282/lib/resources/gen/custom_fields.js#L91-L110
  /**
    * Get a workspace's custom fields
    * @param {String} workspaceGid: (required) Globally unique identifier for the workspace or organization.
    * @param {Object} params: Parameters for the request
    *  - offset {String}:    Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input
    *    parameter to the next request. If an offset is not passed in, the API will return the first page of results. 'Note: You can only pass in an offset that was returned to
    *    you via a previously paginated request.'
    *  - limit {Number}:    Results per page. The number of objects to return per page. The value must be between 1 and 100.
    *  - optFields {[String]}:    Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request
    *    more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to
    *    return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.
    *  - optPretty {Boolean}:    Provides "pretty" output. Provides the response in a "pretty" format. In the case of JSON this means doing proper line breaking and indentation
    *    to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    * @param {Object} [dispatchOptions]: Options, if any, to pass the dispatcher for the request
    * @return {Promise} The requested resource
    */
  def getCustomFieldsForWorkspace(workspaceGid: String): ^[ResourceList[Type]] = js.native
  def getCustomFieldsForWorkspace(workspaceGid: String, params: Any): ^[ResourceList[Type]] = js.native
  def getCustomFieldsForWorkspace(workspaceGid: String, params: Any, dispatchOptions: Any): ^[ResourceList[Type]] = js.native
  def getCustomFieldsForWorkspace(workspaceGid: String, params: Unit, dispatchOptions: Any): ^[ResourceList[Type]] = js.native
}
object CustomFields extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("asana", "resources.CustomFields")
  @js.native
  open class ^ protected ()
    extends StObject
       with CustomFields {
    /**
      * @param dispatcher
      */
    def this(dispatcher: Dispatcher) = this()
  }
  
  @JSImport("asana", "resources.CustomFields")
  @js.native
  val ^ : CustomFieldsStatic = js.native
  
  trait Type
    extends StObject
       with Resource
  object Type {
    
    inline def apply(gid: String, name: String, resource_type: String): Type = {
      val __obj = js.Dynamic.literal(gid = gid.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resource_type = resource_type.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type]
    }
  }
  
  type _To = CustomFieldsStatic
  
  /* This means you don't have to write `^`, but can instead just say `CustomFields.foo` */
  override def _to: CustomFieldsStatic = ^
}
