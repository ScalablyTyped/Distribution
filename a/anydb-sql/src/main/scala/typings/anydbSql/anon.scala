package typings.anydbSql

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Column extends StObject {
    
    var column: String = js.native
    
    var table: String = js.native
  }
  object Column {
    
    @scala.inline
    def apply(column: String, table: String): Column = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any])
      __obj.asInstanceOf[Column]
    }
    
    @scala.inline
    implicit class ColumnMutableBuilder[Self <: Column] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumn(value: String): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTable(value: String): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Emit extends StObject {
    
    def emit(`type`: String, args: js.Any*): Unit = js.native
    
    def on(eventName: String, handler: js.Function): Unit = js.native
  }
  object Emit {
    
    @scala.inline
    def apply(emit: (String, /* repeated */ js.Any) => Unit, on: (String, js.Function) => Unit): Emit = {
      val __obj = js.Dynamic.literal(emit = js.Any.fromFunction2(emit), on = js.Any.fromFunction2(on))
      __obj.asInstanceOf[Emit]
    }
    
    @scala.inline
    implicit class EmitMutableBuilder[Self <: Emit] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmit(value: (String, /* repeated */ js.Any) => Unit): Self = StObject.set(x, "emit", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOn(value: (String, js.Function) => Unit): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait From extends StObject {
    
    var from: String = js.native
    
    var many: js.UndefOr[Boolean] = js.native
  }
  object From {
    
    @scala.inline
    def apply(from: String): From = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any])
      __obj.asInstanceOf[From]
    }
    
    @scala.inline
    implicit class FromMutableBuilder[Self <: From] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMany(value: Boolean): Self = StObject.set(x, "many", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setManyUndefined: Self = StObject.set(x, "many", js.undefined)
    }
  }
  
  @js.native
  trait Having[T] extends StObject {
    
    def having(nodes: js.Any*): T = js.native
  }
  object Having {
    
    @scala.inline
    def apply[T](having: /* repeated */ js.Any => T): Having[T] = {
      val __obj = js.Dynamic.literal(having = js.Any.fromFunction1(having))
      __obj.asInstanceOf[Having[T]]
    }
    
    @scala.inline
    implicit class HavingMutableBuilder[Self <: Having[_], T] (val x: Self with Having[T]) extends AnyVal {
      
      @scala.inline
      def setHaving(value: /* repeated */ js.Any => T): Self = StObject.set(x, "having", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait LOWER extends StObject {
    
    def LOWER(c: typings.anydbSql.mod.Column[String]): typings.anydbSql.mod.Column[String] = js.native
  }
  object LOWER {
    
    @scala.inline
    def apply(LOWER: typings.anydbSql.mod.Column[String] => typings.anydbSql.mod.Column[String]): LOWER = {
      val __obj = js.Dynamic.literal(LOWER = js.Any.fromFunction1(LOWER))
      __obj.asInstanceOf[LOWER]
    }
    
    @scala.inline
    implicit class LOWERMutableBuilder[Self <: LOWER] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLOWER(value: typings.anydbSql.mod.Column[String] => typings.anydbSql.mod.Column[String]): Self = StObject.set(x, "LOWER", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait RTRIM extends StObject {
    
    def LOWER(name: typings.anydbSql.mod.Column[String]): typings.anydbSql.mod.Column[String] = js.native
    
    def RTRIM(name: typings.anydbSql.mod.Column[String]): typings.anydbSql.mod.Column[String] = js.native
  }
  object RTRIM {
    
    @scala.inline
    def apply(
      LOWER: typings.anydbSql.mod.Column[String] => typings.anydbSql.mod.Column[String],
      RTRIM: typings.anydbSql.mod.Column[String] => typings.anydbSql.mod.Column[String]
    ): RTRIM = {
      val __obj = js.Dynamic.literal(LOWER = js.Any.fromFunction1(LOWER), RTRIM = js.Any.fromFunction1(RTRIM))
      __obj.asInstanceOf[RTRIM]
    }
    
    @scala.inline
    implicit class RTRIMMutableBuilder[Self <: RTRIM] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLOWER(value: typings.anydbSql.mod.Column[String] => typings.anydbSql.mod.Column[String]): Self = StObject.set(x, "LOWER", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRTRIM(value: typings.anydbSql.mod.Column[String] => typings.anydbSql.mod.Column[String]): Self = StObject.set(x, "RTRIM", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait RowCount[T] extends StObject {
    
    var rowCount: Double = js.native
    
    var rows: js.Array[T] = js.native
  }
  object RowCount {
    
    @scala.inline
    def apply[T](rowCount: Double, rows: js.Array[T]): RowCount[T] = {
      val __obj = js.Dynamic.literal(rowCount = rowCount.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowCount[T]]
    }
    
    @scala.inline
    implicit class RowCountMutableBuilder[Self <: RowCount[_], T] (val x: Self with RowCount[T]) extends AnyVal {
      
      @scala.inline
      def setRowCount(value: Double): Self = StObject.set(x, "rowCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRows(value: js.Array[T]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowsVarargs(value: T*): Self = StObject.set(x, "rows", js.Array(value :_*))
    }
  }
}
