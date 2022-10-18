package typings.angularLocalize

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toolsSrcMigrateMigrateMod {
  
  @JSImport("@angular/localize/tools/src/migrate/migrate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def migrateFile(sourceCode: String, mapping: MigrationMapping): String = (^.asInstanceOf[js.Dynamic].applyDynamic("migrateFile")(sourceCode.asInstanceOf[js.Any], mapping.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type MigrationMapping = StringDictionary[String]
}
