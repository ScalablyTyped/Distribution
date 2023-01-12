package typings.angularDevkitCore.anon

import typings.angularDevkitCore.srcJsonUtilsMod.JsonValue
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  name :string} & @angular-devkit/core.@angular-devkit/core/src/workspace/definitions.TargetDefinition */
trait namestringTargetDefinitio extends StObject {
  
  var builder: String
  
  var configurations: js.UndefOr[Record[String, js.UndefOr[Record[String, js.UndefOr[JsonValue]]]]] = js.undefined
  
  var defaultConfiguration: js.UndefOr[String] = js.undefined
  
  var name: String
  
  var options: js.UndefOr[Record[String, js.UndefOr[JsonValue]]] = js.undefined
}
object namestringTargetDefinitio {
  
  inline def apply(builder: String, name: String): namestringTargetDefinitio = {
    val __obj = js.Dynamic.literal(builder = builder.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[namestringTargetDefinitio]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: namestringTargetDefinitio] (val x: Self) extends AnyVal {
    
    inline def setBuilder(value: String): Self = StObject.set(x, "builder", value.asInstanceOf[js.Any])
    
    inline def setConfigurations(value: Record[String, js.UndefOr[Record[String, js.UndefOr[JsonValue]]]]): Self = StObject.set(x, "configurations", value.asInstanceOf[js.Any])
    
    inline def setConfigurationsUndefined: Self = StObject.set(x, "configurations", js.undefined)
    
    inline def setDefaultConfiguration(value: String): Self = StObject.set(x, "defaultConfiguration", value.asInstanceOf[js.Any])
    
    inline def setDefaultConfigurationUndefined: Self = StObject.set(x, "defaultConfiguration", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: Record[String, js.UndefOr[JsonValue]]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
