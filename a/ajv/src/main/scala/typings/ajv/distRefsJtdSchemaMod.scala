package typings.ajv

import org.scalablytyped.runtime.Shortcut
import typings.ajv.distTypesMod.SchemaObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distRefsJtdSchemaMod extends Shortcut {
  
  @JSImport("ajv/dist/refs/jtd-schema", JSImport.Default)
  @js.native
  val default: SchemaObject = js.native
  
  type _To = SchemaObject
  
  /* This means you don't have to write `default`, but can instead just say `distRefsJtdSchemaMod.foo` */
  override def _to: SchemaObject = default
}
