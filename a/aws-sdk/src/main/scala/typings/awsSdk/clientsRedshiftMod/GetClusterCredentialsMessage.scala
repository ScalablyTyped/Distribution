package typings.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetClusterCredentialsMessage extends StObject {
  
  /**
    * Create a database user with the name specified for the user named in DbUser if one does not exist.
    */
  var AutoCreate: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * The unique identifier of the cluster that contains the database for which you are requesting credentials. This parameter is case sensitive.
    */
  var ClusterIdentifier: String
  
  /**
    * A list of the names of existing database groups that the user named in DbUser will join for the current session, in addition to any group memberships for an existing user. If not specified, a new user is added only to PUBLIC. Database group name constraints   Must be 1 to 64 alphanumeric characters or hyphens   Must contain only lowercase letters, numbers, underscore, plus sign, period (dot), at symbol (@), or hyphen.   First character must be a letter.   Must not contain a colon ( : ) or slash ( / ).    Cannot be a reserved word. A list of reserved words can be found in Reserved Words in the Amazon Redshift Database Developer Guide.  
    */
  var DbGroups: js.UndefOr[DbGroupList] = js.undefined
  
  /**
    * The name of a database that DbUser is authorized to log on to. If DbName is not specified, DbUser can log on to any existing database. Constraints:   Must be 1 to 64 alphanumeric characters or hyphens   Must contain uppercase or lowercase letters, numbers, underscore, plus sign, period (dot), at symbol (@), or hyphen.   First character must be a letter.   Must not contain a colon ( : ) or slash ( / ).    Cannot be a reserved word. A list of reserved words can be found in Reserved Words in the Amazon Redshift Database Developer Guide.  
    */
  var DbName: js.UndefOr[String] = js.undefined
  
  /**
    * The name of a database user. If a user name matching DbUser exists in the database, the temporary user credentials have the same permissions as the existing user. If DbUser doesn't exist in the database and Autocreate is True, a new user is created using the value for DbUser with PUBLIC permissions. If a database user matching the value for DbUser doesn't exist and Autocreate is False, then the command succeeds but the connection attempt will fail because the user doesn't exist in the database. For more information, see CREATE USER in the Amazon Redshift Database Developer Guide.  Constraints:   Must be 1 to 64 alphanumeric characters or hyphens. The user name can't be PUBLIC.   Must contain uppercase or lowercase letters, numbers, underscore, plus sign, period (dot), at symbol (@), or hyphen.   First character must be a letter.   Must not contain a colon ( : ) or slash ( / ).    Cannot be a reserved word. A list of reserved words can be found in Reserved Words in the Amazon Redshift Database Developer Guide.  
    */
  var DbUser: String
  
  /**
    * The number of seconds until the returned temporary password expires. Constraint: minimum 900, maximum 3600. Default: 900
    */
  var DurationSeconds: js.UndefOr[IntegerOptional] = js.undefined
}
object GetClusterCredentialsMessage {
  
  inline def apply(ClusterIdentifier: String, DbUser: String): GetClusterCredentialsMessage = {
    val __obj = js.Dynamic.literal(ClusterIdentifier = ClusterIdentifier.asInstanceOf[js.Any], DbUser = DbUser.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetClusterCredentialsMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetClusterCredentialsMessage] (val x: Self) extends AnyVal {
    
    inline def setAutoCreate(value: BooleanOptional): Self = StObject.set(x, "AutoCreate", value.asInstanceOf[js.Any])
    
    inline def setAutoCreateUndefined: Self = StObject.set(x, "AutoCreate", js.undefined)
    
    inline def setClusterIdentifier(value: String): Self = StObject.set(x, "ClusterIdentifier", value.asInstanceOf[js.Any])
    
    inline def setDbGroups(value: DbGroupList): Self = StObject.set(x, "DbGroups", value.asInstanceOf[js.Any])
    
    inline def setDbGroupsUndefined: Self = StObject.set(x, "DbGroups", js.undefined)
    
    inline def setDbGroupsVarargs(value: String*): Self = StObject.set(x, "DbGroups", js.Array(value*))
    
    inline def setDbName(value: String): Self = StObject.set(x, "DbName", value.asInstanceOf[js.Any])
    
    inline def setDbNameUndefined: Self = StObject.set(x, "DbName", js.undefined)
    
    inline def setDbUser(value: String): Self = StObject.set(x, "DbUser", value.asInstanceOf[js.Any])
    
    inline def setDurationSeconds(value: IntegerOptional): Self = StObject.set(x, "DurationSeconds", value.asInstanceOf[js.Any])
    
    inline def setDurationSecondsUndefined: Self = StObject.set(x, "DurationSeconds", js.undefined)
  }
}
