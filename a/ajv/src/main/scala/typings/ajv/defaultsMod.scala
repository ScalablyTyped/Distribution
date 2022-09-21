package typings.ajv

import typings.ajv.compileMod.SchemaObjCxt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object defaultsMod {
  
  @JSImport("ajv/dist/compile/validate/defaults", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assignDefaults(it: SchemaObjCxt): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assignDefaults")(it.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def assignDefaults(it: SchemaObjCxt, ty: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assignDefaults")(it.asInstanceOf[js.Any], ty.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
