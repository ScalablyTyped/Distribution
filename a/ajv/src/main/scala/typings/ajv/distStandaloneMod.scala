package typings.ajv

import typings.ajv.distTypesMod.AnyValidateFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distStandaloneMod {
  
  @JSImport("ajv/dist/standalone", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(ajv: typings.ajv.distCoreMod.default): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(ajv.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def default(
    ajv: typings.ajv.distCoreMod.default,
    refsOrFunc: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in string ]:? string} */ js.Any
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(ajv.asInstanceOf[js.Any], refsOrFunc.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def default(ajv: typings.ajv.distCoreMod.default, refsOrFunc: AnyValidateFunction[Any]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(ajv.asInstanceOf[js.Any], refsOrFunc.asInstanceOf[js.Any])).asInstanceOf[String]
}
