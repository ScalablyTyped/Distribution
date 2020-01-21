package typings.alexaSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("alexa-sdk", "services")
@js.native
object services extends js.Object {
  @js.native
  class ApiClient () extends js.Object {
    /**
      * Make a DELETE API call to the specified uri with headers
      * @param uri http(s?) endpoint to call
      * @param headers key value pair of headers
      * @returns Promise<ApiClientResponse>
      */
    def delete(uri: String, headers: js.Object): js.Promise[ApiClientResponse] = js.native
    /**
      * Make a GET API call to the specified uri with headers
      * @param uri http(s?) endpoint to call
      * @param headers key value pair of headers
      * @returns Promise<ApiClientResponse>
      */
    def get(uri: String, headers: js.Object): js.Promise[ApiClientResponse] = js.native
    /**
      * Make a POST API call to the specified uri with headers and optional body
      * @param uri http(s?) endpoint to call
      * @param headers Key value pair of headers
      * @param body post body to send
      * @returns Promise<ApiClientResponse>
      */
    def post(uri: String, headers: js.Object): js.Promise[ApiClientResponse] = js.native
    def post(uri: String, headers: js.Object, body: String): js.Promise[ApiClientResponse] = js.native
    /**
      * Make a PUT API call to the specified uri with headers and optional body
      * @param uri http(s?) endpoint to call
      * @param headers Key value pair of headers
      * @param body post body to send
      * @returns Promise<ApiClientResponse>
      */
    def put(uri: String, headers: js.Object): js.Promise[ApiClientResponse] = js.native
    def put(uri: String, headers: js.Object, body: String): js.Promise[ApiClientResponse] = js.native
  }
  
  @js.native
  /**
    * Create an instance of DeviceAddressService
    * @param [apiClient=new ApiClient()] ApiClient
    */
  class DeviceAddressService () extends js.Object {
    def this(apiClient: ApiClient) = this()
    /**
      * Get country and postal information from Alexa Device Address API
      * @param deviceId deviceId from Alexa request
      * @param apiEndpoint API apiEndpoint from Alexa request
      * @param token bearer token for device address permission
      * @returns Promise<object>
      */
    def getCountryAndPostalCode(deviceId: String, apiEndpoint: String, token: String): js.Promise[js.Object] = js.native
    /**
      * Get full address information from Alexa Device Address API
      * @param deviceId deviceId from Alexa request
      * @param apiEndpoint API apiEndpoint from Alexa request
      * @param token bearer token for device address permission
      * @returns Promise<object>
      */
    def getFullAddress(deviceId: String, apiEndpoint: String, token: String): js.Promise[js.Object] = js.native
  }
  
  @js.native
  /**
    * Creates an instance of DirectiveService.
    * @param [apiClient=new ApiClient()] ApiClient
    */
  class DirectiveService () extends js.Object {
    def this(apiClient: ApiClient) = this()
    /**
      * Send the specified directiveObj to Alexa directive service
      *
      * @param directive directive to send to service
      * @param apiEndpoint API endpoint from Alexa request
      * @param token bearer token for directive service
      * @returns Promise<void>
      */
    def enqueue(directive: js.Object, apiEndpoint: String, token: String): js.Promise[Unit] = js.native
  }
  
  @js.native
  /**
    * Create an instance of ListManagementService
    * @param apiClient apiClient
    */
  class ListManagementService () extends js.Object {
    def this(apiClient: ApiClient) = this()
    /**
      * Create a custom list. The new list name must be different than any existing list name
      * @param params params
      * @param token bearer token for list management permission
      * @returns Promise<ListObject>
      */
    def createList(params: CreateListParams, token: String): js.Promise[ListObject] = js.native
    /**
      * Create an item in an active list or in a default list
      * @param listId unique Id associated with the list
      * @param params params
      * @param token bearer token for list management permission
      * @returns Promise<ListItemObject>
      */
    def createListItem(listId: String, params: CreateListItemParams, token: String): js.Promise[ListItemObject] = js.native
    /**
      * Delete a custom list
      * @param listId unique Id associated with the list
      * @param token bearer token for list management permission
      * @returns Promise<void>
      */
    def deleteList(listId: String, token: String): js.Promise[Unit] = js.native
    /**
      * Delete an item in the specified list
      * @param listId unique Id associated with the list
      * @param itemId unique Id associated with the item
      * @param token bearer token for list management permission
      * @returns Promise<void>
      */
    def deleteListItem(listId: String, itemId: String, token: String): js.Promise[Unit] = js.native
    /**
      * Get currently set apiEndpoint address
      * @returns string
      */
    def getApiEndpoint(): String = js.native
    /**
      * Retrieve list metadata including the items in the list with requested status
      * @param listId unique Id associated with the list
      * @param itemStatus itemsStatus can be either "active" or "completed"
      * @param token bearer token for list management permission
      * @returns Promise<ListObject>
      */
    def getList(listId: String, itemStatus: ListItemObjectStatus, token: String): js.Promise[ListObject] = js.native
    /**
      * Retrieve single item within any list by listId and itemId
      * @param listId unique Id associated with the list
      * @param itemId unique Id associated with the item
      * @param token bearer token for list management permission
      * @returns Promise<ListItemObject>
      */
    def getListItem(listId: String, itemId: String, token: String): js.Promise[ListItemObject] = js.native
    /**
      * Retrieve the metadata for all customer lists, including the customer's default lists
      * @param token bearer token for list management permission
      * @returns Promise<ListCollection>
      */
    def getListsMetadata(token: String): js.Promise[ListCollection] = js.native
    /**
      * Set apiEndpoint address, default is "https://api.amazonalexa.com"
      * @param apiEndpoint apiEndpoint
      * @returns void
      */
    def setApiEndpoint(apiEndpoint: String): Unit = js.native
    /**
      * Update a custom list. Only the list name or state can be updated
      * @param listId unique Id associated with the list
      * @param params params
      * @param token bearer token for list management permission
      * @returns Promise<object>
      */
    def updateList(listId: String, params: UpdateListParams, token: String): js.Promise[ListObject] = js.native
    /**
      * Update an item value or item status
      * @param listId unique Id associated with the list
      * @param itemId unique Id associated with the item
      * @param params params
      * @param token bearer token for list management permission
      * @returns Promise<ListItemObject>
      */
    def updateListItem(listId: String, itemId: String, params: UpdateListItemParams, token: String): js.Promise[ListItemObject] = js.native
  }
  
}

