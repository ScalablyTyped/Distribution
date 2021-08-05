package typings.apostrophe

import org.scalablytyped.runtime.StringDictionary
import typings.apostrophe.mod.AposObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Fields extends StObject {
    
    var fields: js.Array[String]
    
    var label: String
    
    var name: String
  }
  object Fields {
    
    inline def apply(fields: js.Array[String], label: String, name: String): Fields = {
      val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Fields]
    }
    
    extension [Self <: Fields](x: Self) {
      
      inline def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value :_*))
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Form extends StObject {
    
    def form(
      req: js.Any,
      data: js.Any,
      name: String,
      `object`: AposObject,
      field: js.Any,
      callback: js.Function0[js.Any]
    ): Unit
    
    def string(
      req: js.Any,
      data: js.Any,
      name: String,
      `object`: AposObject,
      field: js.Any,
      callback: js.Function0[js.Any]
    ): Unit
  }
  object Form {
    
    inline def apply(
      form: (js.Any, js.Any, String, AposObject, js.Any, js.Function0[js.Any]) => Unit,
      string: (js.Any, js.Any, String, AposObject, js.Any, js.Function0[js.Any]) => Unit
    ): Form = {
      val __obj = js.Dynamic.literal(form = js.Any.fromFunction6(form), string = js.Any.fromFunction6(string))
      __obj.asInstanceOf[Form]
    }
    
    extension [Self <: Form](x: Self) {
      
      inline def setForm(value: (js.Any, js.Any, String, AposObject, js.Any, js.Function0[js.Any]) => Unit): Self = StObject.set(x, "form", js.Any.fromFunction6(value))
      
      inline def setString(value: (js.Any, js.Any, String, AposObject, js.Any, js.Function0[js.Any]) => Unit): Self = StObject.set(x, "string", js.Any.fromFunction6(value))
    }
  }
  
  trait Id extends StObject {
    
    var _id: String
    
    var _url: js.UndefOr[String] = js.undefined
    
    var `type`: String
  }
  object Id {
    
    inline def apply(_id: String, `type`: String): Id = {
      val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    extension [Self <: Id](x: Self) {
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def set_id(value: String): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
      
      inline def set_url(value: String): Self = StObject.set(x, "_url", value.asInstanceOf[js.Any])
      
      inline def set_urlUndefined: Self = StObject.set(x, "_url", js.undefined)
    }
  }
  
  trait Projection extends StObject {
    
    var projection: js.UndefOr[StringDictionary[Double]] = js.undefined
  }
  object Projection {
    
    inline def apply(): Projection = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Projection]
    }
    
    extension [Self <: Projection](x: Self) {
      
      inline def setProjection(value: StringDictionary[Double]): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
      
      inline def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
    }
  }
}
