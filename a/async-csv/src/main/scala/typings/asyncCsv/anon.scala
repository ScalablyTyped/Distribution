package typings.asyncCsv

import typings.asyncCsv.mod.Cast
import typings.asyncCsv.mod.CastingContext
import typings.asyncCsv.mod._ColumnOption
import typings.std.Date
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Boolean extends StObject {
    
    var boolean: js.UndefOr[Cast[scala.Boolean]] = js.native
    
    var date: js.UndefOr[Cast[Date]] = js.native
    
    var number: js.UndefOr[Cast[Double]] = js.native
    
    /**
      * Custom formatter for generic object values
      */
    var `object`: js.UndefOr[Cast[Record[String, _]]] = js.native
    
    var string: js.UndefOr[Cast[String]] = js.native
  }
  object Boolean {
    
    @scala.inline
    def apply(): Boolean = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Boolean]
    }
    
    @scala.inline
    implicit class BooleanMutableBuilder[Self <: Boolean] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBoolean(value: (scala.Boolean, /* context */ CastingContext) => String): Self = StObject.set(x, "boolean", js.Any.fromFunction2(value))
      
      @scala.inline
      def setBooleanUndefined: Self = StObject.set(x, "boolean", js.undefined)
      
      @scala.inline
      def setDate(value: (Date, /* context */ CastingContext) => String): Self = StObject.set(x, "date", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      @scala.inline
      def setNumber(value: (Double, /* context */ CastingContext) => String): Self = StObject.set(x, "number", js.Any.fromFunction2(value))
      
      @scala.inline
      def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
      
      @scala.inline
      def setObject(value: (Record[String, _], /* context */ CastingContext) => String): Self = StObject.set(x, "object", js.Any.fromFunction2(value))
      
      @scala.inline
      def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
      
      @scala.inline
      def setString(value: (String, /* context */ CastingContext) => String): Self = StObject.set(x, "string", js.Any.fromFunction2(value))
      
      @scala.inline
      def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
    }
  }
  
  @js.native
  trait Name extends _ColumnOption {
    
    var name: String = js.native
  }
  object Name {
    
    @scala.inline
    def apply(name: String): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit class NameMutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
