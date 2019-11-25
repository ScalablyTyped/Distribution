package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserDetails extends Object {
  /**
    * The address of the user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#UserDetails)
    */
  var address: String
  /**
    * The email address of the user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#UserDetails)
    */
  var email: String
  /**
    * The fax number of the user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#UserDetails)
    */
  var faxNumber: String
  /**
    * The first name of the user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#UserDetails)
    */
  var firstName: String
  /**
    * The full name of the user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#UserDetails)
    */
  var fullName: String
  /**
    * An array of [group memberships](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#GroupMembership) of the user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#UserDetails)
    */
  var groups: js.Array[GroupMembership]
  /**
    * The last name of the user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#UserDetails)
    */
  var lastName: String
  /**
    * The phone number of the user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#UserDetails)
    */
  var phoneNumber: String
  /**
    * An array of [application privileges](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#Privilege) of the user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#UserDetails)
    */
  var privileges: js.Array[Privilege]
  /**
    * The room number of the user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#UserDetails)
    */
  var roomNumber: String
  /**
    * The login username for the user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#UserDetails)
    */
  var userName: String
  /**
    * An array of [queries](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobQueryContainer) owned by the user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#UserDetails)
    */
  var userQueries: js.Array[JobQueryContainer]
  /**
    * The zip code of the user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#UserDetails)
    */
  var zipCode: String
}

object UserDetails {
  @scala.inline
  def apply(
    address: String,
    constructor: js.Function,
    email: String,
    faxNumber: String,
    firstName: String,
    fullName: String,
    groups: js.Array[GroupMembership],
    hasOwnProperty: PropertyKey => Boolean,
    lastName: String,
    phoneNumber: String,
    privileges: js.Array[Privilege],
    propertyIsEnumerable: PropertyKey => Boolean,
    roomNumber: String,
    userName: String,
    userQueries: js.Array[JobQueryContainer],
    zipCode: String
  ): UserDetails = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], faxNumber = faxNumber.asInstanceOf[js.Any], firstName = firstName.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), lastName = lastName.asInstanceOf[js.Any], phoneNumber = phoneNumber.asInstanceOf[js.Any], privileges = privileges.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), roomNumber = roomNumber.asInstanceOf[js.Any], userName = userName.asInstanceOf[js.Any], userQueries = userQueries.asInstanceOf[js.Any], zipCode = zipCode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UserDetails]
  }
}

