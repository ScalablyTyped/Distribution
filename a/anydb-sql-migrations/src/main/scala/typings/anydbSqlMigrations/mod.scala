package typings.anydbSqlMigrations

import typings.anydbSql.mod.AnydbSql
import typings.anydbSql.mod.Column
import typings.anydbSql.mod.Table
import typings.anydbSql.mod.Transaction
import typings.anydbSqlMigrations.anon.Check
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("anydb-sql-migrations", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(db: AnydbSql, tasks: String): Check = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(db.asInstanceOf[js.Any], tasks.asInstanceOf[js.Any])).asInstanceOf[Check]
  inline def create(db: AnydbSql, tasks: js.Array[MigrationTask]): Check = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(db.asInstanceOf[js.Any], tasks.asInstanceOf[js.Any])).asInstanceOf[Check]
  
  type MigFn = js.Function1[/* tx */ Transaction, typings.bluebird.mod.^[Any]]
  
  trait Migration extends StObject {
    
    var version: String
  }
  object Migration {
    
    inline def apply(version: String): Migration = {
      val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Migration]
    }
    
    extension [Self <: Migration](x: Self) {
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait MigrationOptions extends StObject {
    
    var check: js.UndefOr[Boolean] = js.undefined
    
    var drop: js.UndefOr[Boolean] = js.undefined
    
    var execute: js.UndefOr[Boolean] = js.undefined
    
    var rollback: js.UndefOr[Boolean] = js.undefined
  }
  object MigrationOptions {
    
    inline def apply(): MigrationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MigrationOptions]
    }
    
    extension [Self <: MigrationOptions](x: Self) {
      
      inline def setCheck(value: Boolean): Self = StObject.set(x, "check", value.asInstanceOf[js.Any])
      
      inline def setCheckUndefined: Self = StObject.set(x, "check", js.undefined)
      
      inline def setDrop(value: Boolean): Self = StObject.set(x, "drop", value.asInstanceOf[js.Any])
      
      inline def setDropUndefined: Self = StObject.set(x, "drop", js.undefined)
      
      inline def setExecute(value: Boolean): Self = StObject.set(x, "execute", value.asInstanceOf[js.Any])
      
      inline def setExecuteUndefined: Self = StObject.set(x, "execute", js.undefined)
      
      inline def setRollback(value: Boolean): Self = StObject.set(x, "rollback", value.asInstanceOf[js.Any])
      
      inline def setRollbackUndefined: Self = StObject.set(x, "rollback", js.undefined)
    }
  }
  
  trait MigrationTask extends StObject {
    
    def down(tx: Transaction): typings.bluebird.mod.^[Any]
    @JSName("down")
    var down_Original: MigFn
    
    var name: String
    
    def up(tx: Transaction): typings.bluebird.mod.^[Any]
    @JSName("up")
    var up_Original: MigFn
  }
  object MigrationTask {
    
    inline def apply(
      down: /* tx */ Transaction => typings.bluebird.mod.^[Any],
      name: String,
      up: /* tx */ Transaction => typings.bluebird.mod.^[Any]
    ): MigrationTask = {
      val __obj = js.Dynamic.literal(down = js.Any.fromFunction1(down), name = name.asInstanceOf[js.Any], up = js.Any.fromFunction1(up))
      __obj.asInstanceOf[MigrationTask]
    }
    
    extension [Self <: MigrationTask](x: Self) {
      
      inline def setDown(value: /* tx */ Transaction => typings.bluebird.mod.^[Any]): Self = StObject.set(x, "down", js.Any.fromFunction1(value))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setUp(value: /* tx */ Transaction => typings.bluebird.mod.^[Any]): Self = StObject.set(x, "up", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait MigrationsTable
    extends StObject
       with Table[Migration] {
    
    var version: Column[String] = js.native
  }
}
