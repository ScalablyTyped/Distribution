package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateRelationalDatabaseRequest extends js.Object {
  /**
    * The Availability Zone in which to create your new database. Use the us-east-2a case-sensitive format. You can get a list of Availability Zones by using the get regions operation. Be sure to add the include relational database Availability Zones parameter to your request.
    */
  var availabilityZone: js.UndefOr[String] = js.undefined
  /**
    * The name of the master database created when the Lightsail database resource is created. Constraints:   Must contain from 1 to 64 alphanumeric characters.   Cannot be a word reserved by the specified database engine  
    */
  var masterDatabaseName: String
  /**
    * The password for the master user of your new database. The password can include any printable ASCII character except "/", """, or "@". Constraints: Must contain 8 to 41 characters.
    */
  var masterUserPassword: js.UndefOr[SensitiveString] = js.undefined
  /**
    * The master user name for your new database. Constraints:   Master user name is required.   Must contain from 1 to 16 alphanumeric characters.   The first character must be a letter.   Cannot be a reserved word for the database engine you choose. For more information about reserved words in MySQL 5.6 or 5.7, see the Keywords and Reserved Words articles for MySQL 5.6 or MySQL 5.7 respectively.  
    */
  var masterUsername: String
  /**
    * The daily time range during which automated backups are created for your new database if automated backups are enabled. The default is a 30-minute window selected at random from an 8-hour block of time for each AWS Region. For more information about the preferred backup window time blocks for each region, see the Working With Backups guide in the Amazon Relational Database Service (Amazon RDS) documentation. Constraints:   Must be in the hh24:mi-hh24:mi format. Example: 16:00-16:30    Specified in Coordinated Universal Time (UTC).   Must not conflict with the preferred maintenance window.   Must be at least 30 minutes.  
    */
  var preferredBackupWindow: js.UndefOr[String] = js.undefined
  /**
    * The weekly time range during which system maintenance can occur on your new database. The default is a 30-minute window selected at random from an 8-hour block of time for each AWS Region, occurring on a random day of the week. Constraints:   Must be in the ddd:hh24:mi-ddd:hh24:mi format.   Valid days: Mon, Tue, Wed, Thu, Fri, Sat, Sun.   Must be at least 30 minutes.   Specified in Coordinated Universal Time (UTC).   Example: Tue:17:00-Tue:17:30   
    */
  var preferredMaintenanceWindow: js.UndefOr[String] = js.undefined
  /**
    * Specifies the accessibility options for your new database. A value of true specifies a database that is available to resources outside of your Lightsail account. A value of false specifies a database that is available only to your Lightsail resources in the same region as your database.
    */
  var publiclyAccessible: js.UndefOr[Boolean] = js.undefined
  /**
    * The blueprint ID for your new database. A blueprint describes the major engine version of a database. You can get a list of database blueprints IDs by using the get relational database blueprints operation.
    */
  var relationalDatabaseBlueprintId: String
  /**
    * The bundle ID for your new database. A bundle describes the performance specifications for your database. You can get a list of database bundle IDs by using the get relational database bundles operation.
    */
  var relationalDatabaseBundleId: String
  /**
    * The name to use for your new database. Constraints:   Must contain from 2 to 255 alphanumeric characters, or hyphens.   The first and last character must be a letter or number.  
    */
  var relationalDatabaseName: ResourceName
  /**
    * The tag keys and optional values to add to the resource during create. To tag a resource after it has been created, see the tag resource operation.
    */
  var tags: js.UndefOr[TagList] = js.undefined
}

object CreateRelationalDatabaseRequest {
  @scala.inline
  def apply(
    masterDatabaseName: String,
    masterUsername: String,
    relationalDatabaseBlueprintId: String,
    relationalDatabaseBundleId: String,
    relationalDatabaseName: ResourceName,
    availabilityZone: String = null,
    masterUserPassword: SensitiveString = null,
    preferredBackupWindow: String = null,
    preferredMaintenanceWindow: String = null,
    publiclyAccessible: js.UndefOr[Boolean] = js.undefined,
    tags: TagList = null
  ): CreateRelationalDatabaseRequest = {
    val __obj = js.Dynamic.literal(masterDatabaseName = masterDatabaseName, masterUsername = masterUsername, relationalDatabaseBlueprintId = relationalDatabaseBlueprintId, relationalDatabaseBundleId = relationalDatabaseBundleId, relationalDatabaseName = relationalDatabaseName)
    if (availabilityZone != null) __obj.updateDynamic("availabilityZone")(availabilityZone)
    if (masterUserPassword != null) __obj.updateDynamic("masterUserPassword")(masterUserPassword)
    if (preferredBackupWindow != null) __obj.updateDynamic("preferredBackupWindow")(preferredBackupWindow)
    if (preferredMaintenanceWindow != null) __obj.updateDynamic("preferredMaintenanceWindow")(preferredMaintenanceWindow)
    if (!js.isUndefined(publiclyAccessible)) __obj.updateDynamic("publiclyAccessible")(publiclyAccessible)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[CreateRelationalDatabaseRequest]
  }
}

