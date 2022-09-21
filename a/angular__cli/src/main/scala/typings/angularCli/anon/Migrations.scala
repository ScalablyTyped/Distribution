package typings.angularCli.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Migrations extends StObject {
  
  var migrations: js.UndefOr[String] = js.undefined
  
  var packageGroup: js.UndefOr[js.Array[String] | (Record[String, String])] = js.undefined
  
  var packageGroupName: js.UndefOr[String] = js.undefined
  
  var requirements: js.UndefOr[js.Array[String] | (Record[String, String])] = js.undefined
}
object Migrations {
  
  inline def apply(): Migrations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Migrations]
  }
  
  extension [Self <: Migrations](x: Self) {
    
    inline def setMigrations(value: String): Self = StObject.set(x, "migrations", value.asInstanceOf[js.Any])
    
    inline def setMigrationsUndefined: Self = StObject.set(x, "migrations", js.undefined)
    
    inline def setPackageGroup(value: js.Array[String] | (Record[String, String])): Self = StObject.set(x, "packageGroup", value.asInstanceOf[js.Any])
    
    inline def setPackageGroupName(value: String): Self = StObject.set(x, "packageGroupName", value.asInstanceOf[js.Any])
    
    inline def setPackageGroupNameUndefined: Self = StObject.set(x, "packageGroupName", js.undefined)
    
    inline def setPackageGroupUndefined: Self = StObject.set(x, "packageGroup", js.undefined)
    
    inline def setPackageGroupVarargs(value: String*): Self = StObject.set(x, "packageGroup", js.Array(value*))
    
    inline def setRequirements(value: js.Array[String] | (Record[String, String])): Self = StObject.set(x, "requirements", value.asInstanceOf[js.Any])
    
    inline def setRequirementsUndefined: Self = StObject.set(x, "requirements", js.undefined)
    
    inline def setRequirementsVarargs(value: String*): Self = StObject.set(x, "requirements", js.Array(value*))
  }
}
