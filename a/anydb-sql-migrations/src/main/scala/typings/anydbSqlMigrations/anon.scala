package typings.anydbSqlMigrations

import typings.anydbSqlMigrations.mod.MigrationOptions
import typings.anydbSqlMigrations.mod.MigrationTask
import typings.bluebird.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Check extends StObject {
    
    def check(f: js.Function1[/* items */ js.Array[MigrationTask], js.Any]): ^[js.Any]
    
    def drop(): ^[js.Any]
    
    def execMigrations(migrationOptions: MigrationOptions): ^[Unit]
    
    def migrate(): ^[js.Any]
    
    def run(): ^[js.Any]
    
    def undoLast(): ^[js.Any]
  }
  object Check {
    
    @scala.inline
    def apply(
      check: js.Function1[/* items */ js.Array[MigrationTask], js.Any] => ^[js.Any],
      drop: () => ^[js.Any],
      execMigrations: MigrationOptions => ^[Unit],
      migrate: () => ^[js.Any],
      run: () => ^[js.Any],
      undoLast: () => ^[js.Any]
    ): Check = {
      val __obj = js.Dynamic.literal(check = js.Any.fromFunction1(check), drop = js.Any.fromFunction0(drop), execMigrations = js.Any.fromFunction1(execMigrations), migrate = js.Any.fromFunction0(migrate), run = js.Any.fromFunction0(run), undoLast = js.Any.fromFunction0(undoLast))
      __obj.asInstanceOf[Check]
    }
    
    @scala.inline
    implicit class CheckMutableBuilder[Self <: Check] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCheck(value: js.Function1[/* items */ js.Array[MigrationTask], js.Any] => ^[js.Any]): Self = StObject.set(x, "check", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDrop(value: () => ^[js.Any]): Self = StObject.set(x, "drop", js.Any.fromFunction0(value))
      
      @scala.inline
      def setExecMigrations(value: MigrationOptions => ^[Unit]): Self = StObject.set(x, "execMigrations", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMigrate(value: () => ^[js.Any]): Self = StObject.set(x, "migrate", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRun(value: () => ^[js.Any]): Self = StObject.set(x, "run", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUndoLast(value: () => ^[js.Any]): Self = StObject.set(x, "undoLast", js.Any.fromFunction0(value))
    }
  }
}
