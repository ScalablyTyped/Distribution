package typings.asana.mod.resources

import typings.asana.anon.TypeaheadParamsresourcety
import typings.asana.anon.TypeaheadParamsresourcetyCount
import typings.asana.anon.TypeaheadParamsresourcetyOptfields
import typings.asana.anon.TypeaheadParamsresourcetyOptpretty
import typings.asana.anon.TypeaheadParamsresourcetyQuery
import typings.asana.mod.resources.CustomFields.Type
import typings.asana.mod.resources.Typeahead.TypeaheadParams
import typings.bluebird.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeahead
  extends StObject
     with TopLevelResource {
  
  // https://github.com/Asana/node-asana/blob/6bf00fb3257847744bf0ebe2dc0e95c445477282/lib/resources/gen/typeahead.js#L19-L40
  /**
    * Get objects via typeahead
    * @param {String} workspaceGid: (required) Globally unique identifier for the workspace or organization.
    * @param {Object} params: Parameters for the request
    *  - resourceType {String}:  (required) The type of values the typeahead should return. You can choose from one of the following: `custom_field`, `project`, `portfolio`, `tag`,
    *    `task`, and `user`. Note that unlike in the names of endpoints, the types listed here are in singular form (e.g. `task`). Using multiple types is not yet supported.
    *  - type {String}:  *Deprecated: new integrations should prefer the resource_type field.*
    *  - query {String}:  The string that will be used to search for relevant objects. If an empty string is passed in, the API will currently return an empty result set.
    *  - count {Number}:  The number of results to return. The default is 20 if this parameter is omitted, with a minimum of 1 and a maximum of 100. If there are fewer results
    *    found than requested, all will be returned.
    *  - optFields {[String]}:  Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request
    *    more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to
    *    return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.
    *  - optPretty {Boolean}:  Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to
    *    make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    * @param {Object} [dispatchOptions]: Options, if any, to pass the dispatcher for the request
    * @return {Promise} The requested resource
    */
  // typeaheadForWorkspace(
  //     workspaceGid: string,
  //     params?: Typeahead.TypeaheadParams & { resource_type: 'portfolio' },
  //     dispatchOptions?: any,
  // ): Promise<ResourceList<Portfolios.Type>>;
  def typeaheadForWorkspace(workspaceGid: String): ^[ResourceList[Type]] = js.native
  def typeaheadForWorkspace(workspaceGid: String, params: Unit, dispatchOptions: Any): ^[ResourceList[Type]] = js.native
  def typeaheadForWorkspace(workspaceGid: String, params: TypeaheadParamsresourcety): ^[ResourceList[Type]] = js.native
  def typeaheadForWorkspace(workspaceGid: String, params: TypeaheadParamsresourcetyCount): ^[ResourceList[typings.asana.mod.resources.Projects.Type]] = js.native
  def typeaheadForWorkspace(workspaceGid: String, params: TypeaheadParamsresourcetyCount, dispatchOptions: Any): ^[ResourceList[typings.asana.mod.resources.Projects.Type]] = js.native
  def typeaheadForWorkspace(workspaceGid: String, params: TypeaheadParamsresourcetyOptfields): ^[ResourceList[typings.asana.mod.resources.Tags.Type]] = js.native
  def typeaheadForWorkspace(workspaceGid: String, params: TypeaheadParamsresourcetyOptfields, dispatchOptions: Any): ^[ResourceList[typings.asana.mod.resources.Tags.Type]] = js.native
  def typeaheadForWorkspace(workspaceGid: String, params: TypeaheadParamsresourcetyOptpretty): ^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  def typeaheadForWorkspace(workspaceGid: String, params: TypeaheadParamsresourcetyOptpretty, dispatchOptions: Any): ^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  def typeaheadForWorkspace(workspaceGid: String, params: TypeaheadParamsresourcetyQuery): ^[ResourceList[typings.asana.mod.resources.Users.Type]] = js.native
  def typeaheadForWorkspace(workspaceGid: String, params: TypeaheadParamsresourcetyQuery, dispatchOptions: Any): ^[ResourceList[typings.asana.mod.resources.Users.Type]] = js.native
  def typeaheadForWorkspace(workspaceGid: String, params: TypeaheadParamsresourcety, dispatchOptions: Any): ^[ResourceList[Type]] = js.native
  def typeaheadForWorkspace(workspaceGid: String, params: TypeaheadParams): ^[ResourceList[Resource]] = js.native
  def typeaheadForWorkspace(workspaceGid: String, params: TypeaheadParams, dispatchOptions: Any): ^[ResourceList[Resource]] = js.native
}
object Typeahead {
  
  trait TypeaheadParams extends StObject {
    
    var count: js.UndefOr[Double] = js.undefined
    
    var opt_fields: js.UndefOr[String] = js.undefined
    
    var opt_pretty: js.UndefOr[Boolean] = js.undefined
    
    var query: js.UndefOr[String] = js.undefined
    
    var resource_type: String
  }
  object TypeaheadParams {
    
    inline def apply(resource_type: String): TypeaheadParams = {
      val __obj = js.Dynamic.literal(resource_type = resource_type.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeaheadParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypeaheadParams] (val x: Self) extends AnyVal {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      inline def setOpt_fields(value: String): Self = StObject.set(x, "opt_fields", value.asInstanceOf[js.Any])
      
      inline def setOpt_fieldsUndefined: Self = StObject.set(x, "opt_fields", js.undefined)
      
      inline def setOpt_pretty(value: Boolean): Self = StObject.set(x, "opt_pretty", value.asInstanceOf[js.Any])
      
      inline def setOpt_prettyUndefined: Self = StObject.set(x, "opt_pretty", js.undefined)
      
      inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      inline def setResource_type(value: String): Self = StObject.set(x, "resource_type", value.asInstanceOf[js.Any])
    }
  }
}
