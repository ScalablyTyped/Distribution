package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RedshiftSource extends StObject {
  
  /**
    * The database to read from.
    */
  var Database: EnclosedInStringProperty
  
  /**
    * The name of the Amazon Redshift data store.
    */
  var Name: NodeName
  
  /**
    * The Amazon S3 path where temporary data can be staged when copying out of the database.
    */
  var RedshiftTmpDir: js.UndefOr[EnclosedInStringProperty] = js.undefined
  
  /**
    * The database table to read from.
    */
  var Table: EnclosedInStringProperty
  
  /**
    * The IAM role with permissions.
    */
  var TmpDirIAMRole: js.UndefOr[EnclosedInStringProperty] = js.undefined
}
object RedshiftSource {
  
  inline def apply(Database: EnclosedInStringProperty, Name: NodeName, Table: EnclosedInStringProperty): RedshiftSource = {
    val __obj = js.Dynamic.literal(Database = Database.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Table = Table.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedshiftSource]
  }
  
  extension [Self <: RedshiftSource](x: Self) {
    
    inline def setDatabase(value: EnclosedInStringProperty): Self = StObject.set(x, "Database", value.asInstanceOf[js.Any])
    
    inline def setName(value: NodeName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setRedshiftTmpDir(value: EnclosedInStringProperty): Self = StObject.set(x, "RedshiftTmpDir", value.asInstanceOf[js.Any])
    
    inline def setRedshiftTmpDirUndefined: Self = StObject.set(x, "RedshiftTmpDir", js.undefined)
    
    inline def setTable(value: EnclosedInStringProperty): Self = StObject.set(x, "Table", value.asInstanceOf[js.Any])
    
    inline def setTmpDirIAMRole(value: EnclosedInStringProperty): Self = StObject.set(x, "TmpDirIAMRole", value.asInstanceOf[js.Any])
    
    inline def setTmpDirIAMRoleUndefined: Self = StObject.set(x, "TmpDirIAMRole", js.undefined)
  }
}
