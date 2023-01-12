package typings.awsLambda.triggerLexV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LexV2Bot extends StObject {
  
  var aliasId: String
  
  var aliasName: String
  
  var id: String
  
  var localeId: String
  
  var name: String
  
  var version: String
}
object LexV2Bot {
  
  inline def apply(aliasId: String, aliasName: String, id: String, localeId: String, name: String, version: String): LexV2Bot = {
    val __obj = js.Dynamic.literal(aliasId = aliasId.asInstanceOf[js.Any], aliasName = aliasName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], localeId = localeId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[LexV2Bot]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LexV2Bot] (val x: Self) extends AnyVal {
    
    inline def setAliasId(value: String): Self = StObject.set(x, "aliasId", value.asInstanceOf[js.Any])
    
    inline def setAliasName(value: String): Self = StObject.set(x, "aliasName", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLocaleId(value: String): Self = StObject.set(x, "localeId", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
