package typings.apostrophe

import org.scalablytyped.runtime.StringDictionary
import typings.apostrophe.mod.AposObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Fields extends StObject {
    
    var fields: js.Array[String] = js.native
    
    var label: String = js.native
    
    var name: String = js.native
  }
  object Fields {
    
    @scala.inline
    def apply(fields: js.Array[String], label: String, name: String): Fields = {
      val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Fields]
    }
    
    @scala.inline
    implicit class FieldsMutableBuilder[Self <: Fields] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value :_*))
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Form extends StObject {
    
    def form(
      req: js.Any,
      data: js.Any,
      name: String,
      `object`: AposObject,
      field: js.Any,
      callback: js.Function0[_]
    ): Unit = js.native
    
    def string(
      req: js.Any,
      data: js.Any,
      name: String,
      `object`: AposObject,
      field: js.Any,
      callback: js.Function0[_]
    ): Unit = js.native
  }
  object Form {
    
    @scala.inline
    def apply(
      form: (js.Any, js.Any, String, AposObject, js.Any, js.Function0[_]) => Unit,
      string: (js.Any, js.Any, String, AposObject, js.Any, js.Function0[_]) => Unit
    ): Form = {
      val __obj = js.Dynamic.literal(form = js.Any.fromFunction6(form), string = js.Any.fromFunction6(string))
      __obj.asInstanceOf[Form]
    }
    
    @scala.inline
    implicit class FormMutableBuilder[Self <: Form] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setForm(value: (js.Any, js.Any, String, AposObject, js.Any, js.Function0[_]) => Unit): Self = StObject.set(x, "form", js.Any.fromFunction6(value))
      
      @scala.inline
      def setString(value: (js.Any, js.Any, String, AposObject, js.Any, js.Function0[_]) => Unit): Self = StObject.set(x, "string", js.Any.fromFunction6(value))
    }
  }
  
  @js.native
  trait Id extends StObject {
    
    var _id: String = js.native
    
    var _url: js.UndefOr[String] = js.native
    
    var `type`: String = js.native
  }
  object Id {
    
    @scala.inline
    def apply(_id: String, `type`: String): Id = {
      val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    @scala.inline
    implicit class IdMutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_id(value: String): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_url(value: String): Self = StObject.set(x, "_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_urlUndefined: Self = StObject.set(x, "_url", js.undefined)
    }
  }
  
  @js.native
  trait Projection extends StObject {
    
    var projection: js.UndefOr[StringDictionary[Double]] = js.native
  }
  object Projection {
    
    @scala.inline
    def apply(): Projection = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Projection]
    }
    
    @scala.inline
    implicit class ProjectionMutableBuilder[Self <: Projection] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProjection(value: StringDictionary[Double]): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
    }
  }
}
