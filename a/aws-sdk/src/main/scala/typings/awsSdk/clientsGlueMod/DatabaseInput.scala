package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatabaseInput extends StObject {
  
  /**
    * Creates a set of default permissions on the table for principals. 
    */
  var CreateTableDefaultPermissions: js.UndefOr[PrincipalPermissionsList] = js.undefined
  
  /**
    * A description of the database.
    */
  var Description: js.UndefOr[DescriptionString] = js.undefined
  
  /**
    * The location of the database (for example, an HDFS path). 
    */
  var LocationUri: js.UndefOr[URI] = js.undefined
  
  /**
    * The name of the database. For Hive compatibility, this is folded to lowercase when it is stored.
    */
  var Name: NameString
  
  /**
    * These key-value pairs define parameters and properties of the database. These key-value pairs define parameters and properties of the database.
    */
  var Parameters: js.UndefOr[ParametersMap] = js.undefined
  
  /**
    * A DatabaseIdentifier structure that describes a target database for resource linking.
    */
  var TargetDatabase: js.UndefOr[DatabaseIdentifier] = js.undefined
}
object DatabaseInput {
  
  inline def apply(Name: NameString): DatabaseInput = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseInput]
  }
  
  extension [Self <: DatabaseInput](x: Self) {
    
    inline def setCreateTableDefaultPermissions(value: PrincipalPermissionsList): Self = StObject.set(x, "CreateTableDefaultPermissions", value.asInstanceOf[js.Any])
    
    inline def setCreateTableDefaultPermissionsUndefined: Self = StObject.set(x, "CreateTableDefaultPermissions", js.undefined)
    
    inline def setCreateTableDefaultPermissionsVarargs(value: PrincipalPermissions*): Self = StObject.set(x, "CreateTableDefaultPermissions", js.Array(value*))
    
    inline def setDescription(value: DescriptionString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setLocationUri(value: URI): Self = StObject.set(x, "LocationUri", value.asInstanceOf[js.Any])
    
    inline def setLocationUriUndefined: Self = StObject.set(x, "LocationUri", js.undefined)
    
    inline def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: ParametersMap): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    
    inline def setTargetDatabase(value: DatabaseIdentifier): Self = StObject.set(x, "TargetDatabase", value.asInstanceOf[js.Any])
    
    inline def setTargetDatabaseUndefined: Self = StObject.set(x, "TargetDatabase", js.undefined)
  }
}
