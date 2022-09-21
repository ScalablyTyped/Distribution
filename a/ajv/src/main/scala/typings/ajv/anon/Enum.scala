package typings.ajv.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Enum extends StObject {
  
  var `enum`: js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: infer E */ js.Any
  ]
}
object Enum {
  
  inline def apply(
    `enum`: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: infer E */ js.Any
    ]
  ): Enum = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("enum")(`enum`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Enum]
  }
  
  extension [Self <: Enum](x: Self) {
    
    inline def setEnum(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: infer E */ js.Any
        ]
    ): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
    
    inline def setEnumVarargs(value: (/* import warning: importer.ImportType#apply Failed type conversion: infer E */ js.Any)*): Self = StObject.set(x, "enum", js.Array(value*))
  }
}
