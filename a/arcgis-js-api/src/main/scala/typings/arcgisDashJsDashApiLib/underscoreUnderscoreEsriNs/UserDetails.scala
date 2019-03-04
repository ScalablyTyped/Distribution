package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserDetails
  extends stdLib.Object {
  /**
    * The address of the user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#UserDetails)
    */
  var address: java.lang.String
  /**
    * The email address of the user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#UserDetails)
    */
  var email: java.lang.String
  /**
    * The fax number of the user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#UserDetails)
    */
  var faxNumber: java.lang.String
  /**
    * The first name of the user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#UserDetails)
    */
  var firstName: java.lang.String
  /**
    * The full name of the user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#UserDetails)
    */
  var fullName: java.lang.String
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
  var lastName: java.lang.String
  /**
    * The phone number of the user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#UserDetails)
    */
  var phoneNumber: java.lang.String
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
  var roomNumber: java.lang.String
  /**
    * The login username for the user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#UserDetails)
    */
  var userName: java.lang.String
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
  var zipCode: java.lang.String
}

object UserDetails {
  @scala.inline
  def apply(
    address: java.lang.String,
    constructor: js.Function,
    email: java.lang.String,
    faxNumber: java.lang.String,
    firstName: java.lang.String,
    fullName: java.lang.String,
    groups: js.Array[GroupMembership],
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    lastName: java.lang.String,
    phoneNumber: java.lang.String,
    privileges: js.Array[Privilege],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    roomNumber: java.lang.String,
    userName: java.lang.String,
    userQueries: js.Array[JobQueryContainer],
    zipCode: java.lang.String
  ): UserDetails = {
    val __obj = js.Dynamic.literal(address = address, constructor = constructor, email = email, faxNumber = faxNumber, firstName = firstName, fullName = fullName, groups = groups, hasOwnProperty = hasOwnProperty, lastName = lastName, phoneNumber = phoneNumber, privileges = privileges, propertyIsEnumerable = propertyIsEnumerable, roomNumber = roomNumber, userName = userName, userQueries = userQueries, zipCode = zipCode)
  
    __obj.asInstanceOf[UserDetails]
  }
}

