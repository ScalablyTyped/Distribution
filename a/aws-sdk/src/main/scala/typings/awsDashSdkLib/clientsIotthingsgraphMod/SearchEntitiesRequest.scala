package typings
package awsDashSdkLib.clientsIotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchEntitiesRequest extends js.Object {
  /**
    * The entity types for which to search.
    */
  var entityTypes: EntityTypes
  /**
    * Optional filter to apply to the search. Valid filters are NAME NAMESPACE, SEMANTIC_TYPE_PATH and REFERENCED_ENTITY_ID. REFERENCED_ENTITY_ID filters on entities that are used by the entity in the result set. For example, you can filter on the ID of a property that is used in a state. Multiple filters function as OR criteria in the query. Multiple values passed inside the filter function as AND criteria.
    */
  var filters: js.UndefOr[EntityFilters] = js.undefined
  /**
    * The maximum number of results to return in the response.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * The version of the user's namespace. Defaults to the latest version of the user's namespace.
    */
  var namespaceVersion: js.UndefOr[Version] = js.undefined
  /**
    * The string that specifies the next page of results. Use this when you're paginating results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}

object SearchEntitiesRequest {
  @scala.inline
  def apply(
    entityTypes: EntityTypes,
    filters: EntityFilters = null,
    maxResults: js.UndefOr[MaxResults] = js.undefined,
    namespaceVersion: js.UndefOr[Version] = js.undefined,
    nextToken: NextToken = null
  ): SearchEntitiesRequest = {
    val __obj = js.Dynamic.literal(entityTypes = entityTypes)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults)
    if (!js.isUndefined(namespaceVersion)) __obj.updateDynamic("namespaceVersion")(namespaceVersion)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[SearchEntitiesRequest]
  }
}

