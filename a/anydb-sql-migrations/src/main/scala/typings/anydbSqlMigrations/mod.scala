package typings.anydbSqlMigrations

import typings.anydbSql.mod.AnydbSql
import typings.anydbSql.mod.Column
import typings.anydbSql.mod.Table
import typings.anydbSql.mod.Transaction
import typings.anydbSqlMigrations.anon.Check
import typings.bluebird.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("anydb-sql-migrations", "create")
  @js.native
  def create(db: AnydbSql, tasks: String): Check = js.native
  @JSImport("anydb-sql-migrations", "create")
  @js.native
  def create(db: AnydbSql, tasks: js.Array[MigrationTask]): Check = js.native
  
  type MigFn = js.Function1[/* tx */ Transaction, ^[js.Any]]
  
  @js.native
  trait Migration extends StObject {
    
    var version: String = js.native
  }
  object Migration {
    
    @scala.inline
    def apply(version: String): Migration = {
      val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Migration]
    }
    
    @scala.inline
    implicit class MigrationMutableBuilder[Self <: Migration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MigrationOptions extends StObject {
    
    var check: js.UndefOr[Boolean] = js.native
    
    var drop: js.UndefOr[Boolean] = js.native
    
    var execute: js.UndefOr[Boolean] = js.native
    
    var rollback: js.UndefOr[Boolean] = js.native
  }
  object MigrationOptions {
    
    @scala.inline
    def apply(): MigrationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MigrationOptions]
    }
    
    @scala.inline
    implicit class MigrationOptionsMutableBuilder[Self <: MigrationOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCheck(value: Boolean): Self = StObject.set(x, "check", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckUndefined: Self = StObject.set(x, "check", js.undefined)
      
      @scala.inline
      def setDrop(value: Boolean): Self = StObject.set(x, "drop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropUndefined: Self = StObject.set(x, "drop", js.undefined)
      
      @scala.inline
      def setExecute(value: Boolean): Self = StObject.set(x, "execute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExecuteUndefined: Self = StObject.set(x, "execute", js.undefined)
      
      @scala.inline
      def setRollback(value: Boolean): Self = StObject.set(x, "rollback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRollbackUndefined: Self = StObject.set(x, "rollback", js.undefined)
    }
  }
  
  @js.native
  trait MigrationTask extends StObject {
    
    def down(tx: Transaction): ^[_] = js.native
    @JSName("down")
    var down_Original: MigFn = js.native
    
    var name: String = js.native
    
    def up(tx: Transaction): ^[_] = js.native
    @JSName("up")
    var up_Original: MigFn = js.native
  }
  
  @js.native
  trait MigrationsTable extends Table[Migration] {
    
    var version: Column[String] = js.native
  }
}
