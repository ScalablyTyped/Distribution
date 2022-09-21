package typings.anydbSqlMigrations

import typings.anydbSqlMigrations.mod.MigrationOptions
import typings.anydbSqlMigrations.mod.MigrationTask
import typings.bluebird.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Check extends StObject {
    
    def check(f: js.Function1[/* items */ js.Array[MigrationTask], Any]): ^[Any]
    
    def drop(): ^[Any]
    
    def execMigrations(migrationOptions: MigrationOptions): ^[Unit]
    
    def migrate(): ^[Any]
    
    def run(): ^[Any]
    
    def undoLast(): ^[Any]
  }
  object Check {
    
    inline def apply(
      check: js.Function1[/* items */ js.Array[MigrationTask], Any] => ^[Any],
      drop: () => ^[Any],
      execMigrations: MigrationOptions => ^[Unit],
      migrate: () => ^[Any],
      run: () => ^[Any],
      undoLast: () => ^[Any]
    ): Check = {
      val __obj = js.Dynamic.literal(check = js.Any.fromFunction1(check), drop = js.Any.fromFunction0(drop), execMigrations = js.Any.fromFunction1(execMigrations), migrate = js.Any.fromFunction0(migrate), run = js.Any.fromFunction0(run), undoLast = js.Any.fromFunction0(undoLast))
      __obj.asInstanceOf[Check]
    }
    
    extension [Self <: Check](x: Self) {
      
      inline def setCheck(value: js.Function1[/* items */ js.Array[MigrationTask], Any] => ^[Any]): Self = StObject.set(x, "check", js.Any.fromFunction1(value))
      
      inline def setDrop(value: () => ^[Any]): Self = StObject.set(x, "drop", js.Any.fromFunction0(value))
      
      inline def setExecMigrations(value: MigrationOptions => ^[Unit]): Self = StObject.set(x, "execMigrations", js.Any.fromFunction1(value))
      
      inline def setMigrate(value: () => ^[Any]): Self = StObject.set(x, "migrate", js.Any.fromFunction0(value))
      
      inline def setRun(value: () => ^[Any]): Self = StObject.set(x, "run", js.Any.fromFunction0(value))
      
      inline def setUndoLast(value: () => ^[Any]): Self = StObject.set(x, "undoLast", js.Any.fromFunction0(value))
    }
  }
}
