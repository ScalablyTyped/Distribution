package typings.ajv

import org.scalablytyped.runtime.TopLevel
import typings.ajv.distTypesMod.AnyValidateFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object standaloneMod {
  
  @JSImport("ajv/dist/standalone", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(ajv: typings.ajv.coreMod.default): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(ajv.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def default(
    ajv: typings.ajv.coreMod.default,
    refsOrFunc: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in string ]:? string}
    */ typings.ajv.ajvStrings.default & TopLevel[Any]
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(ajv.asInstanceOf[js.Any], refsOrFunc.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def default(ajv: typings.ajv.coreMod.default, refsOrFunc: AnyValidateFunction[Any]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(ajv.asInstanceOf[js.Any], refsOrFunc.asInstanceOf[js.Any])).asInstanceOf[String]
}
