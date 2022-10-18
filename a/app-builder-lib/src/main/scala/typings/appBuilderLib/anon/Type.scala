package typings.appBuilderLib.anon

import typings.appBuilderLib.appBuilderLibStrings.releases
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Type extends StObject {
  
  var id: String
  
  var `type`: releases
}
object Type {
  
  inline def apply(id: String): Type = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("releases")
    __obj.asInstanceOf[Type]
  }
  
  extension [Self <: Type](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setType(value: releases): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
